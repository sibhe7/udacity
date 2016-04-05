package com.imajinator.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnSpotify;
    private Button btnScores;
    private Button btnLibrary;
    private Button btnBuildIt;
    private Button btnBacon;
    private Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSpotify = (Button) findViewById(R.id.spotify);
        btnScores = (Button) findViewById(R.id.scores);
        btnLibrary = (Button) findViewById(R.id.library);
        btnBuildIt = (Button) findViewById(R.id.buildIt);
        btnBacon = (Button) findViewById(R.id.bacon);
        btnCapstone = (Button) findViewById(R.id.capstone);

        btnSpotify.setOnClickListener(this);
        btnScores.setOnClickListener(this);
        btnLibrary.setOnClickListener(this);
        btnBuildIt.setOnClickListener(this);
        btnBacon.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.spotify:
                Toast.makeText(getApplicationContext(), "This button will launch spotify app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.scores:
                Toast.makeText(getApplicationContext(), "This button will launch scores app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.library:
                Toast.makeText(getApplicationContext(), "This button will launch library app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buildIt:
                Toast.makeText(getApplicationContext(), "This button will launch build it bigger app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bacon:
                Toast.makeText(getApplicationContext(), "This button will launch bacon reader app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(getApplicationContext(), "This button will launch my capstone app", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }

    }
}
