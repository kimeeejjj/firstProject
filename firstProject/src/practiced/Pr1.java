package practiced;
import java.util.Scanner;
public class Pr1 {
	public static void main(String[] args) {
		//�̸��Է�
		//���������Է�
		//���������Է�
		//���������Է�
		//����� 90�̻��̸� A, 80�̻��̸� B, 70�̻��̸� C, 60�̻��̸� D, ���� F
		//��°� ���������� ����������̸�, ������ ���Դϴ�.
		
		Scanner scn=new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���.");
		String name = scn.nextLine();
		
		System.out.println("���������� �Է��ϼ���.");
		int korean = scn.nextInt();
		scn.nextLine();
		
		System.out.println("���������� �Է��ϼ���.");
		int math = scn.nextInt();
		scn.nextLine();
		
		System.out.println("���������� �Է��ϼ���.");
		int eng = scn.nextInt();
		scn.nextLine();
		
		int sum = korean+math+eng;
		double avg = (double)sum/3;
		if(avg >= 90) {
			System.out.printf("%s���� ����� %f���̸�, ������ A�Դϴ�.",name,avg);
		} else if(avg >= 80) {
			System.out.printf("%s���� ����� %f���̸�, ������ B�Դϴ�.",name,avg);
		} else if(avg >=70 ) {
			System.out.printf("%s���� ����� %f���̸�, ������ C�Դϴ�.",name,avg);
		} else if(avg >=60 ) {
			System.out.printf("%s���� ����� %f���̸�, ������ D�Դϴ�.",name,avg);
		} else {
			System.out.printf("%s���� ����� %f���̸�, ������ F�Դϴ�.",name,avg);
		}
	}
}
		
		