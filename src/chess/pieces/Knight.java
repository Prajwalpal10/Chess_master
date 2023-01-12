package chess.pieces;

import java.util.ArrayList;

import chess.Position;
import chess.SideColor;

public class Knight extends Chessman {

	public Knight(SideColor col , int x , int y) 
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
			imgSrc=4;
		}else 
			imgSrc=10;
	}
	
	public ArrayList<Position> GetMoves(Chessman[][] board) 
	{
		
		ArrayList<Position> moves = new ArrayList<Position>(); ;
		
				
		
		// +2 Up And +1 Right Move.
		
		if(pos.x+1 <= 7 && pos.y+2 <= 7 ) 
		{
			
			if(board[pos.x+1][pos.y+2] == null )
			{
				moves.add(new Position(this.pos.x+1 ,this.pos.y+2));
			}
			if(board[pos.x+1][pos.y+2] != null )
			{
				if(board[pos.x+1][pos.y+2].color != this.color)
				{					
					moves.add(new Position(this.pos.x+1 ,this.pos.y+2));
				}
			}		
			
		}
		
		// +2 Down And +1 Right Move.
		
		if(pos.x+1 <= 7 && pos.y-2 >= 0 ) 
		{
			if(board[pos.x+1][pos.y-2] == null)
			{
				moves.add(new Position(this.pos.x+1 ,this.pos.y-2));											
			}
			if(board[pos.x+1][pos.y-2] != null )
			{
				if(board[pos.x+1][pos.y-2].color != this.color) 
				{					
					moves.add(new Position(this.pos.x+1 ,this.pos.y-2));
				}
			}		
		}	
		
		// +2 Right and +1 UP.
		if(pos.x+2 <= 7 && pos.y+1 <= 7 )
		{
			if(board[pos.x+2][pos.y+1] == null)
			{
				moves.add(new Position(this.pos.x+2 ,this.pos.y+1));		
			}
			if(board[pos.x+2][pos.y+1] != null )
			{
				if(board[pos.x+2][pos.y+1].color != this.color)
				{
					moves.add(new Position(this.pos.x+2 ,this.pos.y+1));
				}
			}		
		}
		
		
		//+2 right and +1 Down Move.		
		if(pos.x+2 <= 7 && pos.y-1 >= 0 ) 
		{
							
			if(board[pos.x+2][pos.y-1] == null)
			{
				moves.add(new Position(this.pos.x+2 ,this.pos.y-1));
			}
			if(board[pos.x+2][pos.y-1] != null )
			{
				if(board[pos.x+2][pos.y-1].color != this.color)
				{					
					moves.add(new Position(this.pos.x+2 ,this.pos.y-1));
				}
			}		
		}
	
		
		//+2 Up And +1 LEft move.
		
		if(pos.x-1 >= 0 && pos.y+2 <= 7 ) 
		{
			
			if(board[pos.x-1][pos.y+2] == null)
			{
				moves.add(new Position(this.pos.x-1 ,this.pos.y+2));
			}
			if(board[pos.x-1][pos.y+2] != null )
			{
				if(board[pos.x-1][pos.y+2].color != this.color)
				{					
					moves.add(new Position(this.pos.x-1 ,this.pos.y+2));
				}
			}					
		}
		
		// +1 Up And +2 left.
		if(pos.x-2 >= 0 && pos.y+1 <= 7 ) 
		{			
			if(board[pos.x-2][pos.y+1] == null)
			{
				moves.add(new Position(this.pos.x-2 ,this.pos.y+1));
			}
			if(board[pos.x-2][pos.y+1] != null )
			{
				if(board[pos.x-2][pos.y+1].color != this.color)
				{					
					moves.add(new Position(this.pos.x-2 ,this.pos.y+1));
				}
			}					
		}
		
		//+2 Down and +1 left .
		if(pos.x-1 >= 0 && pos.y-2 >= 0 )
		{
			if(board[pos.x-1][pos.y-2] == null)
			{
				moves.add(new Position(this.pos.x-1 ,this.pos.y-2));			
			}
			if(board[pos.x-1][pos.y-2] != null )
			{
				if(board[pos.x-1][pos.y-2].color != this.color)
				{					
					moves.add(new Position(this.pos.x-1 ,this.pos.y-2));
				}
			}		
		}
			
		//+2 left and +1 down.
		if(pos.x-2 >= 0 && pos.y-1 >= 0 ) 
		{				
			if(board[pos.x-2][pos.y-1] == null)
			{
				moves.add(new Position(this.pos.x-2 ,this.pos.y-1));						
			}
			if(board[pos.x-2][pos.y-1] != null )
			{
				if(board[pos.x-2][pos.y-1].color != this.color)
				{					
					moves.add(new Position(this.pos.x-2 ,this.pos.y-1));
				}
			}		
		}		

		return moves;
		
	}
}
