package reference;

public class MethodExample3 {
	public static void main(String[] args) {

		int[] intAry = { 30, 40, 50, 60, 70 };
		int sum = 0;
		for (int num : intAry) {
			sum += num;
		}
		System.out.println("��:" + sum);

		sum = 0;
		int[] intAry2 = { 30, 40 };
		sum = sumArray(intAry2);
		System.out.println("��:" + sum);

		double avg = 0;
		double[] doubleAry = { 30, 40, 50, 60, 70 };
		avg = avgArray(doubleAry);
		System.out.println("���:" + avg);
		
		avg = avgArray2(intAry);
		System.out.println("���2:"+avg);

	}

	// �迭�� �Ű������� ���
	public static int sumArray(int[] intAry) {
		int sum = 0;
		for (int num : intAry) {
			sum += num;
		}
		return sum;
	}

	// �迭�� �Ű������� ��� -> ��ձ��ϱ�
	public static double avgArray(double[] doubleAry) {
		double sum = 0;
		double cnt = 0;
		for (double num : doubleAry) {
			sum += num;
			cnt++;
		}
		return sum / cnt;
	}
	// �迭�� �Ű������� ��� -> ��ձ��ϱ�(�����Դ�)
	public static double avgArray2(int[]intAry) {
		int sum = sumArray(intAry);
		double avg = (double) sum / intAry.length;
	 	return avg;
	}
}
