package com.example.dell.desicalculator;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    private EditText firstedit, secondedit;
    private Button addbox, minusbox, multbox, dividebox;
    private TextView Textbox;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstedit = (EditText) findViewById(R.id.edt1);
        secondedit = (EditText) findViewById(R.id.edt2);
        addbox = (Button) findViewById(R.id.add_btn);

        Textbox = (TextView) findViewById(R.id.resultText);
        minusbox = (Button) findViewById(R.id.minus_btn);

        multbox = (Button) findViewById(R.id.multiply_btn);

        dividebox = (Button) findViewById(R.id.divide_btn);
        View.OnClickListener add_btn_click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstInt = Integer.parseInt(firstedit.getText().toString());
                double secondInt = Integer.parseInt(secondedit.getText().toString());

                double result = firstInt + secondInt;

                Textbox.setText(String.valueOf(result));
            }



};
        View.OnClickListener minus_btn_click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstInt = Integer.parseInt(firstedit.getText().toString());
                double secondInt = Integer.parseInt(secondedit.getText().toString());

                double result = firstInt - secondInt;

                Textbox.setText(String.valueOf(result));
            }



        };
        View.OnClickListener mult_btn_click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstInt = Integer.parseInt(firstedit.getText().toString());
                double secondInt = Integer.parseInt(secondedit.getText().toString());

                double result = firstInt * secondInt;

                Textbox.setText(String.valueOf(result));
            }



        };
        View.OnClickListener div_btn_click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstInt = Integer.parseInt(firstedit.getText().toString());
                double secondInt = Integer.parseInt(secondedit.getText().toString());

                double result = firstInt / secondInt;

                Textbox.setText(String.valueOf(result));
            }



        };
        addbox.setOnClickListener(add_btn_click);
        minusbox.setOnClickListener(minus_btn_click);
     multbox.setOnClickListener(mult_btn_click);
      dividebox.setOnClickListener(div_btn_click);
}
}