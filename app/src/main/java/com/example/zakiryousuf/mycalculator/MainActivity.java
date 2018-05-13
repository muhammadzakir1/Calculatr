package com.example.zakiryousuf.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnsub,btnper,btnmul,btndiv,btneq,btndot,btnc;
    double var1,var2;
    TextView txtr;
    boolean add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnadd=(Button)findViewById(R.id.btnadd);
        btnmul=(Button)findViewById(R.id.btnmul);
        btnsub=(Button)findViewById(R.id.btnsub);
        btndiv=(Button)findViewById(R.id.btndiv);
        btndot=(Button)findViewById(R.id.btndot);
        btnc=(Button)findViewById(R.id.btnc);
        btnper=(Button)findViewById(R.id.btnper);
        btneq=(Button)findViewById(R.id.btneq);
        txtr=(TextView) findViewById(R.id.txtr);

        btn0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtr.setText(txtr.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtr.setText(txtr.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtr.setText(txtr.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtr.setText(txtr.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtr.setText(txtr.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtr.setText(txtr.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtr.setText(txtr.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtr.setText(txtr.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtr.setText(txtr.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtr.setText(txtr.getText()+"9");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               var1=Double.parseDouble(txtr.getText()+"");
               add=true;
               txtr.setText(null);

            }
        });
        btnsub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                var1=Double.parseDouble(txtr.getText()+"");
                sub=true;
                txtr.setText(null);

            }
        });
        btnmul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                var1=Double.parseDouble(txtr.getText()+"");
                mul=true;
                txtr.setText(null);

            }
        });
        btndiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                var1=Double.parseDouble(txtr.getText()+"");
                div=true;
                txtr.setText(null);

            }
        });
        btneq.setOnClickListener(new View.OnClickListener(){


                public void onClick(View v){

                    var2=Double.parseDouble(txtr.getText()+"");
                    if(add==true){
                        txtr.setText(var1+var2+"");
                        add=false;

                    }
                    else if(sub==true){
                        txtr.setText(var1-var2+"");
                        sub=false;

                    }
                    if(mul==true){
                        txtr.setText(var1*var2+"");
                        mul=false;

                    }
                    if(div==true){
                        txtr.setText(var1/var2+"");
                        div=false;

                    }



                }



        });

    }
}

