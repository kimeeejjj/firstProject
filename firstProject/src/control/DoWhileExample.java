package control;

public class DoWhileExample {
	public static void main(String[] args) {
		
		System.out.println("####예제1####");
		//Do..While
		boolean run = false;  // run값이 false
		while(run) {          // while구문은 변수값이 true여야 실행되는데 false이므로     
			System.out.println("실행문1");  // 얘는 한번도 실행 못하게 됨
		}
		do {					//do-while구문은 while앞에 실행문이 오므로
			System.out.println("실행문2"); //변수가 참인지,거짓인지 따지지않고 무조건1번은실행됨
		} while(run);  //한번 실행이 되고 나서야 run이 false임을 알게 되었음
	
		System.out.println("####예제2####");
		
		boolean run2 = false;
		int cnt = 0;
		do {
			System.out.println(cnt);
			if(cnt >= 10) {
				break; // 반복문을 끝내겠습니다
			}
			cnt++;
		} while(true);
		
		System.out.println("####예제3####"); //예제2와다르게cnt++가먼저if가나중
											//예제2와출력값비교해보기
		boolean run3 = false;
		int cnt2 = 0;
		do {
			System.out.println(cnt2);
			cnt2++;
			if(cnt2 >= 10) {
				break;
			}
		} while(true);
		
		System.out.println("####예제4####"); 
		//예제4는 continue;설명=조건충족시,컨티뉴다음에있는실행문을실행하지않고그다음으로넘어가겠습니다.
		boolean run4 = false;
		int cnt3 = 0;
		do {
			cnt3++;
			if(cnt3 %2 == 1) {
				continue; // if(cnt3 %2 == 1)만족시,다음if구문실행않고그다음으로넘어감.즉,반복문처음으로돌아옴
			}
			System.out.println(cnt3);
			if(cnt3 >= 4) {	
				break;
			}
		} while(true);
	}

}
