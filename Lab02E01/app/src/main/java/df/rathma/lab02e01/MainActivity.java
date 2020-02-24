package df.rathma.lab02e01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button2);
        final TextView textView = (TextView) findViewById(R.id.textView);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                final Button button = (Button) findViewById(R.id.button2);
                final TextView textView = (TextView) findViewById(R.id.textView);
                final ImageView imageView = (ImageView) findViewById(R.id.imageView);
                textView.setText("I'm so full");
                button.setText("DONE");
                imageView.setImageResource(R.drawable.full);
            }
        });

    }
}
