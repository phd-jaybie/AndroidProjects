package unsw.phd.jaybie.testapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TestApplication_MESSAGE = "unsw.phd.jaybie.testapliccation.MESSAGE";
    public static final int AR_requested = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent D_intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        D_intent.putExtra(TestApplication_MESSAGE, message);
        startActivity(D_intent);
    }

    /** Called when the user taps the AR button */
    public void openAR(View view) {
        Intent ARintent = new Intent(this, AugmentedRealityActivity.class);
        ARintent.putExtra(AR_requested);
        startActivity(ARintent);
    }
}
