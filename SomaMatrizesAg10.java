package somamatrizesag10;

/*
Soma de todos os elementos de duas matrizes 5x5.

*@author Michael Viana Pereira da Cruz - Turma CNH - DS_I - Agenda 10
*/

import javax.swing.JOptionPane;

public class SomaMatrizesAg10 {

    public static void main(String[] args) {
        //Declaração de variáveis
        int a[][] = new int [5][5];
        int b[][] = new int [5][5];
        int somaMat=0;
        int linha, coluna = 0;
       
        
        //Entrada de dados da matriz A
        JOptionPane.showMessageDialog(null, "DADOS DA MATRIZ: A");
        for (linha=0; linha<5; linha++){
            for(coluna=0; coluna<5; coluna++){
                a[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("MATRIZ A \nInsira um valor para: \nLinha: "+ (linha+1)+ "\nColuna: "+(coluna+1)));
               // somaA = somaA + a[linha][coluna];
            }
        }
        
        //Entrada de dados da matriz B
        JOptionPane.showMessageDialog(null, "DADOS DA MATRIZ: B");
        for (linha=0; linha<5; linha++){
            for(coluna=0; coluna<5; coluna++){
                b[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("MATRIZ B \nInsira um valor para: \nLinha: "+ (linha+1)+ "\nColuna: "+(coluna+1)));
                //somaB = somaB + b[linha][coluna];
            }
        }
        
        for(linha=0; linha<5; linha++){
            for(coluna=0; coluna<5; coluna++){
                somaMat += a[linha][coluna] + b[linha][coluna];
            }
        }
        JOptionPane.showMessageDialog(null, "A soma dos valores de\n MATRIZ A  +  MATRIZ B \né igual a: "+somaMat);
       
                 
       
    }
    
}
