package at.fh.swengb.pointguardlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import at.fh.swengb.pointguardlist.model.PointGuard;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{


    private List<PointGuard> listPointGuard;
    private ListView myListView;
    private CustomAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listPointGuard = new ArrayList<>();
        listPointGuard.add(new PointGuard("Rajon Rondo", 30, 185, 84, 12, "https://en.wikipedia.org/wiki/Rajon_Rondo"));
        listPointGuard.add(new PointGuard("Stephen Curry", 28,  191, 86, 7,"https://en.wikipedia.org/wiki/Stephen_Curry"));
        listPointGuard.add(new PointGuard("Russel Westbrook", 28, 191, 91, 11, "https://en.wikipedia.org/wiki/Russell_Westbrook"));
        listPointGuard.add(new PointGuard("Chris Paul", 31, 183, 79, 10, "https://en.wikipedia.org/wiki/Chris_Paul"));
        listPointGuard.add(new PointGuard("Kyrie Irving", 24, 191, 88, 12, "https://en.wikipedia.org/wiki/Kyrie_Irving"));

        myListView = (ListView) findViewById(R.id.PointGuardList);

        myAdapter = new CustomAdapter(this, listPointGuard);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);


    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        PointGuard selectedUser = listPointGuard.get(i);
        Intent intent = new Intent(view.getContext(),ShowPointguardActivity.class);
        intent.putExtra("pointGuard",selectedUser);
        startActivity(intent);

    }

}
