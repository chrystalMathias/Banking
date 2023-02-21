package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class info extends AppCompatActivity {

    TextView tv,tv2;
    Button sendmoney;
    EditText ed,ed2;
    SQLiteDatabase db;
    String a="account_number";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        tv=findViewById(R.id.tv2);
        tv2=findViewById(R.id.tv45);
        sendmoney=findViewById(R.id.button);
        ed=findViewById(R.id.editTextNumber);
        ed2=findViewById(R.id.editTextNumber222);
        db=openOrCreateDatabase("customer",MODE_PRIVATE,null);
        Intent i4=getIntent();
        String s1=i4.getStringExtra("s");
        int accnoo=i4.getIntExtra("account_number",0);
        tv2.setText(s1);

        sendmoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int amount=Integer.parseInt(ed.getText().toString());
                int accountnum=Integer.parseInt(ed2.getText().toString());

                    db.execSQL("update customer set current_balance=current_balance-"+amount+" where accno="+accnoo+"");
                    db.execSQL("update customer set current_balance=current_balance+"+amount+" where accno="+accountnum+"");
                    Toast.makeText(info.this, "Transcation Successfull", Toast.LENGTH_SHORT).show();
                }

        });


    }
}