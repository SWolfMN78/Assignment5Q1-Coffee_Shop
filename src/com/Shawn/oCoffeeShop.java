package com.Shawn;

/**
 * Created by Wolfknightx on 3/20/2016.
 * Main class for handling the different functions of the coffee shop computer log - here the magic happens
 */
public class oCoffeeShop {
    oCoffeeShopList CSList = new oCoffeeShopList();
    String drinkName = "";  //Drink name from arraylist.
    int drinksSold = 0; //int information entered by user
    double drinkExpenses = 0; // Sold * Cost to Make (on form)
    double drinkRevenue = 0; // Sold * Purchase price
    double drinkProfit = 0; // Expenses - Revenue
    double grandTotal = 0; // Revenue * Total number of all drink
    boolean qMoreDrinks = false;

    public void shopGreeting(){
        System.out.println("Welcome to the Tweek Drip Coffee Report System.");
        System.out.println("Select your coffee drink from the list to get started");
    }
    public void calculateDrinkCost(){

    }
    public void calculateGrandTotal(){

    }
    public void displayDrinkList(){
        System.out.println(CSList.toString());
    }
    public boolean checkAdditionalDrinks(boolean trueFalse){
        if (trueFalse == true){
            qMoreDrinks = true;
        }
        return trueFalse;
    }


}
