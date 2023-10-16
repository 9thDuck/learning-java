public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000, highScore = 5000,
                levelCompleted = 5,
                bonus = 100;

//        if (score < 5000) {
//            System.out.println("Your score is less than highScore5000--> " + score);
//        } else {
//            System.out.println("Got here. Highscore--> " + score);
//        }
        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000, score --> " + score);
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000, score --> " + score);
        } else {
            System.out.println("Got here. Highscore--> " + score);
        }
    }
}
