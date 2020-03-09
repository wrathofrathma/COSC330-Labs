package df.rathma.lab02e4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    Controller controller;
    Model model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.model = new Model();
        this.controller = new Controller(this.model);
        SeekBar sb = (SeekBar) findViewById(R.id.seekBar2);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                controller.on_slider(progress);
                controller.update_calories(findViewById(R.id.seekBar2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        CheckBox cb = (CheckBox) findViewById(R.id.prosciutto_check);
        cb.setOnClickListener(controller.prosciuttoListener);
        controller.update_calories(findViewById(R.id.prosciutto_check));
    }
    public void onPattyButtonClicked(View view){
        controller.on_patty_clicked(view);
    }
    public void onCheeseButtonClicked(View view){
        controller.on_cheese_clicked(view);
    }
}
