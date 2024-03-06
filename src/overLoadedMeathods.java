public class overLoadedMeathods {
    public static void callingMeathods (String [] arr) {
        //over loaded meathods are meathods that shere the same name but have diffrent parameters. Method name + parameters = method signiture

        // int x = add(1); there will be an error here because we dont have a macthing parameter aka the minimum we need to pass is 2
        int x = add(1,3,5);
        System.out.println(x);

    }

    static int add(int a, int b) { // all these meathods are duplicates but its parameters are diffrent so they are distwinsihble and the compiler can also see that
        System.out.println("This is overloaded method num 1");
        return a+b;
    }
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method num 2");
        return a+b+c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method num 3");
        return a+b+c+d;
    }

    static double add(double a, double b, double c, double d) { // when we change data type that also changes the signiture
        System.out.println("This is overloaded method num 3");
        return a+b+c+d;
    }



}
