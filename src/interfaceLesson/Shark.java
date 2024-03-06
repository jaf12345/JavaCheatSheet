package interfaceLesson;

public class Shark  implements Predator{
    @Override
    public void hunt() { //note that you also have to make the implemented meathod public not sure why but chatgpt it
        System.out.println("The shark is hunting");
    }
}
