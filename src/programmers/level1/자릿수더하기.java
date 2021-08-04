package programmers.level1;

public class 자릿수더하기 {
	
	
    public int solution(int n) {
		String n2 = Integer.toString(n);
		String[] array = n2.split("");
		
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			temp += Integer.parseInt(array[i]);
		}
		
		return temp;
    }
    
    // test
//    public static int solution(int n) {
//		String n2 = Integer.toString(n);
//		String[] array = n2.split("");
//		
//		int temp = 0;
//		for (int i = 0; i < array.length; i++) {
//			temp += Integer.parseInt(array[i]);
//		}
//		
//		return temp;
//    }
//    
//    public static void main(String[] args) {
//		System.out.println(solution(123));
//	}
}
