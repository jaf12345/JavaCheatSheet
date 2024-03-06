public class toStringMeathod {
    public static void toString (String [] arr) {
        //tostring()= speical meathod that all objects have, returns a string statement that "texttully represents" an object
        toStringMeathod car = new toStringMeathod();
        System.out.println(car); //what this will print is the adress in memory location of the car varaible
        System.out.println(car.toString());//this will also print the memory location of the car
        //we are going to be overwritign the .tostring meathod
        //we will create the meathod intructions in the other class

        //it will now print the textual arritubutes of the car
        System.out.println(car);//this will also work is well because the "println" statement also does a .tostring meathod which i assume its calling the contruster we made in the other class?
        //which does seem to be the case its essentailly overiding its defult .tostring ehtier doing it implicility by just calling println or doing it explicitly by calling car.tostring itself

    }
}
