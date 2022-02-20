package com.example.danakharrat201110; //My name and ID

import androidx.appcompat.app.AppCompatActivity; import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity { //chapter 3-Assignment 1

    double costPerTicketB=19.99; // Bronze Tickets
    double costPerTicketS=39.99; // Silver
    double costPerTicketG=59.99; // Gold
    int numberOfTickets;
    double totalCost;
    String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextNumber = findViewById(R.id.txtTickets);
        final Spinner group= findViewById(R.id.txtGroup);
        final TextView result = findViewById(R.id.txtResult);

        Button button= findViewById(R.id.btnCost);
        button.setOnClickListener(view -> {
            numberOfTickets=Integer.parseInt(editTextNumber.getText().toString());
            DecimalFormat currency=new DecimalFormat("$###,###.##");


            groupChoice=group.getSelectedItem().toString(); //this if else statement calculates the value per ticket of selected group
            if (groupChoice.equals("Gold"))
                totalCost=costPerTicketG*numberOfTickets;
            else if(groupChoice.equals("Silver"))
                totalCost=costPerTicketS*numberOfTickets;
            else
                totalCost=costPerTicketB*numberOfTickets;

            result.setText(numberOfTickets+" tickets, "+"Cost for "+groupChoice+" is " + currency.format(totalCost));
        });
    }
}





