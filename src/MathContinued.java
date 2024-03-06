import java.util.Scanner;
public class MathContinued {
    static void ehhh (String[] args){
        double x = 3.14;
        double y = -10;

        double z = Math.max(x,y); //what this is doing here is storing the largest value is varaible z
        System.out.println(z); //here we are displaying that value
        //you can also use .min to get obv
        // you also have other functions like sqrt for squrerootm, round, ceil,floor etc
    }

    static void FindingHypotnue() {

        Scanner values = new Scanner(System.in);
        System.out.println("What is the value of x(small side num: 1)");
        double valueOfX = values.nextDouble();
        System.out.println("What is the value of y (small side num: 2)");
        double valueOfY = values.nextDouble();
        double finalValueofX = Math.pow(valueOfX,2);
        double finalValueofY = Math.pow(valueOfY,2);
        double z = Math.sqrt(finalValueofY+finalValueofX);
        System.out.println("The value of the longest side of the trianlge is"+ z);
    }
}
