package Core;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GamePlay {
	
	public void play(Player p1, Player p2, Board board) {
		board.initBoard();
		Scanner s = new Scanner(System.in);
		int x;
		int y;
		int xNew;
		int yNew;
		while(true) {
			while(true) {
				board.printBoard();
				
				try {
					System.out.println("---------First Players Turn----------");
					System.out.println("Coordinate of piece to move ");
					System.out.println("Enter X: ");
					y = s.nextInt();
					System.out.println("Enter Y: ");
					x = s.nextInt();
					  
					System.out.println("Coordinate of new position ");
					System.out.println("Enter X: ");
					yNew = s.nextInt();
					System.out.println("Enter Y: ");
					xNew = s.nextInt();
					
					p1.setType(1);
					if(p1.fullfill(board.board, x, y, xNew, yNew, p1)) {
						p1.move(board, x, y, xNew, yNew, p1);
						break;
					}
				}catch(InputMismatchException e){
					System.out.println("Invalid input");
					
					
				}
				
				
			}
			while(true) {
				board.printBoard();
				System.out.println("---------Second Players Turn----------");
				System.out.println("Coordinate of piece to move ");
				System.out.println("Enter X: ");
				y = s.nextInt();
				System.out.println("Enter Y: ");
				x = s.nextInt();
				  
				System.out.println("Coordinate of new position ");
				System.out.println("Enter X: ");
				yNew = s.nextInt();
				System.out.println("Enter Y: ");
				xNew = s.nextInt();
				
				p2.setType(2);
				if(p2.fullfill(board.board, x, y, xNew, yNew, p2)) {
					p2.move(board, x, y, xNew, yNew, p2);
					break;
				}
				
			}
		}
		
	}
	
}

