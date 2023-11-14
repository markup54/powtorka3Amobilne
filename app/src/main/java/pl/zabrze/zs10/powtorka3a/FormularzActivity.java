package pl.zabrze.zs10.powtorka3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class FormularzActivity extends AppCompatActivity {
private String opisy[]  = new String[]{
        "zawód dla osób lubiących grzebać w komputerze i konfigurować sieci",
        "zawód dla osób lubiących matematykę i  programowanie",
        "bez lutownicy nie podchodź"};
private TextView textView;
private RadioGroup radioGroup;
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formularz);
        textView = findViewById(R.id.textView);
        radioGroup = findViewById(R.id.radioGroup);
        button = findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int klikniety = radioGroup.getCheckedRadioButtonId();
                        if(klikniety == R.id.radioButton1){
                            textView.setText(opisy[0]);
                        }
                        else if(klikniety == R.id.radioButton2){
                            textView.setText(opisy[1]);
                        }
                        else {
                            textView.setText(opisy[2]);
                        }
                    }
                }
        );

    }
}