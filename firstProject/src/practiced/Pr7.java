package practiced;
import java.util.Scanner;
public class Pr7 {
	public static void main(String[] args) {
	
	//for구문 이용하여 사용자가 원하는 단의 구구단 출력하기
//	Scanner scn=new Scanner(System.in);
//	System.out.println("원하시는 구구단을 입력하세요");
//	int num = scn.nextInt();
//	for(int i=1;i<=10;i++) {
//		int result = num*i;
//		System.out.printf("%d*%d=%d\n",num,i,result);
//	}
	
	//for구문 이용하여 1~10단 모두 출력하기
	for(int a=1;a<=10;a++) {
		int j = a;
		System.out.printf("===%d단===\n",j);
	for(int i=1;i<=10;i++) {
		int result = j*i;
		System.out.printf("%d*%d=%d\n",j,i,result);
	}
	}
	
}
}
