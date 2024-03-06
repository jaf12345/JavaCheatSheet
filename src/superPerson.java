public class superPerson {
    String name;
    int age;
    superPerson (String n,int aage) {
        name = n;
        age = aage;
    }

    public String toString() { // will be returning these values to wherever they are called from
        return name + "\n" + this.age + "\n";
    }
}
