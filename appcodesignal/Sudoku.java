package appcodesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sudoku {

	public static void main(String[] args) {
		int[][] matrix = {{1,3,2,5,4,6,9,2,7}, 
		                  {4,6,5,8,7,9,3,8,1}, 
		                  {7,9,8,2,1,3,6,5,4}, 
		                  {9,2,1,4,3,5,8,7,6}, 
		                  {3,5,4,7,6,8,2,1,9}, 
		                  {6,8,7,1,9,2,5,4,3}, 
		                  {5,7,6,9,8,1,4,3,2}, 
		                  {2,4,3,6,5,7,1,9,8}, 
		                  {8,1,9,3,2,4,7,6,5}};
		System.out.println(sudoku(matrix));
		
	}
	
	static boolean sudoku(int[][] grid) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		int num = 0;
		for (int i = 0; i < 9; i++) {
			num++;
			list2.add(num);
		}
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				list4.add(grid[j][i]);
			}Collections.sort(list4);
			if (!list4.equals(list2)) {
				return false;
			}
			list4.clear();
		}
		for (int i = 0; i < grid.length; i++) {
			List<Integer> list3 = Arrays.stream(grid[i]).boxed().collect(Collectors.toList());
			Collections.sort(list3);
			if (!list3.equals(list2)) {
				return false;
			}
			list3.clear();
		}
		for (int i = 0; i < grid.length; i+=3) {
			for (int j = 0; j < grid.length; j+=3) {
				list.add(grid[i][j]);list.add(grid[i][j+1]);list.add(grid[i][j+2]);
				list.add(grid[i+1][j]);list.add(grid[i+1][j+1]);list.add(grid[i+1][j+2]);
				list.add(grid[i+2][j]);list.add(grid[i+2][j+1]);list.add(grid[i+2][j+2]);
				Collections.sort(list);
				if (!list.equals(list2)) {
					return false;
				}
				list.clear();
			}
		}
		return true;
	}

}
