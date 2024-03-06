public class toStringContinuedCar {
    String make = "Toyota";
    String model = "Altezza";
    String colour = "White";
    int year = 2001;

    public String toString(){
        //Meathod 1
        //String myString = make + "\n"+model+"\n"+colour+"\n"+year; // here we are making a string varaible that will be returned "sent" to whereever its called because now instead of the .tostring meathod returning the memory location it has specific intructions to return the string objects inside the class
        //return myString;

        //Meathod 2
        return make + "\n"+model+"\n"+colour+"\n"+year; // instead of creating another varaible for it, it will return the string representation of all the attributes of the car class
    }



}
