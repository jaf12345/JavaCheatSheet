import java.util.Random;

public class LocalGlobalDiceRoller {
    //2nd alternitive
    /*
    Random random; here we are just delcaring it and we finishing instantiating it inside the contructor
    int number;
     */
     LocalGlobalDiceRoller () {
         Random random = new Random();
         int number =0;
         roll(random,number);

     }
     void roll(Random ran ,int num) { // here we are creating the parameters to accep the arguments passed by the called roll meathod in the contructor
        num = ran.nextInt(6)+1; //adding 1 because it will useally only display 0-5
         System.out.println(num);

         //the proplem we are running into is that "random" and "number" are hidden to the roll meathod because there local varaibles inside the contructer
         //2 ways to solve is to pass "random" and "number" as arguments to roll meathod or assign "random" and "number" as global varaibles
     }
}
