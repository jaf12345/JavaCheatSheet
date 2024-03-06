import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandaling {
    public static void ehh (String [] arr) {
        Scanner scanner = new Scanner(System.in);

        //exception = errors that can distrupt runtime
        //to handle exceptions we surrond the make or break code inside a try block
        try {
            System.out.println("Enter a whole number to devide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to devide by: ");
            int y = scanner.nextInt();
            int z = x / y;

            System.out.println("Result: " + z);
        }
        catch (ArithmeticException error) { //a try cacth is basially if we fail to use the try block we will cacth it with this
            //nothing that the arithmethicEception is an error when you input the wrong type of math
            System.out.println("You cant devide by 0 lel"); //so if the user decides to input 0 for eg it wil cacth this block of code
        }
        //but what happens if they use a string: we will use another cacth block to fuck em up
        catch (InputMismatchException e) {
            System.out.println("Please enter a number you fucktard");
        }
        catch (Exception e) { //this is the lazy exception block which will cacth all exceptions
            System.out.println("Bro??");
        }
        finally {
            System.out.println("This will always print after a try or cacth block regardless of what happens unless runtime stops but this will always exsecute at the end");
            scanner.close(); // here is good practice to close your scanners
        }
    }
}
