package ticTacToeGame;

public class Referee {

	public void proposeToMakeTurn() {
		System.out.println("Please, make your Turn");
	}

	public boolean checkIfTurnIsWinned(Move move, Board board) {

		int countRow = 0;
		// �������� �� �� �
		for (int j = 0; j < board.getBoardTable()[move.getX()].length; j++) {
			if (board.getBoardTable()[move.getX()][j] != null
					&& board.getBoardTable()[move.getX()][j] == (move.getActionFigure())) {
				countRow++;
			}
		}
		if (countRow == board.getBoardTable()[move.getX()].length) {
			return true;
		} else {
			countRow = 0;
		}

		// �������� �� �� Y
		for (int i = 0; i < board.getBoardTable().length; i++) {
			if (board.getBoardTable()[i][move.getY()] != null
					&& board.getBoardTable()[i][move.getY()] == (move.getActionFigure())) {
				countRow++;
			}

		}
		if (countRow == board.getBoardTable().length) {
			return true;
		} else {
			countRow = 0;
		}

		// ֳ 2 ��������, �� �����, ���������� ���� ��� ����� ������
		// ����������� ������ �� boardTable ������� 3x3, 4x4, 5x5..

		if (board.getBoardTable().length == board.getBoardTable()[0].length) {
			
			// �������� �� ������� 45*, �� ������ � = y:
			// ��������� ��� ������ 3�3: ������ ���� 0.0, 1.1, 2.2 ��������.
			// ��������� ��� ������ 4�4: ������ ���� 0.0, 1.1, 2.2, 3.3 ��������.
			// ��������� ��� ������ 5�5: ������ ���� 0.0, 1.1, 2.2, 3.3, 4.4
			// ��������.
			
			if (move.getX() == move.getY()) {

				int i;
				int j;

				for (i = 0, j = 0; i < board.getBoardTable().length; i++, j++) {
					if (board.getBoardTable()[i][j] != null
							&& board.getBoardTable()[i][j] == (move.getActionFigure())) {
						countRow++;
					}
				}
				if (countRow == board.getBoardTable().length) {
					return true;
				} else {
					countRow = 0;
				}
			}

			// �������� �� ������� 45*, �� ���� ������� � �� y = board.getBoardTable().length-1:
			// ��������� ��� 3�3 ������ ���� ������� ���� 2: ������ ���� 2.0, 1.1, 0.2 ��������.
			// ��������� ��� 4�4 ������ ���� ������� ���� 3: ������ ���� 3.0, 2.1, 1.2, 0.3 ��������.
			// ��������� ��� 5�5 ������ ���� ������� ���� 4: ������ ���� 4.0, 3.1, 2.2, 1.3, 0.4 ��������.

			if ((move.getX() + move.getY()) == board.getBoardTable().length - 1) {
				int i;
				int j;

				for (i = 0, j = board.getBoardTable().length - 1; i < board.getBoardTable().length; i++, j--) {
					if (board.getBoardTable()[i][j] != null
							&& board.getBoardTable()[i][j] == (move.getActionFigure())) {
						countRow++;
					}
				}
				if (countRow == board.getBoardTable().length) {
					return true;
				} else {
					countRow = 0;
				}
			}
		}

		return false;
	}

	public void putSignOnBoard(Move move, Board board) {

		board.getBoardTable()[move.getX()][move.getY()] = move.getActionFigure();

	}

}
