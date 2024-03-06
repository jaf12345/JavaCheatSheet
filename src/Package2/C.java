package Package2;
import Package1.*;

public class C {
    String message = "This is default"; //the default modifer for this string basially will not allow anythig outside of this package to access  this string
    public String publicMessagee = "This is public messgae ";
    protected String protectedMessage = "This message is protected"; //somthing that is proteced is accesible to a diffrent class in any package as long as that class is a subclass from the class in which the protected object is kept
    private String privateMessage = "This is a private message"; //Somthing that is private is only visible to the class that it contains itself

}
