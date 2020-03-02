package com.tactfactory.designpattern.controle.entities.items;

import com.tactfactory.designpattern.controle.tools.Const;

public class Cocacola extends Boisson {	
	public Cocacola(String size) {
		this.name = Const.COCACOLA;
		this.size = size;
		switch (size) {
		case Const.GRAND:
			this.price = 2.80F;
			break;
		case Const.MOYEN:
			this.price = 2.20F;
			break;
		case Const.PETIT:
			this.price = 1.80F;
			break;
		default:
			this.price = 0;
			break;
		}
	}
}
