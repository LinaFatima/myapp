package com.example.lab17thmay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lab17thmay.Adapter.RecyclerViewAdapter;
import com.example.lab17thmay.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<Student> studentList= new ArrayList<>();  //simple make a class named student
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /* Student s= new Student("Lina","191074"); //1st method
       studentList.add(s); */

        //2nd method
        recyclerView=findViewById(R.id.recyclerView);
         studentList.add(new Student("Lina Fatima","191074"));
         studentList.add(new Student("Amna Zeeshan","191077"));
         studentList.add(new Student("Arshia Malik","191079"));
         studentList.add(new Student("Azka Shahid","191110"));
        recyclerViewAdapter=new RecyclerViewAdapter(MainActivity.this,studentList);
         recyclerView.setLayoutManager(new LinearLayoutManager(this));
         recyclerView.setHasFixedSize(true);
         recyclerView.setAdapter(recyclerViewAdapter);


    }
}