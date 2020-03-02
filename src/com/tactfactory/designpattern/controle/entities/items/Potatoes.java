package com.tactfactory.designpattern.controle.entities.items;

import com.tactfactory.designpattern.controle.tools.Const;

public class Potatoes extends Accompagnement{	
	public Potatoes(String size) {
		this.name = Const.POTATOES;
		this.size = size;
		switch (size) {
		case Const.GRAND:
			this.price = 2.60F;
			break;
		case Const.MOYEN:
			this.price = 2.00F;
			break;
		case Const.PETIT:
			this.price = 1.60F;
			break;
		default:
			this.price = 0;
			break;
		}
	}
}
