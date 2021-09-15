package control;

public class conditionExample {
	public static void main(String[] args) {
		// <if-else 구문>
		// 90이상 A, 80이상 B, 70이상 C, 60이상 D, 그외 F
		int score = 55;
		
		if(score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else {System.out.println("F학점");}
		//else말고 if구문으로만 조건 정하면 만약 90점이상인경우 출력값이 A,B,C,D학점으로 나올 것
		//즉, 값이 여러개 나와야 할때는 if를 여러개 쓰고 한가지 값만 나와야 할 때는 else사용하기
		
		System.out.println("끝.");
	}
}
