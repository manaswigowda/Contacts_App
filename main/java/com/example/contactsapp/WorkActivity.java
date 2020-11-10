package com.example.contactsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        final List<ContactModel> Work = new ArrayList<>();
        Work.add(new ContactModel("Parth","9964946562","Email.gmail.com",R.drawable.contact));
        Work.add(new ContactModel("Thanya","9965326812","Email.gmail.com",R.drawable.contact));
        Work.add(new ContactModel("Siddhart","9965236482","Email.gmail.com",R.drawable.contact));
        Work.add(new ContactModel("Rumesa","9964946562","Email.gmail.com",R.drawable.contact));
        Work.add(new ContactModel("Manoj","9964946562","Email.gmail.com",R.drawable.contact));
        Work.add(new ContactModel("Darshan","9964946562","Email.gmail.com",R.drawable.contact));
        Work.add(new ContactModel("Smrithi","9964946562","Email.gmail.com",R.drawable.contact));
        Work.add(new ContactModel("Ramesh","9964946562","Email.gmail.com",R.drawable.contact));
        Work.add(new ContactModel("Chandu","9964946562","Email.gmail.com",R.drawable.contact));
        Work.add(new ContactModel("Megha","9964946562","Email.gmail.com",R.drawable.contact));

        RecyclerView Work_recyclerView = findViewById(R.id.Recycler3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Work_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,Work, R.color.colorAccent);
        Work_recyclerView.setAdapter(contactAdapter);
    }
}
