package myapp.example.com.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sr130 on 2019/5/13.
 */

public class NewsAdpter extends ArrayAdapter<News> {
    private int resourceId;

    public NewsAdpter(Context context, int textViewResourceId, List<News> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }

    @Override
    public View getView(int postion, View convertView, ViewGroup
            parent){
        News news=getItem(postion);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView newsText=(TextView) view.findViewById(R.id.news_news);
        TextView newsName=(TextView)view.findViewById(R.id.news_name);
        newsText.setText(news.getText());
        newsName.setText(news.getName());
        return view;
    }

}
