package com.example.tehyproju;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lomake1 extends AppCompatActivity {

    Counters page1 = Counters.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lomake1);
        addListenerOnButton();
    }

    public void tulos(View view) {
        TextView arvosana = findViewById(R.id.tulos_numero);
        arvosana.setText(Integer.toString(page1.getTulos()));
    }

    public void addListenerOnButton() {
        final Context context = this;
        Button button = (Button) findViewById(R.id.seuraava_sivu);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Lomake2.class);
                startActivity(intent);
            }
        });
    }

        public void onRadioButtonClicked (View view){
            boolean checked = ((RadioButton) view).isChecked();

            switch (view.getId()) {
                case R.id.mieliala1:
                    if (checked)
                        page1.increase(1);
                    break;
                case R.id.mieliala2:
                    if (checked)
                        page1.increase(2);
                    break;
                case R.id.mieliala3:
                    if (checked)
                        page1.increase(3);
                    break;
                case R.id.mieliala4:
                    if (checked)
                        page1.increase(4);
                    break;
                case R.id.mieliala5:
                    if (checked)
                        page1.increase(5);
                    break;
                case R.id.mieliala6:
                    if (checked)
                        page1.increase(6);
                    break;
                case R.id.mieliala7:
                    if (checked)
                        page1.increase(7);
                    break;
                case R.id.mieliala8:
                    if (checked)
                        page1.increase(8);
                    break;
                case R.id.mieliala9:
                    if (checked)
                        page1.increase(9);
                    break;
                case R.id.mieliala10:
                    if (checked)
                        page1.increase(10);
                    break;
            }

        }
    }

