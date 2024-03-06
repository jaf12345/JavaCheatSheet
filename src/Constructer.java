public class Constructer { //why is it useful to pass arugments to a contructor: gives us the ability to create diffrent objects that have diffrent atrributes
    //eg: we can create another human that has a diffrent name age etc but first we need to assign the values to atrributes of our class human
    public static void printff (String [] arr) {
        //contructer = speical type of meathod that is called when an object is instantitated (created)
        ContructerContinued human = new ContructerContinued("Jaf",10,20); //In order to create (instantiate) a human object we need to
        //this is a new class call, a contructor works behind the scene, so instead of creating an instance of the class it will create an instants of an object
        //Basially a special meathod and can even pass arguments to it when you create it.
        System.out.println(human.name); // in its current state it will print null because we need to assign the specifc values "name,weight,age" from the other class to the specific object "human" in this class, the fix is shown in the other class
        //Once you have inputted "this"= name "human" varaible it will return the string jaf to command line

        //Below we will be making another human
        ContructerContinued human2 = new ContructerContinued("Yap",40,80);
        System.out.println(human2.name); //this will now display "Yap" which he explains is the point of contructers because it allows us to create objects that have diffrent atrributes eg making another human
        //in the OOP lesson you can only call one specfic car which was altezza. But here we can make diffrent atrributes for the same object
        human2.eat();

        human.drinking(); // now every new contructer of the object human can access the meathods of the human class

    }
        //to sum it up again contructers allow us to create diffrent instances of the same object because they have diffrent attributes but can access upon the same meathods
}
