package reference;

public class MethodExample3 {
	public static void main(String[] args) {

		int[] intAry = { 30, 40, 50, 60, 70 };
		int sum = 0;
		for (int num : intAry) {
			sum += num;
		}
		System.out.println("합:" + sum);

		sum = 0;
		int[] intAry2 = { 30, 40 };
		sum = sumArray(intAry2);
		System.out.println("합:" + sum);

		double avg = 0;
		double[] doubleAry = { 30, 40, 50, 60, 70 };
		avg = avgArray(doubleAry);
		System.out.println("평균:" + avg);
		
		avg = avgArray2(intAry);
		System.out.println("평균2:"+avg);

	}

	// 배열을 매개변수로 사용
	public static int sumArray(int[] intAry) {
		int sum = 0;
		for (int num : intAry) {
			sum += num;
		}
		return sum;
	}

	// 배열을 매개변수로 사용 -> 평균구하기
	public static double avgArray(double[] doubleAry) {
		double sum = 0;
		double cnt = 0;
		for (double num : doubleAry) {
			sum += num;
			cnt++;
		}
		return sum / cnt;
	}
	// 배열을 매개변수로 사용 -> 평균구하기(교수님답)
	public static double avgArray2(int[]intAry) {
		int sum = sumArray(intAry);
		double avg = (double) sum / intAry.length;
	 	return avg;
	}
}
