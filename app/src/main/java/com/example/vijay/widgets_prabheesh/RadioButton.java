package com.example.vijay.widgets_prabheesh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;

public class RadioButton extends AppCompatActivity {
    boolean checked = false;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobutton);
        textView = (TextView) findViewById(R.id.textview);
        textView.setEnabled(false);
    }

    public void view_click(View view) {
        if (view instanceof Checkable) {
            checked = ((Checkable) view).isChecked();
        }
        switch (view.getId()) {
            case R.id.male:
                if (checked) {
                    textView.setText("male");
                    textView.setEnabled(true);
                }

                break;
            case R.id.female:
                if (checked) {
                    textView.setText("female");
                    textView.setEnabled(true);
                }
                break;
        }
    }
}
