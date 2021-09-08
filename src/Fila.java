
import java.util.Scanner;


public class Fila {

    public static void main(String[] args) {
        
        // declaração variável tipo inteiro
        
      int idade;
           
           // Solicitando para o usuário entrar com os dados
           
            Scanner leitor = new Scanner(System.in);
                  System.out.println("Por gentileza,  informe sua idade:");
                       idade = leitor.nextInt();
                       
            // Processamento
            
                        if (idade < 60){
                            System.out.println(" Fila comum ");}
                                else if (idade >= 80){
                                        System.out.println(" Fila 80+ ");
                                              } else  {
                                                              System.out.println(" Fila prioritária");
                        }   
                    
        
                                 }
                       
   
}

