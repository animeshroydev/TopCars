package developer.roy.animesh.topcars;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by animesh on 21/11/18.
 */

public class CarsAdapter extends ArrayAdapter<CarsDetails> {


    public CarsAdapter(Activity context, ArrayList<CarsDetails> carsDetails){
        super(context, 0, carsDetails);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        CarsDetails carsDetails = getItem(position);

        TextView ratingTextView = (TextView) listItemView.findViewById(R.id.rating);
        ratingTextView.setText(carsDetails.getmRating());

        TextView productTextView = (TextView) listItemView.findViewById(R.id.product);
        productTextView.setText(carsDetails.getmProductName());

        TextView priceTextView = (TextView) listItemView.findViewById(R.id.price);
        priceTextView.setText(carsDetails.getmPrice());


        return listItemView;
    }
}
