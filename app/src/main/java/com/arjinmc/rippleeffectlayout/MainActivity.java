package com.arjinmc.rippleeffectlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.arjinmc.rippleeffect.RippleEffectLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBox = (CheckBox) findViewById(R.id.check);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("check", "onClick");
            }
        });
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.e("check", String.valueOf(isChecked));
            }
        });

        TextView textView = new TextView(this);
        textView.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        textView.setPadding(100, 100, 100, 100);
        textView.setText("textview textview");
        RippleEffectLayout rippleEffectLayout = new RippleEffectLayout.Builder(this)
                .childView(textView)
//                .minRadius(100)
//                .maxRadius(1000)
//                .color(Color.RED)
//                .alpha(0.3f)
                .create();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.parent);
        linearLayout.addView(rippleEffectLayout);


    }
}
