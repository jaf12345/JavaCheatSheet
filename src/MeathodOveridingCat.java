public class MeathodOveridingCat extends MeathodOveridingAnimal {

    @Override //this here is telling you this meathod is overiding the orginal meathod
    void speak() { //the meathod that is inherited is useally called the overwritten meathod and the child class meathod version of it is called the overwriting meathod
        //this is because the child will create there own version it
        System.out.println("The cat goes meouh");
    }

}
