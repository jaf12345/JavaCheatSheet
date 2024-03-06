package Package1;
import Package2.*;

public class A {
    public static void ehh (String [] arr) {
        C c = new C();
       // System.out.println(c.Message); will not allow to be accessed because its hidden from anything outside the package
        System.out.println(c.publicMessagee); // this is using the public modifer so it can be seen from anywhere
    }

}
