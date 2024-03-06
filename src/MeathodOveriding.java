public class MeathodOveriding {
    public static void ArrayObject (String [] arr) {
        //meathod overiding = Declaring a meathod in sub class,
                            //Which is already present in parent class
                            //done so that the child class can give its own implementation
        MeathodOveridingCat cat = new MeathodOveridingCat();
        cat.speak(); //what we will do from here is copy and paste the inherited meathod from animal class into the cat class and let it create its own implementation of the meathod
        MeathodOveridingAnimal animal = new MeathodOveridingAnimal();
        animal.speak();//depending what you call it will use the cloest related and approiate meathod for it call upon and use
    }
}
