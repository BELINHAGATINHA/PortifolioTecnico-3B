
package quizz;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Quizz {
   int contador = 0;
    public static void main(String[] args) {
        
        Quizz q = new Quizz();
        
        String p1 = "o que é branco?";
        String r1 = "a junção de todas as cores";
        String p2 = "qual é a cor favorita da maioria das pessoas?";
        String r2 = "azul";
        String p3 = "o que a cor azul remete?";
        String r3 = "confiança e harmonia";
        String p4 = "qual é a cor menos favorita da maioria das pessoas?";
        String r4 = "marrom";
        String p5 = "o que o pintinho caipira disse para o outro?";
        String r5 = "pirrr";
        
        
        q.perguntar(p1, r1);
        q.perguntar(p2, r2);
        q.perguntar(p3, r3);
        q.perguntar(p4, r4);
        q.perguntar(p5, r5);
        q.exibir();
        
    }
     public void perguntar(String pergunta, String respostaCerta){
        String digiteResposta = JOptionPane.showInputDialog(null, pergunta);
        if(digiteResposta.equals(respostaCerta)){
            JOptionPane.showMessageDialog(null, "acertou");
            contador++;
        }
        else {
            JOptionPane.showMessageDialog(null, "errou");
     }
         
     }
     
     public void exibir(){
        JOptionPane.showMessageDialog(null,"acertastes " + contador + " questões");
        
}
}