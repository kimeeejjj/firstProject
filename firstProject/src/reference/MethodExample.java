package reference;
//메소드 개념
public class MethodExample {
	public static void main(String[] args) {
		
		//비만도 계산공식.
		//double bmi = weight / (height * height);
		//bmi < 18.5:저체중, 18.5~23:정상, 23~25:과체중, 25~30미만:고도비만
		double w1 = 72.4, h1 = 1.75;
		checkBMI(w1, h1);   //메소드 실행. checkBMI메소드에기능을정의해놓고, 그기능이필요하면메소드명입력하고매개변수써주면계산됨. 중복코드줄일수있어프로그램훨신간결해짐
		double w2 = 65.7 , h2 = 163.4;
		checkBMI(w2, h2); 
		checkBMI(65.8, 173.6); //매개변수써주지않고 이렇게 매개값만 써놔도 출력가능함.
	}
	
	//새로운 메소드 생성. 메소드를 정의할때 매개변수 적어주기! 여기선 (double weight, double height)임.
	public static void checkBMI(double weight, double height) {  //checkBMI호출할때(double weight, double height)라는매개변수이용하여출력해주겠다.
		double bmi = weight / (height * height);
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("적정체중");
		}else if(bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		}else if(bmi >= 25) {
			System.out.println("비만");
		}else {
			System.out.println("의사와 상담하세요");
		}
		
	}
}
