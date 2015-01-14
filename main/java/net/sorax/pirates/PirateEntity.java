package net.sorax.pirates;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.sorax.pirates.common.entities.EntityBoulet;
import net.sorax.pirates.common.entities.EntityFusilBullet;
import net.sorax.pirates.common.entities.EntityKnife;
import net.sorax.pirates.common.entities.EntityLanceur;
import net.sorax.pirates.common.entities.EntityPirateMaudit;

public class PirateEntity {
	
	public static void loadCreature() {
		registerMob(EntityPirateMaudit.class, "EntityPirateMaudit", 0, 0xFF0000);
		registerMob(EntityLanceur.class, "Lanceur", 0xFF9999, 0x553333);
	}
	
	public static void loadOthers() {
		registerOther(EntityKnife.class, "EntityKnife");
		registerOther(EntityBoulet.class, "EntityBoulet");
		registerOther(EntityFusilBullet.class, "EntityFusilBullet");
	}
	
	private static void registerMob(Class<? extends EntityLivingBase> clazz, String name, int egg1, int egg2) {
		EntityRegistry.registerGlobalEntityID(clazz, name, EntityRegistry.findGlobalUniqueEntityId(), egg1, egg2);
	}
	
	private static void registerOther(Class<? extends Entity> clazz, String name) {
		EntityRegistry.registerGlobalEntityID(clazz, name, EntityRegistry.findGlobalUniqueEntityId());
	}
}