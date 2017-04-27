package magmasrc.ageofweapons.client.gui;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class GuiTableOfAges extends GuiScreen {

    final ResourceLocation texture = new ResourceLocation(AgeOfWeapons.MODID, "textures/gui/table_of_ages_gui.png");
    int guiWidth = 250;
    int guiHeigth = 222;


    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
        int centerX = (width /2)-guiWidth/2;
        int centerY = (height/2)-guiHeigth/2;

        drawTexturedModalRect(centerX, centerY, 0, 0, guiWidth, guiHeigth);
        super.drawScreen(mouseX, mouseY, partialTicks);
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
