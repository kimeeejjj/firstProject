package firstProject;

public class VariableExample2 {

	public static void main(String[] args) {
		// 이름, 나이, 참/거짓
		// age <= 나이 => 이름은 25세 이상.
		// age >= 나이 => 이름은 25세 이하.
		String name = "김은지";
		int myAge = 25;
		boolean A = true;
		
		int Age = 25;
		
		A = myAge <= Age;
		if(A) {
			System.out.println(name + "의 나이는 25이하입니다.");
		
		A = myAge >= Age;
		if(A) 
			System.out.println(name + "의 나이는 25이상입니다.");
		}
		System.out.println("end of program.");
		 }
	
	}
