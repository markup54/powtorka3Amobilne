package pl.zabrze.zs10.powtorka3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class GaleriaActivity extends AppCompatActivity {
    private ArrayList<Integer> obrazkiId = new ArrayList<>();
    private EditText editText;
    private Button button;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);
        obrazkiId.add(R.drawable.kasprowy);
        obrazkiId.add(R.drawable.koziwierch);
        obrazkiId.add(R.drawable.rysy);
        obrazkiId.add(R.drawable.swinica);
        editText =findViewById(R.id.editTextNumber);
        button = findViewById(R.id.button2);
        imageView = findViewById(R.id.imageView2);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        int id = Integer.valueOf(editText.getText().toString());
                        if(id<0 || id>=obrazkiId.size())
                        {
                            id =0;
                        }
                        imageView.setImageResource(obrazkiId.get(id));
                    }
                }
        );
    }
}