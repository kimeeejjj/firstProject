package firstProject;
import java.util.Scanner;
public class KimEunJi {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.println("�������Է�:");
	int num1 = scn.nextInt();
	scn.nextLine();
	
	System.out.println("�����Է�(m):");
	int num2 = scn.nextInt();
	scn.nextLine();
	
	System.out.println("�̸��Է�:");
	String name = scn.nextLine();
	
	int num3 = num2*num2;
	double bmi = (int)num1/num3;
	
	System.out.printf("%s���� BMI������ %d�Դϴ�", name,bmi);
	
}
}
