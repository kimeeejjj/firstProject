package control;

public class ForExample {
	public static void main(String[] args) {
		int cnt = 0;
		
		cnt += 1;
		System.out.printf("cnt: %d\n",cnt);

		cnt += 1;
		System.out.printf("cnt: %d\n",cnt);

		cnt += 1;
		System.out.printf("cnt: %d\n",cnt);

		cnt += 1;
		System.out.printf("cnt: %d\n",cnt);		
		//이렇게 반복되는 작업이 필요할 경우 사용하는게 반복문!
		//[반복문1]. for(초기화식(변수선언);반복하는조건;증감식)
		//->변수선언, 변수가조건에해당하면1번반복, 증감식적용, 증감식적용된변수가조건에해당하면1번더반복 ...
		System.out.println("====1씩증가====");
		cnt = 0;
		for(int i=1; i<=5; i++) {  // i=i+1 => i+=1
			cnt += 1;
			System.out.printf("cnt: %d\n",cnt);
		}
		System.out.println("====2씩증가====");
		cnt = 0;
		for(int i=1; i<=10; i+=2) { //i가2씩커지니까i가1,3,5,7,9인경우의값만출력됨)
			cnt += 1;
			System.out.printf("cnt: %d\n",cnt);
		}
		System.out.println("====cnt+=i====");
		cnt = 0;
		for(int i=1; i<=3; i++) {  //원리다시곱씹어보기!!!!
			cnt += i;
			System.out.printf("i: %d, cnt: %d\n",i, cnt);
		}
		System.out.println("====다시====");
		int tempValue = (int)(Math.random()*10)+1; //원리다시곱씹기!!!!
		for(int i=1; i<=5; i++) { 
			tempValue = (int)(Math.random()*10)+1; //변수가반복문{}안에있어야정상적으로실행
			System.out.printf("%d번째 값:%d\n", i, tempValue);
		}
		System.out.println("====다시2====");
		int tempValue2 = 0;
		for(int i=1; i<=5; i++) { 
//			tempValue2 = 0;      이경우에는변수가반복문{}안에있게되면값이누적되지못함.밖에있어야함.
			tempValue2 = (int)(Math.random()*10)+1;
			System.out.printf("%d번째 값:%d\n", i, tempValue2);
		}
		System.out.println("반복문끝");
		
	}
}
