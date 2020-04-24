package br.com.pauloc.listacontatos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    ListView lista_contatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lista_contatos = findViewById(R.id.lista_contatos);
        lista_contatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nome = ( (TextView) view ).getText().toString();

                AlertDialog.Builder msgNome = new AlertDialog.Builder(MainActivity.this);
                msgNome.setTitle("Contato selecionado");
                msgNome.setMessage("o contato selecionado foi " + nome);
                msgNome.setNeutralButton("OK", null);
                msgNome.show();
            }
        });
    }
}
