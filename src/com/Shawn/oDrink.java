package com.Shawn;

/**
 * Created by Wolfknightx on 3/20/2016.
 * created constructor to handle putting the 3 values of name, cost, and price into one simple object.
 */
public class oDrink {
    String name = ""; //drink name
    double cost = 0; //cost to make
    double price = 0; //price to purchase

    public oDrink(String name, double price, double cost){
        this.name = name;
        this.price = price;
        this.cost = cost;
    }
}
