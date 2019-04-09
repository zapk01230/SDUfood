package sdu.cs.sirichai.sduthaifood;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
//    ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;

    ListView listView;

    int[] ints = new int[]{ R.drawable.logo_01, R.drawable.logo_02, R.drawable.logo_03,
                            R.drawable.logo_04, R.drawable.logo_05, R.drawable.logo_06,
                            R.drawable.logo_07, R.drawable.logo_08, R.drawable.logo_09};

    String[] detailString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView1);

        detailString = getResources().getStringArray(R.array.detail);

//        btn1 = findViewById(R.id.btm1);
//        btn2 = findViewById(R.id.btm2);
//        btn3 = findViewById(R.id.btm3);
//        btn4 = findViewById(R.id.btm4);
//        btn5 = findViewById(R.id.btm5);
//        btn6 = findViewById(R.id.btm6);
//        btn7 = findViewById(R.id.btm7);
//        btn8 = findViewById(R.id.btm8);
//        btn9 = findViewById(R.id.btm9);
//        btn10 = findViewById(R.id.btm10);

//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent detailIntent = new Intent(MainActivity.this, Detail.class);
//                detailIntent.putExtra("detail",detailString[i]);
//                startActivity(detailIntent);
//            }
//        });

        MyAdapter myAdapter = new MyAdapter(MainActivity.this,ints, detailString);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent detailIntent = new Intent(MainActivity.this, Detail.class);
                detailIntent.putExtra("logo",ints[i]);
                detailIntent.putExtra("detail",detailString[i]);
                startActivity(detailIntent);

            }
        });

    }
}
