package demo.pattern.practice;

public class DrawTriangle {

	public static void main(String[] args) {
		
		int temp=0; 
		int numberOfSpc=8;
		int newLine = 8;
		for(int p=0; p<newLine;p++) {
			for(int i=0;i<=p;i++) {
				if(temp==0) {
					for(int j=0;j<numberOfSpc;j++) {
						System.out.print(" ");
					}
				}
				System.out.print("* ");
				temp++;
			}
			temp=0;
			numberOfSpc--;
			System.out.println();
		}
	}

}
