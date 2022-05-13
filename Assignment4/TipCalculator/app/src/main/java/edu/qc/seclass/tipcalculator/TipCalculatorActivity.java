package edu.qc.seclass.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class TipCalculatorActivity extends AppCompatActivity {
    EditText checkAmountValue, partySizeValue;
    EditText fifteenPercentTipValue,twentyPercentTipValue, twentyFivePercentTipValue,
            fifteenPercentTotalValue, twentyPercentTotalValue, twentyFivePercentTotalValue;

    Button buttonCompute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCompute =  findViewById(R.id.buttonCompute);
        buttonCompute.setOnClickListener(v -> {

            checkAmountValue = findViewById(R.id.checkAmountValue);
            partySizeValue = findViewById(R.id.partySizeValue);
            fifteenPercentTipValue = findViewById(R.id.fifteenPercentTipValue);
            twentyPercentTipValue = findViewById(R.id.twentyPercentTipValue);
            twentyFivePercentTipValue = findViewById(R.id.twentyfivePercentTipValue);
            fifteenPercentTotalValue = findViewById(R.id.fifteenPercentTotalValue);
            twentyPercentTotalValue = findViewById(R.id.twentyPercentTotalValue);
            twentyFivePercentTotalValue = findViewById(R.id.twentyfivePercentTotalValue);
            if (checkAmountValue.getText() == null || partySizeValue.getText() == null ||
                    checkAmountValue.getText().toString().isEmpty() || partySizeValue.getText().toString().isEmpty() ||
                    Integer.parseInt(checkAmountValue.getText().toString()) <= 0
                    || Integer.parseInt(partySizeValue.getText().toString() )<= 0 ) {
                Toast.makeText(getApplicationContext(), "Empty or incorrect value(s)!", Toast.LENGTH_LONG).show();
                fifteenPercentTipValue.setText(null);
                twentyPercentTipValue.setText(null);
                twentyFivePercentTipValue.setText(null);
                fifteenPercentTotalValue.setText(null);
                twentyPercentTotalValue.setText(null);
                twentyFivePercentTotalValue.setText(null);
            } else {
                float checkAmount = (int) Float.parseFloat(checkAmountValue.getText().toString());
                int partySize = Integer.parseInt(partySizeValue.getText().toString());

                fifteenPercentTipValue.setText(String.valueOf(Math.round(checkAmount / partySize * 0.15)));
                twentyPercentTipValue.setText(String.valueOf(Math.round(checkAmount / partySize * 0.20)));
                twentyFivePercentTipValue.setText(String.valueOf(Math.round(checkAmount / partySize * 0.25)));
                fifteenPercentTotalValue.setText(String.valueOf((Math.round((checkAmount / partySize * 0.15) + (checkAmount / partySize)))));
                twentyPercentTotalValue.setText(String.valueOf((Math.round((checkAmount / partySize * 0.20) + (checkAmount / partySize)))));
                twentyFivePercentTotalValue.setText(String.valueOf((Math.round((checkAmount / partySize * 0.25) + (checkAmount / partySize)))));


            }
        });

    }



}










