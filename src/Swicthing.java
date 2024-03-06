public class Swicthing {
    public static void swicthing (String [] arr) {
        //swicth = statement that allows a variable to be tested againts a list of values
        String day = "Friday";
        switch (day) {
            case "Sunday" : System.out.println("It is sunday");
                break;
            case "Monday" : System.out.println("Its monday");
                break;
            case "Tuesday" : System.out.println("Its Tuesday");
                break;
            case "Wenesaday" : System.out.println("Its Wenesaday");
                break;
            case "Thursday" : System.out.println("Its Thursday");
                break;
            case "Friday" : System.out.println("Its Friday");
                break;
            case "Saturday" : System.out.println("Its Saturday");
            break;

            default: //the statement that if there are no macthes it "defaults" to this
                System.out.println("That is not a day");
            //Whichever varaible is passed it will evalute that input againts each swicth, if there is a macth it will peform the task after ":"
            //If you do not use the break statement the first instance there is a macth againts the swicth statement it will accept all codes after ":" in the lines below it
        }
    }
}
