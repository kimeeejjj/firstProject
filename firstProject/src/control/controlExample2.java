package control;

public class controlExample2 {
	public static void main(String[] args) {
		String inputValue = "A";
		
		switch(inputValue) {
		case "A" :
			System.out.println("참 잘했어요:)");
			break;
		case "B" :
			System.out.println("잘했어요:)");
			break;
		case "C" :
			System.out.println("보통입니다^^");
			break;
		case "D" :
			System.out.println("노력하세요^^..");
			break;
		default:
			System.out.println("실망입니다T^T");
		}
			
		//switch는 만족하는 조건문만나면 출력하고 빠져나오는게 아니라, 전부 다 실행해봄.
		//그래서 모든 조건 만족하는 경우엔 조건문 출력값이 전부 다 나옴. 그래서 순서 매우중요!
	    //break; 를 조건문 말미마다 적어주면 만족하는 조건문 만나면 출력하고 빠져나옴.
		//디폴트 값에는 적어줄 필요 없음.
		//if처럼 범위지정은 X. 그래서 간단한 조건문은 switch, 범위지정필요한 조건문은 if
		
		//
		switch(inputValue){
		case "A":
		case "B":
		case "C":
			System.out.println("Pass");
			break;
		case "D":
			System.out.println("retry");
			break;
		default:
			System.out.println("Fail");
		}
	}

}


