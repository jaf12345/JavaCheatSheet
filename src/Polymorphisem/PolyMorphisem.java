package Polymorphisem;

public class PolyMorphisem {

    public static void ehh (String [] arr) {
        //polymorphisem = greek word for many poly (many) morph (form)
        //the ability for an object to identify as more then 1 type
        Car car = new Car();
        Bike bike = new Bike();
        ATV atv = new ATV();

        Vehicle [] racers = {car,bike,atv}; //Since all of these objects parent class is vehcile we can store all those instances in the vehcile class

        //we can do this to call the go meathod or alternitive meathod will be shown below
        //car.go();
        //bike.go();
        //atv.go();

        //this is the correct meathod will will use a for loop to iterate through the Vehcile array
        for(Vehicle x : racers) { //This is the syntax for a for-each loop in Java. It iterates over each element (x) in the array racers, and the type of each element is specified as Vehicle
            x.go(); //Inside the loop, x represents the current element (an object of type Vehicle) being iterated over. The go() method is then called on the current Vehicle object.
            //x: It's a reference variable of type Vehicle, but since Vehicle is an interface or a superclass, the actual type of the object referred to by x can be any class that implements or extends Vehicle.
            //go(): This is a method call on the Vehicle object. The go() method should be defined in the Vehicle interface or superclass, and it will be overridden by each concrete class (Car, Bike, ATV) that implements or extends Vehicle. This is an example of polymorphism, where the appropriate go() method for each specific class will be invoked at runtime.
        }
    }
}
