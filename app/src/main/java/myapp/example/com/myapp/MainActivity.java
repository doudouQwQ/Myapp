package myapp.example.com.myapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.id_button_shouye);
        Button button2 = (Button) findViewById(R.id.id_button_fenxiang);
        Button button3 = (Button) findViewById(R.id.id_button_fabu);
        Button button4 = (Button) findViewById(R.id.id_button_xiaoxi);
        Button button5 = (Button) findViewById(R.id.id_button_me);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(MainActivity.this,Main1Activity.class);
                startActivity(intent1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent2 =new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent3 =new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent3);

            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent4 =new Intent(MainActivity.this,Main4Activity.class);
                startActivity(intent4);

            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent5 =new Intent(MainActivity.this,Main5Activity.class);
                startActivity(intent5);

            }
        });


    }
}
