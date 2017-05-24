package unsw.phd.jaybie.cameratestapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the AR button */
    public void openAR(View view) {
        Intent ARintent = new Intent(this, AugmentedReality.class);
        startActivity(ARintent);
    }
}
