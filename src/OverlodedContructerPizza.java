public class OverlodedContructerPizza {
    String bread;
    String sauce;
    String topping;
    int pizzaSize;
    OverlodedContructerPizza (String b,String s,String t,int size ) {
        bread = b;
        sauce = s;
        topping = t;
        pizzaSize = size;


    }
    OverlodedContructerPizza (String b,String s,int size ) { //here it is allowed because we removed 1 parameter
        bread = b;
        sauce = s;
        pizzaSize = size;
    }
}
