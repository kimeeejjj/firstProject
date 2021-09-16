package reference;

public class ArrayExample {
	public static void main(String[] args) {
		// 학생 30명
		// int s1 ~ s30까지 변수가 30개 필요
		// int num, String str;
		int[]intAry = {1,2,3,4,5}; //int타입의 변수 여러개를 선언한 변수 intAry
		
		System.out.println(intAry[0]); //배열과같은참조값은선언된값자체를기억하고있는게아니라
		System.out.println(intAry[1]); //선언된값은힙에넣어두고그주소를기억하고있음
		System.out.println(intAry[2]); //그래서선언된값은1,2,3,4,5이지만
		System.out.println(intAry[3]); //그값의인덱스주소는각각0,1,2,3,4로
		System.out.println(intAry[4]); //선언된값과주소는다름
		
		for(int i=0; i<5; i++) {			//위의5줄과 이2줄은 같은결과를출력
			System.out.println(intAry[i]); //배열의 장점!
		}
		System.out.println("==============");
		intAry[0] = 6; //배열타입의값을저장할수있는intAry라는변수와[]주소를넣는대괄호가같이있으면
		intAry[1] = 7; //정수를저장할수있음 하지만배열타입값저장하는intAry에다바로정수를저장하려하면
		intAry[2] = 8; //에러발생함. 즉 intAry=1; --> 에러발생 | intAry[0] = 1; -->가능
		intAry[3] = 9;
		intAry[4] = 10; //이렇게넣어주면int[]intAry={1,2,3,4,5}였던게int[]intAry={6,7,8,9,10}으로바뀜
		
		for(int i=0; i<5; i++) {			//위의5줄로 다른값을저장함
			System.out.println(intAry[i]);	//그래서 출력값달라질것.
		}
		System.out.println("==============");
		byte[] byteAry = {1,2,3}; //byte배열값담을수있는byteAry변수선언
		for(int i=0; i<3; i++) {
			System.out.println("byte배열:" + byteAry[i]);
		}

		String[] strAry = {"Hello", "world", "Nice"}; //String배열값담을수있는strAry변수선언
		//strAry = new String[] {1,2,3}; String이니까 당연히 숫자를 저장할 수는 없음,에러발생
		strAry = new String[] {"H", "K", "P"}; //배열변수 선언 후엔 이렇게 값을 다른걸로 변경가능
		for(int i=0; i<3; i++) {
			System.out.println("String배열:" + strAry[i]);
		}
		
		double[] dblAry;		//double배열값 갖는 변수 dblAry변수선언, 내용은 입력안함.
		dblAry = new double[] {1, 2.3, 5}; //뒤늦게 내용입력해도 ㄱㅊ
		
		float[] fltAry = new float[5]; //변수의 크기만 지정해둘 수 있음. 즉 5개만저장가능 | 크기만 지정해두면 초기값이 출력됨. float의 경우 0.0이 초기값. 출력해보면 0.0이 5개나옴
		for(int i=0; i<fltAry.length; i++) {  //fltAry.length <-- 이건 '배열의크기만큼'이라는 의미
			System.out.println(fltAry[i]);
		}
	}
}
