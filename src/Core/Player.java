package Core;

public class Player {
	
	public int type;
	
	public void setType(int a) {
		this.type = a;
	}
	
	public void move(Board board, int x, int y, int xNew, int yNew, Player p){
		int[][] num = board.board;
		if(this.fullfill(num, x, y, xNew, yNew, p   )) {
			num[x][y]=0;
			num[xNew][yNew]=p.type;
			
			
			board.board = num;
		}
		
	}
	
	public boolean fullfill(int[][] num, int x, int y, int xNew, int yNew, Player p) {
		if (num[x][y]!=(p.type)) {
			System.out.println("This position does not contain your piece!");
			return false;
		}
		
		if (num[xNew][yNew]!=0) {
			System.out.println("Destination position is not empty!");
			return false;
		}
		
		if (!((x==xNew+1) || (x==xNew-1)) || !((y==yNew+1) || (y==yNew-1)) ) {
			
			return false;
		}
		
		return true;
	}
	
}
