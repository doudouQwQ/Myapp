package myapp.example.com.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main1Activity extends AppCompatActivity {

    private  List<Goods> GoodsList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);



        Intent intent = getIntent();
        String data = intent.getStringExtra("data");


        Goods goods=new Goods(data,R.drawable.apple_pic);
        GoodsList.add(goods);

        GoodsAdpter adapter=new GoodsAdpter(Main1Activity.this,R.layout.goods_item,GoodsList);
        ListView listView=(ListView)findViewById(R.id.list_view1);
        listView.setAdapter(adapter);
    }
}


