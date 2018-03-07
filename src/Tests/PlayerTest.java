package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Core.Player;
import Core.Board;
class PlayerTest {

	@Test
	void testSetType() {
		Player p = new Player();
		p.setType(1);
		
		assertEquals(1, p.type);
	}
	
	@Test
	void testMove() {
		Player p = new Player();
		Board board = new Board();
		board.initBoard();
		p.move(board, 1, 2, 0, 3, p);//moving 1 piece to (0,3) coordinate from (1,2)
		
		
		assertEquals(board.board[0][3], 1);
	}
	

}
