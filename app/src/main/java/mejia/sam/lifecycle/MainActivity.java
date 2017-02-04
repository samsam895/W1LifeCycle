package mejia.sam.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = "MACT";
    public static final String THE_ACTIVITY = "MA  v-";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, THE_ACTIVITY + "onCreate");

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, THE_ACTIVITY + "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, THE_ACTIVITY + "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, THE_ACTIVITY + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, THE_ACTIVITY + "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, THE_ACTIVITY + "onPause");
    }


    public void onClicbtn(View view) {
        Button btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent();
                i.setAction("mejia.sam.lifecycle.BuyACar");
                startActivity(i);



            }
        });
    }
}
