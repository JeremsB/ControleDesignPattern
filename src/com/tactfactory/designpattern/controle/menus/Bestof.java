package com.tactfactory.designpattern.controle.menus;

import com.tactfactory.designpattern.controle.tools.Const;

public class Bestof extends Menu {
	
	public Bestof() {}
	
	public Bestof(String burger, String accompagnement, String boisson) {
		this.name = "Best-of";
		this.price = 8.70F;
		this.size = Const.MOYEN;
		
		setBurger(burger);
		setAccompagnement(accompagnement);
		setBoisson(boisson);
	}
	

}
