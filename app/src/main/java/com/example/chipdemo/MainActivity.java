package com.example.chipdemo;

import android.os.Bundle;
import android.support.design.chip.Chip;
import android.support.design.chip.ChipGroup;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ChipGroup chipGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chipGroup = (ChipGroup) findViewById(R.id.chipGroup);
        for (int i = 0; i < 50; i++) {
            Chip chip = new Chip(this);
            chip.setText( i+ "chip");
            chipGroup.addView(chip);
        }
    }
}
