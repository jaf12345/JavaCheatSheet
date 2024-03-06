import java.util.Locale;

public class StringMeathods {
    public static void StringMeathod (String [] arr) {
            //string = a reffernace data type that can store one or more charaters,
            //referance data types have access to a bunch of useful meathods
        String name = "Jaf";
        boolean result = name.equals("Jaf"); //this will store the boolean value of weather name.equals returns and you can then print boolean value to console
        //you can use .equalsIgnoreCase meathod if you dont want it to be case sensitive
        int results = name.length(); // will print the int value lenght of the string inside name
        char resultss = name.charAt(2); //this will print the char at postion 2
        int resultsss = name.indexOf("a"); //this will return the int value of postion the string value you are looking for
        boolean resullt = name.isEmpty(); // this will check weather name varaible is empty
        String reesult = name.toUpperCase(); //Will uppercase the name varailbe and .LowerCase will do the oppiste
        String rresult = name.trim(); //Will trim off empty spaces around the string
        String reeesult = name.replace("a","z"); // this will replace an old char with a new one

        System.out.println(result);

    }
}
