import java.util.Scanner;
public class UserInput {

    public static void eh (String[] args) {
        Scanner humanInput = new Scanner(System.in); //The System.in parameter tells the Scanner to read input from the standard input stream, which is typically the keyboard. So, you're creating a Scanner object that is ready to read input from the keyboard.

        System.out.println("What is your name ");
        String name = humanInput.nextLine(); //Here you are identifying that its a string first then storing it in varaible "name" you are then assinging "=" the String varaible "name" to humanInput which is the varaible instance of the scanner function and using the .nextline meathod which is a meathod of the scanner class that reads the next line of input from the user. In this case, it reads the user's input until they press Enter

        System.out.println("Your name is " + name);
        System.out.println("How old are you");
        int age = humanInput.nextInt(); //You can see the differnce here from string input its  int type with the next int meathod being called
        System.out.println("You are"+name+ ",and you are"+age+"Years old");

        //so a proplem with going from .nextline to .nextint is it jumps the line if you were to call another .nextline meathod again this happens because .nextInt meathod will only accept the int value and ignore the /n which appears when you hit the enter key so thats all that will be left of the scanner when you hit enter so it basically skips the next .nextline meathod and carries on
        // The fix for ^ is simply to call humanInput.nextLine(); again after next int to basially clear the scanner 

    }
}
