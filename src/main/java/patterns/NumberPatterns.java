package patterns;

public class NumberPatterns {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			int k=5-i+1;
			for( int j=1;j<=5;j++) {
			
				System.out.print(k+" ");
				k+=5;
			}
			
			System.out.println();
		}

		
		         //incomplete
		System.out.println("----------------");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				int k;
				if(j%2==0) {
					 k=5;
					System.out.print(k);
					k+=10;
				}
				else {
					k=6;
					System.out.print(k);
					  k+=10;
					
				}
				k--;
				
			}
			System.out.println();
		}
	}

}
