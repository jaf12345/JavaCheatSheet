import java.util.Scanner;

public class WhileLoops {
    public static void whaleloop (String [] arr) {
        //While loops basisaly keep excuting code for as long as the code remains true
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isBlank()){ //if the stuf inside the brackets remain true then it will continue to excute the block of code that is inside {}
            System.out.print("Enter your name");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+ name); //so once the while loops true statement is true aka somone types somthing in it will excutute that block of code repeadtly then untill somone types there name in it will escape the while loop and go down the code lines
        /* An alternitive is the "do" loop which makes the block of code preceed the while loop
        do {
            System.out.print("Enter your name");
            name = scanner.nextLine();
         } while (name.isBlank())

         the differnce is the "while" loop will check if the condition is met and exsecute the code, while the do loop atlest exsecutes once
         */
    }

    public static void forLoops () {
        // for loops = excutes code for a limited amount of time
        for (int i = 0; i<=10; i++) { //the way "for" loops are desinged is for (initialization; condition; update)
            //side note "--" means minus by 1 and ++ means add by 1
            // i-=2 will now descriment by 2 or any number you set
            System.out.println(i);
        }
    }
}
