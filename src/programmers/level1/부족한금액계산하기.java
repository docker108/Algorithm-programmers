package programmers.level1;

public class 부족한금액계산하기 {
	
    public  long solution(int price, int money, int count) {

        long answer = -1;        
        long temp = 0;
       
        for (int i = 1; i <= count; i++) {temp += price*i;}
        
       
        if(temp < money) {
        	answer = 0;
        } else {
        	answer = temp-money;
        }

        return answer;
    
    }
    
//    // test
//    public  static long solution(int price, int money, int count) {
//    	
//    	long answer = -1;        
//    	long temp = 0;
//    	
//    	for (int i = 1; i <= count; i++) {temp += price*i;}
//    	
//    	
//    	if(temp < money) {
//    		answer = 0;
//    	} else {
//    		answer = temp-money;
//    	}
//    	
//    	return answer;
//    	
//    }
//    public static void main(String[] args) {
//		
//		System.out.println(solution(3, 20, 4));
//	}
}
