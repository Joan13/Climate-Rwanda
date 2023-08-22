package com.agtechnologies.climaterwanda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class HomeActivity extends Activity {

    CardView agriculture, weather, disasters, environment, areas;
    Button kigali_city, northern, southern, eastern, western, prov_kig_1, settings;
    RelativeLayout kig_dis, n_dis, s_dis, e_dis, w_dis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home);

        agriculture = findViewById(R.id.agriculture);
        weather = findViewById(R.id.weather);
        disasters = findViewById(R.id.disasters);
        environment = findViewById(R.id.environment);
        areas = findViewById(R.id.areas);
        settings = findViewById(R.id.settings);

        kigali_city = findViewById(R.id.kigali);
        northern = findViewById(R.id.northern);
        southern = findViewById(R.id.southern);
        eastern = findViewById(R.id.eastern);
        western = findViewById(R.id.western);

        kig_dis = findViewById(R.id.districts_kig);
        n_dis = findViewById(R.id.districts_1);
        s_dis = findViewById(R.id.districts_2);
        w_dis = findViewById(R.id.districts_3);
        e_dis = findViewById(R.id.districts_4);

        prov_kig_1 = findViewById(R.id.prov_kig1);

        prov_kig_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, ContentDistrictsActivity.class));
                Animatoo.animateSlideLeft(HomeActivity.this);
                finish();
            }
        });

        agriculture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (kigali_city.getVisibility() == View.GONE) {
                    kigali_city.setVisibility(View.VISIBLE);
                } else {
                    kigali_city.setVisibility(View.GONE);
                    kig_dis.setVisibility(View.GONE);

                    n_dis.setVisibility(View.GONE);
                    s_dis.setVisibility(View.GONE);
                    w_dis.setVisibility(View.GONE);
                    e_dis.setVisibility(View.GONE);
                }

                if (northern.getVisibility() == View.GONE) {
                    northern.setVisibility(View.VISIBLE);
                } else {
                    northern.setVisibility(View.GONE);

                    n_dis.setVisibility(View.GONE);
                    s_dis.setVisibility(View.GONE);
                    w_dis.setVisibility(View.GONE);
                    e_dis.setVisibility(View.GONE);
                }

                if (southern.getVisibility() == View.GONE) {
                    southern.setVisibility(View.VISIBLE);
                } else {
                    southern.setVisibility(View.GONE);

                    n_dis.setVisibility(View.GONE);
                    s_dis.setVisibility(View.GONE);
                    w_dis.setVisibility(View.GONE);
                    e_dis.setVisibility(View.GONE);
                }

                if (eastern.getVisibility() == View.GONE) {
                    eastern.setVisibility(View.VISIBLE);
                } else {
                    eastern.setVisibility(View.GONE);

                    n_dis.setVisibility(View.GONE);
                    s_dis.setVisibility(View.GONE);
                    w_dis.setVisibility(View.GONE);
                    e_dis.setVisibility(View.GONE);
                }

                if (western.getVisibility() == View.GONE) {
                    western.setVisibility(View.VISIBLE);
                } else {
                    western.setVisibility(View.GONE);

                    n_dis.setVisibility(View.GONE);
                    s_dis.setVisibility(View.GONE);
                    w_dis.setVisibility(View.GONE);
                    e_dis.setVisibility(View.GONE);
                }
            }
        });

        kigali_city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kig_dis.getVisibility() == View.GONE) {
                    kig_dis.setVisibility(View.VISIBLE);
                } else {
                    kig_dis.setVisibility(View.GONE);

                    n_dis.setVisibility(View.GONE);
                    s_dis.setVisibility(View.GONE);
                    w_dis.setVisibility(View.GONE);
                    e_dis.setVisibility(View.GONE);
                }
            }
        });

        northern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n_dis.getVisibility() == View.GONE) {
                    n_dis.setVisibility(View.VISIBLE);
                } else {
                    n_dis.setVisibility(View.GONE);
                }
            }
        });

        southern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s_dis.getVisibility() == View.GONE) {
                    s_dis.setVisibility(View.VISIBLE);
                } else {
                    s_dis.setVisibility(View.GONE);
                }
            }
        });

        western.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (w_dis.getVisibility() == View.GONE) {
                    w_dis.setVisibility(View.VISIBLE);
                } else {
                    w_dis.setVisibility(View.GONE);
                }
            }
        });

        eastern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e_dis.getVisibility() == View.GONE) {
                    e_dis.setVisibility(View.VISIBLE);
                } else {
                    e_dis.setVisibility(View.GONE);
                }
            }
        });



        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, SettingsActivity.class));
                Animatoo.animateSlideLeft(HomeActivity.this);
                finish();
            }
        });
    }
}
