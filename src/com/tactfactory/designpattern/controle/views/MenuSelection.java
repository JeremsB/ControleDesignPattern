package com.tactfactory.designpattern.controle.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.tactfactory.designpattern.controle.entities.Meal;
import com.tactfactory.designpattern.controle.entities.MealBuilder;
import com.tactfactory.designpattern.controle.factory.MenuFactory;
import com.tactfactory.designpattern.controle.tools.Const;

public class MenuSelection extends JFrame {

  private Home home;
  //private Meal meal;
  
  private String burger1Test;
  private String burger2Test;
  private String boissonTest;
  private String accompagnementTest;
  private String menuTest;
  private String jouetTest;

  private JButton bestOf = new JButton(Const.BESTOF);
  private JButton maxiBestOf = new JButton(Const.MAXIBESTOF);
  private JButton goldenMenu = new JButton(Const.GOLDENMENU);
  private JButton happyMeal = new JButton(Const.HAPPYMEAL);

  private JButton burger1 = new JButton(Const.BURGER1);
  private JButton burger2 = new JButton(Const.BURGER2);

  private JButton drink1 = new JButton(Const.COCACOLA);
  private JButton drink2 = new JButton(Const.PEPSI);

  private JButton fries = new JButton(Const.FRITES);
  private JButton potatoes = new JButton(Const.POTATOES);
  
  private JButton girlToy = new JButton(Const.JOUETFILLE);
  private JButton boyToy = new JButton(Const.JOUETGARCON);

  private JButton validate = new JButton("Valider");

  public MenuSelection() {
    this.setTitle("Menu");
    this.setSize(400, 200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    bindActions();
    addButtons();

    this.setVisible(true);
  }

  private void addButtons() {
    JPanel container = new JPanel();
    container.setLayout(new GridLayout(3, 1));

    JPanel containerType = new JPanel();
    containerType.setLayout(new GridLayout(1, 2));
    containerType.add(bestOf);
    containerType.add(maxiBestOf);
    containerType.add(goldenMenu);
    containerType.add(happyMeal);
    container.add(containerType);

    JPanel containerBurger = new JPanel();
    containerBurger.setLayout(new GridLayout(2, 4));
    containerBurger.add(burger1);
    containerBurger.add(burger2);
    container.add(containerBurger);

    JPanel containerDrink = new JPanel();
    containerDrink.setLayout(new GridLayout(2, 4));
    containerDrink.add(drink1);
    containerDrink.add(drink2);
    container.add(containerDrink);

    JPanel containerAccompaniment = new JPanel();
    containerAccompaniment.setLayout(new GridLayout(2, 4));
    containerAccompaniment.add(fries);
    containerAccompaniment.add(potatoes);
    container.add(containerAccompaniment);

    container.add(validate);
    this.setContentPane(container);
  }

  private void bindActions() {

	bestOf.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			menuTest = Const.BESTOF;
			burger2Test = "";
			jouetTest = "";
		}
	});
	maxiBestOf.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			menuTest = Const.MAXIBESTOF;
			burger2Test = "";
			jouetTest = "";
		}
	});
	
	goldenMenu.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			menuTest = Const.GOLDENMENU;
			jouetTest = "";
		}
	});
	happyMeal.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			menuTest = Const.HAPPYMEAL;
			burger2Test = "";
		}
	});
	burger1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			burger1Test = Const.BURGER1;
		}
	});
	burger2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			burger1Test = Const.BURGER2;
		}
	});
	fries.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			accompagnementTest = Const.FRITES;
		}
	});
	potatoes.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			accompagnementTest = Const.POTATOES;
		}
	});
	drink1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			boissonTest = Const.COCACOLA;
		}
	});
	drink2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			boissonTest = Const.PEPSI;
		}
	});
	girlToy.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
			jouetTest = Const.JOUETFILLE;
		}
	});
	boyToy.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			jouetTest = Const.JOUETGARCON;
		}
	});
    validate.addActionListener(new ActionListener() {
    	@Override
		public void actionPerformed(ActionEvent e) {
			MenuFactory menufactory = new MenuFactory();
			MealBuilder mealbuilder = new MealBuilder();
			mealbuilder.addItem(menufactory.create(menuTest, burger1Test, burger2Test, boissonTest, accompagnementTest, jouetTest));
			home.setVisible(true);
			MenuSelection.this.dispose();
		}
    });
  }
  
  public void setHome(Home home) {
    this.home = home;
    //meal = home.getMeal();
    home.setVisible(false);
  }
}
