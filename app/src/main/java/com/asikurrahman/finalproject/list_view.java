package com.asikurrahman.finalproject;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class list_view extends Activity{
    ListView listview;
    String [] foodNames = {"Noodles","Peking Duck","Hot Pot", "Kung Pao Chicken","baozi"};
    int [] foodImages = {R.drawable.noodles1,R.drawable.duck1,R.drawable.hotpot,R.drawable.kung1,R.drawable.baozi1};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_list_activity);

        listview = findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();
        listview.setAdapter(customAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), my_dataActivity.class);
                intent.putExtra("name",foodNames[i]);
                intent.putExtra("image",foodImages[i]);
                startActivity(intent);
            }
        });

    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return foodImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1= getLayoutInflater().inflate(R.layout.my_new_data,null);
            TextView name = view1.findViewById(R.id.fruits);
            ImageView image = view1.findViewById(R.id.images);
            name.setText(foodNames[i]);
            image.setImageResource(foodImages[i]);
            return view1;
        }


    }
}
