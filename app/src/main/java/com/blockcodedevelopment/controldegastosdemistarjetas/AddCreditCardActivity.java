package com.blockcodedevelopment.controldegastosdemistarjetas;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Gravity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class AddCreditCardActivity extends AppCompatActivity {

    EditText etName, etLimit;
    AdView mAdView;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_credit_card);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        etName = findViewById(R.id.assignment_name_card);
        etLimit = findViewById(R.id.assignment_limit_card);
        view = findViewById(R.id.color_background_card);

        view.setBackgroundColor(getResources().getColor(R.color.red));

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popUpMenu(v);
            }
        });

    }

    public  void popUpMenu(View v){

//        PopupMenu popupMenu = new PopupMenu(this, v);
//        MenuInflater inflater = popupMenu.getMenuInflater();
//        inflater.inflate(R.menu.view_pop_up, popupMenu.getMenu());
//        popupMenu.show();
        PopupMenu popupMenu = new PopupMenu(this, v);
        popupMenu.inflate(R.menu.view_pop_up);
        popupMenu.setGravity(Gravity.END);
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.red:
                        break;
                }

                return false;
            }
        });
    }
}
