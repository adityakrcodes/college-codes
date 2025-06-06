package com.example.mad3;

import androidx.appcompat.app.AppCompatActivity; import android.annotation.SuppressLint;
import android.os.Bundle; import android.text.TextUtils; import android.view.View;
import android.view.View.OnClickListener; import android.widget.Button;
import android.widget.EditText; import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    EditText Num1;
    EditText Num2;
    Button Add;
    Button Sub;
    Button Mul;
    Button Div;
    TextView Result;
    Button clearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num1 = (EditText) findViewById(R.id.editText1);
        Num2 = (EditText) findViewById(R.id.editText2);
        Add = (Button) findViewById(R.id.Add);
        Sub = (Button) findViewById(R.id.Sub);
        Mul = (Button) findViewById(R.id.Mul);
        Div = (Button) findViewById(R.id.Div);
        Result = (TextView) findViewById(R.id.ResultView);
        clearButton = findViewById(R.id.clearButton);
        Add.setOnClickListener(this);
        Sub.setOnClickListener(this);
        Mul.setOnClickListener(this);
        Div.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }

    @SuppressLint("SetTextI18n") public void onClick(View v) {
        float num1 = 0; float num2 = 0; float result = 0; String oper = "";

// check if the fields are empty
        if (TextUtils.isEmpty(Num1.getText().toString()) || TextUtils.isEmpty(Num2.getText().toString()))
            return;

// read EditText and fill variables with numbers
        num1 = Float.parseFloat(Num1.getText().toString()); num2 = Float.parseFloat(Num2.getText().toString());

// defines the button that has been clicked and performs the corresponding operation
// write operation into oper, we will use it later for output
        int id = v.getId();
        if (id == R.id.Add) { oper = "+";
            result = num1 + num2;
        } else if (id == R.id.Sub) { oper = "-";
            result = num1 - num2;
        } else if (id == R.id.Mul) { oper = "*";
            result = num1 * num2;
        } else if (id == R.id.Div) { oper = "/";
            result = num1 / num2;
        }
// form the output line
        Result.setText(num1 + " " + oper + " " + num2 + " = " + result);
//Clear the textfields
        if(id == R.id.clearButton) { Num1.setText("");
            Num2.setText("");
            Result.setText("");
        }
    }
}
