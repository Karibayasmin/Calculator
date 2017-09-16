package com.example.karibayasmin.calculator;
`
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num_one,num_two;
    TextView result;
    Button add,subtract,multiply,divide;

    float result_num;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num_one =(EditText)findViewById(R.id.num_one);
        num_two =(EditText)findViewById(R.id.num_two);

         result =(TextView)findViewById(R.id.result);

            add =(Button)findViewById(R.id.add);
       subtract =(Button)findViewById(R.id.subtract);
       multiply =(Button)findViewById(R.id.multiply);
         divide =(Button)findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1=Integer.parseInt(num_one.getText().toString());
                num2=Integer.parseInt(num_two.getText().toString());

                result_num=num1+num2;
                result.setText(String.valueOf(result_num));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1=Integer.parseInt(num_one.getText().toString());
                num2=Integer.parseInt(num_two.getText().toString());

                result_num=num1-num2;
                result.setText(String.valueOf(result_num));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1=Integer.parseInt(num_one.getText().toString());
                num2=Integer.parseInt(num_two.getText().toString());

                result_num=num1*num2;
                result.setText(String.valueOf(result_num));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1=Integer.parseInt(num_one.getText().toString());
                num2=Integer.parseInt(num_two.getText().toString());

                result_num=num1/num2;
                result.setText(String.valueOf(result_num));
            }
        });
    }
}
