package com.Shawn;

import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.internal.dynalink.support.RuntimeContextLinkRequestImpl;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import jdk.internal.org.xml.sax.ErrorHandler;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
 * Created by Wolfknightx on 3/20/2016.
 * Main class for handling the different functions of the coffee shop computer log - here the magic happens
 */
public class oCoffeeShop {
    oCoffeeShopList CSList = new oCoffeeShopList();
    Scanner scanner = new Scanner(System.in);
    String drinkName = "";  //Drink name from arraylist.
    int drinksSold = 0; //int information entered by user
    double grandTotal = 0; // Revenue * Total number of all drink
    boolean qMoreDrinks = true;
    DecimalFormat df = new DecimalFormat("#,###,##0.00");//stackoverflow help

    public void shopGreeting(){
        System.out.println("Welcome to the Tweek Drip Coffee Report System.");
        System.out.println("Select your coffee drink from the list to get started");
        try {
            CSList.coffeeList();
        }catch (IOException i){
            System.out.println(i);
        }
    }

    public void displayDrinkList(){//display the current drink list, cost to make, price to purchase.
        grandTotal = 0;
        for (oDrink drink : CSList.drinkList ) {//for each type of oDrink in the arraylist of drink
            System.out.println(drink.infoPrintBack());
            grandTotal = grandTotal + drink.calculateProfit();
        }
        System.out.println("Current grand total is $" + df.format(grandTotal));
    }

    public void editDrinkInfo(){
        System.out.println("Please enter the name of the drink you wish to edit");
        drinkName = scanner.nextLine();
        if (CSList.doesContainName(drinkName)){
            System.out.println("Please enter the amount of drinks you sold");
            drinksSold = scanner.nextInt();
            scanner.nextLine();
            CSList.editQuantity(drinkName, drinksSold);
        }else {
            System.out.println("No match found, please type a drink name from the display list.");
        }
    }

    public void askForMoreDrinks(){
        System.out.println("Do you want to edit more drinks Y or N");
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("n")){
            qMoreDrinks = false;
        }
    }

    public void shopExit(){
        System.out.println("Your final listing of information is:");
        displayDrinkList();
    }
}
