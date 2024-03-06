public class OOP {
    public static void printff (String [] arr){
        //objects = an instance of a class that may cottain arrtibutes and meathods
        //ex: (phone,desk,computer,coffee cup)
        //attributes cab be defined as the charatristics an object has and meathods the actions the object it can pefrom
        OOPcalledClass car = new OOPcalledClass(); //the "car" varaible now has all the attributes in the car class and ready to use methods
        System.out.println(car.colour);// it will first create car object and make an instance of it then it will access the class and look for string colour and display that
        car.drive(); //we are now calling the meathod

        //we can create multipul instances of the class for more objects
        OOPcalledClass newCar = new OOPcalledClass();
        System.out.println(newCar.modle); // this will print the same contents as the other instance created called car because we are simply sourcing the attribuites all over again
    }
}
