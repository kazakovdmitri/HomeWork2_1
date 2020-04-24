package com.kazakovdmitri.homework2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOk = findViewById(R.id.button_ok);
        Button buttonClear = findViewById(R.id.button_clear);
        final EditText etName = findViewById(R.id.editText_name);
        final EditText etEmail = findViewById(R.id.editText_email);
        final TextView result = findViewById(R.id.textView_result);
        buttonOk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (etName.getText().toString().equals("")) {
                    result.setText(getString(R.string.empty_name));
                    } else if (etEmail.getText().toString().equals("")) {
                        result.setText(getString(R.string.empty_email));
                    } else {
                        result.setText(getString(R.string.succes_result, etName.getText(), etEmail.getText()));
                    }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                etEmail.setText("");
                etName.setText("");
                result.setText("");
            }
        });
    }
}
