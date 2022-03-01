package demo.pattern.practice;

public class StepsPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int numberOfAst=6;
		while(temp < 8) {
			
			for (int i = 0; i < (numberOfAst*(temp+1)); i++) {
				if (i<(numberOfAst*(temp))) {
				System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}	
			System.out.println();
			for(int j=0; j < 4;j++) {
				for(int k=0;k < (numberOfAst*(temp+1));k++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			temp++;
		}
	}

}
