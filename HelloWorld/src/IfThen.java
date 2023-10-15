public class IfThen {
    public static void main(String[] args) {
        boolean isAlien = false;
//        if (!isAlien) {
//            System.out.println("Is it not an alien!");
//            System.out.println("And I am scared of aliens.");
//        }

        int topScore = 80;

        if(topScore == 100){
            System.out.println("You got the high score!");
        }else{
            System.out.println("Your score is --> " + topScore);
        }
    }
}