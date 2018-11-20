package developer.roy.animesh.topcars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CarsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);

        ArrayList<CarsDetails> carsDetails = QueryUtils.extractCarsDetails();

        ListView carsListView = (ListView) findViewById(R.id.list);

        CarsAdapter adapter = new CarsAdapter(this, carsDetails);

        carsListView.setAdapter(adapter);

        // App successfully parsed JSON from QueryUtils class...
    }
}
