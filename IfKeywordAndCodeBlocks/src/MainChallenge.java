public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800, highScore = 5_000, levelCompleted = 5,
                bonus = 100;

        int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println("Your final score was " + finalScore);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }
}
