package magmasrc.ageofweapons.util;

import magmasrc.ageofweapons.client.gui.GuiCrusher;
import magmasrc.ageofweapons.containers.ContainerCrusher;
import magmasrc.ageofweapons.tileentitys.TileEntityCrusher;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;


public class GuiHandlerCrusher implements IGuiHandler {

    private static final int GUIID_crusher = 1;
    public static int getGuiID() {
        System.out.println("GuiHandlerClass " + GUIID_crusher);
        return GUIID_crusher;
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID != getGuiID()) {
            System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
        }

        BlockPos xyz = new BlockPos(x, y, z);
        TileEntity tileEntity = world.getTileEntity(xyz);
        if (tileEntity instanceof TileEntityCrusher) {
            TileEntityCrusher tileEntityCrusher = (TileEntityCrusher) tileEntity;
            return new ContainerCrusher(player.inventory, tileEntityCrusher);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID != getGuiID()) {
            System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
        }

        BlockPos xyz = new BlockPos(x, y, z);
        TileEntity tileEntity = world.getTileEntity(xyz);
        if (tileEntity instanceof TileEntityCrusher) {
            TileEntityCrusher tileEntityCrusher = (TileEntityCrusher) tileEntity;
            return new GuiCrusher(player.inventory, tileEntityCrusher);
        }
        return null;
    }

}
