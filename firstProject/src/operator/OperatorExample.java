package operator;

public class OperatorExample {
	public static void main(String[] args) {
		// +, -, *, /, %(나눈 후 나머지), | 논리적인 값 처리(비트연산자) : &(and논리곱), |(or논리합), ^(두수값다르면1,같으면0), ~(not의 값)
		int num1, num2, result;
		num1 = 10;
		num2 = 5;
		
		//result = num2 = num1;
		result = num1 * num2; //이항연산자, 할당(대입)연산자 = : 오른쪽 값을 왼쪽으로
		
		result = -result; //단항연산자,
		System.out.printf("-연산결과: %d\n", result);
		
		result = num1 % 3;
		System.out.printf("연산결과: %d\n", result);

		result = num1 & num2;
		System.out.printf("&연산결과: %d\n", result);
		
		result = num1 | num2;
		System.out.printf("|연산결과: %d\n", result);
		
		result = num1 ^ num2;
		System.out.printf("^연산결과: %d\n", result);
		
		result = ~num1; // 2진수 => ~(비트를반전시킴) => 여기다1더한결과가0이되면, 그게양수2진수의음수값 
		                // 3 + (-3) = 0 
		System.out.printf("~연산결과: %d\n", result);
		
		// >>, >>>, <<
		result = num1 >> 2;
		System.out.printf(">>연산결과: %d\n", result);
		
		// &&, ||, !
		boolean b1 = false;
		boolean b2 = !b1;  // b1의 반대값(!)을 취하겠습니다 = true
		
		//boolean b3 = b1 && b2; // 둘다 true면 true, 둘다 false면 false 
		//System.out.printf("&&연산결과 b3 : %s, b1:%s, b2:%s ", b3, b1, b2);
		
		boolean b3 = b1 || b2; // 둘 중 하나라도 true면, ture 
		System.out.printf("||연산결과 b3 : %s, b1:%s, b2:%s ", b3, b1, b2);
		
		
	}
}
