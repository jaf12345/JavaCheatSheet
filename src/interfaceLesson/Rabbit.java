package interfaceLesson;

public class Rabbit  implements Prey{
    @Override //when you implement somthing you must delcare it in body in the implemented class
    public void flee() {
        System.out.println("The rabbit is running away ");

    }
}
