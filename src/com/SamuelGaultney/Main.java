package com.SamuelGaultney; //rebuild path by right clicking folder in directory if error

public class Main {

    public static void main(String[] args) {


	Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
	double price = hamburger.itemizeHamburger();

	//normal hamburger with additions
	hamburger.addHamburgerAddition1("Tomato", 0.27);
	hamburger.addHamburgerAddition2("Lettuce", 0.75);
	hamburger.addHamburgerAddition3("Cheese", 1.13);
	System.out.println("Total Burger price is " + hamburger.itemizeHamburger());


	//Healthy burger can utilize methods from its parent class
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

    //Deluxe Burger
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
    //how do we make it so that additions cant be added?
        //by overriding those calls to output something else
        deluxeBurger.addHamburgerAddition1("Should not do this", 50.53);





    }


}
