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

public class GoodsAdpter extends ArrayAdapter<Goods> {
    private int resourceId;

    public GoodsAdpter(Context context, int textViewResourceId, List<Goods> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }

    @Override
    public View getView(int postion, View convertView, ViewGroup
            parent){
        Goods fruit=getItem(postion);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView goodsImage=(ImageView)view.findViewById(R.id.goods_image);
        TextView goodsName=(TextView)view.findViewById(R.id.goods_name);
        goodsImage.setImageResource(fruit.getImageId());
        goodsName.setText(fruit.getName());
        return view;
    }

}
