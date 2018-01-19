package com.example.vijay.widgets_prabheesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class ToggleButton extends AppCompatActivity {
    boolean checked = false;
    TextView textView;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        textView = (TextView) findViewById(R.id.textview);
        textView.setVisibility(View.GONE);
        aSwitch = (Switch) findViewById(R.id.switchbutton);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (checked) {
                    textView.setText("wifi on");
                    textView.setVisibility(View.VISIBLE);
                } else {
                    textView.setText("wifi off");
                    textView.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    public void view_click(View view) {
        if (view instanceof Checkable) {
            checked = ((Checkable) view).isChecked();
        }
        switch (view.getId()) {
            case R.id.toggle_button:
                if (checked) {
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("On");
                } else {
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("Off");
                }
                break;

            case R.id.switchbutton:

                break;


        }
    }
}
