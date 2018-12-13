package com.maho.upi.ggappjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    ArrayList<Model> models;
    ListView listView;
    Button generate;
    TextView input;
    private static ListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.input);
        generate = (Button)findViewById(R.id.btnGenerate);
        listView = (ListView)findViewById(R.id.listView);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getListGG();



            }
        });
    }

    private void getListGG() {
        models = new ArrayList<>();
        int n = Integer.parseInt(input.getText().toString());
        for (int i = 0; i <= n; i++){
            if (i % 2 == 0){
                Model m = new Model( "" + i ," Bilangan","Genap");
                models.add(m);
            }else {
                Model m = new Model("" + i ," Bilangan","Ganjil");
                models.add(m);
            }
        }

        adapter = new ListAdapter(models, getApplicationContext());
        listView.setAdapter(adapter);
    }


}
