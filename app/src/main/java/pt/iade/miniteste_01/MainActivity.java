package pt.iade.miniteste_01;

import static android.text.TextUtils.isEmpty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.function.Predicate;

import pt.iade.miniteste_01.models.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    EMENTA EMENTA = new EMENTA("teste");

    public void adicionar_ementa(View v){
            TextView tmp = (TextView)findViewById(R.id.editTextCookingTime);
            TextView name = (TextView)findViewById(R.id.editTextTextName);
            int tmp1 = Integer.parseInt(tmp.getText().toString());
            String name1 = name.getText().toString();

            PRATO PRATO;
            if (!isEmpty(name1)) {
                if (tmp1 != 0) {
                    PRATO = new PRATO(name1, tmp1);
                } else {
                    PRATO = new PRATO(name1);
                }
                EMENTA.inserir_prato(PRATO);
            }
    }


    public void n_receitas1(View v) {
        TextView n_receitas1 = (TextView)findViewById(R.id.textView_nreceitas);
        int i = EMENTA.n_pratos(EMENTA.getPratos());
        n_receitas1.setText(String.valueOf(i));
    }


}