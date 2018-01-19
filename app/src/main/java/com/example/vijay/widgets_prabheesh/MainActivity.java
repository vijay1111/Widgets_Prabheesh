package com.example.vijay.widgets_prabheesh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void view_click(View view) {
        switch (view.getId()) {
            case R.id.checkbox:
                startActivity(new Intent(this, CheckBoxes.class));
                break;
            case R.id.radiobutton:
                startActivity(new Intent(this, RadioButton.class));
                break;
            case R.id.spinner:
                startActivity(new Intent(this, Spinnerr.class));
                break;
            case R.id.toggle_button:
                startActivity(new Intent(this, ToggleButton.class));
                break;

        }
    }
}
