/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vale.card;

/**
 *
 * @author Caio
 */
import javax.swing.JOptionPane;
public class ValeCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int digito;
        String d;
        
        digito = Integer.parseInt(JOptionPane.showInputDialog("Entre com o último número da sua placa"));
        
        switch (digito) {
            case 1:
                d = "até 30/04";
                break;
                
            case 2:
                d = "até o dia 31/05";
                break;
                
            case 3:
                d = "até o dia 30/06";
                break;
                
            case 4:
                d = "até o dia 31/07";
                break;
                
            case 5:
                d = "até o dia 31/08";
                break;
                
            case 6:
                d = "até o dia 30/09";
                break;
                
            case 7:
                d = "até o dia 31/10";
                break;
                
            case 8:
                d = "até o dia 30/11";
                break;
                
            case 9:
                d = "até o dia 31/12";
                break;
                
            case 0:
                d = "até o dia 31/12";
                break;
                
            default: 
                d = "O valor digitado está incorreto";
                break;             
                
        }
        JOptionPane.showMessageDialog(null, "A data para pagamento é " +d );
    }
    
}
