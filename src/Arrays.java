public class Arrays {
    public static void arrays (String [] arr) {
        // arrays = used to store multipul values in a single varaible
        String [] cars = {"Hyundai","Subaru","Toyota"};
        cars[0] = "Evo"; //will now replace postion 0 with evo
        System.out.println(cars[0]);

        String[] newCars = new String[2]; //this will add a total of 2 strings to our array of newCars

        newCars[0] = "STI";
        newCars[1] = "GR";
        newCars[2] = "Volester";

        //Using a for loop to display the contents of an array
        for (int i = 0; i<cars.length; i++) { //so this will keep looping through as it starts with array postion number 0
            System.out.println(cars[i]); // This here I assume is telling to print the array of cars from the int value postion of i which is 0
        }

    }
    public static void twoDArray() {
        //2d arrays = an array 2 dimensional
        String [] [] car = new String[2][2];
        car [0][0] = "Altezza";
        car [0][1] = "Sti";
        car [1][0] = "Mopar";

        // to display the contents of the 2d array we will use a nested for loop where the outer for loop will take care of the rows and an inner for loop take care of the collums
        for (int i=0; i<=car.length; i++) {
            System.out.println();
            for(int j=0; j<car[i].length; j++) { //what this is doing is taking the length of the first row and will continue adding to j as long as its less then the length of the row it is currently on
                System.out.println(car[i][j]+" "); //car[i] is basially saying j will repeat the number of collums in the postion of i which is basially the current row it is in
            }
        }
        //the other way to make arrays is to assign postions to exsisting varaibles
        String [] [] carrs = {{"Pepe","Popo","Lala"},
                              {"nom","lom","yom"}
                                                    };
    }

}
