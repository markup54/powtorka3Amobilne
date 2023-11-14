package pl.zabrze.zs10.powtorka3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class PacakActivity extends AppCompatActivity {
    private ArrayList<Integer> idImageView = new ArrayList<>();
    private ArrayList<ImageView> imageViews = new ArrayList<>();
    private int ktory = 0;
    private int ileSekund =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pacak);
        idImageView.add(R.id.imageView3);
        idImageView.add(R.id.imageView4);
        idImageView.add(R.id.imageView5);
        idImageView.add(R.id.imageView6);
        idImageView.add(R.id.imageView7);
        idImageView.add(R.id.imageView8);
        idImageView.add(R.id.imageView9);
        idImageView.add(R.id.imageView10);
        idImageView.add(R.id.imageView11);
        for (int idO:idImageView) {
            ImageView imageView = findViewById(idO);
            imageView.setVisibility(View.INVISIBLE);
            imageViews.add(imageView);
        }
        final Handler handler = new Handler();
        handler.post(
                new Runnable() {
                    @Override
                    public void run() {
                        imageViews.get(ktory).setVisibility(View.INVISIBLE);
                        ktory = (int)(Math.random()*9);
                        ileSekund++;
                        imageViews.get(ktory).setVisibility(View.VISIBLE);
                    if(ileSekund <= 10){
                        handler.postDelayed(this,1000);
                    }
                    }
                }
        );


    }
}

