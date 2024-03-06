public class abstractKeyword {
    public static void ehh (String [] arr) {
        //abstract = abstract classes cannot be instaniated, but they have subclasses
        //abstract meathods are delcared without an implementation
        abstractCar car = new abstractCar();
        // abstractViechle viechle = new abstractViechle(); // creating an instance of the viechle class is too abstract guide uses going to dealership as an example if you want a vehicle
        //they will want to know weather its a car bike or van etc. but you say nah need a vehicle
        // thats why vehcile class is too generic to call upon and assining the keyword abstract to it will stop somone from creating an instance of it in main
        //we can call aspects of vehicle class via its child classes
        car.go();

    }

}
