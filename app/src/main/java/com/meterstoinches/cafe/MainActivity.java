package com.meterstoinches.cafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    Button add1,minus1,add2,minus2;
    TextView t1,t2,Maintextview1,Maintextview2;
    int quantity=0;
    int quantity2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add1=(Button) findViewById(R.id.add1);
        minus1=(Button) findViewById(R.id.minus1);
        t1=(TextView) findViewById(R.id.textview1);
        t2=(TextView) findViewById(R.id.textView2);
        Maintextview1=(TextView) findViewById(R.id.maintextView1);
        Maintextview2=(TextView) findViewById(R.id.maintextView2);
    }

    public void order(View view) {
        Intent s= new Intent(MainActivity.this,Main2Activity.class);
        startActivity(s);
    }

    public void plus1(View view) {
        quantity+=1;
        t1.setText(""+quantity);
        maintextview1();
    }

    public void minus1(View view) {
        quantity-=1;
        t1.setText(""+quantity);
        maintextview1();
    }
    public void maintextview1(){
        Double total = Double.parseDouble(t1.getText().toString());
        total=total*5;
        Maintextview1.setText(NumberFormat.getCurrencyInstance().format(total));

    }

    public void minus2(View view) {
        quantity2-=1;
        t2.setText(""+quantity2);
        maintextview2();
    }

    public void add2(View view) {
        quantity2+=1;
        t2.setText(""+quantity2);
        maintextview2();
    }
    public void maintextview2(){
        Double total=Double.parseDouble(t2.getText().toString());
        total=total*5;
        Maintextview2.setText(NumberFormat.getCurrencyInstance().format(total));
    }
}
