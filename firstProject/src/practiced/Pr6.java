package practiced;
import java.util.Scanner;
public class Pr6 {
	public static void main(String[] args) {
		//�޴� ����
		//�̸�,����,����ó,����
		String name = "������";
		int age = 25;
		String phone = "010-8370-1707";
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1.�̸� 2.���� 3.����ó 4.����");
			int num = scn.nextInt();
			scn.nextLine();
			if(num==1) {
				System.out.println(name);	
			}else if(num==2) {
				System.out.println(age);
			}else if(num==3) {
				System.out.println(phone);
			}else if(num==4) {
				System.out.println("�����մϴ�.");
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		
}
}
