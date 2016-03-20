package com.Shawn;

import java.text.DecimalFormat;

/**
 * Created by Wolfknightx on 3/20/2016.
 * created constructor to handle putting the 3 values of name, cost, and price into one simple object.
 */
public class oDrink {
    String name = ""; //drink name
    double cost = 0; //cost to make
    double price = 0; //price to purchase
    int quanity = 0; //the quanity of a given drink

    public oDrink(String name, double price, double cost){//this is the generic makeup of a drink
        this.name = name;
        this.price = price;
        this.cost = cost;
    }
    public String infoPrintBack(){ //print the coffee.txt in the following format.
        //return quanity + " - " + name + " drink(s) - cost $" + cost + " to make, and are priced at $" + price + " per drink.";
        DecimalFormat df = new DecimalFormat("#,###,##0.00");//stackoverflow help

        return name + ": sold " + quanity + ", Expenses $" + df.format(calculateExpense())
                + ", Revenue $" + df.format(calculateRevenue())
                + ", Profit $" + df.format(calculateProfit());
        //Cappuccino: Sold 10, Expenses $15.60, Revenue $35.00, Profit $19.40
    }
    public double calculateExpense(){//calcualte the expense from here.
        double expense = cost * quanity;
        return expense;
    }
    public double calculateRevenue(){//calcualte the revune from here.
        return price * quanity;
    }
    public double calculateProfit(){//calculate the profit from here.
        return calculateRevenue() - calculateExpense();
    }
}
