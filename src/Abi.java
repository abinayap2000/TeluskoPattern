
public class Abi {
	public static void main(String[] args) {
	


		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || j==3) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}System.out.println();
		
		int n=5;
		
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=n;j++) {
				if(i==1||i==5||i==n/2+1||j==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=5;j++) {
				if(i==5||j==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=5;j++) {
				if(i==5&&j>1&&j<5||j==1&&i<5||j==5&&i<5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=5;j++) {
				if(i==1&&j>1||i==5&&j<5||i==3||i==2&&j==1||i==4&&j==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=5;j++) {
				if(j==1||i==j&&i>=3||i==1&&j==5||i==2&&j==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=5;j++) {
				if((i==1&&j>1&&j<5)||i==5&&j>1&&j<5||j==1&&i>1&&i<5||j==5&&i>1&&i<5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		
	}
			
}


