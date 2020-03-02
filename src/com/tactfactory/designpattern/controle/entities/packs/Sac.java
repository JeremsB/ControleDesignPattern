package com.tactfactory.designpattern.controle.entities.packs;

import com.tactfactory.designpattern.controle.entities.Packing;

public class Sac implements Packing {

	@Override
	public String pack() {
		return "Sac";
	}
	
	@Override
	public String toString() {
		return "Sac";
	}
}
