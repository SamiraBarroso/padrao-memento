package org.example;
import java.util.ArrayList;
import java.util.List;

public class Documento {
    private String conteudo;
    private Versao versao;
    private List<Versao> versoes = new ArrayList<Versao>();


    public Versao getVersao() {
        return this.versao;
    }

    public void setVersao(Versao versao) {
        this.versao = versao;
        this.versoes.add(this.versao);
    }

    public void restauraVersao(int indice) {
        if (indice < 0 || indice > this.versoes.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.versao = this.versoes.get(indice);
    }

    public List<Versao> getVersoes(){
        return this.versoes;
    }
}