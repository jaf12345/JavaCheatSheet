public class ObjectPassingArguments {
    public static void passingArgumentsToMeathod (String [] arr) {
        //the task of this lesson is to send our gerage class to the car class so we can park some cars in our gerauge class
        objectPassingArgContinued gerage = new objectPassingArgContinued();
        objectPassingArgContinutedP2 cars = new objectPassingArgContinutedP2("BMW"); // here we have created instnace of the car class in main and are sending the arguments through

        gerage.park(cars);// in order for this to work we need to send an "cars" object as the parameters reuqried for the park meathod needs somthing from the car class
        //it works now that we sent our string varaible from car class which we created in main to the park meathod in the gerage class
        objectPassingArgContinutedP2 cars2 = new objectPassingArgContinutedP2("Altezza");
        gerage.park(cars2); // here is another exmaple of passing it through with another car
        //a note that we can only pass "car" objects as that is the only argument accepted by the park parameter if you see in the gerage class the park meathod has been set up to only accept arugments that fit into parameters of the car class hope that makes sence


    }
}
