package practiced;
import java.util.Scanner;
public class Pr2 {
 public static void main(String[] args) {
	
	 Scanner scn=new Scanner(System.in);
	while(true) {
	 System.out.println("<�������� ����>");
	 System.out.println("�̸��� �Է��ϼ���:");
	 String name = scn.nextLine();
	 
	 System.out.println("����ó�� �Է��ϼ���:");
	 int phone = scn.nextInt();
	 scn.nextLine();
	 
	 System.out.println("���̸� �Է��ϼ���:");
	 int age = scn.nextInt();
	 scn.nextLine();
	 
	 System.out.printf("����� �̸��� %s, ���̴� %d, ����ó�� %d�Դϴ�.\n",name,age,phone);
	 System.out.println("������ 1, Ʋ���� 2�� �����ּ���.");
	 int answer = scn.nextInt();
	 scn. nextLine();
	 
	 if(answer == 1) {
		 System.out.println("���翡 �������ּż� �����մϴ�.");
		 break;
	 } 
 }
}
}
