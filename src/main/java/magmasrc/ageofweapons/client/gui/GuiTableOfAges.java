package magmasrc.ageofweapons.client.gui;

import magmasrc.ageofweapons.containers.ContainerTableOfAges;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.tileentitys.TileEntityTableOfAges;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import java.awt.*;
import java.io.IOException;

public class GuiTableOfAges extends GuiContainer {

    final ResourceLocation texture = new ResourceLocation(AgeOfWeapons.MODID, "textures/gui/table_of_ages_gui.png");
    private TileEntityTableOfAges tileEntityTableOfAges;
    private int guiWidth = 250;
    private int guiHeigth = 222;

    public GuiTableOfAges(InventoryPlayer invPlayer, TileEntityTableOfAges tile) {
        super(new ContainerTableOfAges(invPlayer, tile));
        tileEntityTableOfAges = tile;
        xSize = 261;
        ySize = 222;
    }

    @Override
    public void drawGuiContainerBackgroundLayer(float partialTicks, int x, int y) {
        drawDefaultBackground();
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
        int centerX = (width /2)-guiWidth/2;
        int centerY = (height/2)-guiHeigth/2;

        drawTexturedModalRect(centerX, centerY, 0, 0, guiWidth, guiHeigth);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        fontRendererObj.drawString("Table Of Ages", 10, 5, Color.darkGray.getRGB());
        fontRendererObj.drawString("Inventory", 95, 130, Color.darkGray.getRGB());
        fontRendererObj.drawString("Storage", 112, 90, Color.darkGray.getRGB());
    }

    @Override
    public void initGui() {
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        super.actionPerformed(button);
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode) throws IOException {
        super.keyTyped(typedChar, keyCode);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }



}
