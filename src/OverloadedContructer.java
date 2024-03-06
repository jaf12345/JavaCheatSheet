public class OverloadedContructer {
    public static void Overload (String [] arr) {
        //overloaded contructers = multipul contructers in the same class that have the same name
        // name + parameters = signiture
        OverlodedContructerPizza pizza = new OverlodedContructerPizza("Thicc crust pizza","Tomatoe","Chesse",16);
        System.out.println("These are the ingredients of your pizza:");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);
        System.out.println(pizza.pizzaSize);
        //If we tried making a pizza with only 3 arguments eg no chese we whoudnt be able to pass it through so we have to create an identical contructer that only takes 3 parameters
    }
}
