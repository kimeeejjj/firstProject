package reference;

public class ArrayExample {
	public static void main(String[] args) {
		// �л� 30��
		// int s1 ~ s30���� ������ 30�� �ʿ�
		// int num, String str;
		int[]intAry = {1,2,3,4,5}; //intŸ���� ���� �������� ������ ���� intAry
		
		System.out.println(intAry[0]); //�迭������������������Ȱ���ü������ϰ��ִ°Ծƴ϶�
		System.out.println(intAry[1]); //����Ȱ��������־�ΰ���ּҸ�����ϰ�����
		System.out.println(intAry[2]); //�׷�������Ȱ���1,2,3,4,5������
		System.out.println(intAry[3]); //�װ����ε����ּҴ°���0,1,2,3,4��
		System.out.println(intAry[4]); //����Ȱ����ּҴ´ٸ�
		
		for(int i=0; i<5; i++) {			//����5�ٰ� ��2���� ������������
			System.out.println(intAry[i]); //�迭�� ����!
		}
		System.out.println("==============");
		intAry[0] = 6; //�迭Ÿ���ǰ��������Ҽ��ִ�intAry��º�����[]�ּҸ��ִ´��ȣ������������
		intAry[1] = 7; //�����������Ҽ����� �������迭Ÿ�԰������ϴ�intAry���ٹٷ������������Ϸ��ϸ�
		intAry[2] = 8; //�����߻���. �� intAry=1; --> �����߻� | intAry[0] = 1; -->����
		intAry[3] = 9;
		intAry[4] = 10; //�̷��Գ־��ָ�int[]intAry={1,2,3,4,5}������int[]intAry={6,7,8,9,10}���ιٲ�
		
		for(int i=0; i<5; i++) {			//����5�ٷ� �ٸ�����������
			System.out.println(intAry[i]);	//�׷��� ��°��޶�����.
		}
		System.out.println("==============");
		byte[] byteAry = {1,2,3}; //byte�迭���������ִ�byteAry��������
		for(int i=0; i<3; i++) {
			System.out.println("byte�迭:" + byteAry[i]);
		}

		String[] strAry = {"Hello", "world", "Nice"}; //String�迭���������ִ�strAry��������
		//strAry = new String[] {1,2,3}; String�̴ϱ� �翬�� ���ڸ� ������ ���� ����,�����߻�
		strAry = new String[] {"H", "K", "P"}; //�迭���� ���� �Ŀ� �̷��� ���� �ٸ��ɷ� ���氡��
		for(int i=0; i<3; i++) {
			System.out.println("String�迭:" + strAry[i]);
		}
		
		double[] dblAry;		//double�迭�� ���� ���� dblAry��������, ������ �Է¾���.
		dblAry = new double[] {1, 2.3, 5}; //�ڴʰ� �����Է��ص� ����
		
		float[] fltAry = new float[5]; //������ ũ�⸸ �����ص� �� ����. �� 5�������尡�� | ũ�⸸ �����صθ� �ʱⰪ�� ��µ�. float�� ��� 0.0�� �ʱⰪ. ����غ��� 0.0�� 5������
		for(int i=0; i<fltAry.length; i++) {  //fltAry.length <-- �̰� '�迭��ũ�⸸ŭ'�̶�� �ǹ�
			System.out.println(fltAry[i]);
		}
	}
}
