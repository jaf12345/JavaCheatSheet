public class staticKeywords {
    public static void ArrayObject (String [] arr) {
        //static = modifer. A single copy of the varaible/meathod is created and sheared
        // the class "owns" the static memeber
        staticKeywordFriends friend1 = new staticKeywordFriends("nigga");
        staticKeywordFriends friend2 = new staticKeywordFriends("yo");

        System.out.println(staticKeywordFriends.numberOfFriends); // this will display 0 however the next steps will be in the friends class
        //now that we had incremented the number of friends inside the contructer since its static the contructer now owns the varaible numoffriends. This is because friend1 and friend2 shere the same varaible of numoffriends
        //to display the static varaible of numoffriends it should be done by calling the name of the class followed by the static memebr

        //what would happen if we remove the static modifer from the varaible numoffriends?
        //what will happen is we whoudnt be able to call it from the class name itself but from the varaible instance of friend1/fnd2 in this class but since its not static you can now make multipul copies of them and since you incremented by 1 they all just copy the increment by 1
        //so hopefully that gives you an understanding of why you have the use of static to create a single version of somthing
        //in the case of making it static we can call the static varaible using a static referance aka the class itself.

        //below we will call a static meathod that will retunr the number of friends we have instead of just incrementing a varaible
        staticKeywordFriends.displayFriends();//here you can see will still have to call the class name and not just an instance of the call created aka friend1/2

        //unrelated exmaple is the math utill is a static class as it makes more sence to call math than the .meathod you want to use otherwise you would have to Math meth = new Math to use it which is silly

    }

}
