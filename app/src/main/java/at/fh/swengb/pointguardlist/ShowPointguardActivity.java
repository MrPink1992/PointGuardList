package at.fh.swengb.pointguardlist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.fh.swengb.pointguardlist.model.PointGuard;

public class ShowPointguardActivity extends AppCompatActivity {

    private PointGuard pointGuard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_pointguard);

        Intent intent = getIntent();
        pointGuard = (PointGuard)intent.getExtras().get("pointGuard");

        TextView viewName = (TextView) findViewById(R.id.textViewName);
        TextView viewAge = (TextView) findViewById(R.id.textViewAge);
        TextView viewHeight = (TextView) findViewById(R.id.textViewHeight);
        TextView viewWeight = (TextView) findViewById(R.id.textViewWeight);
        TextView viewAssists= (TextView) findViewById(R.id.textViewAssists);

        viewName.setText(pointGuard.getName());
        viewAge.setText("Age: " + String.valueOf(pointGuard.getAge()));
        viewHeight.setText("Height: " + String.valueOf(pointGuard.getHeight()));
        viewWeight.setText("Weight: " + String.valueOf(pointGuard.getWeight()));
        viewAssists.setText("Assists per Game: " + String.valueOf(pointGuard.getAssistsPerGame()));

    }

    public void showURL(View view) {

        Uri webSite = Uri.parse(pointGuard.getUrl());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, webSite);
        startActivity(mapIntent);
    }

}
