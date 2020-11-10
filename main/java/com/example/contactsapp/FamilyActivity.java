package com.example.contactsapp;

        import android.os.Bundle;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import java.util.ArrayList;
        import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final List<ContactModel> Family = new ArrayList<>();
        Family.add(new ContactModel("Papa","9964946562","Email.gmail.com",R.drawable.contact));
        Family.add(new ContactModel("Mumma","9965326812","Email.gmail.com",R.drawable.contact));
        Family.add(new ContactModel("YoungerSister","9965236482","Email.gmail.com",R.drawable.contact));
        Family.add(new ContactModel("YoungerBrother","9964946562","Email.gmail.com",R.drawable.contact));
        Family.add(new ContactModel("OlderBrother","9964946562","Email.gmail.com",R.drawable.contact));
        Family.add(new ContactModel("OlderSister","9964946562","Email.gmail.com",R.drawable.contact));
        Family.add(new ContactModel("Aunty","9964946562","Email.gmail.com",R.drawable.contact));
        Family.add(new ContactModel("Uncle","9964946562","Email.gmail.com",R.drawable.contact));
        Family.add(new ContactModel("Grandpa","9964946562","Email.gmail.com",R.drawable.contact));
        Family.add(new ContactModel("Granny","9964946562","Email.gmail.com",R.drawable.contact));

        RecyclerView Family_recyclerView = findViewById(R.id.Recycler1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Family_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,Family, R.color.colorAccent);
        Family_recyclerView.setAdapter(contactAdapter);
    }
}