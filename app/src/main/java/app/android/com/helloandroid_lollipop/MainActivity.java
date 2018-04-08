package app.android.com.helloandroid_lollipop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    private Button btn_go_to_servce_layout, btn_go_to_youtube_layout;

    private static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Log.d(TAG," "+new Throwable().getStackTrace()[0].getMethodName()+"()"+"#"+new Throwable().getStackTrace()[0].getLineNumber());

        //버튼에 대한 참조
        btn_go_to_servce_layout = (Button)findViewById(R.id.btn_go_to_servce_layout);
        btn_go_to_servce_layout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Layout_Service.class);
                startActivity(intent);
            }
        });
        btn_go_to_youtube_layout = findViewById(R.id.btn_go_to_youtube_layout);
        btn_go_to_youtube_layout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Layout_Player.class);
                startActivity(intent);
            }
        });

    }

}
