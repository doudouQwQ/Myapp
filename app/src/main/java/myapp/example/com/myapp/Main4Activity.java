package myapp.example.com.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {

    private List<News> NewsList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        initNews();



        NewsAdpter adapter =new NewsAdpter(Main4Activity.this,R.layout.news_item,NewsList);
        ListView listView2=(ListView)findViewById(R.id.list_view2);
        listView2.setAdapter(adapter);



    }



    private void initNews(){
        for(int i=1;i<=30;i++){
            News apple=new News("i","您有一条消息");
            NewsList.add(apple);
//            Fruit banana=new Fruit("Banana",R.drawable.banana_pic);
//            fruitList.add(banana);
        }
    }

}
