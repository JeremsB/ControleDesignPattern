package com.tactfactory.designpattern.controle.entities.items;

import com.tactfactory.designpattern.controle.entities.Item;
import com.tactfactory.designpattern.controle.entities.Packing;
import com.tactfactory.designpattern.controle.entities.packs.Bouteille;

public abstract class Boisson implements Item {
	protected String name;
    protected Packing packing = new Bouteille();
    protected String size;
    protected float price;

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public Packing packing() {
		return this.packing;
	}
	
	@Override
	public String size() {
		return this.size;
	}

	@Override
	public float price() {
		return this.price;
	}

	@Override
	public String toString() {
		return "Nom : " + name + "/ Pack : " + packing + "/ Prix : " + price;
	}

}
