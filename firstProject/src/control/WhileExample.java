package control;

public class WhileExample {

	public static void main(String[] args) {
		int i = 1; //�ʱ��
		while(i <= 10) {
			System.out.printf("i�� ���� %d\n", i); //���⼭�������������̾����������ݺ�
			i++;   //�̷��������ĳ־���������������
		}
		System.out.println("###while���������̷��Ծ�###");
		boolean run = true;
		int cnt = 0;
		while(run) {     //while���� = ���ǿ������������ݺ��ϰڴ�
			cnt = (int)(Math.random()*10)+1;
			System.out.println(cnt);
			if(cnt == 8) {
				run = false;
				//break;   while������ break;��밡��!
			}
		}
		System.out.println("��");

	}

}
