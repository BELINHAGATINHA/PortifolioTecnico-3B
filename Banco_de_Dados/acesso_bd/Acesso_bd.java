/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acesso_bd;

/**
 *
 * @author SESI_SENAI
 */
public class Acesso_bd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Pessoa p = new Pessoa();
      p.setId(4);
      p.setIdade(20);
      p.setNome("Jungkook");
      Banco.salvar(p);
      Banco.vizualiza_banco("pessoas", "id", "nome", "idade");
    }
    
}
