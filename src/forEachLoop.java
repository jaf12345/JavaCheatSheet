import java.util.ArrayList;

public class forEachLoop {
    public static void fforEachLoop (String [] arr) {
        //for each loop = traversing teahnique to iterate through the elements in an array/collection
        //less steps more readable
        //less flexible
        String [] animals = {"Cat","Dog","Bird","Panda"}; //You could create a for loop to iterate once through each element or a for each loop
        for (String i : animals) { //1. list it as a string because we are iterating through strings, 2. Need an index "i", 3. Need a ":" which basially means "in" so it basially looks like "for every string index in animals"
            //what would you like to do in each iteration of the "for" loop
            System.out.println(i); //since "i" is a string you can print it directly

            //and thats pretty much a for each loop, looks more simple right?

            //now to use it in an array list
            ArrayList<String> animalss = new ArrayList<String>();
            animalss.add("cat");
            animalss.add("Dog");
            animalss.add("Panda");

            for (String j : animalss) {
                System.out.println(j);
            }
            //the process is the exact same for arraylists

        }

    }
}
