package reference;

public class ForExample {
	public static void main(String[] args) {
		
		{
			int j = 0;
			int i = 0;  //���ȿ� j,i��� ���� ����
		}				//�� ���� ����� ����j,i�� ������Ƿ�
		
		int j = 10;		//�ٽ� ������ �����ص� �������
		//int i = 10;		//������ i�� �ؿ� for�������� =1�� ������̹Ƿ� �� �� ����.
						//����main�޼ҵ�� ��Ͽ� �ֱ� ������ �������� 2�� ����.
		//
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("��1.");
		
		// 1~10 ¦���� ���..
		for (int i=1; i<=10; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("��2.");
		
		// 1~10 Ȧ���� ��.
		int sum = 0;
		for (int i=1; i<=10; i++) {
			if(i%2 == 1) {
				sum += i;
			}
		}	
		System.out.println(sum);
		System.out.println("��3");
		
		sum = 0;  // ���������� �� �ٲٷ��� �������� ���� ���� �ٲٱ�(int sum = 0;(X))
		int cnt = 0; // Ƚ���� �޾ƿͼ� ���
		// 1~10 sum�� ���� 20�� �Ѿ�� �׶��� Ƚ��
		for(int i=1; i<=10; i++) {
			sum += i;
			if(sum >= 20) {
				cnt = i;
				break;
			}
		}
		System.out.println("Ƚ��:"+cnt);
		System.out.println("��4");
	}

}