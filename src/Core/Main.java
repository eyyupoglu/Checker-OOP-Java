package Core;

public class Main {

	public static void main(String[] args) {
		Board board = new Board();
		Player p1 = new Player();
		Player p2 = new Player();
		GamePlay gamePlay = new GamePlay();
		gamePlay.play(p1, p2, board);
	}

}
