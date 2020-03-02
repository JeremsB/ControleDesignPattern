package com.tactfactory.designpattern.controle.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.tactfactory.designpattern.controle.entities.Meal;
import com.tactfactory.designpattern.controle.entities.MealBuilder;
import com.tactfactory.designpattern.controle.entities.items.*;
import com.tactfactory.designpattern.controle.tools.Const;

public class ItemSelection extends JFrame {

  private Home home;
  private Meal meal;
  
  MealBuilder mealBuilder = new MealBuilder();

  private JButton burger1 = new JButton(Const.BURGER1);
  private JButton burger2 = new JButton(Const.BURGER2);

  private JButton drink1Small = new JButton(Const.PETIT + " " + Const.COCACOLA);
  private JButton drink1Medium = new JButton(Const.MOYEN + " " + Const.COCACOLA);
  private JButton drink1Big = new JButton(Const.GRAND + " " + Const.COCACOLA);

  private JButton drink2Small = new JButton(Const.PETIT + " " + Const.PEPSI);
  private JButton drink2Medium = new JButton(Const.MOYEN + " " + Const.PEPSI);
  private JButton drink2Big = new JButton(Const.GRAND + " " + Const.PEPSI);

  private JButton friesSmall = new JButton(Const.PETIT + " " + Const.FRITES);
  private JButton friesMedium = new JButton(Const.MOYEN + " " + Const.FRITES);
  private JButton friesBig = new JButton(Const.GRAND + " " + Const.FRITES);

  private JButton potatoesSmall = new JButton(Const.PETIT + " " + Const.POTATOES);
  private JButton potatoesMedium = new JButton(Const.MOYEN + " " + Const.POTATOES);
  private JButton potatoesBig = new JButton(Const.GRAND + " " + Const.POTATOES);

  private JButton validate = new JButton("Valider");

  public ItemSelection() {
    this.setTitle("Items");
    this.setSize(400, 200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    bindActions();
    addButtons();

    this.setVisible(true);
  }

  private void addButtons() {
    JPanel container = new JPanel();
    container.setLayout(new GridLayout(3, 1));

    JPanel containerBurger = new JPanel();
    containerBurger.setLayout(new GridLayout(2, 4));
    containerBurger.add(burger1);
    containerBurger.add(burger2);
    container.add(containerBurger);

    JPanel containerDrink = new JPanel();
    containerDrink.setLayout(new GridLayout(2, 3));
    containerDrink.add(drink1Small);
    containerDrink.add(drink1Medium);
    containerDrink.add(drink1Big);
    containerDrink.add(drink2Small);
    containerDrink.add(drink2Medium);
    containerDrink.add(drink2Big);
    container.add(containerDrink);

    JPanel containerAccompaniment = new JPanel();
    containerAccompaniment.setLayout(new GridLayout(2, 3));
    containerAccompaniment.add(friesSmall);
    containerAccompaniment.add(friesMedium);
    containerAccompaniment.add(friesBig);
    containerAccompaniment.add(potatoesSmall);
    containerAccompaniment.add(potatoesMedium);
    containerAccompaniment.add(potatoesBig);
    container.add(containerAccompaniment);

    container.add(validate);
    this.setContentPane(container);
  }

  private void bindActions() {

	// Actions code here
		burger1.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new Burger1());
	      }
	    });
		burger2.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new Burger2());
	      }
	    });
		drink1Small.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new Cocacola(Const.PETIT));
	      }
	    });
		drink1Medium.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new Cocacola(Const.MOYEN));
	      }
	    });
		drink1Big.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new Cocacola(Const.GRAND));
	      }
	    });
		drink2Small.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new Pepsi(Const.PETIT));
	      }
	    });
		drink2Medium.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new Pepsi(Const.MOYEN));
	      }
	    });
		drink2Big.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new Pepsi(Const.GRAND));
	      }
	    });
		friesSmall.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new Frites(Const.PETIT));
	      }
	    });
		friesMedium.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new Frites(Const.MOYEN));
	      }
	    });
		friesBig.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new Frites(Const.GRAND));
	      }
	    });
		potatoesSmall.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new Potatoes(Const.PETIT));
	      }
	    });
		potatoesMedium.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new Potatoes(Const.MOYEN));
	      }
	    });
		potatoesBig.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new Potatoes(Const.GRAND));
	      }
	    });

    validate.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        //home.setMeal(meal);
        home.setVisible(true);
        ItemSelection.this.dispose();
      }
    });
  }

  public void setHome(Home home) {
    this.home = home;
    meal = home.getMeal();
    home.setVisible(false);
  }
}
