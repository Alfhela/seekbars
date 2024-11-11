package ru.at.seekcalc;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        SeekBar seekBar = findViewById(R.id.seekBar);
        TextView textView = findViewById(R.id.seekBarValue);
        SeekBar SBVal1 = findViewById(R.id.seekBarVal1);
        SeekBar SBVal2 = findViewById(R.id.seekBarVal2);
        TextView TBVal1 = findViewById(R.id.textViewVal1);
        TextView TBVal2 = findViewById(R.id.textViewVal2);
        TextView result = findViewById(R.id.textViewResult);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        SBVal1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                TBVal1.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        SBVal2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                TBVal2.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void buttonPlus(View view) {
        TextView result = findViewById(R.id.textViewResult);
        SeekBar SBVal1 = findViewById(R.id.seekBarVal1);
        SeekBar SBVal2 = findViewById(R.id.seekBarVal2);
        result.setText(String.valueOf(SBVal1.getProgress() + SBVal2.getProgress()));
    }

    public void buttonMinus(View view) {
        TextView result = findViewById(R.id.textViewResult);
        SeekBar SBVal1 = findViewById(R.id.seekBarVal1);
        SeekBar SBVal2 = findViewById(R.id.seekBarVal2);
        result.setText(String.valueOf(SBVal1.getProgress() - SBVal2.getProgress()));
    }

    public void buttonMultiple(View view) {
        TextView result = findViewById(R.id.textViewResult);
        SeekBar SBVal1 = findViewById(R.id.seekBarVal1);
        SeekBar SBVal2 = findViewById(R.id.seekBarVal2);
        result.setText(String.valueOf(SBVal1.getProgress() * SBVal2.getProgress()));
    }

    public void buttonDivide(View view) {
        TextView result = findViewById(R.id.textViewResult);
        SeekBar SBVal1 = findViewById(R.id.seekBarVal1);
        SeekBar SBVal2 = findViewById(R.id.seekBarVal2);
        result.setText(String.valueOf((float) SBVal1.getProgress() / (float) SBVal2.getProgress()));
    }
}