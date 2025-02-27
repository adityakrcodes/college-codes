package com.example.mad5;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
    EditText Rollno, Name, Marks;
    Button Insert, Delete, Update, View, ViewAll, Clear;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Rollno = (EditText) findViewById(R.id.Rollno);
        Name = (EditText) findViewById(R.id.Name);
        Marks = (EditText) findViewById(R.id.Marks);
        Insert = (Button) findViewById(R.id.Insert);
        Delete = (Button) findViewById(R.id.Delete);
        Update = (Button) findViewById(R.id.Update);
        View = (Button) findViewById(R.id.View);
        ViewAll = (Button) findViewById(R.id.ViewAll);
        Clear = (Button) findViewById(R.id.Clear);
        Insert.setOnClickListener(this);
        Delete.setOnClickListener(this);
        Update.setOnClickListener(this);
        View.setOnClickListener(this);
        ViewAll.setOnClickListener(this);
        Clear.setOnClickListener(this);
        db = openOrCreateDatabase("StudentDB", Context.MODE_PRIVATE,
                null);
        db.execSQL("CREATE TABLE IF NOT EXISTS student(rollno VARCHAR,name VARCHAR,marks VARCHAR);");
    }

    @Override
    public void onClick(View view) {
        if (view == Insert) {
            if (Rollno.getText().toString().trim().length() == 0 ||
                    Name.getText().toString().trim().length() == 0 ||
                    Marks.getText().toString().trim().length() == 0) {
                showMessage("Error", "Please enter all values");
                return;
            }
            db.execSQL("INSERT INTO student VALUES('" + Rollno.getText() + "','" + Name.getText() + "','"
                    + Marks.getText() + "');");
            showMessage("Success", "Record added");
            clearText();
        }
        if (view == Delete) {
            if (Rollno.getText().toString().trim().length() == 0) {
                showMessage("Error", "Please enter Rollno");
                return;
            }
            Cursor c = db.rawQuery("SELECT * FROM student WHERE rollno='" + Rollno.getText() + "'", null);
            if (c.moveToFirst()) {
                db.execSQL("DELETE FROM student WHERE rollno='" + Rollno.getText() + "'");
                showMessage("Success", "Record Deleted");
            } else {
                showMessage("Error", "Invalid Rollno");
            }
            clearText();
        }
        if (view == Update) {
            if (Rollno.getText().toString().trim().length() == 0) {
                showMessage("Error", "Please enter Rollno");
                return;
            }
            Cursor c = db.rawQuery("SELECT * FROM student WHERE rollno='" + Rollno.getText() + "'", null);
            if (c.moveToFirst()) {
                db.execSQL("UPDATE student SET name='" + Name.getText() +
                        "',marks='" +
                        Marks.getText() +
                        "' WHERE rollno='" + Rollno.getText() + "'");
                showMessage("Success", "Record Modified");
            } else {
                showMessage("Error", "Invalid Rollno");
            }
            clearText();
        }
        if (view == View) {
            if (Rollno.getText().toString().trim().length() == 0) {
                showMessage("Error", "Please enter Rollno");
                return;
            }
            Cursor c = db.rawQuery("SELECT * FROM student WHERE rollno='" + Rollno.getText() + "'", null);
            if (c.moveToFirst()) {
                Name.setText(c.getString(1));
                Marks.setText(c.getString(2));
            } else {
                showMessage("Error", "Invalid Rollno");
                clearText();
            }
        }
        if (view == ViewAll) {
            Cursor c = db.rawQuery("SELECT * FROM student", null);
            if (c.getCount() == 0) {
                showMessage("Error", "No records found");
                return;
            }
            StringBuffer buffer = new StringBuffer();
            while (c.moveToNext()) {
                buffer.append("Rollno: " + c.getString(0) + "\n");
                buffer.append("Name: " + c.getString(1) + "\n");
                buffer.append("Marks: " + c.getString(2) + "\n\n");
            }
            showMessage("Student Details", buffer.toString());
        }
        if (view == Clear) {
            Rollno.setText("");
            Name.setText("");
            Marks.setText("");
            Rollno.requestFocus();
        }
    }

    public void showMessage(String title, String message) {
        Builder builder = new Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

    public void clearText() {
        Rollno.setText("");
        Name.setText("");
        Marks.setText("");
        Rollno.requestFocus();
    }
}