package practiced;
import java.util.Scanner;
public class Pr4 {
public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	System.out.println("�̸��� �Է��ϼ���.");
	String name = scn.nextLine();
	
	System.out.println("���������� �Է��ϼ���.");
	int guk = scn.nextInt();
	scn.nextLine();
	
	System.out.println("���������� �Է��ϼ���.");
	int math = scn.nextInt();
	scn.nextLine();
	
	System.out.println("���������� �Է��ϼ���.");
	int eng = scn.nextInt();
	scn.nextLine();
	
	double sum = guk+math+eng;
	double avg = sum/3;
	
	System.out.printf("%s���� �����հ�� %f�̸�, ����� %f���Դϴ�.",name,sum,avg);
	
	
	
}
}
