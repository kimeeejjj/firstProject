package firstProject;
import java.util.Scanner; // ������� scanner�̸� ���� ������ �� ����
public class ScannerExample3 {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in); // scanner������ �� ���� �ʼ�, �� �ϱ�
	System.out.println("���������Է�:");
	int number1 = scn.nextInt();  // ����
	scn.nextLine(); //���ڳ� �����Է¿���
	
	System.out.println("���������Է�:");
	int number2 = scn.nextInt();
	scn.nextLine();
	
	System.out.println("�̸��Է�:");
	String name = scn.nextLine();
	
	int sum = number1+number2;
	int avg = sum/2;
	
	System.out.printf("%s���� ����,���������� ���� %d,����� %d �Դϴ�.",name,sum,avg);
	System.out.println(); //���ٶ���ֱ�
	
	boolean pass = true;
	
	int ps = 120;
	pass = sum >= ps;
	if(pass) {
		System.out.printf("%s���� �հ��Դϴ�.",name);
	}else {System.out.printf("%s���� ���հ��Դϴ�.",name);}
}
}
