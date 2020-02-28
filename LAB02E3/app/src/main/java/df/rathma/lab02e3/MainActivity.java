package df.rathma.lab02e3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text_input = (EditText) findViewById(R.id.weight_input);
        text_input.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                double weight = Double.parseDouble(v.getText().toString());

                TextView cost = (TextView) findViewById(R.id.shipping_cost);
                cost.setText(generateCosts(weight));
                return true;
            }
        });

    }
    public String generateCosts(double weight){
        double base_cost = 0.0;
        if(weight<30)
            base_cost = 3.00;
        else
            base_cost = 4.00;
        double extra = Math.max(Math.ceil((weight - 16.00)/4.00),0)*0.5;
        String cost = "";
        cost+= "Base Cost:                   $";
        cost+= Double.toString(base_cost);
        cost+= "\n";
        cost+= "Added Cost:                     $";
        cost+= Double.toString(extra);
        cost+="\n";
        cost+="Total Shipping Cost:             $";
        cost+=Double.toString(base_cost+extra);
        return cost;
    }
}
