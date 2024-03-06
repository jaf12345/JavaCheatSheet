public class superKeyword {
    public static void ehh (String [] args) {
    //super = keyword refferance to the (parent) class of an object very similar to "this" keyword
        superHero hero1 = new superHero("Batman",50,"Power");
        System.out.println(hero1.name); // this will now access the string name varaible in person class and print the info

        //we will now use the super keyword to call a meathod going to hero class for this
        superHero hero2 = new superHero("Robbin",30,"Arrow");
        System.out.println(hero2.toString());
    }
}
