import java.util.ArrayList;

public class main {  //class is just a java file that helps us make objects
    public static void main(String[] args) {
        // if it is orange it is a bulit in java function
        String name = "Sole"; // "String" is an object and you can do many things with objects when you hit the "." function right after it.
        System.out.println(name.toUpperCase()); //system.out.println is basially the print statement // .toUpperCase is the function after calling the String "name" which as you see uppercases the name
        // anything with "()" are parathesies and they will essentially be meathods
        addExclimationPoint("Beat yo ass");

        cats a = new cats(); //you are calling the cats class and storing in "a" and creating a new instance of the cats class
        String b = a.iAmCat(); // here you are calling the iamCat function that was stored in varaible a and storing it in a string varaible b
        System.out.println(b); // here you are printing contents of varaible b which was storing the function of iAmcat in varaible a
        // what its basially doing is returning the function of iAmCat which is stored in "a" which stores the class then "b" stores the specfic function then returns to command line


        //ArrayList<Integer> b = new ArrayList<Integer>(); //when you type this code in it will be red you can hover on it and intellij will import the module for ArrayList
        ArrayList<Integer> bs = new ArrayList<Integer>();
        // now I can do b"." and have a bunch of functions to do with b

        // \n is an escape sequnce to basially a "n-newline"
        // \t before a string to tab the sentances
        // if you want to comment out a segment of code use / and *



        cats test = new cats();
        int bb = test.doStuff();
        int value = bb.bbs
        if (){
            System.out.println("Incorrect number");

       } else {
            System.out.println("Your number is correct");
        }

        cats waleloop = new cats();
        waleloop.WhileLoop();


    }

    public static void addExclimationPoint(String randomName ){
        System.out.println(randomName + "!");
        // randomName is just the name of the varaible

        //public static void addExclimationPoint(String randomName ){
        //        return randomName + "!";

        //In this example you can remove system.out.print and put return // However you run into an issue where VOID would be underlined red. Void is the type of what you want to bring back
        // so what you do is change VOID to String

        //public static String addExclimationPoint(String randomName ){
        //        return randomName + "!";

        // back in the main class when you call the function you will type as follows:
        //String randomNames = addExclimationPoint("Beat yo ass")

        //Which is basially saying String randomNames is "=" (is equal to) what is returned from addExclimationPoint("Beat yo ass")
        // then you just print (randomNames) and it should do the same thing
    }

    //The exmaple below will be teaching how to call code from another java file aka the cat class




}
