package net.amigocraft.pore.implementation.entity;

import org.bukkit.entity.EnderCrystal;
import org.bukkit.entity.EntityType;

public class PoreEnderCrystal extends PoreEntity implements EnderCrystal {

	//TODO: make constructor as specific as possible
	protected PoreEnderCrystal(org.spongepowered.api.entity.Entity handle){
		super(handle);
	}

	public static PoreEnderCrystal of(org.spongepowered.api.entity.Entity handle){
		return (PoreEnderCrystal)PoreEntity.of(handle);
	}

	@Override
	public EntityType getType(){
		return EntityType.ENDER_CRYSTAL;
	}

}