package com.tactfactory.designpattern.controle.menus;

import com.tactfactory.designpattern.controle.entities.items.Jouet;
import com.tactfactory.designpattern.controle.tools.Const;

public class HappyMeal extends Menu {
	protected Jouet jouet;
	
	public HappyMeal() {}
	
	public HappyMeal(String burger, String accompagnement, String boisson, String jouet) {
		this.name = Const.HAPPYMEAL;
		this.price = 4.0F;
		this.size = Const.PETIT;
		
		setBurger(burger);
		setAccompagnement(accompagnement);
		setBoisson(boisson);
		setJouet(jouet);
		
	}
}
