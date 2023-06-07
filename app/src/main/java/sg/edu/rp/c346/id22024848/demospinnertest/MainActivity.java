package sg.edu.rp.c346.id22024848.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tw;
    Spinner spnYesNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tw=findViewById(R.id.textView);
        spnYesNo=findViewById(R.id.spinner) ;
        spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        tw.setText("Spinner Item, Yes Selected");

                        break;
                    case 1:
                        tw.setText("Spinner Item, No Selected");

                        break;
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }




    });
}}