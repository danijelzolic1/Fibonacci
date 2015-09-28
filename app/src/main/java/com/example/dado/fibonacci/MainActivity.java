package com.example.dado.fibonacci;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private TextView textView, tv;
    private EditText editText;
    private Button button;
    private int number;
    private int f=0, j=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView4);
        tv = (TextView) findViewById(R.id.textView3);
        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                printFibernacci();
            }
        });
    }

    public void printFibernacci(){
        number = Integer.parseInt(editText.getText()+"");
        editText.setText(null);
        String str = tv.getText().toString();
        tv.setText(str + number + " numbers");
        int[] feb = new int[number];
        feb[0] = 0;
        feb[1] = 1;
        String stringFibernacci = feb[0]+", ";

        for(int i=2; i < number; i++){
            feb[i] = feb[i-1] + feb[i-2];
        }

        for(int i=1; i< number; i++){
            stringFibernacci = stringFibernacci + feb[i] + ", ";
        }
        textView.setText(stringFibernacci);

    }


}
