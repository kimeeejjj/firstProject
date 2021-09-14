package firstProject;

public class StringExample {
	
	public static void main(String[] args) {
		int age = 20;
		String name = "홍길동";
		
		long myAge = age; // 서로타입안맞을때 자동형변환발생(promotion)
		age = (int) myAge; // 큰타입이오른쪽에있을땐괄호넣어서 강제형변환시켜줘야함(casting) 

// age = "홍길동";  -> 서로 데이터 타입 안맞아서 에러남
// name = 20;     -> 마찬가지
 		System.out.println(name + "의 나이는" + age);
 		
 		int age =25;
 		String name = "김은지";
 		System.out.println(name + "의 나이는" + age + "입니다.");
 		
 		System.out.println("김은지의 나이는" + 25 + "입니다.");
 		
	}
}
