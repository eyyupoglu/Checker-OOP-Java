package Core;

public class Board {
	
	
	public int[][] board = new int[8][8]; 
	
	
	public void initBoard() {
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
		 }		 
		 this.board = num;
	}
	
	public void printBoard() {
		System.out.print("     0  1  2  3  4  5  6  7 ");
		System.out.println();
		System.out.print("   +------------------------");
		System.out.println();
		for(int i = 0; i<8; i++) {
			System.out.print(i);
			System.out.print( "  | ");
			for(int j = 0; j<8 ; j++) {
				if(board[i][j]==0) {
					System.out.print(" ");
				}
				else{
					System.out.print(this.board[i][j]);
				}
				System.out.print("  ");
			}
			
			System.out.println(" ");
			System.out.print("   |");
			System.out.println(" ");
		}
		
	}
	
	
	
}
