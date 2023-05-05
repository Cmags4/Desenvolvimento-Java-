package eadtec.padocadojoaquim;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class PadocaDoJoaquim {   
    
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new  ArrayList<Produto>();
        DecimalFormat formatadorNumerico = new DecimalFormat("R$ #,##0.00");
        
        for(int controle = 0; controle <= 1; controle++){
           String descProd = JOptionPane.showInputDialog("Digite a Descrição do produto");
           double valProd = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto").replace(',', '.'));
           double valDesc = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do desconto").replace(',', '.'));
           Produto p = new Produto(descProd, valProd, valDesc);
           produtos.add(p);
        }
        
        String janelaDeProdutos = "Lista de produtos com desconto:\n";   
        
        for(Produto p : produtos){
           janelaDeProdutos += "Descrição do produto: \n" + p.getDescricaoDoProduto() + " | Valor do produto é "+formatadorNumerico.format(p.getValorDoProduto()) + " | Valor do produto com desconto de " +p.getDescontoDoProduto() +"% é " +formatadorNumerico.format(p.calcularDesconto())+"\n";
        }
        
        JOptionPane.showMessageDialog(null, janelaDeProdutos);
    }
}
