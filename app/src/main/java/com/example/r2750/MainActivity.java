package com.example.r2750;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton power;
    ImageButton mute;
    ImageButton minusb;
    ImageButton plusb;
    ImageButton minusb1;
    ImageButton plusb1;
    ImageButton line1b;
    ImageButton line2b;
    ImageButton opticalb;
    ImageButton coaxialb;
    ImageButton bluetoothb;
    ImageButton nextb;
    ImageButton playPauseb;
    ImageButton previouseb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        power = (ImageButton) findViewById(R.id.power);
        mute = (ImageButton) findViewById(R.id.mute);
        minusb = (ImageButton) findViewById(R.id.minus);
        plusb = (ImageButton) findViewById(R.id.plus);
        line1b = (ImageButton) findViewById(R.id.line1);
        line2b = (ImageButton) findViewById(R.id.line2);
        opticalb = (ImageButton) findViewById(R.id.opt);
        coaxialb = (ImageButton) findViewById(R.id.coaxial);
        bluetoothb = (ImageButton) findViewById(R.id.bluet);
        nextb = (ImageButton) findViewById(R.id.next);
        playPauseb = (ImageButton) findViewById(R.id.play_pause);
        previouseb = (ImageButton) findViewById(R.id.previous);
        minusb1 = (ImageButton) findViewById(R.id.minus1);
        plusb1 = (ImageButton) findViewById(R.id.plus1);
        final String errIr = "The device is not equipped with an IR port";
        final ConsumerIrManager consumerIrManager = (ConsumerIrManager) this.getSystemService(Context.CONSUMER_IR_SERVICE);
        final int frequency = 36000;
        final int[] volume_plus = new int[]{8950,4450, 600,550, 600,550, 550,550, 600,550, 550,1700, 550,550, 550,600, 550,550, 550,1650, 600,1650, 600,1650, 600,550, 600,550, 550,1700, 550,1650, 600,1650, 600,1650, 600,550, 600,1650, 600,550, 550,550, 600,550, 550,550, 600,550, 550,550, 600,1650, 600,550, 550,1650, 600,1650, 600,1650, 600,1650, 600,1650, 600};  // NEC 8E7A05F
        final int[] volume_plus1 = new int[]{8950,4450, 600,500, 600,550, 600,500, 600,550, 600,1650, 600,500, 600,550, 600,500, 600,1650, 600,1650, 600,1650, 600,550, 600,500, 600,1650, 600,1650, 600,1650, 600,550, 600,1650, 600,1650, 600,500, 600,550, 550,550, 600,550, 600,500, 600,1650, 600,550, 600,550, 550,1650, 600,1650, 600,1650, 600,1650, 600,1650, 600};  // NEC 8E7609F
        final int[] volume_minus = new int[]{8950,4450, 600,550, 550,550, 600,550, 550,550, 600,1650, 600,550, 550,550, 600,550, 550,1650, 600,1650, 600,1650, 600,550, 600,550, 550,1650, 600,1650, 600,1650, 600,1650, 600,1650, 600,1650, 600,550, 550,550, 600,550, 550,1650, 600,550, 600,550, 550,550, 600,550, 550,1650, 600,1650, 600,1650, 600,550, 600,1650, 600};  // NEC 8E7E21D
        final int[] volume_minus1 = new int[]{8950,4450, 600,550, 600,550, 550,550, 600,550, 550,1650, 600,550, 600,550, 550,550, 600,1650, 600,1650, 600,1650, 600,550, 550,550, 600,1650, 600,1650, 600,1650, 600,1650, 550,600, 550,550, 600,1650, 550,600, 550,550, 600,1650, 550,600, 550,550, 550,1650, 600,1650, 600,550, 600,1650, 600,1650, 600,550, 550,1650, 600};  // NEC 8E7926D
        final int[] on_off = new int[]{8950,4450, 600,550, 550,550, 600,550, 550,550, 600,1650, 600,550, 550,550, 600,550, 550,1700, 550,1650, 600,1650, 600,550, 600,550, 550,1650, 600,1650, 600,1650, 600,550, 600,1650, 600,1650, 600,550, 550,550, 600,550, 550,1650, 600,550, 550,1650, 600,600, 550,550, 550,1650, 600,1650, 600,1650, 600,550, 600,1650, 600};  // NEC 8E7629D
        final int[] mute_device = new int[]{8950,4450, 600,550, 550,550, 600,500, 600,550, 600,1650, 600,550, 550,550, 600,550, 550,1650, 600,1650, 600,1650, 600,550, 600,500, 600,1650, 600,1650, 600,1650, 600,1650, 600,550, 550,600, 550,550, 550,550, 600,550, 550,1650, 600,600, 550,500, 600,1650, 600,1650, 600,1650, 600,1650, 600,1650, 600,550, 600,1650, 600};  // NEC 8E7827D
        final int[] line1 = new int[]{8950,4450, 600,550, 600,550, 550,550, 550,600, 550,1700, 550,550, 550,600, 550,550, 600,1650, 550,1700, 600,1650, 600,550, 550,550, 550,1700, 600,1650, 550,1700, 600,1650, 550,1700, 600,1600, 600,600, 550,550, 600,550, 550,550, 550,600, 550,550, 550,600, 550,550, 550,1700, 550,1700, 550,1700, 550,1700, 550,1700, 550};  // NEC 8E7E01F
        final int[] line2 = new int[]{8950,4450, 600,550, 550,550, 600,550, 550,550, 600,1650, 600,550, 550,550, 600,550, 550,1650, 600,1650, 600,1650, 600,550, 600,550, 550,1650, 600,1650, 600,1650, 600,1650, 600,550, 550,550, 600,1650, 600,550, 550,550, 600,550, 550,550, 600,550, 550,1650, 600,1650, 600,550, 600,1650, 600,1650, 600,1650, 600,1650, 600};  // NEC 8E7906F
        final int[] coaxial = new int[]{8900,4450, 600,550, 600,550, 550,550, 600,550, 550,1650, 600,550, 600,550, 550,550, 600,1650, 600,1650, 600,1650, 600,550, 550,550, 600,1650, 600,1650, 600,1650, 600,1650, 600,1650, 600,550, 550,550, 600,550, 550,550, 600,550, 550,550, 600,550, 550,550, 600,1650, 600,1650, 550,1700, 600,1650, 550,1700, 600,1600, 600};  // NEC 8E7C03F
        final int[] opt = new int[]{8950,4450, 600,500, 600,550, 600,550, 550,550, 600,1650, 600,500, 600,550, 600,500, 600,1650, 600,1650, 600,1650, 600,550, 550,600, 550,1650, 600,1650, 600,1650, 600,1650, 600,500, 600,1650, 600,550, 600,500, 600,550, 600,1650, 600,500, 600,550, 600,1650, 600,500, 600,1650, 600,1650, 600,1650, 600,550, 600,1650, 600};  // NEC 8E7A25D
        final int[] bluetooth = new int[]{8950,4450, 600,550, 600,550, 550,550, 600,550, 550,1650, 600,550, 600,550, 550,550, 600,1650, 550,1700, 600,1650, 550,600, 550,550, 550,1650, 650,1600, 600,1650, 600,550, 600,500, 600,1650, 600,1650, 600,1650, 600,550, 600,1650, 600,500, 600,1650, 600,1650, 600,550, 600,550, 550,550, 600,1650, 600,550, 550,1650, 600};  // NEC 8E73AC5
        final int[] previous = new int[]{8900,4450, 600,550, 600,550, 550,550, 600,550, 550,1650, 600,550, 600,550, 550,550, 600,1650, 600,1650, 600,1650, 600,550, 550,550, 600,1650, 600,1650, 600,1650, 600,550, 550,1650, 600,1650, 600,1650, 600,1650, 600,550, 550,600, 550,550, 600,1650, 550,600, 550,550, 600,550, 550,550, 550,1650, 600,1650, 600,1650, 600};  // NEC 8E77887
        final int[] playpause = new int[]{8950,4450, 600,550, 600,550, 550,550, 550,600, 550,1650, 600,550, 550,600, 550,550, 550,1650, 600,1650, 600,1650, 600,550, 600,550, 550,1650, 600,1650, 600,1650, 600,550, 600,1650, 600,1650, 600,1650, 600,1650, 600,550, 550,1650, 600,550, 600,1650, 600,550, 550,550, 600,500, 600,550, 600,1650, 600,550, 550,1650, 600};  // NEC 8E77A85
        final int[] next = new int[]{8950,4450, 600,550, 550,600, 550,550, 600,550, 550,1650, 600,550, 600,550, 550,550, 550,1700, 600,1650, 600,1650, 550,600, 550,550, 600,1650, 550,1650, 600,1650, 600,550, 600,1650, 600,550, 550,550, 600,550, 550,550, 600,550, 550,550, 600,1650, 600,550, 550,1650, 600,1650, 600,1650, 600,1650, 600,1650, 600,1650, 600};  // NEC 8E740BF

        // consumerIrManager.transmit(frequency, pattern);

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, on_off);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        mute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, mute_device);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        minusb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, volume_minus);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });

        minusb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, volume_minus1);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });


        plusb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, volume_plus);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });

        plusb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, volume_plus1);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });

        line1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, line1);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        line2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, line2);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        opticalb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, opt);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        coaxialb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, coaxial);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        bluetoothb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, bluetooth);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        previouseb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, previous);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        playPauseb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, playpause);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        nextb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    consumerIrManager.transmit(frequency, next);
                }
                catch(UnsupportedOperationException e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            errIr, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}