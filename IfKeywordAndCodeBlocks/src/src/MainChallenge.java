package src;

public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800, highScore = 5_000,
                levelCompleted = 5,
                bonus = 100;
        
        score = 10_000;
        highScore = 5_000;
        levelCompleted = 8;
        bonus = 200;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
