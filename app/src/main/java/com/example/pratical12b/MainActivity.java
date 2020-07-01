package com.example.pratical12b;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int nCount=0;
    private TextView nShowCount;
    boolean iscolor = true;
    private TextView btn_Zero;
    private TextView btn_count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nShowCount = (TextView) findViewById(R.id.Show_count);
        btn_Zero = (TextView) findViewById(R.id.btn_zero);
        btn_count = (TextView) findViewById(R.id.btn_Count);
    }
    public void showToast(View view){
        Toast toast=Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp(View view){
        ++nCount;
        if(nShowCount !=null)
            nShowCount.setText(Integer.toString(nCount));
           btn_Zero.setBackgroundColor(Color.BLACK);
        if((nCount%2)==0){
            btn_count.setBackgroundColor(Color.GREEN);
        }
        else{
            btn_count.setBackgroundColor(Color.BLUE);
        }
    }
    public void btn_zero(View view){
        btn_Zero.setBackgroundColor(Color.GRAY);
        if(nShowCount != null)
            nShowCount.setText(Integer.toString(nCount- nCount));
        nCount=0;

    }
}