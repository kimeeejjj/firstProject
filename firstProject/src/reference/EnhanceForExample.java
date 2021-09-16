package reference;

public class EnhanceForExample {
	public static void main(String[] args) {
	//	String[] strAry = null;   아무값도입력안함
	//	System.out.println(strAry.length);  아무값도없는변수의크기를출력해달라고하면에러발생

		String[] strAry = null;
		strAry = new String[5]; //null, null, null,null,null
		strAry = new String[] {"Hong", "Park", "Choi", "Kim", "Hwang"};
		System.out.println(strAry.length);
		
		strAry[2] = "Hong";
		
		//홍만 출력하고싶음
		for(int i = 0; i < strAry.length; i++) {
			if(strAry[i].equals("Hong"))
			System.out.println(strAry[i]);
		}
		System.out.println("============");
		// Enhanced for
		for(String name : strAry) {  //배열에들어있는개수만큼반복하겠다. 이렇게쓰면됨.
			System.out.println(name);
		}
		
		System.out.println("============");
		int[] scores = {50, 70, 80, 60};
		int sum = 0;
		for(int score : scores) {
			sum += score;
			System.out.println(score);
		}
		
		System.out.println("============");
		//학생3명의 점수 4.2,3.5,2.8 배열선언.
		//합계를 담을 수 있도록 변수선언.
		//평균을 계산해서 avg
		//학생평균: 3.??입니다.
		double[] sco = {4.2, 3.5, 2.8};
		double summ = 0;
		for(double score : sco) {
			summ += score;
		}
		double avg = summ/3;
		System.out.println("학생평균:"+avg+ "입니다.");
	}
}
