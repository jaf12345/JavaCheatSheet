import java.util.Scanner;
public class AndOrOP {
    public static void andOrOp (String [] arr) {
        /*&& = (AND)
        || = (OR)
        ! = (NOT
         */

        Scanner input = new Scanner(System.in);
        System.out.println("How much hp are you making");
        int enginehp = input.nextInt();
        input.nextLine();
        String correctCarModle = "Altezza";
        System.out.println("What car you have and engine hp");
        String carInput = input.nextLine();

        if (enginehp<200 &&carInput!=correctCarModle) {
            System.out.println("You slow");
        }
        else if (enginehp>200 && carInput==correctCarModle) {
            System.out.println("You a real g");
        } else {
            System.out.println("Do better");
        }
    }
}
