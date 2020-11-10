package com.example.contactsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Family = findViewById(R.id.Family);
        Family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(intent);
            }
        });

        TextView Friends = findViewById(R.id.Friends);
        Friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FriendsActivity.class);
                startActivity(intent);
            }
        });

        TextView Work = findViewById(R.id.Work);
        Work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WorkActivity.class);
                startActivity(intent);
            }
        });
    }
}