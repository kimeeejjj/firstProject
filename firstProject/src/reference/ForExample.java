package reference;

public class ForExample {
	public static void main(String[] args) {
		
		{
			int j = 0;
			int i = 0;  //블럭안에 j,i라는 변수 선언
		}				//블럭 밖을 벗어나면 변수j,i는 사라지므로
		
		int j = 10;		//다시 변수로 선언해도 상관없음
		//int i = 10;		//하지만 i는 밑에 for구문에서 =1로 사용중이므로 쓸 수 없음.
						//같은main메소드안 블록에 있기 때문에 변수선언 2번 못함.
		//
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("끝1.");
		
		// 1~10 짝수만 출력..
		for (int i=1; i<=10; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("끝2.");
		
		// 1~10 홀수만 합.
		int sum = 0;
		for (int i=1; i<=10; i++) {
			if(i%2 == 1) {
				sum += i;
			}
		}	
		System.out.println(sum);
		System.out.println("끝3");
		
		sum = 0;  // 같은변수의 값 바꾸려면 선언하지 말고 값만 바꾸기(int sum = 0;(X))
		int cnt = 0; // 횟수를 받아와서 출력
		// 1~10 sum의 값이 20을 넘어서는 그때의 횟수
		for(int i=1; i<=10; i++) {
			sum += i;
			if(sum >= 20) {
				cnt = i;
				break;
			}
		}
		System.out.println("횟수:"+cnt);
		System.out.println("끝4");
	}

}