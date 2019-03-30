package com.example.android_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    EditText editText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        editText = findViewById(R.id.editText);

    }

    public void btn_edit_clik(View view){
        String iiiip = editText.getText().toString();
        Toast.makeText(this,iiiip,Toast.LENGTH_LONG).show();
    }

}
