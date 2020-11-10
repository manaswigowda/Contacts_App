package com.example.contactsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        final List<ContactModel> Friends = new ArrayList<>();
        Friends.add(new ContactModel("Mandy","9964946562","Email.gmail.com",R.drawable.contact));
        Friends.add(new ContactModel("Thanu","9965326812","Email.gmail.com",R.drawable.contact));
        Friends.add(new ContactModel("Neha","9965236482","Email.gmail.com",R.drawable.contact));
        Friends.add(new ContactModel("Deeps","9964946562","Email.gmail.com",R.drawable.contact));
        Friends.add(new ContactModel("Milind","9964946562","Email.gmail.com",R.drawable.contact));
        Friends.add(new ContactModel("Rakesh","9964946562","Email.gmail.com",R.drawable.contact));
        Friends.add(new ContactModel("Manoj","9964946562","Email.gmail.com",R.drawable.contact));
        Friends.add(new ContactModel("Sujan","9964946562","Email.gmail.com",R.drawable.contact));
        Friends.add(new ContactModel("Ananya","9964946562","Email.gmail.com",R.drawable.contact));
        Friends.add(new ContactModel("Ashwin","9964946562","Email.gmail.com",R.drawable.contact));

        RecyclerView Friends_recyclerView = findViewById(R.id.Recycler2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Friends_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,Friends, R.color.colorAccent);
        Friends_recyclerView.setAdapter(contactAdapter);
    }
}