package control;

public class DoWhileExample {
	public static void main(String[] args) {
		
		System.out.println("####����1####");
		//Do..While
		boolean run = false;  // run���� false
		while(run) {          // while������ �������� true���� ����Ǵµ� false�̹Ƿ�     
			System.out.println("���๮1");  // ��� �ѹ��� ���� ���ϰ� ��
		}
		do {					//do-while������ while�տ� ���๮�� ���Ƿ�
			System.out.println("���๮2"); //������ ������,�������� �������ʰ� ������1���������
		} while(run);  //�ѹ� ������ �ǰ� ������ run�� false���� �˰� �Ǿ���
	
		System.out.println("####����2####");
		
		boolean run2 = false;
		int cnt = 0;
		do {
			System.out.println(cnt);
			if(cnt >= 10) {
				break; // �ݺ����� �����ڽ��ϴ�
			}
			cnt++;
		} while(true);
		
		System.out.println("####����3####"); //����2�ʹٸ���cnt++������if������
											//����2����°����غ���
		boolean run3 = false;
		int cnt2 = 0;
		do {
			System.out.println(cnt2);
			cnt2++;
			if(cnt2 >= 10) {
				break;
			}
		} while(true);
		
		System.out.println("####����4####"); 
		//����4�� continue;����=����������,��Ƽ���������ִ½��๮�����������ʰ�״������γѾ�ڽ��ϴ�.
		boolean run4 = false;
		int cnt3 = 0;
		do {
			cnt3++;
			if(cnt3 %2 == 1) {
				continue; // if(cnt3 %2 == 1)������,����if��������ʰ�״������γѾ.��,�ݺ���ó�����ε��ƿ�
			}
			System.out.println(cnt3);
			if(cnt3 >= 4) {	
				break;
			}
		} while(true);
	}

}
