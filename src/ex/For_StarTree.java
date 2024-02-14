package ex;

public class For_StarTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//예제 1
		for (int i=1; i<=5; i++) {
			System.out.println("*");
		}
		
		//예제 2
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
			System.out.println("*");
		}
		System.out.println();
	}
		
		//예제 3
		for (int i=1; i<=5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
		
		//예제 4
		for (int i=5; i>0; i--) {
			for (int j=0; j<i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
		//예제 5
		for (int i=0; i<5; i++) {
			for (int j=0; j>i; j--) {
				System.out.println("*");
			}
				System.out.println();
		}
		
		
		//예제 6
		 for (int i=1; i<6; i++) {
			 for (int j=5; j>i; j++) {
				 System.out.println("");
			 }
			 for (int j=0; j<i; j++) {
				 System.out.println("*");
			 }
			 System.out.println();
		 }
		 
		 //예제 7
		 for (int i=1; i<=5; i++) {
			 for (int j=0; j<i; j++) {
				 System.out.println("*");
			 }
			 System.out.println();
		 }
		 for (int i=0; i<5; i++) {
			 for (int j=4; j>i; j--) {
				 System.out.println("*");
			 }
			 System.out.println();
		 }
		 
		 
	}

}
