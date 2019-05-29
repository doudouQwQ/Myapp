package myapp.example.com.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {


    class ADD{
        public EditText editText_1;
        public EditText editText_2;
        public EditText editText_3;
//        public ImageView imageView;
    }
//    List<ADD> a=new ArrayList<ADD>;


    ADD a =new ADD();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button =(Button)findViewById(R.id.button_fabu_add);
        a.editText_1=(EditText)findViewById(R.id.id_add_1) ;
        a.editText_2=(EditText)findViewById(R.id.id_add_2) ;
        a.editText_3=(EditText)findViewById(R.id.id_add_3) ;
//        a.imageView=(ImageView)findViewById(R.id.id_img_1);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input_1 =a.editText_1.getText().toString();
                String input_2 =a.editText_1.getText().toString();
                String input_3 =a.editText_1.getText().toString();
//                Toast.makeText(Main3Activity.this,input_1,
////                        Toast.LENGTH_SHORT).show();
//                Goods goods=new Goods(input_1,R.drawable.apple_pic);
//                GoodsList.add(goods);


                Intent intent = new Intent(Main3Activity.this, Main1Activity.class);
                intent.putExtra("data", input_1);
                startActivity(intent);

            }
        });

    }
}
