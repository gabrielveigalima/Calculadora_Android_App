package gabrielveigalima.com.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button botao0;
    private Button botao1;
    private Button botao2;
    private Button botao3;
    private Button botao4;
    private Button botao5;
    private Button botao6;
    private Button botao7;
    private Button botao8;
    private Button botao9;
    private Button botaoSoma;
    private Button botaoDivisao;
    private Button botaoSubtracao;
    private Button botaoMultiplicacao;
    private Button botaoPonto;
    private Button botaoIgual;
    private EditText tela;
    private Button botaoApaga;
    private String sinal = "";
    private Double valor1;
    private Double valor2;
    private String resultado;
    private int resulInt;
    private Double resulDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tela = (EditText) findViewById(R.id.telaId);
        botao0 = (Button) findViewById(R.id.botao0);
        botao1 = (Button) findViewById(R.id.botao1);
        botao2 = (Button) findViewById(R.id.botao2);
        botao3 = (Button) findViewById(R.id.botao3);
        botao4 = (Button) findViewById(R.id.botao4);
        botao5 = (Button) findViewById(R.id.botao5);
        botao6 = (Button) findViewById(R.id.botao6);
        botao7 = (Button) findViewById(R.id.botao7);
        botao8 = (Button) findViewById(R.id.botao8);
        botao9 = (Button) findViewById(R.id.botao9);
        botaoSoma = (Button) findViewById(R.id.botaoSoma);
        botaoDivisao = (Button) findViewById(R.id.botaoDivisao);
        botaoSubtracao = (Button) findViewById(R.id.botaoSubitracao);
        botaoMultiplicacao = (Button) findViewById(R.id.botaoMultiplicacao);
        botaoPonto = (Button) findViewById(R.id.botaoPonto);
        botaoIgual = (Button) findViewById(R.id.botaoIgual);
        botaoApaga = (Button) findViewById(R.id.botaoApagarId);


        botao0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText().toString()+"0");
            }
        });

        botao0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText().toString()+"0");
            }
        });

        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText().toString()+"1");
            }
        });

        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText().toString()+"2");
            }
        });

        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText().toString()+"3");
            }
        });

        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText().toString()+"4");
            }
        });

        botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText().toString()+"5");
            }
        });

        botao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText().toString()+"6");
            }
        });

        botao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText().toString()+"7");
            }
        });

        botao8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText().toString()+"8");
            }
        });

        botao9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText().toString()+"9");
            }
        });

        botaoPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText().toString()+".");
            }
        });

        botaoSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sinal = "+";
                valor1 = Double.parseDouble(tela.getText().toString());
                tela.setText("");
            }
        });

        botaoSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sinal = "-";
                valor1 = Double.parseDouble(tela.getText().toString());
                tela.setText("");
            }
        });

        botaoDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sinal = "/";
                valor1 = Double.parseDouble(tela.getText().toString());
                tela.setText("");
            }
        });

        botaoMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sinal = "*";
                valor1 = Double.parseDouble(tela.getText().toString());
                tela.setText("");
            }
        });

        botaoIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor2 = Double.parseDouble(tela.getText().toString());
                //Verificar qual operação é para fazer
                if(sinal.equals("+")){
                    resulDouble =  valor1 + valor2;
                    if(resulDouble % 2 == 0){
                        resulInt = resulDouble.intValue();
                        tela.setText(String.valueOf(resulInt));
                    }else{
                        tela.setText(String.valueOf(resulDouble));
                    }
                } else if(sinal.equals("-")){
                    resulDouble =  valor1 - valor2;
                    if(resulDouble % 2 == 0){
                        resulInt = resulDouble.intValue();
                        tela.setText(String.valueOf(resulInt));
                    }else{
                        tela.setText(String.valueOf(resulDouble));
                    }
                } else if(sinal.equals("*")){
                    resulDouble =  valor1 * valor2;
                    if(resulDouble % 2 == 0){
                        resulInt = resulDouble.intValue();
                        tela.setText(String.valueOf(resulInt));
                    }else{
                        tela.setText(String.valueOf(resulDouble));
                    }
                } else if(sinal.equals("/")){
                    resulDouble =  valor1 / valor2;
                    if(resulDouble % 2 == 0){
                        resulInt = resulDouble.intValue();
                        tela.setText(String.valueOf(resulInt));
                    }else{
                        tela.setText(String.valueOf(resulDouble));
                    }
                }
            }
        });



        botaoApaga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText("");
            }
        });


    }
}
