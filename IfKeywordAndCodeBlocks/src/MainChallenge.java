public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800, highScore = 5_000,
                levelCompleted = 5,
                bonus = 100, finalScore = score;

        calculateScore(gameOver, score, levelCompleted, bonus, finalScore);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus, int finalScore) {

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
