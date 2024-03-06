import java.util.Scanner;

public class NestedLoops {
    public static void NestedLoops (String [] arr) {
        //Nested loop = A loop inside a loop
        Scanner scanner = new Scanner(System.in);
        int rows;
        int collums;
        String symbol = "";
        System.out.println("Enter the number of rows");
        rows = scanner.nextInt();

        System.out.println("Enter the number of coluums");
        collums = scanner.nextInt();
        System.out.println("Enter symbol to use");
        symbol = scanner.next();

        for (int i=1; i<=rows; i++) {
            System.out.println();
            for (int j=1; j<=collums; j++) {
                System.out.println(symbol);
            }
        }
    }
}
/*
So, the output is built incrementally as follows:

This makes sence because I missed a detail which is the for loop inside is still INSIDE the outer for loop my brain thought
for etc etc {
}
for etc etc
when its actully
for etc etc {
block of code
for etc etc
}

Outer Loop Iteration 1: the "i" loop - prints a new line
Inner Loop Iteration 1: Prints one symbol. the "j" loop
Inner Loop Iteration 2: Prints one symbol.
Inner Loop Iteration 3: Prints one symbol.
Inner Loop Iteration 4: Prints one symbol.
Moves to the next line for the next row.
Outer Loop Iteration 2:
(Same as above)
Outer Loop Iteration 3:
(Same as above)
 */
