package appcodesignal;

public class ChessKnight {

	public static void main(String[] args) {
		chessKnight("d7");
	}
	
	static int chessKnight(String cell) {
		class Parser {
	        int getX(char pos) {
	            return pos - 'a' + 1;
	        }
	 
	        int getY(char pos) {
	            return pos -'1' + 1;
	        }
	    }
	    Parser p = new Parser();
	 
	    int x1 = p.getX(cell.charAt(0)),
	        y1 = p.getY(cell.charAt(1));
	    int x2 = x1,x3 = x1,x4 = x1,x5 = x1,x6 = x1,x7 = x1,x8 = x1,
	    	y2 = y1,y3 = y1,y4 = y1,y5 = y1,y6 = y1,y7 = y1,y8 = y1;
	    int count = 0;
	   
	    for (int n = 0; n < 1; n++) {
	    	x1 += 2;y1 += 1;x2 += 1;y2 += 2;x3 -= 1;y3 += 2;x4 += 2;y4 -= 1;
	    	x5 += 1;y5 -= 2;x6 -= 1;y6 -= 2;x7 -= 2;y7 += 1;x8 -= 2;y8 -= 1;
		    System.out.println("x1: " + x1 + " y1: " + y1); //right - up
		    System.out.println("x2: " + x2 + " y2: " + y2); //up - right
		    System.out.println("x3: " + x3 + " y1: " + y3); //up - left
		    System.out.println("x4: " + x4 + " y4: " + y4); //right - down
		    System.out.println("x5: " + x5 + " y5: " + y5); //down - right
		    System.out.println("x6: " + x6 + " y6: " + y6); //down - left
		    System.out.println("x7: " + x7 + " y7: " + y7); //left - up
		    System.out.println("x8: " + x8 + " y8: " + y8); //left - down
		    
		    if (x1>=1&&x1<=8&&y1>=1&&y1<=8) {count++;}
		    if (x2>=1&&x2<=8&&y2>=1&&y2<=8) {count++;}
		    if (x3>=1&&x3<=8&&y3>=1&&y3<=8) {count++;}
		    if (x4>=1&&x4<=8&&y4>=1&&y4<=8) {count++;}
		    if (x5>=1&&x5<=8&&y5>=1&&y5<=8) {count++;}
		    if (x6>=1&&x6<=8&&y6>=1&&y6<=8) {count++;}
		    if (x7>=1&&x7<=8&&y7>=1&&y7<=8) {count++;}
		    if (x8>=1&&x8<=8&&y8>=1&&y8<=8) {count++;}
	    }
	    System.out.println(count);
		return count;

	}

}
