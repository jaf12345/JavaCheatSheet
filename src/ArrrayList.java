import java.util.ArrayList;

public class ArrrayList {
    public static void ArrrayList (String [] arr) {
        //Array list = A resizeble array
        //Elements can be added or removed after the compilation phase
        //store refferance data types
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Hamburger");
        food.add("Thickshake");
        //for loop again to see elements in the list
        for (int i=0;i<food.size(); i++) { //useally for arrays you use .length but for array length you use .size
            System.out.println(food.get(i)); //food.get(i): Accesses the element at index i in the food ArrayList.
            //useful meathods of arraylist
            food.set(2,"Test"); //This will set a new string at index 2 of the arraylist
            food.remove(1); //Will remove the string at index 1
            food.clear(); // will clear the entire arraylist

        }


    }
}
