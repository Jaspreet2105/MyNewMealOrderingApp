package com.example.mymealorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] mealNames = {"PunjabiThali","GujaratiMeal","FriedRice","ChatPapdi","SubwayVeggiePatty","MacdFood","Fastfood","BreakfastMeal","MixVegetables","Salad"};
    String[] mealPrice = {"100", "200","30","50","46","89","78","85","41","56"};

    EditText price;
    Spinner spinner;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         spinner = findViewById(R.id.spinnerMeal);
        price = findViewById(R.id.editText);


        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,mealNames);
        spinner.setAdapter(adapter);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {

                switch (i){

                    case 0:
                        price.setText( mealPrice[i]);
                        break;


                    case 1:
                        price.setText( mealPrice[i]);
                        break;
                    case 2:
                        price.setText(mealPrice[i]);
                        break;
                    case 3:
                        price.setText(mealPrice[i]);
                        break;
                    case 4:
                        price.setText(mealPrice[i]);
                        break;
                    case 5:
                        price.setText(mealPrice[i]);
                        break;
                    case 6:
                        price.setText(mealPrice[i]);
                        break;
                    case 7:
                        price.setText(mealPrice[i]);
                        break;
                    case 8:
                        price.setText(mealPrice[i]);
                        break;
                    case 9:
                        price.setText(mealPrice[i]);
                        break;




                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });






    }




}
