package reference;

public class EnhanceForExample {
	public static void main(String[] args) {
	//	String[] strAry = null;   �ƹ������Է¾���
	//	System.out.println(strAry.length);  �ƹ��������º�����ũ�⸦����ش޶���ϸ鿡���߻�

		String[] strAry = null;
		strAry = new String[5]; //null, null, null,null,null
		strAry = new String[] {"Hong", "Park", "Choi", "Kim", "Hwang"};
		System.out.println(strAry.length);
		
		strAry[2] = "Hong";
		
		//ȫ�� ����ϰ����
		for(int i = 0; i < strAry.length; i++) {
			if(strAry[i].equals("Hong"))
			System.out.println(strAry[i]);
		}
		System.out.println("============");
		// Enhanced for
		for(String name : strAry) {  //�迭������ִ°�����ŭ�ݺ��ϰڴ�. �̷��Ծ����.
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
		//�л�3���� ���� 4.2,3.5,2.8 �迭����.
		//�հ踦 ���� �� �ֵ��� ��������.
		//����� ����ؼ� avg
		//�л����: 3.??�Դϴ�.
		double[] sco = {4.2, 3.5, 2.8};
		double summ = 0;
		for(double score : sco) {
			summ += score;
		}
		double avg = summ/3;
		System.out.println("�л����:"+avg+ "�Դϴ�.");
	}
}
