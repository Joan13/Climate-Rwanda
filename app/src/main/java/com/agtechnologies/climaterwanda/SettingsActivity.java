package com.agtechnologies.climaterwanda;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import java.util.Locale;

public class SettingsActivity extends Activity {

    private Button english, kiny, french;
    LanguageManager languageManager;
    private String eng = "eng";
    private String fr = "fr";
    private String rw = "rw";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_settings);

        languageManager = new LanguageManager(this);

        english = findViewById(R.id.english);
        kiny = findViewById(R.id.kiny);
        french = findViewById(R.id.fench);

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                languageManager.setDisplayLanguage(eng);
                setLocale(eng);
            }
        });

        french.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                languageManager.setDisplayLanguage(fr);
                setLocale(fr);
            }
        });

        kiny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                languageManager.setDisplayLanguage(rw);
                setLocale(rw);
            }
        });
    }

    public void setLocale(String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        startActivity(new Intent(SettingsActivity.this, SettingsActivity.class));
        Animatoo.animateFade(SettingsActivity.this);
        finish();
    }

    @Override
    public void onBackPressed() {
        if (languageManager.hasLanguage()) {
            startActivity(new Intent(SettingsActivity.this, HomeActivity.class));
            Animatoo.animateSlideRight(SettingsActivity.this);
            finish();
        }
        else {
            startActivity(new Intent(SettingsActivity.this, MainActivity.class));
            Animatoo.animateFade(SettingsActivity.this);
            Toast.makeText(this, "You must select a language", Toast.LENGTH_LONG).show();
            finish();
        }

        super.onBackPressed();
    }

}
