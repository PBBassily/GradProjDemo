package eg.alexu.eng.mobdev.gradprojdemo.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import eg.alexu.eng.mobdev.gradprojdemo.R;


/**
 * This class is just entry point to the class you want to
 * preview first
 */
public class MainActivity extends AppCompatActivity {

    public static Context appContext;
    public static AppCompatActivity appCompatActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        appContext = this.getBaseContext();
        appCompatActivity=this;

        gotoOtherActivity(Splash.class);

        finish();
    }

    private void gotoOtherActivity(Class someClass) {

        Intent myIntent = new Intent(this, someClass);
        startActivity(myIntent);

    }

}
