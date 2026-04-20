
package src;

import javax.swing.JOptionPane;


public class Pessoa {
    String nome;
    String cpf;
    String datanasc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }
         public Pessoa() {
    JOptionPane.showMessageDialog(null, "Passou pelo segundo construtor");
}
}
