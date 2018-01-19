package com.example.vijay.widgets_prabheesh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.TextView;
import java.util.ArrayList;

public class CheckBoxes extends AppCompatActivity {
    TextView textView;
    ArrayList<String> arrayList = new ArrayList<String>();
    Button button;
    boolean checked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkboxes);
        textView = (TextView) findViewById(R.id.result);
        textView.setEnabled(false);
        button = (Button) findViewById(R.id.submit);
    }
    public void view_click(View view) {
        if (view instanceof Checkable) {
            checked = ((Checkable) view).isChecked();
        }
        switch (view.getId()) {
            case R.id.mango:

                if (checked) {
                    arrayList.add("mango");
                } else
                    arrayList.remove("mango");
                System.out.println(arrayList);
//
                break;
            case R.id.apple:
                if (checked) {
                    arrayList.add("apple");
                } else
                    arrayList.remove("apple");
                System.out.println(arrayList);
                break;
            case R.id.grapes:
                if (checked) {
                    arrayList.add("grapes");
                } else
                    arrayList.remove("grapes");
                System.out.println(arrayList);
                break;

            case R.id.submit:
                String finaltext = "";
                for (String arraylist : arrayList) {
                    finaltext = finaltext+ arraylist + "\n";
                }
                textView.setText(finaltext);
                textView.setEnabled(true);
                break;

        }
    }
}
