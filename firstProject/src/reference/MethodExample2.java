package reference;

public class MethodExample2 {
	public static void main(String[] args) {
		sum(24,55);  //메소드 실행. 매개값입력해주기
		int a = 45, b = 77; //int타입의 변수선언하고
		sum(a,b);	//메개값 입력해줘도 콘솔에 결과값나옴.	
		multi(35,88);
		getArea(3.5);
		int res = getMax(a,b); //a와 b는 각각 45,77으로 위에서 선언했음
		System.out.println("큰 수는 :" + res);
		double re = divide(5,3); // 정수값을입력하는거지만divide메소드에서출력하는값은double이므로double을써줘야함.
		System.out.println("첫번째 값을 두번째 값으로 나누면 :"+re);
	}
	
	// 두 정수를 입력받아서 두 수의 합을 console에다 보여주는 기능의 메소드 생성.
	public static void sum(int n1, int n2) { //매개변수입력때 타입정의도 필수!
		int sum = n1 + n2;
		System.out.println("두 수의 합:"+sum);
	}
	
	// 두 정수를 입력받아서 두 수의 곱을 console에다 보여주는 기능의 메소드 생성.
	public static void multi(int i1, int i2) {
		int multi = i1 * i2;
		System.out.println("두 수의 곱:"+multi);
	}
	
	// 정사격형 넓이를 계산해주는 메소드.
	public static void getArea(double side){
		double getArea = side * side;
		System.out.println("정사격형의 넓이는:"+getArea);
	}

	// 두 수 중에서 큰 값을 반환해주는 메소드.
	// '반환'해준다는 건 void(반환할값이없다)적지말고 반환해줘야할 값의 타입을 입력. 여기선int!
	public static int getMax(int num1, int num2) {
		int result = (num1 >= num2) ?num1 : num2; //result라는 변수는 두수중에더큰수를저장하는변수로 선언
		return result; //반환값은 result
	}
	
	// 두 정수를 입력받아서 첫번째 / 두번째 나눈 결과를 반환.
	public static double divide(int a, int b) {
		double result = a/b;
		return result;
	}
}