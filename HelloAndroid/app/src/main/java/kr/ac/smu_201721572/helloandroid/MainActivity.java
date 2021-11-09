package kr.ac.smu_201721572.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button1;
    CheckBox checkbox1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkbox1 = (CheckBox)findViewById(R.id.checkbox1);
        button1 = (Button) findViewById(R.id.button1);

        checkbox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkbox1.isChecked() == true){
                    button1.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),"하단의 버튼을 클릭해 안드로이드에 대해 알아보세요!",Toast.LENGTH_SHORT).show();
                }else{
                    button1.setVisibility(View.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"궁금하실때 Check해주세요",Toast.LENGTH_SHORT).show();
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ko.wikipedia.org/wiki/안드로이드_(운영_체제)"));
                startActivity(mIntent);
            }
        });
    }
}