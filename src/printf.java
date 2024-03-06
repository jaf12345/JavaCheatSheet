public class printf {
    public static void printff (String [] arr) {
        //print f = an optional meathod to control, format and display text to the console window
        //two arugments = format string + object (object,varaible,value)
        // % [flags], [precision], [width], [conversion-charater]
        System.out.printf("This is a format string %",123); //what this will do is format that value and place it at some postion in that string, where the postion is, is identified with the % sign for exmaple %d is a format specifier for a decimal number
        boolean myBoolean = true;
        String myString = "name";
        char myChar = '!';
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf("%b",myBoolean); //this will now display the value inside myBoolean
        System.out.printf("%c",myChar); // and so on for the rest of them
        //conversion charaters are certain letters that follow the % sign, and to display a said object,varaible,value you need the macthing conversion charater
        System.out.printf("Hello %10s"+ myString); // the value is now controlling the width

        System.out.printf("You have this much money%.2f"+myDouble); // this will set the number of digits to display for floating values .2 determines that



    }
}
