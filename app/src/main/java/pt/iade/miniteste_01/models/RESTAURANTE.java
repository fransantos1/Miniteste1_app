package pt.iade.miniteste_01.models;

import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull; //sugerido pelo android studio
import pt.iade.miniteste_01.models.EMENTA;

import java.util.ArrayList;
import java.util.List;

public class RESTAURANTE {
    private String nome;
    private String morada;
    private int number;
    private final ArrayList<EMENTA> ementas = new ArrayList<EMENTA>();

    public RESTAURANTE (String nome){
        this.nome = nome;
    }
    public RESTAURANTE (String nome, String mor){
        this.nome = nome;
        this.morada= mor;
    }
    public String getNome() {return nome;}
    public String getMorada() {return morada;}
    public void setMorada(String morada) {this.morada = morada;}
    public void setNumber(int number) {this.number = number;}
    public void addementa(EMENTA ementa){ementas.add(ementa);}
    public void removementa(EMENTA ementa){ementas.remove(ementa);}
    public int n_ementas(@NonNull ArrayList<EMENTA> ementa){return ementa.size();}
}
