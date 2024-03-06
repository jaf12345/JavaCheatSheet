package ForAndWhileLoopPractice;

public class ForLoopWhileLoop {
    public static void ehh (String [] arr) {
        // A for loop has 3 conditions set out
        // for (varaible; condition; change)
        // the varaible is the setter which we are using to basailly compare a condition too
        //the condition is essentailly what statement will keep repeating untill the condition is met the false is triggerd and the loop stops
        // the change is basially how the condition reaches its false statement, it allows the loop to keep adding after 1 cycle untill the cycle is completed

        // The while loop is more simple in the sence that it has less steps and easier to read
        // int i = 1
        // while ( i < 5) {
        // "Your block of code etc"
        // i++
        // }
        // it is saying while "this statement is true" continue the block of code and add the increment so that the while loop will break once the condition is met

        //^ the while loop above can be written in a for loop too which I will attempt on my own
        // for ( int i; i < 5; i++) {
        // "Hello" + i
        // }

        // a note to state with for loops we are declaring the varaible int "i" inside the for loop so that does mean only the foor loop can access that varaible

        // if you declaring and assign it outside the loop you can leave the varaible part of the for loop completly blank and just set condition and change

        // for ( int i; i <=5; i++) { // a note that this will print "hello 6" this is because on the last cylce of the loop it iterates 1 more time so its last value will be 6
        // "Hello" + i
        // } but if you set it to < 5 it will stop at hello 5

        // Nested loops
        // each time an outer loop is exsecuted the inner loop is exsecuted again
        //eg
        for (int i = 0; i < 10; i++) { //note dispite the increment being done in the initilization of the for loop it actully comes last i will comment it where
            for (int j = 0; j < 5; j++) {
                System.out.println(i+ ""+j);
                //j++
            }
            System.out.println();
            //i++
        }
        //a note from the video the inner loop will fully complete its cycle then technically destory itself and then the outer loop started its 2nd cycle which is i=2 so it will restart the inner loop all over again and print i=2 in the print line statement
        // https://www.youtube.com/watch?v=CwjSpUIFi7w skip to 1:25 and he goes over how the loop exatly unfolds

        for (int i = 0; i < 4; ) {
            for (int j = 0; j<i;) {
                System.out.print('@');
                j++;
            }
            i++;
        }



    }
}
