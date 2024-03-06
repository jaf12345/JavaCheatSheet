package GetAndSet;

public class Test {
    public static void ehh (String arh) {
        GetterSetter Bob = new GetterSetter();
        Bob.setName("whoops"); // Here you can see the set name when you access the meathod it asks for a string argument to be passed as it has string parameters on the other end of the class
        System.out.println(Bob.getName()); // now we can see the contents of the private varaible 
    }

}
