package uk.co.lawilliams.finalproject.explosionanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable explosionAnimation;
    Button pressMeButton;
    TextView helloWorldText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView explosionImage = (ImageView) findViewById(R.id.animation_image);
        explosionImage.setBackgroundResource((R.drawable.animation));
        explosionAnimation = (AnimationDrawable) explosionImage.getBackground();

        pressMeButton = (Button) findViewById(R.id.pressme_button);
        helloWorldText = (TextView) findViewById(R.id.helloworld_text);

        pressMeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (helloWorldText.getVisibility() == View.VISIBLE) {
                    helloWorldText.setVisibility(View.INVISIBLE);
                    explosionImage.setVisibility(View.VISIBLE);
                }
                else {
                    helloWorldText.setVisibility(View.VISIBLE);
                    explosionImage.setVisibility(View.INVISIBLE);
                }
            }

        });

        explosionAnimation.start();
    }
}
