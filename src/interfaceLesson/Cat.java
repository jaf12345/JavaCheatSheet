package interfaceLesson;

public class Cat implements Prey,Predator{ //Here is an example of where an animal can inhreit from 2 diffrnet interfaces as they fit in both catogories
    @Override
    public void hunt() {
        System.out.println("The cat is hunting");
    }
    @Override
    public void flee() {
        System.out.println("The cat is running away");
    }
}
