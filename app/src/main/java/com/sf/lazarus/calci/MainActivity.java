package com.sf.lazarus.calci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.udojava.evalex.Expression;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    private TextView resultscreen;
    private Button i1,i2,i3,i4,i5,i6,i7,i8,i9,i0,iequal,idot,iplus,isub,imul,idiv,idel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultscreen=findViewById(R.id.resultscreen);
        i1=findViewById(R.id.b1);
        i2=findViewById(R.id.b2);
        i3=findViewById(R.id.b3);
        i4=findViewById(R.id.b4);
        i5=findViewById(R.id.b5);
        i6=findViewById(R.id.b6);
        i7=findViewById(R.id.b7);
        i8=findViewById(R.id.b8);
        i9=findViewById(R.id.b9);
        i0=findViewById(R.id.b0);
        iequal=findViewById(R.id.bequal);
        idot=findViewById(R.id.bdot);
        iplus=findViewById(R.id.bplus);
        isub=findViewById(R.id.bsub);
        imul=findViewById(R.id.bmul);
        idiv=findViewById(R.id.bdiv);
        idel=findViewById(R.id.bdel);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultscreen.setText(resultscreen.getText()+"1");
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultscreen.setText(resultscreen.getText()+"2");
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultscreen.setText(resultscreen.getText()+"3");
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultscreen.setText(resultscreen.getText()+"4");
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultscreen.setText(resultscreen.getText()+"5");
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultscreen.setText(resultscreen.getText()+"6");
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultscreen.setText(resultscreen.getText()+"7");
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultscreen.setText(resultscreen.getText()+"8");
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultscreen.setText(resultscreen.getText()+"9");
            }
        });
        i0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultscreen.setText(resultscreen.getText()+"0");
            }
        });
        iplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultscreen.setText(resultscreen.getText()+"+");
            }
        });
        isub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultscreen.setText(resultscreen.getText()+"-");
            }
        });
        imul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultscreen.setText(resultscreen.getText()+"*");
            }
        });
        idiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultscreen.setText(resultscreen.getText()+"/");
            }
        });
        idot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultscreen.setText(resultscreen.getText()+".");
            }
        });

        iequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String eq=resultscreen.getText().toString();
                if(eq!=""){
                    Expression expression=new Expression(eq);
                    BigDecimal bigDecimal=expression.eval();

                    String result=String.valueOf(bigDecimal);
                    resultscreen.setText(result);

                }
            }
        });

        idel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String eqn=resultscreen.getText().toString();
                if(eqn.length()>0 && eqn!=null){
                    resultscreen.setText(eqn.substring(0,eqn.length()-1));
                }

            }
        });


    }
}
