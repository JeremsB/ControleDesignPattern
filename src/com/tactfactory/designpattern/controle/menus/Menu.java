package com.tactfactory.designpattern.controle.menus;

import com.tactfactory.designpattern.controle.entities.Item;
import com.tactfactory.designpattern.controle.entities.Packing;
import com.tactfactory.designpattern.controle.entities.items.*;
import com.tactfactory.designpattern.controle.entities.packs.Boite;
import com.tactfactory.designpattern.controle.tools.Const;

public class Menu implements Item {
	protected String name;
	protected Packing packing = new Boite();
	protected Burger burger;
	protected Burger burger2;
	protected Accompagnement accompagnement;
	protected Boisson boisson;
	protected Jouet jouet;
	protected float price;
	protected String size;

	public void setBurger(String burger) {
		switch (burger) {
		case Const.BURGER1:
			this.burger = new Burger1();
			break;
		case Const.BURGER2:
			this.burger = new Burger2();
			break;
		default:
			this.burger = null;
			break;
		}
	}
	
	public void setBurger2(String burger2) {
		switch (burger2) {
		case Const.BURGER1:
			this.burger2 = new Burger1();
			break;
		case Const.BURGER2:
			this.burger2 = new Burger2();
			break;
		default:
			this.burger2 = null;
			break;
		}
	}

	public void setAccompagnement(String accompagnement) {
		switch (accompagnement) {
		case Const.FRITES:
			this.accompagnement = new Frites(size);
			break;
		case Const.POTATOES:
			this.accompagnement = new Potatoes(size);
			break;
		default:
			this.accompagnement = null;
			break;
		}
	}

	public void setBoisson(String boisson) {
		switch (boisson) {
		case Const.COCACOLA:
			this.boisson = new Cocacola(size);
			break;
		case Const.PEPSI:
			this.boisson = new Pepsi(size);
			break;
		default:
			this.boisson = null;
			break;
		}
	}
	
	public void setJouet(String jouet) {
		switch (jouet) {
		case Const.JOUETGARCON:
			this.jouet = new JouetGarcon();
			break;
		case Const.JOUETFILLE:
			this.jouet = new JouetFille();
			break;
		default:
			this.jouet = null;
			break;
		}
	}

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public Packing packing() {
		return this.packing;
	}

	@Override
	public float price() {
		return this.price;
	}

	@Override
	public String toString() {
		String textDeuxiemeBurger = ""; 
		Burger deuxiemeBurger = burger2;
		if (deuxiemeBurger != null) {
			textDeuxiemeBurger = "2nd Burger : " + burger2.name() + "";
		}
		String textJouet = "";
		Jouet leJouet = jouet;
		if (leJouet != null) {
			textJouet = "Jouet : " + jouet.name() + "";
		}
		return "Burger : " + burger.name() +  textDeuxiemeBurger + " Accompagnement : " + size + " " + accompagnement.name() + "Boisson : " + size + " " + boisson.name() + textJouet;
	}

	@Override
	public String size() {
		return null;
	}	
}