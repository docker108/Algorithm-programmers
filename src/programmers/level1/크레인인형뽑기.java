package programmers.level1;

import java.util.ArrayList;

public class 크레인인형뽑기 {
	
	public static void main(String[] args) {
		int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		
		System.out.println(solution(board, moves));
	}
	
	
    public static int solution(int[][] board, int[] moves) {
    	
    	int result = 0;
    	ArrayList<Integer> temp = new ArrayList<Integer>();
    	
    	for (int i = 0; i < moves.length; i++) {
			
    		for (int j = 0; j < board[0].length; j++) {
				
    			if(board[j][moves[i]-1] != 0) {
    				
    				temp.add(board[j][moves[i]-1]);
    				if(temp.size() != 1) {
    				
	    				if(temp.get(temp.size()-1) == temp.get(temp.size()-2)) {
	    					temp.remove(temp.size()-1);
	    					temp.remove(temp.size()-1);
	    					result += 2;
	    				}
    				}
    				
    				board[j][moves[i]-1] = 0;    
    				break;
    				}
			}
    		
		}
    	
    	
        return result;
    }
    
    
}
