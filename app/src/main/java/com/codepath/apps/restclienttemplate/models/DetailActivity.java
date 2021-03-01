package com.codepath.apps.restclienttemplate.models;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.codepath.apps.restclienttemplate.R;

import org.parceler.Parcels;
import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    TextView tvDetailBody;
    TextView tvDetailName;
    TextView tvDetailNameTag;
    ImageView ivDetailPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvDetailBody = findViewById(R.id.tvDetailBody);
        tvDetailName = findViewById(R.id.tvDetailName);
        tvDetailNameTag = findViewById(R.id.tvDetailNameTag);
        ivDetailPicture = findViewById(R.id.ivDetailPicture);


        //String body = getIntent().getStringExtra("Text");           //<------ THIS WORKS
        //tvDetailBody.setText(body);                                 //<------ THIS WORKS

        //Instead of passing things one by one, we can simply use Parcels
        Tweet tweet = Parcels.unwrap(getIntent().getParcelableExtra("text"));
        tvDetailBody.setText(tweet.getBody());
    }
}