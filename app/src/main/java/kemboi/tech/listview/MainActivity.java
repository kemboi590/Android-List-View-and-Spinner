package kemboi.tech.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView citiesList;
    private Spinner studentsSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesList = findViewById(R.id.citiesList);
                
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Nairobi");
        cities.add("Mombasa");
        cities.add("Nakuru");
        cities.add("Nyali");
        cities.add("Kisumu");
        cities.add("Kerugoya");
        cities.add("Eldoret");
        cities.add("Kutus");
        cities.add("Embu");
        cities.add("Kisii");
        cities.add("Migori");
        cities.add("Thika");
        cities.add("Kapsabet");
        cities.add("Vihiga");
        cities.add("Narok");
        cities.add("Malindi");
        cities.add("Nyeri");

        studentsSpinner = findViewById(R.id.studentsSpinner);
//        ArrayList<String> students = new ArrayList<>();
//        students.add("Kemboi");
//        students.add("Kevin");
//        students.add("Joy");
//        students.add("Jane");
//        students.add("Peter");

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                cities
        );

        citiesList.setAdapter(citiesAdapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, cities.get(position) + " Selected😀", Toast.LENGTH_SHORT).show();
            }
        });


//        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_dropdown_item_1line,
//                students
//        );
//        studentsSpinner.setAdapter((studentsAdapter));

        studentsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, studentsSpinner.getSelectedItem().toString() + " Selected😀", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}