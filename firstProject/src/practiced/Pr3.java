package practiced;
import java.util.Scanner;
public class Pr3 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("<1~9 출력>");
		System.out.println("원하는 단을 말씀해주세요.");
		int num = scn.nextInt();
		scn.nextLine();
		
		boolean isTrue = true;
		
		if(num == 1) {
			for(int i=1; i<=10;i++) {
				int gob = num*i;
				System.out.printf("%d * %d = %d\n",num,i,gob);
			}
		}else if(num == 2) {
			for(int i=1; i<=10;i++) {
				int gob = num*i;
				System.out.printf("%d * %d = %d\n",num,i,gob);
			}		
		}else if(num == 3) {
			for(int i=1; i<=10;i++) {
				int gob = num*i;
				System.out.printf("%d * %d = %d\n",num,i,gob);
			}
		}else if(num == 4) {
				for(int i=1; i<=10;i++) {
				int gob = num*i;
				System.out.printf("%d * %d = %d\n",num,i,gob);
				}
		}else if(num == 5) {
			for(int i=1; i<=10;i++) {
				int gob = num*i;
				System.out.printf("%d * %d = %d\n",num,i,gob);
			}
		}else if(num == 6) {
			for(int i=1; i<=10;i++) {
				int gob = num*i;
				System.out.printf("%d * %d = %d\n",num,i,gob);
			}
		}else if(num == 7) {
			for(int i=1; i<=10;i++) {
				int gob = num*i;
				System.out.printf("%d * %d = %d\n",num,i,gob);
			}
		}else if(num == 8) {
			for(int i=1; i<=10;i++) {
				int gob = num*i;
				System.out.printf("%d * %d = %d\n",num,i,gob);
			}
		}else {
			for(int i=1; i<=10;i++) {
				int gob = num*i;
				System.out.printf("%d * %d = %d\n",num,i,gob);
			}
		}
	
	}
}
