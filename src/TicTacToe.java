import java.util.Random;

import javax.swing.JOptionPane;

public class TicTacToe {
	private Player playerOne;
	private Player playerTwo;
	private char[][] board = new char[3][3];
	
	public TicTacToe(){
		this("King");
	}
	
	public TicTacToe(String n){
		playerOne = new Player();
		playerTwo = new Player(n, true);
		makeBoard();
	}
	
	public void makeBoard(){
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				board[i][j] = ' ';
			}
		}
	}
	
	private void setPlayerPieces(){
		Random rNum = new Random();
		int godComplex = rNum.nextInt(2);
		if(godComplex == 1){
			playerOne.setPiece('x');
			playerTwo.setPiece('o');
		}
		else{
			playerOne.setPiece('o');
			playerTwo.setPiece('x');
		}
	}
	
	private void compPlays(){
		Random rNum = new Random();
		int x = rNum.nextInt(3);
		int y = rNum.nextInt(3);
		while(board[x][y]!=' '){
			x =  rNum.nextInt(3);
			y =  rNum.nextInt(3);
		}
		board[x][y] = playerOne.getPiece();
	}
	
	private void personPlays(){
		int x=Integer.parseInt(JOptionPane.showInputDialog("Enter a Row Value(0-2): "));
		int y=Integer.parseInt(JOptionPane.showInputDialog("Enter a Column Value(0-2): "));
		while(board[x][y]!=' '){
			x=Integer.parseInt(JOptionPane.showInputDialog("Enter a Row Value(0-2): "));
			y=Integer.parseInt(JOptionPane.showInputDialog("Enter a Column Value(0-2): "));
		}
		board[x][y] = playerTwo.getPiece();
		
	}
	
	private boolean checkWin(char c){
		int rowTotal = 0;
		int colTotal = 0;
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				if(board[i][j]==c){
					rowTotal +=1;
				}
				if(rowTotal==3){
					return true;
				}
			}
			rowTotal = 0;
		}
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				if(board[j][i]==c){
					colTotal +=1;
				}
				if(colTotal==3){
					return true;
				}
			}
			colTotal = 0;
		}
		return false;
	}
	
	public boolean playGame(){
		setPlayerPieces();
		Random rNum = new Random();
		int godComplex = rNum.nextInt(2);
		String boardStr = "";
		boolean full = true;
		if(godComplex == 0){
		System.out.println("Person goes first");
			while(true){
				personPlays();
				boardStr = "";
				full = true;
				for(int i = 0; i<3; i++){
					for(int j = 0; j<3; j++){
						boardStr += "[";
						boardStr += board[i][j];
						boardStr += "]";
						if(board[i][j]==' '){
							full = false;
						}
					}
					boardStr+= "\n";
				}
				if(full){
					return false;
				}
				System.out.println(boardStr);
				if(checkWin('x')){
					return true;
				}
				else if(checkWin('o')){
					return true;
				}
				compPlays();
				boardStr = "";
				full = true;
				for(int i = 0; i<3; i++){
					for(int j = 0; j<3; j++){
						boardStr += "[";
						boardStr += board[i][j];
						boardStr += "]";
						if(board[i][j]==' '){
							full = false;
						}
					}
					boardStr+= "\n";
				}
				if(full){
					return false;
				}
				System.out.println(boardStr);
				if(checkWin('x')){
					return true;
				}
				else if(checkWin('o')){
					return true;
				}
			}
		}
		else{
			System.out.println("Computer goes first");
			while(true){
				compPlays();
				boardStr = "";
				full = true;
				for(int i = 0; i<3; i++){
					for(int j = 0; j<3; j++){
						boardStr += "[";
						boardStr += board[i][j];
						boardStr += "]";
						if(board[i][j]==' '){
							full = false;
						}
					}
					boardStr+= "\n";
				}
				if(full){
					return false;
				}
				System.out.println(boardStr);
				if(checkWin('x')){
					return true;
				}
				else if(checkWin('o')){
					return true;
				}
				personPlays();
				boardStr = "";
				full = true;
				for(int i = 0; i<3; i++){
					for(int j = 0; j<3; j++){
						boardStr += "[";
						boardStr += board[i][j];
						boardStr += "]";
						if(board[i][j]==' '){
							full = false;
						}
					}
					boardStr+= "\n";
				}
				if(full){
					return false;
				}
				System.out.println(boardStr);
				if(checkWin('x')){
					return true;
				}
				else if(checkWin('o')){
					return true;
				}
			}
		}
	}
	
	public String toString(){
		String boardStr = "";
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				boardStr += "[";
				boardStr += board[i][j];
				boardStr += "]";
			}
			boardStr+= "\n";
		}
		
		return(playerOne.toString() + "\n"+
			   playerTwo.toString()+ "\n" +boardStr);
	}
}
