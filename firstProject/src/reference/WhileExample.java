package reference;

public class WhileExample {
	public static void main(String[] args) {
		
		System.out.println("��1.");
		//while �ݺ���.while�� �� �Ǵ� �������ֱ�, �����ָ� �߰�ȣ�ȿ� false�� �������� �����ֱ�
		//�������ʼ�
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("��2.");
		//1~10 ¦���� ���.
		boolean run = true;
		i = 1;
		while(run) {
			if(i%2==0) {
				System.out.println(i);
			}
			if (i == 10)
				run = false;
			i++;
		}
		
		while(true) {
			if (i == 11) {
				break;
			}
		}
	}

	
}
