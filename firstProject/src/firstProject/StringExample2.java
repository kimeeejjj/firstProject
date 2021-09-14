package firstProject;

public class StringExample2 {
	public static void main(String[] args) {
		String name = "김은지";
		int age = 25;
		
		 //이름은 김은지, 나이는 25
		System.out.println("이름은 "+name+", 나이는 "+age);
		System.out.printf("이름은 %s, 나이는 %d", name, age);
		
		byte b1 = -90;
		byte b2 = 10;
		int result = b1 + b2;
		System.out.println(b1 + "+" + b2 + "=" + result);
		
		//isLarger
		//result > 0
		//if(100>10) {
				
		//}else {
		//}
		boolean isLarger = result > 0;
		if(isLarger) {
			System.out.println("0보다 큽니다(양수입니다.)");
		}else {System.out.println("0보다 작습니다(음수입니다.)");};
		
		long number1 = 2200000000l;
		double number2 = 78;
		double number3 = 8;
		double avg = number2/number3;
		System.out.println(number2 + "을" + number3 + "로 나눈 결과" + ":" + avg);
		
		long nb1 = 2200000000l;
		double nb2 = 78;
		double nb3 = 8;
		double sumavg = (nb1+nb2+nb3)/3;
		System.out.println("평균값:"+sumavg);
	}
}
