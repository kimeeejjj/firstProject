package firstProject;

public class StringExample {
	
	public static void main(String[] args) {
		int age = 20;
		String name = "ȫ�浿";
		
		long myAge = age; // ����Ÿ�Ծȸ����� �ڵ�����ȯ�߻�(promotion)
		age = (int) myAge; // ūŸ���̿����ʿ���������ȣ�־ ��������ȯ���������(casting) 

// age = "ȫ�浿";  -> ���� ������ Ÿ�� �ȸ¾Ƽ� ������
// name = 20;     -> ��������
 		System.out.println(name + "�� ���̴�" + age);
 		
 		int age =25;
 		String name = "������";
 		System.out.println(name + "�� ���̴�" + age + "�Դϴ�.");
 		
 		System.out.println("�������� ���̴�" + 25 + "�Դϴ�.");
 		
	}
}
