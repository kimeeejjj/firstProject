package firstProject;
import java.util.Scanner;
public class ScannerExample2 {
	public static void main(String[] args) {
		// ����: ����� �Է�(10, 20)
		// 10 + 20
		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��ϼ���.");
		int number1 = scn.nextInt();
		scn.nextLine();
		
		System.out.println("�ι�° ���� �Է��ϼ���.");
		int number2 = scn.nextInt();
		scn.nextLine();
		
		System.out.printf("%d+%d=%d",number1,number2,number1+number2);
	}
}
