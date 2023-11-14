package pl.zabrze.zs10.powtorka3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<Obraz> obrazki = new ArrayList<>();
private  ListView listView;
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obrazki.add(new Obraz("Kasprowy Wierch",R.drawable.kasprowy));
        obrazki.add(new Obraz("Kozi Wierch",R.drawable.koziwierch));
        obrazki.add(new Obraz("Rysy",R.drawable.rysy));
        obrazki.add(new Obraz("Świnica",R.drawable.swinica));
        imageView = findViewById(R.id.imageView);
        //most -> adapter
        ArrayAdapter<Obraz> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                obrazki);
        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        imageView.setImageResource(obrazki.get(i).getIdObrazka());
                    }
                }
        );
    }
}