public class abstractCar extends abstractViechle {
    //you will be running into an error of the meathod go needs to be delcared as you cannot create intructions for it in its own class but all its child classes
    @Override
    void go() { //this is an ovveride if you remember we are adding our own implementation of this meathod
        System.out.println("The driver is driving the car "); // since we cant call an instance of vehcile class cus its too vauge and the meathods in it are too vauge
                                                                //we are basically wanting the user to force pick the tpye of vehcile they want which inherits from the vehcile class
                                                                //and we are forced to overide and add our implementation of the go meathod specific to all its child classes
    }
}
