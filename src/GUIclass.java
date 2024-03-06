import javax.swing.JOptionPane; //this is the class we have to import to use the gui class
public class GUIclass {
    public static void ehh (String [] args) {
        String namess = JOptionPane.showInputDialog("Enter your name"); //this code will alow you to run a pop up box that will prompt "Enter your name"
        JOptionPane.showMessageDialog(null , "Hello" + namess);
        //for getting int varaibles it will be the same process but with int identifier
        // int age = JOptionPane.showInputDialog("Enter your age"); //A proplem with showInputDialog is it wants to return a string, however you have assinged an int value
        //the fix is to
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); //here the fix is to use the Integer meathod which belongs to Java.Lang class and use the .parseInt meathod which I assume passes an int value from a string so you can store an int inside age varaible
        JOptionPane.showMessageDialog(null , "You are" + age + "Years old");

        // double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height")); this is what a double varaible fix would look like  note: when you are converting string to anything else you have to convert it to that specfic data type



    }
}
