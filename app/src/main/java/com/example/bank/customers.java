package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class customers extends AppCompatActivity {
    Button mohan,govind,rohit,virat,ritu,mohit,sharavya,sonu,richa,sinha;
    SQLiteDatabase db;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers);
        mohan=findViewById(R.id.gopal);
        govind=findViewById(R.id.sunaina);
        rohit=findViewById(R.id.somya);
        virat=findViewById(R.id.suraj);
        ritu=findViewById(R.id.ritu);
        mohit=findViewById(R.id.mohit);
        sharavya=findViewById(R.id.krishna);
        sonu=findViewById(R.id.sonu);
        richa=findViewById(R.id.richa);
        sinha=findViewById(R.id.sinha);
        db=openOrCreateDatabase("customers",MODE_PRIVATE,null);


        mohan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(customers.this,info.class);
                db.execSQL("create table if not exists customer(name varchar(10) ,Email varchar(20),accno varchar(20),adress varchar(20),current_balance varchar(20))");
                String name="mohan singh";
                String Email="mohansinghss2@gmail.com";
                String adress="ranagar sector 6 bhilai chattisgargh";
                String num="";
                int current_balance=500;
                int accno=1228765678;
                Cursor c=db.rawQuery("select * from customer where name=?",new String[]{name+""});
                if(c.getCount()>0)
                    Toast.makeText(customers.this, "CUSTOMER ALREADY exsits", Toast.LENGTH_SHORT).show();
                else
                db.execSQL("insert into customer values('"+name+"','"+Email+"','"+accno+"','"+adress+"',"+current_balance+")");
                num=num+"Accountnumb:"+accno+"\nNAME: "+name+"\n Email ID: "+Email+"\n Address : "+adress+"\nCurrent balance : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("account_number",accno);
                i4.putExtra("account_balance",current_balance);
                startActivity(i4);

            }
        });
        govind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(customers.this,info.class);

                db.execSQL("create table if not exists customer(name varchar(10) ,Email varchar(20),accno varchar(20),adress varchar(20),current_balance varchar(20))");
                String name="govind singh";
                String Email="govindsinghs6@gmail.com";
                String adress="Rajiv road line 61 ludiana,punjab";
                String num="";
                int current_balance=1000;
                int accno=1228885678;
                Cursor c=db.rawQuery("select * from customer where name=?",new String[]{name+""});
                if(c.getCount()>0)
                    Toast.makeText(customers.this, "CUSTOMER ALREADY exsits", Toast.LENGTH_SHORT).show();
                else
                db.execSQL("insert into customer values('"+name+"','"+Email+"','"+accno+"','"+adress+"',"+current_balance+")");
                num=num+"Accountnumb:"+accno+"\nNAME: "+name+"\n Email ID: "+Email+"\n Address : "+adress+"\nCurrent balance : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("account_number",accno);
                i4.putExtra("account_balance",current_balance);
                startActivity(i4);


            }

        });
        db=openOrCreateDatabase("customer",MODE_PRIVATE,null);


        rohit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(customers.this,info.class);
                db.execSQL("create table if not exists customer(name varchar(10) ,Email varchar(20),accno varchar(20),adress varchar(20),current_balance varchar(20))");
                String name="rohit sharma";
                String Email="rohitsharma22222222@gmail.com";
                String adress="ranagar sector 6 bhilai chattisgargh";
                String num="";
                int current_balance=500;
                int accno=1222345666;
                Cursor c=db.rawQuery("select * from customer where name=?",new String[]{name+""});
                if(c.getCount()>0)
                    Toast.makeText(customers.this, "CUSTOMER ALREADY exsits", Toast.LENGTH_SHORT).show();
                else
                db.execSQL("insert into customer values('"+name+"','"+Email+"','"+accno+"','"+adress+"',"+current_balance+")");
                num=num+"Accountnumb:"+accno+"\nNAME: "+name+"\n Email ID: "+Email+"\n Address : "+adress+"\nCurrent balance : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("account_number",accno);
                i4.putExtra("account_balance",current_balance);
                startActivity(i4);


            }
        });
        db=openOrCreateDatabase("customer",MODE_PRIVATE,null);


        virat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(customers.this,info.class);
                db.execSQL("create table if not exists customer(name varchar(10) ,Email varchar(20),accno varchar(20),adress varchar(20),current_balance varchar(20))");
                String name="virat kohli";
                String Email="virats22@gmail.com";
                String adress="ranagar sector 6 bhilai chattisgargh";
                String num="";
                int current_balance=500;
                int accno=1555345678;
                Cursor c=db.rawQuery("select * from customer where name=?",new String[]{name+""});
                if(c.getCount()>0)
                    Toast.makeText(customers.this, "CUSTOMER ALREADY exsits", Toast.LENGTH_SHORT).show();
                else
                db.execSQL("insert into customer values('"+name+"','"+Email+"','"+accno+"','"+adress+"',"+current_balance+")");
                num=num+"Accountnumb:"+accno+"\nNAME: "+name+"\n Email ID: "+Email+"\n Address : "+adress+"\nCurrent balance : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("account_number",accno);
                i4.putExtra("account_balance",current_balance);
                startActivity(i4);


            }
        });
        ritu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(customers.this,info.class);

                db.execSQL("create table if not exists customer(name varchar(10) ,Email varchar(20),accno varchar(20),adress varchar(20),current_balance varchar(20))");
                String name="ritu sharma";
                String Email="ritusharsa222@gmail.com";
                String adress="Rajiv road line 61 ludiana,punjab";
                String num="";
                int current_balance=1000;
                int accno=1267345678;
                Cursor c=db.rawQuery("select * from customer where name=?",new String[]{name+""});
                if(c.getCount()>0)
                    Toast.makeText(customers.this, "CUSTOMER ALREADY exsits", Toast.LENGTH_SHORT).show();
                else
                db.execSQL("insert into customer values('"+name+"','"+Email+"','"+accno+"','"+adress+"',"+current_balance+")");
                num=num+"Accountnumb:"+accno+"\nNAME: "+name+"\n Email ID: "+Email+"\n Address : "+adress+"\nCurrent balance : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("account_number",accno);
                i4.putExtra("account_balance",current_balance);
                startActivity(i4);


            }

        });
        mohit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(customers.this,info.class);
                db.execSQL("create table if not exists customer(name varchar(10) ,Email varchar(20),accnov varchar(20),adress varchar(20),current_balance varchar(20))");
                String name="mohit sharma";
                String Email="mohitsharma2222@gmail.com";
                String adress="ranagar sector 6 bhilai chattisgargh";
                String num="";
                int current_balance=500;
                int accno=1222345578;
                Cursor c=db.rawQuery("select * from customer where name=?",new String[]{name+""});
                if(c.getCount()>0)
                    Toast.makeText(customers.this, "CUSTOMER ALREADY exsits", Toast.LENGTH_SHORT).show();
                else
                db.execSQL("insert into customer values('"+name+"','"+Email+"','"+accno+"','"+adress+"',"+current_balance+")");
                num=num+"Accountnumb:"+accno+"\nNAME: "+name+"\n Email ID: "+Email+"\n Address : "+adress+"\nCurrent balance : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("account_number",accno);
                i4.putExtra("account_balance",current_balance);
                startActivity(i4);


            }
        });
        sharavya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(customers.this,info.class);
                db.execSQL("create table if not exists customer(name varchar(10) ,Email varchar(20),accno varchar(20),adress varchar(20),current_balance varchar(20))");
                String name="sharavya";
                String Email="sharavyas22222@gmail.com";
                String adress="ranagar sector 6 bhilai chattisgargh";
                String num="";
                int current_balance=500;
                int accno=1562345678;
                Cursor c=db.rawQuery("select * from customer where name=?",new String[]{name+""});
                if(c.getCount()>0)
                    Toast.makeText(customers.this, "CUSTOMER ALREADY exsits", Toast.LENGTH_SHORT).show();
                else
                db.execSQL("insert into customer values('"+name+"','"+Email+"','"+accno+"','"+adress+"',"+current_balance+")");
                num=num+"Accountnumb:"+accno+"\nNAME: "+name+"\n Email ID: "+Email+"\n Address : "+adress+"\nCurrent balance : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("account_number",accno);
                i4.putExtra("account_balance",current_balance);
                startActivity(i4);


            }
        });
        sonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(customers.this,info.class);
                db.execSQL("create table if not exists customer(name varchar(10) ,Email varchar(20),accno varchar(20),adress varchar(20),current_balance varchar(20))");
                String name="sonu sharma";
                String Email="sonusharma222222@gmail.com";
                String adress="ranagar sector 6 bhilai chattisgargh";
                String num="";
                int current_balance=500;
                int accno=1222345778;
                Cursor c=db.rawQuery("select * from customer where name=?",new String[]{name+""});
                if(c.getCount()>0)
                    Toast.makeText(customers.this, "CUSTOMER ALREADY exsits", Toast.LENGTH_SHORT).show();
                else
                db.execSQL("insert into customer values('"+name+"','"+Email+"','"+accno+"','"+adress+"',"+current_balance+")");
                num=num+"Accountnumb:"+accno+"\nNAME: "+name+"\n Email ID: "+Email+"\n Address : "+adress+"\nCurrent balance : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("account_number",accno);
                i4.putExtra("account_balance",current_balance);
                startActivity(i4);


            }
        });
        richa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(customers.this,info.class);

                db.execSQL("create table if not exists customer(name varchar(10) ,Email varchar(20),accno varchar(20),adress varchar(20),current_balance varchar(20))");
                String name="richa sharma";
                String Email="richasharma2222222@gmail.com";
                String adress="ranagar sector 6 bhilai chattisgargh";
                String num="";
                int current_balance=500;
                int accno=1222345678;
                Cursor c=db.rawQuery("select * from customer where name=?",new String[]{name+""});
                if(c.getCount()>0)
                    Toast.makeText(customers.this, "CUSTOMER ALREADY exsits", Toast.LENGTH_SHORT).show();
                else
                db.execSQL("insert into customer values('"+name+"','"+Email+"','"+accno+"','"+adress+"',"+current_balance+")");
                num=num+"Accountnumb:"+accno+"\nNAME: "+name+"\n Email ID: "+Email+"\n Address : "+adress+"\nCurrent balance : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("account_number",accno);
                i4.putExtra("account_balance",current_balance);
                startActivity(i4);


            }
        });
        sinha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(customers.this,info.class);

                db.execSQL("create table if not exists customer(name varchar(10) ,Email varchar(20),accno varchar(20),adress varchar(20),current_balance varchar(20))");
                String name="sinha singh";
                String Email="gopalsingh2@gmail.com";
                String adress="ranagar sector 6 bhilai chattisgargh";
                String num="";
                int current_balance=500;
                int accno=1225678899;
                Cursor c=db.rawQuery("select * from customer where name=?",new String[]{name+""});
                if(c.getCount()>0)
                    Toast.makeText(customers.this, "CUSTOMER ALREADY exsits", Toast.LENGTH_SHORT).show();
                else
                db.execSQL("insert into customer values('"+name+"','"+Email+"','"+accno+"','"+adress+"',"+current_balance+")");
                num=num+"Accountnumb:"+accno+"\nNAME: "+name+"\n Email ID: "+Email+"\n Address : "+adress+"\nCurrent balance : "+current_balance+"";
                i4.putExtra("s",num);
                i4.putExtra("account_number",accno);
                i4.putExtra("account_balance",current_balance);
                startActivity(i4);


            }
        });



    }
}