package com.example.loanapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fname,mname,lname,Occupation,AmountPay;
    Double rate,principalAmount,interest;
    TextView Payment;
    Button Month12,Month24,Month36,viewDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=findViewById(R.id.etFname);
        mname=findViewById(R.id.etMname);
        lname=findViewById(R.id.etLname);
        Occupation=findViewById(R.id.etOccupation);
        AmountPay=findViewById(R.id.etAmount);
        Month12=findViewById(R.id.btnMonths12);
        Month24=findViewById(R.id.btnMonths24);
        Month36=findViewById(R.id.btnMonths36);
        Payment=findViewById(R.id.txtPayPerMonth);
        Month12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rate=0.05;
                principalAmount=Double.parseDouble(String.valueOf(AmountPay.getText()));
                interest=(principalAmount*rate*1);
                Payment.setText(String.valueOf(interest));
            }
        });
        Month24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rate=0.1;
                principalAmount=Double.parseDouble(String.valueOf(AmountPay.getText()));
                interest=(principalAmount*rate*2);
                Payment.setText(String.valueOf(interest));
            }
        });
        Month36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rate=0.15;
                principalAmount=Double.parseDouble(String.valueOf(AmountPay.getText()));
                interest=(principalAmount*rate*3);
                Payment.setText(String.valueOf(interest));
            }
        });
        viewDetails=findViewById(R.id.btnViewDetails);
        viewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Name: "+fname.getText()+" "+
                        mname.getText()+" "+lname.getText()+
                        "\nOccupation: "+Occupation.getText()+"\nAmount: "+String.valueOf(principalAmount)
                        +"\nPayment per Month: "+String.valueOf(Payment),Toast.LENGTH_LONG).show();

            }
        });

    }
}