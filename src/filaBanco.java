import java.util.Scanner;

//Elabore um programa que simule uma fila de atendimento bancário. 
//O programa deve ler o nome de 3 pessoas (clientes do banco), armazenando-os em uma fila.
public class filaBanco {

	public static void main(String[] args) {
		
		String[] nomesFila = new String[3]; 
	    Scanner nome = new Scanner(System.in); 

     
        
        for(int i = 0; i < nomesFila.length; i++){
            nomesFila[i] = nome.next(); 
        }

        for(int i = 0; i < nomesFila.length; i++){
            int posicao = i+1;
            System.out.println(nomesFila[i] + " - esta na posicao: " + posicao);
        }
        
      }


}

