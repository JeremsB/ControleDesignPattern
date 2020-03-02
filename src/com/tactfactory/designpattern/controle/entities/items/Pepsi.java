package com.tactfactory.designpattern.controle.entities.items;

import com.tactfactory.designpattern.controle.tools.Const;

public class Pepsi extends Boisson {
	public Pepsi(String size) {
		this.name = Const.PEPSI;
		this.size = size;
		switch (size) {
		case Const.GRAND:
			this.price = 2.70F;
			break;
		case Const.MOYEN:
			this.price = 2.10F;
			break;
		case Const.PETIT:
			this.price = 1.70F;
			break;
		default:
			this.price = 0;
			break;
		}
	}
}
