package com.sorax.pirates.client.render.entity;

import com.sorax.pirates.common.entities.EntityPirateGhost;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderPirateGhost extends RenderBiped<EntityPirateGhost> {
	
	private ResourceLocation texture = new ResourceLocation("pirates", "textures/entities/mob/pirate_fantome.png");
	
	public RenderPirateGhost(RenderManager renderManager, float p_i46168_3_) {
		super(renderManager, new ModelBiped(), p_i46168_3_);
		this.addLayer(new LayerBipedArmor(this));
        this.addLayer(new LayerHeldItem(this));
	}
	
	protected ResourceLocation getEntityTexture(EntityPirateGhost living) {
		return getPirateMauditTexture(living);
	}
	
	private ResourceLocation getPirateMauditTexture(EntityPirateGhost entity) {
		return this.texture;
	}
	
	public void doRender(EntityPirateGhost entity, double x, double y, double z, float p_76986_8_, float partialTicks)
    {
        super.doRender(entity, x, y, z, p_76986_8_, partialTicks);
    }
}
