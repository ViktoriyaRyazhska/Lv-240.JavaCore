package ticTacToeGame;

import java.io.IOException;

public class Game {

	public static int numberOfMoves = 1;

	public static void main(String[] args) {

		Referee referee = new Referee();

		Player player1 = new Player(ActionFigure.CROSS, PlayerType.COMPUTER);
		Player player2 = new Player(ActionFigure.NOUGHT, PlayerType.COMPUTER);

		Board board = new Board();
		System.out.println(board.getBoardTable().length);
		Player[] players = { player1, player2 };

		
			while (board.hasMoreSpace()) {

				try {
					if (Game.turnAndPut(board, referee, players)) {
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println(
							"�� ����� �� ���� �������� � ���� � ��� Y, ������� ���� ����� ��� ��������� ������ ������");
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					System.out.println(
							"�� ����� �� ���� �����, ��� ��������. �������� ������� ���� � ����� [0;2], �� �������� �� ������ ������");
					e.printStackTrace();
					break;

				}
				// if (!board.hasMoreSpace()){
				// System.out.println("��� ����������� ����");
				// }
				// Move move1 = player1.turn(board);
				// referee.putSignOnBoard(move1, board);
				// board.printBoard();
				// System.out.println();
				// if (referee.checkIfTurnIsWinned(move1, board)){
				// System.out.println("³����, ������� �1 ������");
				// break;
				// } else if (!board.hasMoreSpace()){
				// System.out.println("��� ����������� ����");
				// }
				//
				// Move move2 = player2.turn(board);
				// referee.putSignOnBoard(move2, board);
				// board.printBoard();
				// System.out.println();
				// if (referee.checkIfTurnIsWinned(move2, board)){
				// System.out.println("³����, ������� �2 ������");
				// break;
				// } else if (!board.hasMoreSpace()){
				// System.out.println("��� ����������� ����");
				// }

			}
		
	}

	public static boolean turnAndPut(Board board, Referee referee, Player[] players)
			throws NumberFormatException, IOException {
		boolean gameIsOver = false;

		for (int i = 0; i < players.length; i++) {
			Move move = players[i].turn(board);
			referee.putSignOnBoard(move, board);
			System.out.println("�������, �� ��� ������� '" + move.getActionFigure().getSign() + "', ������� ��� "
					+ numberOfMoves + "-� ���" + "\n" + "��������� ����");
			System.out.println();
			board.printBoard();
			System.out.println();
			if (referee.checkIfTurnIsWinned(move, board)) {
				System.out.println("³����, �������, �� ��� ������� \"" + players[i].getActionFigure().getSign()
						+ "\", ������");
				gameIsOver = true;
				break;
			} else if (!board.hasMoreSpace()) {
				System.out.println("��� ����������� ����");
				gameIsOver = true;
				break;
			}

		}
		numberOfMoves++;
		return gameIsOver;

	}

}
