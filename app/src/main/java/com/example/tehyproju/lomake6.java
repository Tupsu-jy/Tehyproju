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

public class lomake6 extends AppCompatActivity {

    Counters page6 = Counters.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lomake6);
        //addListenerOnButton();
    }

    public void tulos(View view){
        TextView arvosana = findViewById(R.id.tulos_numero);
        arvosana.setText(Integer.toString(page6.getTulos()));
    }

    /**public void addListenerOnButton() {
        final Context context = this;
        Button button = (Button) findViewById(R.id.seuraava_sivu);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, lomake6.class);
                startActivity(intent);
            }
        });
    }*/
    public void palaaEtusivulle(View view){
        Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent1);
    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.stressi1:
                if (checked)
                    page6.increase(1);
                break;
            case R.id.stressi2:
                if (checked)
                    page6.increase(2);
                break;
            case R.id.stressi3:
                if (checked)
                    page6.increase(3);
                break;
            case R.id.stressi4:
                if (checked)
                    page6.increase(4);
                break;
            case R.id.stressi5:
                if (checked)
                    page6.increase(5);
                break;
            case R.id.stressi6:
                if (checked)
                    page6.increase(6);
                break;
            case R.id.stressi7:
                if (checked)
                    page6.increase(7);
                break;
            case R.id.stressi8:
                if (checked)
                    page6.increase(8);
                break;
            case R.id.stressi9:
                if (checked)
                    page6.increase(9);
                break;
            case R.id.stressi10:
                if (checked)
                    page6.increase(10);
                break;
        }

    }
}
