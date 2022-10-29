package pt.iade.miniteste_01.models;

import java.util.ArrayList;
import java.util.List;

public class PRATO {

    private String nome;
    private double tmp_cozedura;
    private int dificuldade;
    private String instru;
    private final ArrayList<String> ingredientes = new ArrayList<String>();

    public PRATO (String nome){
        this.nome= nome;
    }
    public PRATO (String nome, int tmp){
        this.nome = nome;
        this.tmp_cozedura= tmp;
    }

    public String getNome() {
        return nome;
    }

    public double getTmp_cozedura() {
        return tmp_cozedura;
    }

    public void setTmp_cozedura(double tmp_cozedura) {
        this.tmp_cozedura = tmp_cozedura;
    }

    public void setInstru(String instru) {
        this.instru = instru;
    }
    public void inserir_ingrediente(String name){
        ingredientes.add(name);

    }
    public void remover_ingrediente(String prato) {
        ingredientes.remove(prato);
    }
}
