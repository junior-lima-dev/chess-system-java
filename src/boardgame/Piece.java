package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null; // Representa a cri��o da pe�a que n�o est� no tabuleiro (Null).
	}

	// M�todo protegido pois ele n�o pode ser vis�vel, com exce��o apenas das classes no mesmo pacote ou subclasses
	protected Board getBoard() {
		return board;
	}
	
	
	
	
}
