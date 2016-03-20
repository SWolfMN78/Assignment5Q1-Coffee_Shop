package com.Shawn;

public class Main {

    public static void main(String[] args) {
	// This is the front door of the shop that will be the overall presentation level
        oCoffeeShop cs = new oCoffeeShop();

        cs.shopGreeting(); //display greeting
        while (cs.qMoreDrinks == true){//as long as more drinks need entering this will stay true until line 13 = n.
            cs.displayDrinkList(); //display current quantity, drinks, cost and price along with current grand total.
            cs.editDrinkInfo(); //Ask user for which drink they want to enter information
            cs.askForMoreDrinks(); //check if the user needs more drinks updated.
        }
        cs.displayDrinkList(); //display the final read out of information.
        cs.shopExit(); //Diplay thank you - End
    }
}
