package control;

public class DoWhileExe {
	public static void main(String[] args) {
		boolean run = false;
		int cnt = 0;
		
		// ��1. 1���� 10���� ���.
		do {
			cnt++;
			System.out.println(cnt);
			if(cnt == 10) {
				break;
				}
		} while(true);  //true���� ������ ����.. [����]while���¹ݺ����������ϱ������������ٴºκ��̹Ƿ�,
		System.out.println("###��1###"); // true�����������׻������̿Ǳ⶧�����ݺ����̹��ѽ����
										// �׷���true���̵��ִٸ�break�����عݺ��������������ü�����.
		// ��2. ¦���� ���.				// �Ǵ�boolean run = false;�ؼ� false����run���־�������ü�����.
		cnt = 0;						// ����׷��ٸ��ѹ�������ǰ�ݺ����̳����Ե�.(Ȯ����������..�Ф�)
		do {
			cnt++;
			if(cnt % 2 == 0) {
			System.out.println(cnt);   //continueȰ���غ����ϴµ��ФФ�
			} 
			if(cnt == 11) {
				break;
			}
		} while(true);
		System.out.println("###��2###");
		
		// ��3. Ȧ���� �հ�. continueȰ���ؼ�! �ٽ��غ���
		cnt = 0;
		int sum = 0;			
		do {
			cnt++;
			if(cnt % 2 == 0) {
				continue;
			}
			if(cnt >= 10) { //cnt�� 11�� �Ǿ�� break�� �ɸ�
				break;
			}
			sum += cnt;
		} while(true);
		System.out.println(sum);
		System.out.println("###��3###");
		
		// ��4. ������ �� 1~10;
		// sum ���� 100 ���� ū ���� �Ǿ��� ��
		// �׶��� sum���� ���...��� �����ߴ��� �����ֵ���...,continue���
		// sum : 101, ���� : 13
		// ��4         �������̤̤ФФФФ��� �������غ���
		
		cnt = 0;
		sum = 0;
		int count = 0;
		do {
			cnt++;
			System.out.println(cnt);
			if(cnt == 10) {
				break;
			}
		} while(true);


		
	}
}
