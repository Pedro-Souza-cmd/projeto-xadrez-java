package boardgame;

public class Board {
	
	
	private int rows;
	private int columns;
	private Piece [][] pieces;
	
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}


	public int getRows() {
		return rows;
	}


	public void setRows(int rows) {
		this.rows = rows;
	}
	
	
	
	public int getColumns() {
		return columns;
	}


	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	// Retorna minha matriz na linha row e coluna column
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	// Sobrecarga para retornar a peça pela posição
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	// Põe uma peça no tabuleiro
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}


}
