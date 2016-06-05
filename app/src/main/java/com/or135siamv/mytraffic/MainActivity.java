package com.or135siamv.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit หรือ การประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutMeButton;
    private String urlYoutubestring = "https://youtu.be/GVVW4Mx9SFE";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind Widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

        //Controller buttom
        controllerButton();

    } // Main Method หรือ เมธอดหลัก

    private void controllerButton() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // การใส่เสียงทำซาวด์เอฟเฟคประกอบการคลิกปุ่ม
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.cat);
                mediaPlayer.start();


                //web View
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urlYoutubestring));
                startActivity(intent);
                

            }
        });


    }// controllerButton


}  // Main Class นี่คือคลาสหลัก


