package pt.iade.miniteste_01.models;

import androidx.annotation.NonNull;

import pt.iade.miniteste_01.models.PRATO;
import java.util.ArrayList;
import java.util.List;

public class EMENTA {
    private String nome;
    private final ArrayList<PRATO> pratos = new ArrayList<PRATO>();

    public EMENTA(String nome){
        this.nome = nome;

    }
    public void inserir_prato(PRATO name){
        pratos.add(name);

    }
    public void remover_prato(PRATO prato){
        pratos.remove(prato);
    }
    public int n_pratos(@NonNull ArrayList<PRATO> pratos){
        return pratos.size();
    }
    public PRATO maior(@NonNull PRATO pratos){
     return pratos;
    }

    public ArrayList<PRATO> getPratos() {
        return pratos;
    }
}
