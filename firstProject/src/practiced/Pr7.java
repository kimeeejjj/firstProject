package practiced;
import java.util.Scanner;
public class Pr7 {
	public static void main(String[] args) {
	
	//for���� �̿��Ͽ� ����ڰ� ���ϴ� ���� ������ ����ϱ�
//	Scanner scn=new Scanner(System.in);
//	System.out.println("���Ͻô� �������� �Է��ϼ���");
//	int num = scn.nextInt();
//	for(int i=1;i<=10;i++) {
//		int result = num*i;
//		System.out.printf("%d*%d=%d\n",num,i,result);
//	}
	
	//for���� �̿��Ͽ� 1~10�� ��� ����ϱ�
	for(int a=1;a<=10;a++) {
		int j = a;
		System.out.printf("===%d��===\n",j);
	for(int i=1;i<=10;i++) {
		int result = j*i;
		System.out.printf("%d*%d=%d\n",j,i,result);
	}
	}
	
}
}
