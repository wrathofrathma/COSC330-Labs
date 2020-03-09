package df.rathma.lab03e04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button clear;
    Button percent;
    Button division;
    Button multiplication;
    Button minus;
    Button plus;
    Button equals;

    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;

    TextView results;
    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = new Calculator();
        results = (TextView) findViewById(R.id.results);

        clear = (Button) findViewById(R.id.ac_button);
        percent = (Button) findViewById(R.id.percent_button);
        division = (Button) findViewById(R.id.div_button);
        multiplication = (Button) findViewById(R.id.multi_button);
        minus = (Button) findViewById(R.id.minus_button);
        plus = (Button) findViewById(R.id.plus_button);
        equals = (Button) findViewById(R.id.equal_button);

        zero = (Button) findViewById(R.id.button_0);
        one = (Button) findViewById(R.id.button_1);
        two = (Button) findViewById(R.id.button_2);
        three = (Button) findViewById(R.id.button_3);
        four = (Button) findViewById(R.id.button_4);
        five = (Button) findViewById(R.id.button_5);
        six = (Button) findViewById(R.id.button_6);
        seven = (Button) findViewById(R.id.button_7);
        eight = (Button) findViewById(R.id.button_8);
        nine = (Button) findViewById(R.id.button_9);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.num_pressed(0);
                results.setText(calculator.getResults());
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.num_pressed(1);
                results.setText(calculator.getResults());

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.num_pressed(2);
                results.setText(calculator.getResults());
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.num_pressed(3);
                results.setText(calculator.getResults());
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.num_pressed(4);
                results.setText(calculator.getResults());
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.num_pressed(5);
                results.setText(calculator.getResults());
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.num_pressed(6);
                results.setText(calculator.getResults());
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.num_pressed(7);
                results.setText(calculator.getResults());
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.num_pressed(8);
                results.setText(calculator.getResults());
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.num_pressed(9);
                results.setText(calculator.getResults());
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clear();
                results.setText(calculator.getResults());
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.add();
                results.setText(calculator.getResults());
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.divide();
                results.setText(calculator.getResults());
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.multiply();
                results.setText(calculator.getResults());
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.minus();
                results.setText(calculator.getResults());
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.equals();
                results.setText(calculator.getResults());
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.percent();
                results.setText(calculator.getResults());
            }
        });
    }
}
