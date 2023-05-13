public class Player {
	private String pseudo;
	private int score;
	
	public Player(String n) {
		pseudo = n;
		score = 0;
	}
	public int getScore() {
		return score;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String newPseudo) {
		pseudo = newPseudo;
	}
	public void incrementScore() {
		score++;
	}
}
