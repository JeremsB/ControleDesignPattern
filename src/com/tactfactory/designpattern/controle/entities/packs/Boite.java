package com.tactfactory.designpattern.controle.entities.packs;

import com.tactfactory.designpattern.controle.entities.Packing;

public class Boite implements Packing {

	@Override
	public String pack() {
		return "Boite";
	}
	
	@Override
	public String toString() {
		return "Boite";
	}
}
