package com.tactfactory.designpattern.controle.menus;

import com.tactfactory.designpattern.controle.tools.Const;

public class MaxiBestof extends Menu {
	
	public MaxiBestof() {}
	
	public MaxiBestof(String burger, String accompagnement, String boisson) {
		this.name = Const.MAXIBESTOF;
		this.price = 8.90F;
		this.size = Const.GRAND;
		
		setBurger(burger);
		setAccompagnement(accompagnement);
		setBoisson(boisson);
	}
}
