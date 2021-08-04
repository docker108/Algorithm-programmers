package programmers.level1;

public class 내적 {
	
    public int solution(int[] a, int[] b) {
        int[] array = new int[(a.length)];
			
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i]*b[i];
            temp += array[i];
        }

        return temp;
    }
    
//    // test
//    public static int solution(int[] a, int[] b) {
//        int[] array = new int[(a.length)];
//			
//        int temp = 0;
//        for (int i = 0; i < a.length; i++) {
//            array[i] = a[i]*b[i];
//            temp += array[i];
//        }
//
//        return temp;
//    }
//    
//    public static void main(String[] args) {
//    	int[] a = {1,2,3,4};
//    	int[] b = {-3,-1,0,2};
//    	System.out.println(solution(a, b));
//		
//	}
}
