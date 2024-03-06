public class WarrperClasses {
    public static void WarrperClasses (String [] arr) {
        //Warrper classes = A way to use primitve data types as refferance data types
        //Refferance data types contain useful meathods
        //can be used with collections (ex:Arraylist)
        //Autoboxing in Java refers to the automatic conversion of primitive data types to their corresponding wrapper classes
        //Unboxing in Java refers to the automatic conversion of wrapper class objects to their corresponding primitive data types.

        /* Primitive       //Warrper
        boolean             Boolean
        char                Charater
        int                 Integer
        double              Double
         */
        Boolean a = true;
        Character b = '@';
        Integer c = 199;
        Double d = 6.99;
        String e = "Yaf";

        //the varaibles ."meathod" will have a bunch of options you can use
        if (a==true) {
            System.out.println("This is true");
        } //the unboxing meathod will return the refferance data type back to a primitive for this process
    }
}
