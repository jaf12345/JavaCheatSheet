public class encapsulationCar {
    private String make;
    private String model;
    private int year;
    encapsulationCar (String make, String model, int year){
        this.setMakee(make);//here we just instanciated that arguments passed from main to this contructer is = the setter meathod so we can set arrtibutes to the private make varaible
        this.model = model;
        this.year = year;

    }

    public String getMakee() { //these meathods are the way to send private varaibles outside the class
        return make;
    }
    public String geetModlee() {
        return model;
    }
    public int getyearr() {
        return year;
    }

    public void setMakee(String make) {
        this.make = make; // because we have this setter we can remove the instanite in the contructer and just instnatiate the setmakee in there
    }

}
