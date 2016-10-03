package com.example.pratikratnaparkhi.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;

public class MainActivity extends AppCompatActivity {

     Sql_database sql_database;
    TextView textView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textView = (TextView) findViewById(R.id.display_textview);
        sql_database = new Sql_database(this);

        sql_database.insertName("Pratik","Ratnaparkhi");
        sql_database.insertName("Kasturi","Bidwai");
        sql_database.insertName("Judy","Simons");
        sql_database.insertName("Sachin","Tendulkar");

        sql_database.getName(textView);





    }
}
