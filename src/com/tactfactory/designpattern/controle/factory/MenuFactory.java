package com.tactfactory.designpattern.controle.factory;

import com.tactfactory.designpattern.controle.menus.*;
import com.tactfactory.designpattern.controle.tools.Const;

public class MenuFactory {
	public Menu create(String menu, String burger1, String burger2, String accompagnement, String boisson, String jouet) {
		Menu switchMenu = null;

		switch (menu) {
		case Const.BESTOF:
			switchMenu = new Bestof(burger1, accompagnement, boisson);
			break;
		case Const.MAXIBESTOF:
			switchMenu = new MaxiBestof(burger1, accompagnement, boisson);
			break;
		case Const.GOLDENMENU:
			switchMenu = new GoldenMenu(burger1, burger2, accompagnement, boisson);
			break;
		case Const.HAPPYMEAL:
			switchMenu = new HappyMeal(burger1, accompagnement, boisson, jouet);
			break;
		default:
			break;
		}
		return switchMenu;
	}
}