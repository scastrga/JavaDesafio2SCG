package operators;

public class Pinball {

	private int score;
	private int ball;
	private int points;
	private boolean gameOn;

	/**
	 * Generate a random number
	 */
	private void numBall() {
		ball = (int) (Math.random() * 30 + 1);
	}

	/**
	 * Start Game
	 */
	public void startGame() {
		// Start the game in true
		gameOn = true;
		// while the game is true
		while (gameOn == true) {
			// call numBall
			numBall();
			// if ball is 1 or 2 end game
			if (ball == 1 || ball == 2) {
				endGame();
			} else {
				// else call operators
				operators();
			}
		}
	}

	/**
	 * Add up the points
	 */
	private void sumPoints() {
		// if the ball is bigger than two
		if (ball > 2) {
			// generate random points up to 200
			points = (int) (Math.random() * 200 + 100);
			// it goes to score
			score = score + points;
			// shows the points obtained
			System.out.println("Pium le diste sumPoints toma estos " + points + " puntos");
		}
	}

	/**
	 * double the score
	 */
	private void multiPoints() {
		// if the ball is 5 or 7
		if (ball == 5 || ball == 7) {
			// points are score times two
			points = score * 2;
			// it goes to score
			score = score + points;
			// displays a double punctuation message
			System.out.println("PAAAAAM doble puntuacion");
		}
	}

	/**
	 * method covering scores
	 */
	private void operators() {
		sumPoints();
		multiPoints();
	}

	/**
	 * End Game
	 */
	private void endGame() {
		// turn gameOn false
		gameOn = false;
		// if score is more bigger than 0
		if (score > 0) {
			// displays Game Over message and score
			System.out.println("Game Over : (    ||    Score:  " + score);
		} else {
			// we insult a little and score message
			System.out.println("Game over (No vea si eres malo) || Score: " + score);
		}
	}

}
