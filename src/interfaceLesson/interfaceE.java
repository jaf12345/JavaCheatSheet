package interfaceLesson;

public class interfaceE {
    public static void ehh (String [] arr) {
        //interface = a template that can be applied to a class
        //similar to inheritance, but specifies what a class has/must do
        //classes can apply more then 1 interface, inheritance is limited to 1 super class
        Rabbit rabbit = new Rabbit();

        rabbit.flee(); //here we are calling upon the flee meathod that exsist in the rabbit class which sourses the flee meathod from the interface

        Shark shark = new Shark();
        shark.hunt(); //the whole use of this system is so that the shark class cannot access the attributes of the pray class

        Cat cat = new Cat();
        cat.flee();
        cat.hunt(); // here we can see the temlate of prey and predetor interfaces are being applied to the cat class

    }
}
