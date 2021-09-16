package operator;

public class OperatorExample2 {
	public static void main(String[] args) {
		//대입(할당)연산자: 오른쪽 값 왼쪽으로 할당
		int num1, num2, result;
		num1 = num2 = 10;
		
		result = num1 + num2;
		
		result = result + 10;
		result += 10;  //위라인과 같은 소리임, 복합대입연산자

		result -= 10; //result = result - 10;
		result *= 10; //result = result * 10;
		result /= 10; //result를 10으로 나눈 값을 다시 result에 넣겠다
		result %= 10; //result를 10으로 나눈 후 나머지값을 다시 result에 넣겠다
		//long, int, byte 다 사용가능
		
		String str = "Hello";
		str = str + " World"; // Hello에다 World를 추가
		str += " welcome"; // Hello World에다 welcome을 추가
		System.out.println(str);
		
		//3항 연산자
		int score = 80;
		boolean pass = (score > 60) ? false : true;//괄호 안 값이 참이냐 거짓이냐? 만족하면 true, 아니면 false
		System.out.println(pass);
		String isOk = (score > 60) ? "Pass" : "Fail"; //T,F아니고 문자열 출력도 가능
			System.out.println(isOk);
				
		
}
}
