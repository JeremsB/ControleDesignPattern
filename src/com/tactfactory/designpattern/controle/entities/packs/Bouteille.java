package com.tactfactory.designpattern.controle.entities.packs;

import com.tactfactory.designpattern.controle.entities.Packing;

public class Bouteille implements Packing {

	@Override
	public String pack() {
		return "Bouteille";
	}

	@Override
	public String toString() {
		return "Bouteille";
	}
}
