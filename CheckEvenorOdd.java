package Schoollevel;

public class CheckEvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 101;
		
		if(isEven(n) != false) {
			System.out.print("Even");
		}
		else {
			System.out.print("oDD");
		}

	}
	
	static boolean isEven(int n) {
		
		return((n/2)*2==n);
	}

}
