package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private TextView shape;
    private TextView result;
    private Button button_clear;
    private Button button_result;
    private ImageView triangle;
    private ImageView circle;
    private ImageView square;
    private EditText length1;
    private EditText length2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        shape = (TextView) findViewById(R.id.textView);
        result = (TextView) findViewById(R.id.textView2);
        button_result = (Button) findViewById(R.id.button);
        button_clear = (Button) findViewById(R.id.button2);
        triangle = (ImageView) findViewById(R.id.imageView);
        circle = (ImageView) findViewById(R.id.imageView2);
        square = (ImageView) findViewById(R.id.imageView3);
        length1 = (EditText) findViewById(R.id.editText);
        length2 = (EditText) findViewById(R.id.editText2);

        float len1,len2;

        len1 = Float.parseFloat(length1.getText().toString());
        len2 = Float.parseFloat(length2.getText().toString());

        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             shape.setText("Triangle");

            }
        });







    }
}
