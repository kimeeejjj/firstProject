package control;

public class ConditionExe {
	public static void main(String[] args) {
		// [1]�� ���� 60, 70
		// �� ���� ���� ��� 100�� �Ѿ�� �հ�, �̸� ���հ�
		// ��.
		int A = 60;
		int B = 70;
		int sum = A + B;
		int gob = A * B;

		if (sum >= 100) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
			System.out.println("1����");
		// [2]�� ���� ���ؼ� ¦���̸� ¦��, Ȧ���̸� Ȧ��
		// 2��° ��.
		if (gob % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
			System.out.println("2����");
		// [3]���� ���� ����. 4,9,12�� ���ʷ� �־��
		// 2�� ����̸� 2�ǹ��, 3�� ����̸� 3�� ���, 2�� 3�� ���
		int c = 12;
		if (c % 2 == 0 && c % 3 == 0) {
			System.out.println("2�� 3�� ����Դϴ�"); // 12�ǰ����̰�����µǾ���ϹǷ�2,3�ǰ��������ǹ�������ó�����ؾ���.
												// �̰�����������������12�ǰ��2�ǹ�������ɷ������������������ǹ�����������������
		} else if (c % 2 == 0) {
			System.out.println("2�� ����Դϴ�");
		} else if (c % 3 == 0) {
			System.out.println("3�� ����Դϴ�");
		}
			System.out.println("3����");
		int randomValue = (int) (Math.random()*6)+1; //random������ô���Ÿ�����ΰ�����������.�׷��Ƿο��ʰ��׻�����̾���� ex.double A = Math.random()
		System.out.println(randomValue); //random�Ǳ������������������.�׻�0~1�����ǰ��������.�׷����Ҽ������ַ��鰭����(int)�θ�������.
											//�׸���1�̻��ǰ��̳�������*���������ָ��. ex) Math.random()*6 = 0.6~5.4���ǰ��̳��ð�.

		//[4]switch���ǹ�(switch-break) -> 1�� ���Խ��ϴ�.
		//4����.
		switch(randomValue) {
		case 1 :
			System.out.println("1�� ���Խ��ϴ�.");
			break;
		case 2 :
			System.out.println("2�� ���Խ��ϴ�.");
			break;	
		case 3 :
			System.out.println("3�� ���Խ��ϴ�.");
			break;	
		case 4 :
			System.out.println("4�� ���Խ��ϴ�.");
			break;
		case 5 :
			System.out.println("5�� ���Խ��ϴ�.");
			break;
		default:
			System.out.println("6�� ���Խ��ϴ�.");
		}
		System.out.println("4����");
		
		//[5]�������� 1~99���� ���������ϰ�, 90�̻�A, 80�̻�B, 70�̻�C, 60�̻�D, 60�̸�F
		int randomScore = (int)(Math.random()*100); //1~99���� ���;� �ϴ� 100�����ֱ�
		System.out.println(randomScore);
		
		if(randomScore >= 90) {
			System.out.println("A����");
		}else if(randomScore >= 80) {
			System.out.println("B����");
		}else if(randomScore >= 70) {
			System.out.println("C����");
		}else if(randomScore >= 60) {
			
		}else {
			System.out.println("F����");
		}
			System.out.println("5����");
			
		//[5-1]5���� ���� �������� switch���� ����غ���
		
		int randomScore2 = (int)(Math.random()*100); //0~1���̷�������100���ϰ�int�����Ͽ��Ҽ������ָ�1~99������
		int resultRandomScore2 = randomScore2 / 10; //1~99�����ǰ�����10���γ�����,90�̻��ΰ��¸��̹�����9,80�̻��ΰ�����8..�̹Ƿ�	
		
		switch(resultRandomScore2) {
		case 9 :
			System.out.println("A����");
			break;
		case 8 :
			System.out.println("B����");
			break;
		case 7 :
			System.out.println("C����");
			break;
		case 6 :
			System.out.println();
			
		} 
			System.out.println("��");
	}
}
