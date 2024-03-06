public class callingMeathods {
    public static void callingMeathods (String [] arr) {
        //meathod = a block of code that is excuted whenever it is called, in our case meathods outside of main
        // hello(); //we need to add static to the hello meathod to make it work as we are calling from static main,
        //we have to do this because if we dont we would have to create a new instance of the hello meathod because static basially  it means that the method is associated with the class itself, not with any specific instance of the class.

        //A feature of meathods is that we can pass values to it while we are calling it is well
        String name = "Bro";
        int age = 21;
        hello(name,age); //we are passing the string varaible into the meathod hello
        //What values we are sendign to the meathod are kwon as arguments whch can be confused with parameters


        //return types lesson will carry on from here
        int x = 4;
        int y = 10;
        int f = add(x,y); //we are storing the called add meathod which we are passing x and y which will excute its block of code to which then returns its value z and is now storing it in varaible f
        System.out.println(f);
        System.out.println(add(x,y)); //alternitively you can just print the add meathod and it will print the returned results


    }
    static void hello(String namess,int ages) { //^following up on sending arguments to meathods we basially need a macthing set of "parameters" so since we are expecting a string as an argument you have to set that datatype inside the meathods creation
        //^folliwing up we now have a macthing set of arguments and parameters
        //Since we are passing the name varaible to the hello meathod, the hello meathod now has acces to a string varaible of namess and it contains the value set by the string name in the main meathod which we had orginally passed
        System.out.println("Hello "+ namess); //what it essentially doing is storing the passed argument of name into its own string varaible of namess

        //note you can always pass more than 1 argument as long as you have macthing set of parameters
        System.out.println("You are "+ages);

        //return types are basially returning the value back to the area in which we called it

    }

    static int add (int x, int y) { //normally you would use void, however since you wanting to return a data type of that value
        //in order to call the add meathod we need to pass 2 ints which is 2 arugments meaning we need 2 paramneters
        //we need to add a return statement is well
        int z = x+y;
        return z; //now we will return the z value back to where we are calling it from
    }


}
