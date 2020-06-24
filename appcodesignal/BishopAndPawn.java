package appcodesignal;

public class BishopAndPawn {

	public static void main(String[] args) {
		bishopAndPawn("a1", "c3");
	}
	
	static boolean bishopAndPawn(String bishop, String pawn) {
		class Parser {
	        int getX(char pos) {
	        	System.out.println(pos - 'A');
	            return pos - 'A';
	        }
	 
	        int getY(char pos) {
	        	System.out.println(pos);
	            return pos - '1';
	        }
	    }
	    Parser p = new Parser();
	 
	    int x1 = p.getX(bishop.charAt(0)),
	        y1 = p.getY(bishop.charAt(1)),
	        x2 = p.getX(pawn.charAt(0)),
	        y2 = p.getY(pawn.charAt(1));
	    System.out.println(x1);
	 
	    if (x1 + y1 == x2 + y2 || x1 - y1 == x2 - y2) {
	        return true;
	    }
	 
	    return false;

	}

}
