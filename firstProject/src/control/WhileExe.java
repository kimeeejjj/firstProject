package control;

public class WhileExe {
	public static void main(String[] args) {
		// Q1.while ������ 1~10���� ���
		// (����) 
		// int i = 1;
		// while(i <= 10) {
		//   system.out.println(i);
		//   i++; }
		boolean run = true;
		int num = 0;
		while (run) {
			num += 1;
			System.out.println(num);
			if (num == 10) {
				run = false;
			} 
		}//���� �̷��Գ� ��� �ԤФФФФФ�
		System.out.println("����1.��");
		// Q2.while ������ 2,4,6,8,10�� ���
		int i = 1;
		while(i <= 10) {
			if(i % 2 == 0) {
				System.out.println(i);
			} i++;
		}
		System.out.println("����2.��");
		// Q3.while ������ 1,3,5,7,9�� ���
		
	}

}
