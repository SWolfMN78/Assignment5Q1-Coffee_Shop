package com.Shawn;

public class Main {

    public static void main(String[] args) {
	// This is the front door of the shop that will be the overall presentation level
        oCoffeeShop cs = new oCoffeeShop();

        cs.shopGreeting(); //display greeting
        while (cs.qMoreDrinks == true){
            cs.displayDrinkList(); //display current quantity, drinks, cost and price along with current grand total.
            cs.editDrinkInfo(); //Ask user for which drink they want to enter information
            cs.askForMoreDrinks();
        }
        cs.displayDrinkList();


        //Display the total for that item
        //Re-populate the list with the new information
        //Ask the user if they have any other drinks
        //If yes - repeat line 5 of the above
        //If no - tally infomation and display the new list
        cs.shopExit(); //Diplay thank you - End

    }
}
