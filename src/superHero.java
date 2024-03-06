public class superHero extends superPerson {
    String power;
    superHero(String n,int aage,String powa) {
        super(n,aage); // //to return these varaibles back to the parent class you have to use the "super" keyword
        String power = powa;

        // when you use super keyword you now dont need to delcare it here so we will comment this out
       // name = n; //here you can see you are instantiating the varaible name to equal to the parameters of the superhero contructer but you are souring the varaibles from the person class because
       // age = aage; // the hero class is a child class of person class so it inherits all its traits and atrributes

        //now the hero class is set up as we have name age and power, where name and age have been sourced from the person class
    }
    public String toString() {
        return super.toString()+power; // here we are calling the same meathod from person class but adding our own varaible to the end of it to make it complete
    }
}
