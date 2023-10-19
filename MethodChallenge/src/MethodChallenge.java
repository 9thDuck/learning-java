public class MethodChallenge {
    public static void main(String[] args){
        int score = 1000;
        String name = "Sai";

        int playerPositionOnHighScoreList = calculateHighScorePosition(score);

        displayResult(name, playerPositionOnHighScoreList);
    }

    public static void displayResult (String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }
    public static int calculateHighScorePosition(int score){
        if(score > 999) {
            return 1;
        } else if(score > 499) {
            return 2;
        } else if (score > 99) {
            return 3;
        } else {
            return 4;
        }
    }
}
