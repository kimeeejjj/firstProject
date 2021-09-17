package reference;

public class ArrayExample2 {
	public static void main(String[] args) {
		//1~10까지 임의 수를 생성.
		//학생 10명.
		int[] scores = new int[10]; //크기만지정.초기값0이10개출력될것.
		System.out.println(scores.length); //크기는10이니까 10이출력됨.
		for(int i=0; i<scores.length; i++){
			int temp=(int)(Math.random()*10)+1;
			scores[i] = temp;
			System.out.println("int배열:"+scores[i]); //출력해보면스코어변수크기는10이므로값이10개만나올것임.
		}
		// scores 배열타입. scores[0] int타입.
		
		for(int i =0,l = scores.length; i<l; i++) {
			System.out.printf("scores[%d] => %d\n", i, scores[i]);
		}
		System.out.println("끝1");
		
		//배열에 들어있는 요소들의 합.
		int sum = 0;
		//배열의 합계: 55
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("배열의 합계:"+sum);
		System.out.println("끝2");
		
		//배열의 요소 중 5보다 큰 값만 합계
		sum =0 ;
		for(int i=0; i<scores.length; i++) {
			if(scores[i] > 5) {
				sum += scores[i];
				}
		}
		System.out.println(sum);
		System.out.println("끝3");
		
		//배열의 요소 중 짝수번째 값만 합계
		sum=0;
		for(int i=0; i<scores.length; i++) {
			if(scores[i]%2==0) {
				sum = scores[i];
			}
		}
		System.out.println(sum);
	}
}
