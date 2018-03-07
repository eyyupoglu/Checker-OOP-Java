package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Core.Board;
class BoardTest {

	
	@Test
	void testInitBoard() {
		
		Board board = new Board();
		
		int[][] num = new int[8][8];
		
		for(int i = 0; i < num.length; i++) {
			 for (int j = 0; j<num.length; j++) {
				 if((i==0 && (j==1|| j==3 || j==5 || j==7)) || (i==2 && (j==1|| j==3 || j==5 || j==7)) ||
						 (i==1 && (j==0|| j==2 || j==4 || j==6))) {
					 num[i][j]=1;
				 }
				 else if(num[i][j]!=2) {
					 num[i][j]=0;
				 }	
				 if((i==5 && (j==0|| j==2 || j==4 || j==6)) || (i==7 && (j==0|| j==2 || j==4 || j==6)) ||
						 (i==6 && (j==1|| j==3 || j==5 || j==7))) {
					 num[i][j]=2;
				 }
				 else if(num[i][j]!=1) {
					 num[i][j]=0;
				 }
			 }
		
		board.initBoard();
		//assertEquals(num, board.board);
		
		
	}
	

}
}
