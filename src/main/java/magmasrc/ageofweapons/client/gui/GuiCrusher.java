package magmasrc.ageofweapons.client.gui;

import magmasrc.ageofweapons.containers.ContainerCrusher;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiCrusher extends GuiContainer
{
    private static final ResourceLocation CRUSHER_GUI_TEXTURES = new ResourceLocation(AgeOfWeapons.MODID, "textures/gui/crusher_gui.png");
    /** The player inventory bound to this GUI. */
    private final InventoryPlayer playerInventory;
    private final IInventory tileCrusher;

    public GuiCrusher(InventoryPlayer playerInv, IInventory crusherInv)
    {
        super(new ContainerCrusher(playerInv, crusherInv));
        this.playerInventory = playerInv;
        this.tileCrusher = crusherInv;
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        String s = this.tileCrusher.getDisplayName().getUnformattedText();
        this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        this.fontRendererObj.drawString(this.playerInventory.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
    }

    /**
     * Draws the background layer of this container (behind the items).
     */
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(CRUSHER_GUI_TEXTURES);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);

        if (TileEntityFurnace.isBurning(this.tileCrusher))
        {
            int k = this.getBurnLeftScaled(13);
            this.drawTexturedModalRect(i + 56, j + 36 + 12 - k, 176, 12 - k, 14, k + 1);
        }

        int l = this.getCookProgressScaled(24);
        this.drawTexturedModalRect(i + 79, j + 34, 176, 14, l, 16);
    }

    private int getCookProgressScaled(int pixels)
    {
        int i = this.tileCrusher.getField(2);
        int j = this.tileCrusher.getField(3);
        return j != 0 && i != 0 ? i * pixels / j : 0;
    }

    private int getBurnLeftScaled(int pixels)
    {
        int i = this.tileCrusher.getField(1);

        if (i == 0)
        {
            i = 200;
        }

        return this.tileCrusher.getField(0) * pixels / i;
    }
}