package magmasrc.ageofweapons.util;

import java.util.UUID;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.items.ItemHandlerHelper;


public class Events {    
	
	
    	/** Update-Checker **/
	
	private boolean hasShownUp = false;
	
	
	@SubscribeEvent
	public void onClientTick(ClientTickEvent event) {
		if (AgeOfWeapons.activateUpdateChecker) {
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
	
	
	
	
	
	/** FOV **/ 
	
	@SubscribeEvent
	public void onFOVUpdate(FOVUpdateEvent event) {
		EntityPlayer player = event.getEntity();
		  if (player.isHandActive() && player.getActiveItemStack() != null && player.getActiveItemStack().getItem() == ModItems.recurveBow) {
			
			 int i = player.getItemInUseMaxCount();
			 float f1 = (float) i / 7.0F;
			                      //speed
			
			if (f1 > 1.0F) {
				f1 = 1.0F;
			} else {
				f1 = f1 * f1;
			}
			                                        //zoom wight
		event.setNewfov(event.getNewfov() * 1.0F - f1 * 0.15F);	
		} 
		  
		  
		  if (player.isHandActive() && player.getActiveItemStack() != null && player.getActiveItemStack().getItem() == ModItems.crossbow) {
				
			 int i = player.getItemInUseMaxCount();
			 float f1 = (float) i / 7.0F;
			                      //speed
			
			if (f1 > 1.0F) {
				f1 = 1.0F;
			} else {
				f1 = f1 * f1;
			}
			                                        //zoom wight
		event.setNewfov(event.getNewfov() * 1.0F - f1 * 0.30F);	
		} 
		  
		  
		  
		  if (player.isHandActive() && player.getActiveItemStack() != null && player.getActiveItemStack().getItem() == ModItems.longbow) {
				
			 int i = player.getItemInUseMaxCount();
			 float f1 = (float) i / 7.0F;
			                      //speed
			
			if (f1 > 1.0F) {
				f1 = 1.0F;
			} else {
				f1 = f1 * f1;
			}
			                                        //zoom wight
		event.setNewfov(event.getNewfov() * 1.0F - f1 * 0.15F);	
		} 
		  
		  
		  
		  if (player.isHandActive() && player.getActiveItemStack() != null && player.getActiveItemStack().getItem() == ModItems.compoundBow) {
				
			 int i = player.getItemInUseMaxCount();
			 float f1 = (float) i / 7.0F;
			                      //speed
			
			if (f1 > 1.0F) {
				f1 = 1.0F;
			} else {
				f1 = f1 * f1;
			}
			                                        //zoom wight
		event.setNewfov(event.getNewfov() * 1.0F - f1 * 0.60F);	
		} 
		  
		  
		  if (player.isHandActive() && player.getActiveItemStack() != null && player.getActiveItemStack().getItem() == ModItems.blowgun) {
				
			 int i = player.getItemInUseMaxCount();
			 float f1 = (float) i / 10.0F;
			                      //speed
			
			if (f1 > 1.0F) {
				f1 = 1.0F;
			} else {
				f1 = f1 * f1;
			}
			                                        //zoom wight
		event.setNewfov(event.getNewfov() * 1.0F - f1 * 0.10F);	
		} 
		 
		  
		  if (player.isHandActive() && player.getActiveItemStack() != null && player.getActiveItemStack().getItem() == ModItems.herobrineBow) {
				
			 int i = player.getItemInUseMaxCount();
			 float f1 = (float) i / 7.0F;
			                      //speed
			
			if (f1 > 1.0F) {
				f1 = 1.0F;
			} else {
				f1 = f1 * f1;
			}
			                                        //zoom wight
		event.setNewfov(event.getNewfov() * 1.0F - f1 * 0.30F);	
		} 
		  
		  
		  if (player.isHandActive() && player.getActiveItemStack() != null && player.getActiveItemStack().getItem() == ModItems.fieldGlasses) {
				
			 int i = player.getItemInUseMaxCount();
			 float f1 = (float) i / 10.0F;
			                      //speed
			
			if (f1 > 1.0F) {
				f1 = 1.0F;
			} else {
				f1 = f1 * f1;
			}
			                                        //zoom wight
		event.setNewfov(event.getNewfov() * 1.0F - f1 * 0.80F);	
		} 

		  
		  
		  
	}
	
	
	
	/** Easter egg **/
	
	@SubscribeEvent
	public static void playerLoggedIn(final PlayerEvent.PlayerLoggedInEvent event) {
		final EntityPlayer player = event.player;
		PlayerList list = player.world.getMinecraftServer().getPlayerList();

		final NBTTagCompound entityData = player.getEntityData();
		final NBTTagCompound persistedData = entityData.getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG);
		entityData.setTag(EntityPlayer.PERSISTED_NBT_TAG, persistedData);

		final String key = AgeOfWeapons.MODID + ":" + "ReceivedItems";

		if (!persistedData.getBoolean(key)) {
			persistedData.setBoolean(key, true);

			ItemHandlerHelper.giveItemToPlayer(list.getPlayerByUUID(UUID.fromString("ed5d14eb-57c0-4253-a1e1-a6dab224b393")), new ItemStack(ModItems.epicKatana));
			ItemHandlerHelper.giveItemToPlayer(list.getPlayerByUUID(UUID.fromString("524b9b5d-831d-45c5-a2cc-0cdbfdc60724")), new ItemStack(ModItems.epicWaraxe));
		}
   }

}


