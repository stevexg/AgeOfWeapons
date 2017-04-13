package magmasrc.ageofweapons.util;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;


public class Events {    
	
	
    	/** Update-Checker **/
	
	private boolean hasShownUp = false;
	
	
	@SubscribeEvent
	public void onClientTick(ClientTickEvent event) {
		if (UpdateChecker.isNewVersionAvailable() && !hasShownUp && Minecraft.getMinecraft().currentScreen == null) {
	        
				ClickEvent versionCheckChatClickEvent = new ClickEvent(ClickEvent.Action.OPEN_URL, "https://minecraft.curseforge.com/projects/age-of-weapons");
	            Style clickableChatStyle = new Style().setClickEvent(versionCheckChatClickEvent);
	            Minecraft.getMinecraft().player.sendMessage(new TextComponentString(TextFormatting.BLUE + "A newer version of Age of Weapons is available!"));
	            TextComponentString versionWarningChatComponent = new TextComponentString(TextFormatting.GRAY + "Click here to update!");
	            versionWarningChatComponent.setStyle(clickableChatStyle);
	            Minecraft.getMinecraft().player.sendMessage(versionWarningChatComponent);

			hasShownUp = true;
		}
	}
	

}


