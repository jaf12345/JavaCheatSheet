public class staticKeywordFriends {
    String name;
    static int numberOfFriends;
    staticKeywordFriends (String n) {
        name = n;
        numberOfFriends++;//here we are going increment the number of friends

    }
    static void displayFriends() {//the reason this is void is because your not returning anything back to main you are simply excuting the intructions in this meathod
        System.out.println("You have "+numberOfFriends+"friends");
    }

}
