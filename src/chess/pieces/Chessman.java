package chess.pieces;



import java.util.ArrayList;

import chess.Position;
import chess.SideColor;



public abstract class Chessman {

	public SideColor color;    // Player Side Color of piece i.e White/Black.
	public boolean notMoved;   // Status of a Piece.
	public Position pos;      // position of a Piece
	public int Value;         // Value of a piece
	
	public short imgSrc;      // Image of a piece.
	
	abstract void loadImage() ;	

	
	public abstract ArrayList<Position> GetMoves(Chessman[][] board);
}
