package com.example.intentdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.intentdemo.R;

public class ScondActivity extends Activity {

    TextView textInput;
    EditText edtResult;
    Button btnSetAndFinish;

    String name;
    int rollNumber;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        initViews();
    }
    private void initViews(){
        textInput = findViewById(R.id.textInput);
        edtResult = findViewById(R.id.edtResult);
        btnSetAndFinish = findViewById(R.id.btnSetAndFinish);
    }
    private void initListeners(){
        btnSetAndFinish.setOnClickListener(new BtnSetAndFinishClickListener());
    }
    class BtnSetAndFinishClickListener implements View.OnClickListener {

        public void onClick(View v){
            Intent resultIntent = new Intent();
            resultIntent.putExtra("result",edtResult.getText().toString());
            setResult(1,resultIntent);
            finish();
        }

    }
}
