package df.rathma.lab03e03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Matrix;
import android.media.Image;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ImageView> petals;
    private LayoutInflater inflater;
    private Button add_gold;
    private Button add_purple;
    private Button clear_button;
    private RelativeLayout relativeLayout;
    Flower flower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        petals = new ArrayList<>();
        clear_button = (Button) findViewById(R.id.clear_button);
        add_purple = (Button) findViewById(R.id.add_purple);
        add_gold = (Button) findViewById(R.id.add_gold);
        relativeLayout = (RelativeLayout) findViewById(R.id.root);
        flower = new Flower();

        inflater = LayoutInflater.from(this);


        add_purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayMetrics metrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(metrics);
                flower.setxCenter(metrics.widthPixels / 2 - 120);
                flower.setyCenter(metrics.heightPixels / 2 - 120);
                ImageView image = (ImageView) inflater.inflate(R.layout.petal_pink,relativeLayout, false);
                Matrix model = new Matrix();
                model.postScale(flower.getScaleX(),flower.getScaleY());
                model.postRotate(flower.getRotate());
                model.postTranslate(flower.getxCenter(),flower.getyCenter());
                image.setScaleType(ImageView.ScaleType.MATRIX);
                image.setImageMatrix(model);
                relativeLayout.addView(image);
                flower.add_flower();
                petals.add(image);
                for(int i = petals.size() - 1; i>=0; i--){
                    petals.get(i).bringToFront();
                }

                clear_button.bringToFront();
                add_gold.bringToFront();
                add_gold.bringToFront();
            }
        });
        add_gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayMetrics metrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(metrics);
                flower.setxCenter(metrics.widthPixels / 2 - 120);
                flower.setyCenter(metrics.heightPixels / 2 - 120);
                ImageView image = (ImageView) inflater.inflate(R.layout.petal_gold,relativeLayout, false);
                Matrix model = new Matrix();
                model.postScale(flower.getScaleX(),flower.getScaleY());
                model.postRotate(flower.getRotate());
                model.postTranslate(flower.getxCenter(),flower.getyCenter());
                image.setScaleType(ImageView.ScaleType.MATRIX);
                image.setImageMatrix(model);
                relativeLayout.addView(image);

                flower.add_flower();
                petals.add(image);
                for(int i = petals.size() - 1; i>=0; i--){
                    petals.get(i).bringToFront();
                }

                clear_button.bringToFront();
                add_gold.bringToFront();
                add_gold.bringToFront();
            }
        });
        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(View view : petals){
                    relativeLayout.removeView(view);
                }
                petals.clear();
                flower.reset();
            }
        });

    }
}
