package com.migueroncallo.juegomemoria;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,restart;
    ArrayList seleccionados;
    int completados;
    long delay=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button b1=(Button) findViewById(R.id.button1);
        final Button b2=(Button) findViewById(R.id.button2);
        final Button b3=(Button) findViewById(R.id.button3);
        final Button b4=(Button) findViewById(R.id.button4);
        final Button b5=(Button) findViewById(R.id.button5);
        final Button b6=(Button) findViewById(R.id.button6);
        final Button b7=(Button) findViewById(R.id.button7);
        final Button b8=(Button) findViewById(R.id.button8);
        final Button b9=(Button) findViewById(R.id.button9);
        final Button b10=(Button) findViewById(R.id.button10);
        final Button b11=(Button) findViewById(R.id.button11);
        final Button b12=(Button) findViewById(R.id.button12);
        final Button b13=(Button) findViewById(R.id.button13);
        final Button b14=(Button) findViewById(R.id.button14);
        final Button b15=(Button) findViewById(R.id.button15);
        final Button b16=(Button) findViewById(R.id.button16);
        final Button restart=(Button) findViewById(R.id.restart);
        seleccionados=new ArrayList<Button>();
        completados=0;
        restart.setText(R.string.restart);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setText(R.string.button1);
                seleccionados.add(b1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2.setText(R.string.button2);
                seleccionados.add(b2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3.setText(R.string.button3);
                seleccionados.add(b3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4.setText(R.string.button4);
                seleccionados.add(b4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5.setText(R.string.button5);
                seleccionados.add(b5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6.setText(R.string.button6);
                seleccionados.add(b6);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7.setText(R.string.button7);
                seleccionados.add(b7);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b8.setText(R.string.button8);
                seleccionados.add(b8);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b9.setText(R.string.button9);
                seleccionados.add(b9);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b10.setText(R.string.button10);
                seleccionados.add(b10);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b11.setText(R.string.button11);
                seleccionados.add(b11);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b12.setText(R.string.button12);
                seleccionados.add(b12);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b13.setText(R.string.button13);
                seleccionados.add(b13);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b14.setText(R.string.button14);
                seleccionados.add(b14);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b15.setText(R.string.button15);
                seleccionados.add(b15);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b16.setText(R.string.button16);
                seleccionados.add(b16);
            }
        });
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                finish();
                startActivity(intent);

            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void match() throws InterruptedException {
        if (seleccionados.size()==2){
            Button opcion1=(Button) seleccionados.get(0);
            Button opcion2=(Button) seleccionados.get(1);
            seleccionados.clear();

            if (opcion1.getText().equals(opcion2.getText())){
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                completados++;
                if (completados==8){
                    Toast.makeText(this, "Felicitaciones! Ha ganado.",Toast.LENGTH_LONG).show();

                }


            }else {
                Thread.sleep(delay);
                opcion1.setText("");
                opcion2.setText("");
            }

        }
    }


}
