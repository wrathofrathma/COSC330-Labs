package df.rathma.lab02e2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CoffeeModel coffeeModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coffeeModel = new CoffeeModel();
        Button order = (Button) findViewById(R.id.order_button);
        Button minus = (Button) findViewById(R.id.minus_button);
        Button plus = (Button) findViewById(R.id.plus_button);
        CheckBox cream = (CheckBox) findViewById(R.id.topping_cream);
        CheckBox chocolate = (CheckBox) findViewById(R.id.topping_chocolate);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView summary = findViewById(R.id.order_summary);
                summary.setText(coffeeModel.generate_summary());
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int qty = coffeeModel.minusQuantity();
                TextView quantity_label = (TextView) findViewById(R.id.quantity);
                quantity_label.setText(Integer.toString(qty));
                TextView summary = findViewById(R.id.order_summary);
                summary.setText(coffeeModel.generate_summary());
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int qty = coffeeModel.plusQuantity();
                TextView quantity_label = (TextView) findViewById(R.id.quantity);
                quantity_label.setText(Integer.toString(qty));
                TextView summary = findViewById(R.id.order_summary);
                summary.setText(coffeeModel.generate_summary());
            }
        });
        cream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coffeeModel.toggleCream();
                TextView summary = findViewById(R.id.order_summary);
                summary.setText(coffeeModel.generate_summary());
            }
        });
        chocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coffeeModel.toggleChocolate();
                TextView summary = findViewById(R.id.order_summary);
                summary.setText(coffeeModel.generate_summary());
            }
        });
    }
}
