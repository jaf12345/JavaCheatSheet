public class IfStatements {
    public static void wh (String args) {
        // to make if statements you use "if()" and then the {}
        //If you set age to 75 it will trigger first if statement because it executes the first true statement and skip everything else
        int age = 18;

        if(age>= 18) {
            System.out.println("You are an adult");

        }
        else if (age>75) {
            System.out.println("You are old");

        }
        else {
            System.out.println("You are a child");
        }

    }
}
