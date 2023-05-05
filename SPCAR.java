/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spcar;

/**
 *
 * @author Caio
 */
public class SPCAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String modelo;
        double valorDiaria;
        int quantidadeDias;
        double quantidadeKms;
        double valorTotal;

        Scanner leitor = new Scanner(System.in);
       
             
        System.out.println("Calculo de valores de diarias");
        System.out.println("Digite o modelo carro");
        modelo = leitor.next();
        System.out.println("Digite o valor da diária");
        valorDiaria = leitor.nextDouble ();
        System.out.println("Digite a quantidade de dias");
        quantidadeDias = leitor.nextInt();
        System.out.println("Digite a quantidade de quilometros");
        quantidadeKms = leitor.nextDouble();
        valorTotal=(valorDiaria*quantidadeDias)+(quantidadeKms*0.2);
        System.out.println(modelo + "o valor total e R$" + valorTotal);
        
                
                
    

    

);
        
             
                     
             
     
     
     
     
     

    }

}
