package com.tactfactory.designpattern.controle.menus;

import com.tactfactory.designpattern.controle.tools.Const;

public class GoldenMenu extends Menu {
	public GoldenMenu() {}
	
	public GoldenMenu(String burger, String burger2, String accompagnement, String boisson) {
		this.name = Const.GOLDENMENU;
		this.price = 12F;
		this.size = Const.GRAND;
		
		setBurger(burger);
		setBurger2(burger2);
		setAccompagnement(accompagnement);
		setBoisson(boisson);
	}
}
