package GetAndSet;

public class GetterSetter {

    //instance of the varaibles that are gettters and setters are private but thats the point of making gets/sets
        private String name;
        private int age;
        private String favColour;
        //test has no access to these varaibles but to be able to get acess you need setters and getters

    public void setName(String namee) {
        namee = name; //here we are passing the varaible name from external and equalling it to the private varaible name

    } // now if you want to reuturn the results of this private varaible back you will use the get meathod
    public String getName() {
        return name; //this is what it looks like to retrive the name from the private varaible and return it to whereever it is called
    }
}
