package magmasrc.ageofweapons.util;

import com.google.common.collect.*;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemSword;

	public class ItemCustomSword extends ItemSword {

		private final float attackDamage;
		private final float attackSpeed;

		public ItemCustomSword(ToolMaterial material, float attackSpeed) {
			super(material);
			this.attackSpeed = attackSpeed;
			this.attackDamage = 3.0F + material.getDamageVsEntity();
		}


	@Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot)
    {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

        if (equipmentSlot == EntityEquipmentSlot.MAINHAND)
        {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.attackDamage, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", attackSpeed, 0));
        }                                                                                                                                  

        return multimap;
    }
}