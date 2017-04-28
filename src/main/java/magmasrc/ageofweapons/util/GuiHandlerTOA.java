package magmasrc.ageofweapons.util;

import magmasrc.ageofweapons.client.gui.GuiTableOfAges;
import magmasrc.ageofweapons.containers.ContainerTableOfAges;
import magmasrc.ageofweapons.tileentitys.TileEntityTableOfAges;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandlerTOA implements IGuiHandler {

    private static final int GUIID_tableofages = 0;
    public static int getGuiID() {
        System.out.println("GuiHandlerClass " + GUIID_tableofages);
        return GUIID_tableofages;
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID != getGuiID()) {
            System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
        }

        BlockPos xyz = new BlockPos(x, y, z);
        TileEntity tileEntity = world.getTileEntity(xyz);
        if (tileEntity instanceof TileEntityTableOfAges) {
            TileEntityTableOfAges tileEntityTableOfAges = (TileEntityTableOfAges) tileEntity;
            return new ContainerTableOfAges(player.inventory, tileEntityTableOfAges);
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
        if (tileEntity instanceof TileEntityTableOfAges) {
            TileEntityTableOfAges tileEntityTableOfAges = (TileEntityTableOfAges) tileEntity;
            return new GuiTableOfAges(player.inventory, tileEntityTableOfAges);
        }
        return null;
    }

}
