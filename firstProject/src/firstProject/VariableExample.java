package firstProject;

public class VariableExample {
	public static void main(String[] args) {
		int number1 = 10; // 변수 <--> 상수
		number1 = 20; 
		number1 = 30;
		System.out.println("결과:" + number1);

		int number3 = 90;
		int result; 
		
		final int number2 = 20;
//		number2 = 30; 이건 상수이기 때문에 에러발생.
		//[데이터타입&크기] byte < short < int정수 < long < float < double실수
		result = number1 + number2;
		double result1 = number3 / 20.0; //20.0은더블타입,넘버3은int이니까더큰타입으로결과값나옴
		
		System.out.println("결과값: " + result1);
		
	}
}
