package programmers.level1;

public class 음양더하기 {
	
    public int solution(int[] absolutes, boolean[] signs) {
        int temp = 0;
		for (int i = 0; i < absolutes.length; i++) {
			
			if(signs[i] == false) {
				absolutes[i] *= -1;
			}
			temp += absolutes[i];
		}
        return temp;
    }
	
	
	// test
//    public static int solution(int[] absolutes, boolean[] signs) {
//        int temp = 0;
//		for (int i = 0; i < absolutes.length; i++) {
//			
//			if(signs[i] == false) {
//				absolutes[i] *= -1;
//			}
//			temp += absolutes[i];
//		}
//        return temp;
//    }
//    
//    public static void main(String[] args) {
//		int[] a = {4,7,12};
//		boolean[] b = {true, false, true};
//		
//		System.out.println(solution(a, b));
//	}
}
