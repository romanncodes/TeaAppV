package cl.roman.teaappv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import cl.roman.teaappv.adapter.AdapterTea;
import cl.roman.teaappv.model.Tea;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_tea);

        AdapterTea ad = new AdapterTea(this,Tea.teaList(),R.layout.tea_item);

        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(ad);


    }
}