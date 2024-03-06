public class ContructerContinued {

    String name; // here we are just defining the attributes
    int age;
    double weight;
    ContructerContinued(String name,int age, double weight){ //setting up the parameters for the arguments to be passed to
      /*  name = name;
        age = age;
        weight = weight;
        Below will be the fix
       */
        this.name = name;
        this.age = age;
        this.weight = weight; //guide says to pretend your writing "humam" here which is basially the varaible name of this class instance in the main class
        //"this" is only used when the names are the same for example "this.name = name" can be changed to name = n; we will still be defining the attributes and assinging them to the instance varaibles

    }
    void eat() {
        System.out.println(this.name+"is eating"); // how we would write it to create a function for this class
    }
    void drinking(){
        System.out.println(this.name+"Is drinking");
    }
}
