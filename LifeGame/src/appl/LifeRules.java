package appl;

import java.util.Arrays;

public class LifeRules {

	private byte[] field;
	private byte[] mirrorField;

	private int width, height;
	private int[] neighboursNotBorder;
	private int[][] neighboursBorder;

	public LifeRules(int width, int height) {
		this.width = width;
		this.height = height;
		field = new byte[width * height];
		mirrorField = new byte[width * height];
		neighboursNotBorder = new int[] { -width - 1, -width, -width + 1, -1, 1, width - 1, width, width + 1 };
		neighboursBorder = new int[][] { { -1, -1 }, { 0, -1 }, { 1, -1 }, { -1, 0 }, { 1, 0 }, { -1, 1 }, { 0, 1 },{ 1, 1 } };
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public byte[] getField() {
		return field;
	}

	public void clear() {
		Arrays.fill(field, (byte) 0);
	}

	public void setCell(int x, int y, byte c) {
		field[y * width + x] = c;
	}

	public byte getCell(int x, int y) {
		return field[y * width + x];
	}

	public void generate() {
		// кл≥тинки не крайн≥
		for (int y = 1; y < height - 1; y++) {
			for (int x = 1; x < width - 1; x++) {
				int j = y * width + x;
				byte n = countNeighbours(j);
				mirrorField[j] = creatingCell(field[j], n);
			}
		}

		// граничн≥ кл≥тинки
		// верх ≥ низ
		for (int x = 0; x < width; x++) {
			int j = width * (height - 1);
			byte n = countBorderneighbours(x, 0);
			mirrorField[x] = creatingCell(field[x], n);
			n = countBorderneighbours(x, height - 1);
			mirrorField[x + j] = creatingCell(field[x + j], n);
		}
		// л≥во право
		for (int y = 1; y < height - 1; y++) {
			int j = width * y;
			byte n = countBorderneighbours(0, y);
			mirrorField[j] = creatingCell(field[j], n);
			n = countBorderneighbours(width - 1, y);
			mirrorField[j + width - 1] = creatingCell(field[j + width - 1], n);
		}

		// обм≥н м≥сц€ми
		byte[] t = field;
		field = mirrorField;
		mirrorField = t;
	}

	private byte countNeighbours(int j) {
		byte n = 0;
		for (int i = 0; i < 8; i++) {
			n += field[j + neighboursNotBorder[i]];
		}
		return n;
	}

	private byte countBorderneighbours(int x, int y) {
		byte n = 0;
		for (int i = 0; i < 8; i++) {
			int bx = (x + neighboursBorder[i][0] + width) % width;
			int by = (y + neighboursBorder[i][1] + height) % height;
			n += field[by * width + bx];
		}
		return n;
	}

	private byte creatingCell(byte self, byte neighbours) {
		return (byte) (self == 0 ? (neighbours == 3 ? 1 : 0) : neighbours == 2 || neighbours == 3 ? 1 : 0);
	}

	@Override
	public String toString() {
		return "LifeRules [field=" + Arrays.toString(field) + ", mirrorField=" + Arrays.toString(mirrorField) + "]";
	}

	public static void main(String[] args) {
		LifeRules l1 = new LifeRules(20, 20);
		l1.setCell(2, 2, (byte) 1);
		l1.setCell(2, 1, (byte) 1);
		l1.setCell(1, 2, (byte) 1);
		l1.setCell(1, 1, (byte) 1);
		l1.setCell(3, 2, (byte) 1);

		for (int i = 0; i < 10; i++) {

			for (int x = 0; x < l1.getWidth(); x++) {
				for (int y = 0; y < l1.getHeight(); y++) {
					System.out.print(l1.getCell(x, y));
				}
				System.out.println();

			}

			System.out.println("_____");
			l1.generate();
		}

	}
}