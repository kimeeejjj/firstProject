package control;
import java.util.Scanner; //����Ŭ�����ε�String��import�ʿ����길�̷�������?
						//java.lang.String;�� ���lang���⺻��Ű���� �����ʿ����.
public class WhileExample2 {
	public static void main(String[] args) {
		String name = "ȫ�浿";
		String age = "20";
		String phone = "010-0101-2345";
		
		// Scanner���
		// ����ڰ�1�Է�-�̸�,2�Է�-����,3�Է�-����ó ���
		// 4�Է�-�ݺ��� ����.
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1.�̸� 2.���� 3.����ó 4.����");
			int menu = scn.nextInt();
			if(menu == 1) {
				System.out.println("�̸�: "+name);
			} else if(menu == 2) {
				System.out.println("����:"+age);
			} else if(menu == 3) {
				System.out.println("����ó"+phone);
			} else if(menu == 4) {
				break;
			}
		} 
		System.out.println("��");
		
	}
}
