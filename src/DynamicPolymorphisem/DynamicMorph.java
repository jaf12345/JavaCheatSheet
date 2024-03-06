package DynamicPolymorphisem;

import java.util.Scanner;

public class DynamicMorph {
    public static void ehh (String [] arr) {
        //dyanamic = after compilation (during runtime)
        Animal animal; // in this lesson we dont know which class they want to asusme between dog and cat we just know its an animal
        // this is an example of dyanic ploymorphisem because 1 your asking what form the animal class will take on during runtime and then it creates that intance of it after conditions have been met
        //once a class is picked its going to assume everything form its parent class but everything the child class they picked that has overidden meathods will take over 
        Scanner scanner = new Scanner(System.in);
        System.out.println("What animal do you wana be");
        System.out.println("1= Cat or 2=Bird: ");
        int choise = scanner.nextInt();

        if (choise ==1) {
            animal = new Cat(); //we will be using the cat contruster as this animal has now become a cat
            animal.speak(); //this will use the cat overwritten meathod as its the child class its directly sourcing from
        } else if (choise==2) {
            animal = new Bird();// the same process here if they pick 2
            animal.speak();
        }
        else { //this is the fall back if they are autistic and pick somthing stupid
            animal = new Animal();
            System.out.println("That choise was invalid");
            animal.speak();
        }

    }
}
