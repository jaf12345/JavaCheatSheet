import java.util.*;
public class TwoDArrayList {
    public static void twoDArrayList (String [] arr) {
        //2d array list = a dynamic list of lists
        //You can change the size of these lists during runtime

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasat");
        bakeryList.add("Garlic");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Apple");
        produceList.add("Banana");
        produceList.add("Orange");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Soda");
        drinksList.add("Coffee");

        System.out.println(bakeryList.get(0)); //this will get and print the string value stored in postion 0
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        groceryList.add(bakeryList);
        groceryList.add(drinksList);
        groceryList.add(produceList); //here you are adding all the lists inside 1 list

        System.out.println(groceryList.get(0).get(0)); //if we want to retrive Pasat and display it we would have to first get the first index list
        // then inside that index list we have to get the index postion once we have both we can print what we want







    }
}
