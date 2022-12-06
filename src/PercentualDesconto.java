import java.util.Scanner;

public class PercentualDesconto {

	public static void main(String[] args) {
	
		    Scanner input = new Scanner(System.in);
				
		    int M = input.nextInt();
		    int S = input.nextInt();  
		    
		 
		    double percentualDesconto = S * 100 / M ;

		    

		    System.out.format("O desconto foi de %.0f%%%n", (100 - percentualDesconto));

		    

	}

}
