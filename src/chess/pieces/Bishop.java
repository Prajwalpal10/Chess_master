package chess.pieces;

import java.util.ArrayList;

import chess.Position;
import chess.SideColor;

/* Bishop Moves in  North-East,North-West And South-East, South-West  Directions*/


public class Bishop extends Chessman 
{

	public Bishop(SideColor col , int x , int y)
	{
		color =col;
		pos= new Position(x ,y);
		Value = 350;
		loadImage();
		
	}
	
	public void loadImage() 
	{
		if(this.color==SideColor.WHITE)
		{
			imgSrc=3;
			
		}else 
			imgSrc=9;
	}
	
	public ArrayList<Position> GetMoves(Chessman[][] board) 
	{
		
		ArrayList<Position> moves = new ArrayList<Position>(); ;
		
		//North-East Moves of Bishop.
		int i = 1;
		
		while(this.pos.x+i <= 7 && this.pos.y-i >=0 ) 
		{
		
			if(board[pos.x+i][pos.y-i] == null)
			{
				moves.add(new Position(this.pos.x+i ,this.pos.y-i));				
			}
			
			if(board[pos.x+i][pos.y-i] != null)
			{							
				if(board[this.pos.x+i][this.pos.y-i].color != this.color) 
				{
					moves.add(new Position(this.pos.x+i ,this.pos.y-i));
					break;				
				}
				else 
					break;				
			}	
			i++;
		}
		
		//North-West Moves of Bishop.	
		
		i = 1;
		while(this.pos.x-i >= 0 && this.pos.y-i >=0 ) {

			if(board[pos.x-i][pos.y-i] == null)
			{
				moves.add(new Position(this.pos.x-i ,this.pos.y-i));				
			}
			
			if(board[pos.x-i][pos.y-i] != null) 
			{							
				if(board[this.pos.x-i][this.pos.y-i].color != this.color) {
					moves.add(new Position(this.pos.x-i ,this.pos.y-i));
					break;				
				}
				else 
					break;				
			}	
			i++;
		}
		
		//South-East Moves of Bishop.
		i = 1;
		while(this.pos.x+i <= 7 && this.pos.y+i <=7 ) {
			
			if(board[pos.x+i][pos.y+i] == null){
				moves.add(new Position(this.pos.x+i ,this.pos.y+i));				
			}
			
			if(board[pos.x+i][pos.y+i] != null) {							
				if(board[this.pos.x+i][this.pos.y+i].color != this.color) {
					moves.add(new Position(this.pos.x+i ,this.pos.y+i));
					break;				
				}
				else 
					break;				
			}
			i++;
		}
		
		// South - West moves of Bishop.
		
		i = 1;
		
		while(this.pos.x-i >= 0 && this.pos.y+i <=7 ) {
			
			if(board[pos.x-i][pos.y+i] == null){
				moves.add(new Position(this.pos.x-i ,this.pos.y+i));
								
			}
			
			if(board[pos.x-i][pos.y+i] != null) {							
				if(board[this.pos.x-i][this.pos.y+i].color != this.color) {
					moves.add(new Position(this.pos.x-i ,this.pos.y+i));
					break;				
				}
				else 
					break;				
			}
			i++;
		}
		

		return moves;
		
	}
}
