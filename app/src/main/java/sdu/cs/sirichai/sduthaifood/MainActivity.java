package sdu.cs.sirichai.sduthaifood;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        int[] ints = new int[]{R.drawable.logo_01, R.drawable.logo_02, R.drawable.logo_03,
        R.drawable.logo_04, R.drawable.logo_05, R.drawable.logo_06, R.drawable.logo_07,
        R.drawable.logo_08, R.drawable.logo_09};

        btn1 = findViewById(R.id.btm1);
        btn2 = findViewById(R.id.btm2);
        btn3 = findViewById(R.id.btm3);
        btn4 = findViewById(R.id.btm4);
        btn5 = findViewById(R.id.btm5);
        btn6 = findViewById(R.id.btm6);
        btn7 = findViewById(R.id.btm7);
        btn8 = findViewById(R.id.btm8);
        btn9 = findViewById(R.id.btm9);
        btn10 = findViewById(R.id.btm10);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
