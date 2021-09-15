package control;

public class DoWhileExe {
	public static void main(String[] args) {
		boolean run = false;
		int cnt = 0;
		
		// 문1. 1부터 10까지 출력.
		do {
			cnt++;
			System.out.println(cnt);
			if(cnt == 10) {
				break;
				}
		} while(true);  //true적는 이유가 뭘까.. [이유]while에는반복문을실행하기위한조건을다는부분이므로,
		System.out.println("###끝1###"); // true값을넣으면항상조건이옳기때문에반복문이무한실행됨
										// 그래서true값이들어가있다면break를통해반복문에서빠져나올수있음.
		// 문2. 짝수만 출력.				// 또는boolean run = false;해서 false값인run을넣어도빠져나올수있음.
		cnt = 0;						// 만약그렇다면한번만실행되고반복문이끝나게됨.(확실하진않음..ㅠㅠ)
		do {
			cnt++;
			if(cnt % 2 == 0) {
			System.out.println(cnt);   //continue활용해봐야하는데ㅠㅠㅠ
			} 
			if(cnt == 11) {
				break;
			}
		} while(true);
		System.out.println("###끝2###");
		
		// 문3. 홀수만 합계. continue활용해서! 다시해보기
		cnt = 0;
		int sum = 0;			
		do {
			cnt++;
			if(cnt % 2 == 0) {
				continue;
			}
			if(cnt >= 10) { //cnt가 11이 되어야 break에 걸림
				break;
			}
			sum += cnt;
		} while(true);
		System.out.println(sum);
		System.out.println("###끝3###");
		
		// 문4. 임의의 값 1~10;
		// sum 값이 100 보다 큰 수가 되었을 때
		// 그때의 sum값을 출력...몇번 실행했는지 보여주도록...,continue사용
		// sum : 101, 실행 : 13
		// 끝4         못했음ㅜㅜㅠㅠㅠㅠㅠ힝 집가서해보기
		
		cnt = 0;
		sum = 0;
		int count = 0;
		do {
			cnt++;
			System.out.println(cnt);
			if(cnt == 10) {
				break;
			}
		} while(true);


		
	}
}
