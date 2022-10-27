package pt.iade.miniteste_01;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collection;
import java.util.Collections;

import pt.iade.miniteste_01.models.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EMENTA EMENTA = new EMENTA("teste");
    public void change_window(View v) {

    }
    TextView n_receitas = (TextView)findViewById(R.id.textView_nreceitas);
    public void n_receitas(View v) {
        int i = EMENTA.n_pratos(EMENTA.getPratos());
        n_receitas.setText(i);
    }
    TextView most_dificulty = (TextView)findViewById(R.id.textView_maior_dificuldade);
    public void most_dificulty(View v) {
        
        String nome = null;
        int i = EMENTA.n_pratos(EMENTA.getPratos());
        for (int j=0 ; j <= i; j++){
            int n = 0;

        }
        most_dificulty.setText(nome);
    }
    public void maior_ingredientes(View v){

    }





}