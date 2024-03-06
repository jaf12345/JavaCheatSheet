public class Encapsulation {
    public static void ehh (String [] arr) {
        //encapsulation = attributes of a class being hidden or private
        //can only be accessed through meathods, (getters,setters)
        //You should make attributes private if you dont have a reason to make them public

        encapsulationCar car = new encapsulationCar("Toyota","Altezza",2001);
      //  System.out.println(car.make); // the make is not visible  because the modifer is private only the class itself can see it
        System.out.println(car.getMakee()); //now this will return the make as you are using the "getter" meathod

        car.year = 2022; //this wont work because we need to create a "setter" meathod to allow changes to private varaibles
        car.setMakee("Subaru");//here we can now set diffrnt attributes for the car instance using the sette meathod so that now toyota will change to subaru 

    }
}
