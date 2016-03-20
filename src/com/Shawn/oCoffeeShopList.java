package com.Shawn;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by Wolfknightx on 3/20/2016.
 * This list will handle grabbing the .txt file which holds the drink list & pricing information
 */
public class oCoffeeShopList {
    ArrayList<oDrink> drinkList = new ArrayList<oDrink>();

    public void coffeeList() throws IOException{ //put in IOException incase information can't be found/read.
        oDrink drink; //nothing passed in or set at this time - will declare later
        String drinkName = "";
        double costToCreate = 0;
        double priceToPurchase = 0;
        int quantity = 0;

        try (FileReader reader = new FileReader("Coffee.txt")){
            BufferedReader bufReader = new BufferedReader(reader);
            String line = bufReader.readLine();

            //run a while loop to fill the arraylist
            while (line != null){
                drinkName = (line.split(";")[0]); //being as this is a string don't need to re-declare it.
                priceToPurchase = Double.parseDouble(line.split(";")[2]);
                costToCreate = Double.parseDouble(line.split(";")[1]);
                drink = new oDrink(drinkName,priceToPurchase,costToCreate); //populate the drinks based on the above.
                drinkList.add(drink); //take the information from the constructor and push it into the arraylist
                line = bufReader.readLine();
            }
            bufReader.close();
        }
    }

    public boolean doesContainName(String name){
        for (oDrink drink: drinkList) {//if the name that is passed in matches the one on the list then flag true.
            if (drink.name.equalsIgnoreCase(name) == true){
                return true;
            }
        }
        return false;
    }

    public void editQuantity(String name, int quantity){
        for (oDrink drink: drinkList){
            if (drink.name.equalsIgnoreCase(name)){
                drink.quanity = quantity;
            }
        }
    }

}
