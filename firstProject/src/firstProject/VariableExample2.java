package firstProject;

public class VariableExample2 {

	public static void main(String[] args) {
		// �̸�, ����, ��/����
		// age <= ���� => �̸��� 25�� �̻�.
		// age >= ���� => �̸��� 25�� ����.
		String name = "������";
		int myAge = 25;
		boolean A = true;
		
		int Age = 25;
		
		A = myAge <= Age;
		if(A) {
			System.out.println(name + "�� ���̴� 25�����Դϴ�.");
		
		A = myAge >= Age;
		if(A) 
			System.out.println(name + "�� ���̴� 25�̻��Դϴ�.");
		}
		System.out.println("end of program.");
		 }
	
	}
