public class ArrayOfObjects {
    public static void ArrayObject (String [] arr) {
        arrayObjectsFood[] refrigrator = new arrayObjectsFood[3]; //creating an array of an object class  that can hold 3 food items
        arrayObjectsFood food1 = new arrayObjectsFood("Pizza");
        arrayObjectsFood food2 = new arrayObjectsFood("Hamburger");
        arrayObjectsFood food3 = new arrayObjectsFood("Dohnut"); //sending this list to the contructer in the other class

        refrigrator[0] = food1;
        refrigrator[1] = food2;
        refrigrator[2] = food3;

        System.out.println(refrigrator[0]);//here it will print whatever food object is at index 0 note: it will just print the memory location of it fix is to add .name to it
        System.out.println(refrigrator[1].name);

        //Meathod 2 for declaring all the food objects and assinging the values right away

        arrayObjectsFood foodo1 = new arrayObjectsFood("Pizza");
        arrayObjectsFood foodo2 = new arrayObjectsFood("Hamburger");
        arrayObjectsFood foodo3 = new arrayObjectsFood("Dohnut");

        arrayObjectsFood [] refigorator = {foodo1,foodo2,foodo3}; // in this process we are calling the call and creating instance of it and passing the argument to the contructer then
                                                                    //we are creating the varaible instance in whcih all the objects we have created will be stored in and passed to the contructer again
                                                                    //note: since the contruster has the same name as the class the java compiler knows automatically when your calling the class and passing arguments stright to its contruter


    }
}
