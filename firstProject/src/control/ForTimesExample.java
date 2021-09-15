package control;

public class ForTimesExample {
	public static void main(String[] args) {  //**for구문으로 구구단만들기**
		
		for(int j=2; j<=9; j++ ) { // 반복문 안에 반복문 들어올 수 있음
		
		int row = j;  //여기에 넣은 숫자에 맞게 구구단 출력. 3넣으면 3단출력
		System.out.println("====" + row + "단====");
		for(int i=1; i<=9; i++) { 
			System.out.printf("%d * %d = %d\n", row,i,(row*i));
		}
	 }
   }
}
