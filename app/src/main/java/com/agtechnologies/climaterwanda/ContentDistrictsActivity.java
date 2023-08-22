package com.agtechnologies.climaterwanda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class ContentDistrictsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_districts);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(ContentDistrictsActivity.this, HomeActivity.class));
        Animatoo.animateSlideRight(ContentDistrictsActivity.this);
        finish();
        super.onBackPressed();
    }
}
