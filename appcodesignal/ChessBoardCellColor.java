package appcodesignal;

public class ChessBoardCellColor {

	public static void main(String[] args) {
		chessBoardCellColor("A1", "C4");
		
		
	}
	
	public static boolean chessBoardCellColor(String cell1, String cell2) {
		String[][] matrix = {
				{"A8", "B8", "C8", "D8", "E8", "F8", "G8", "H8"},
				{"A7", "B7", "C7", "D7", "E7", "F7", "G7", "H7"},
				{"A6", "B6", "C6", "D6", "E6", "F6", "G6", "H6"},
				{"A5", "B5", "C5", "D5", "E5", "F5", "G5", "H5"},
				{"A4", "B4", "C4", "D4", "E4", "F4", "G4", "H4"},
				{"A3", "B3", "C3", "D3", "E3", "F3", "G3", "H3"},
				{"A2", "B2", "C2", "D2", "E2", "F2", "G2", "H2"},
				{"A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1"}
		};
		for (String[] number : matrix) {
			System.out.print(" [ ");
			for (String cell : number) {
				System.out.print(cell + " ");
			}
			System.out.print("]\n");
		}
		boolean result = false;
		String colour1 = null;
		String colour2 = null;
		if (cell1.matches("A1|A3|A5|A7|B2|B4|B6|B8|C1|C3|C5|C7|D2|D4|D6|D8|E1|E3|E5|E7|F2|F4|F6|F8|G1|G3|G5|G7|H2|H4|H6|H8")) {
		     colour1 = "black";
		}
		if (cell1.matches("A2|A4|A6|A8|B1|B3|B5|B7|C2|C4|C6|C8|D1|D3|D5|D7|E2|E4|E6|E8|F1|F3|F5|F7|G2|G4|G6|G8|H1|H3|H5|H7")) {
		     colour1 = "white";
		}
		System.out.println("Cell 1: " + colour1);
		if (cell2.matches("A1|A3|A5|A7|B2|B4|B6|B8|C1|C3|C5|C7|D2|D4|D6|D8|E1|E3|E5|E7|F2|F4|F6|F8|G1|G3|G5|G7|H2|H4|H6|H8")) {
		     colour2 = "black";
		}
		if (cell2.matches("A2|A4|A6|A8|B1|B3|B5|B7|C2|C4|C6|C8|D1|D3|D5|D7|E2|E4|E6|E8|F1|F3|F5|F7|G2|G4|G6|G8|H1|H3|H5|H7")) {
		     colour2 = "white";
		}
		System.out.println("Cell 2: " + colour2);
		if (colour1 == colour2) {
			result = true;
		}
		System.out.println("Same colour: " + result);
		return result;
	}

}
