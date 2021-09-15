package control;

public class ConditionExe {
	public static void main(String[] args) {
		// [1]두 정수 60, 70
		// 두 수를 합한 결과 100점 넘어서면 합격, 미만 불합격
		// 끝.
		int A = 60;
		int B = 70;
		int sum = A + B;
		int gob = A * B;

		if (sum >= 100) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
			System.out.println("1번끝");
		// [2]두 수를 곱해서 짝수이면 짝수, 홀수이면 홀수
		// 2번째 끝.
		if (gob % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
			System.out.println("2번끝");
		// [3]정수 변수 선언. 4,9,12값 차례로 넣어보기
		// 2의 배수이면 2의배수, 3의 배수이면 3의 배수, 2와 3의 배수
		int c = 12;
		if (c % 2 == 0 && c % 3 == 0) {
			System.out.println("2와 3의 배수입니다"); // 12의경우는이값이출력되어야하므로2,3의공통배수조건문을제일처음에해야함.
												// 이게젤마지막에있으면12의경우2의배수에서걸러져버려서공통배수조건문까지도달하지못함
		} else if (c % 2 == 0) {
			System.out.println("2의 배수입니다");
		} else if (c % 3 == 0) {
			System.out.println("3의 배수입니다");
		}
			System.out.println("3번끝");
		int randomValue = (int) (Math.random()*6)+1; //random값실행시더블타입으로결과값을담아줌.그러므로왼쪽값항상더블이어야함 ex.double A = Math.random()
		System.out.println(randomValue); //random의기능은랜덤값생성해줌.항상0~1사이의값출력해줌.그래서소수점없애려면강제로(int)로만들어야함.
											//그리고1이상의값이나오려면*정수를해주면됨. ex) Math.random()*6 = 0.6~5.4등의값이나올것.

		//[4]switch조건문(switch-break) -> 1이 나왔습니다.
		//4번끝.
		switch(randomValue) {
		case 1 :
			System.out.println("1이 나왔습니다.");
			break;
		case 2 :
			System.out.println("2가 나왔습니다.");
			break;	
		case 3 :
			System.out.println("3이 나왔습니다.");
			break;	
		case 4 :
			System.out.println("4가 나왔습니다.");
			break;
		case 5 :
			System.out.println("5가 나왔습니다.");
			break;
		default:
			System.out.println("6이 나왔습니다.");
		}
		System.out.println("4번끝");
		
		//[5]랜덤값이 1~99까지 나오도록하고, 90이상A, 80이상B, 70이상C, 60이상D, 60미만F
		int randomScore = (int)(Math.random()*100); //1~99까지 나와야 하니 100곱해주기
		System.out.println(randomScore);
		
		if(randomScore >= 90) {
			System.out.println("A학점");
		}else if(randomScore >= 80) {
			System.out.println("B학점");
		}else if(randomScore >= 70) {
			System.out.println("C학점");
		}else if(randomScore >= 60) {
			
		}else {
			System.out.println("F학점");
		}
			System.out.println("5번끝");
			
		//[5-1]5번과 같은 조건으로 switch구문 사용해보기
		
		int randomScore2 = (int)(Math.random()*100); //0~1사이랜덤값에100곱하고int적용하여소수점없애면1~99값나옴
		int resultRandomScore2 = randomScore2 / 10; //1~99사이의값들을10으로나눌때,90이상인경우는몫이무조건9,80이상인경우몫이8..이므로	
		
		switch(resultRandomScore2) {
		case 9 :
			System.out.println("A학점");
			break;
		case 8 :
			System.out.println("B학점");
			break;
		case 7 :
			System.out.println("C학점");
			break;
		case 6 :
			System.out.println();
			
		} 
			System.out.println("끝");
	}
}
