package com.SamuelGaultney;

/**
 * Created by Samuel on 2/22/2017.
 */
public class HealthyBurger extends Hamburger{

    //must create two new fields for the healthy options
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;


    //constructor calls only the necessary fields from the base class whilst setting the standardized options
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    //again creating basic "setters"
    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    //In order to add price to the itemize method in the parent class, that method must be overwritten.
    @Override //this means healthyBurger.itemizeHamburger will call this method instead of parent class
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger(); //calls itemize method from parent class to set initial price

        if(this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra of " + this.healthyExtra1Price);
        }

        if(this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra of " + this.healthyExtra2Price);
        }

        return hamburgerPrice;
    }
}
