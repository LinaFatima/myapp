package com.example.lab17thmay.Adapter;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab17thmay.Model.Student;
import com.example.lab17thmay.R;
import com.example.lab17thmay.newActivity;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.ViewHolder>{
    Context context;
    List<Student> studentList;

    //empty constructor
    public RecyclerViewAdapter() {
    }
    //parameterizec constructor
    public RecyclerViewAdapter(Context context, List<Student> studentList) {
        this.context = context;
        this.studentList = studentList; //recycler view ki class ky iss constructor main aik context and aik list
        //pass ki hue humny. so main act java ki line 32 main bhi yahi kiya hua
    }

    @NonNull
    @Override


    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
Student student=studentList.get(position); //student list returns an item of 1 obj. that pos is stored in student obj
      holder.textViewStudentName.setText("Student Name"+ student.getName());
        holder.textViewRollNo.setText("Student Roll No"+ student.getRollNo());

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textViewStudentName, textViewRollNo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewStudentName=itemView.findViewById(R.id.txtName);
            textViewRollNo=itemView.findViewById(R.id.txtRollNo);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            //this is simply java class without a context. therefore we made context ka obj takay jis act main kaam
            // uska context pass kardain so use that context ka variable & ye toast main act main show houga
            int position=this.getAdapterPosition();

            //1st method
            Student student=studentList.get(position);

          /*  Toast.makeText(context,"Item is clicked at "+position, Toast.LENGTH_LONG).show(); //to check kis pos
            // pe click like item clicked at 5 etc */

        // 2nd method /*  Toast.makeText(context,"Item is clicked at "+studentList.get(position).getName(), Toast.LENGTH_LONG).show(); */
            //to check kis pos pe click like item clicked at 5 etc

//1st method contd
// we can also do keh student keh obj main wou sari positions store karadain
// and then student.getname()+student.getRollNo() instead of studenList.get(pos) like below*/
Toast.makeText(context,"Item is clicked at "+student.getName()+student.getRollNo(), Toast.LENGTH_LONG).show();

            Intent intent =new Intent(context, newActivity.class);
            intent.putExtra("studentName",student.getName());
            intent.putExtra("studentRollNo",student.getRollNo());

        }
    }
}
