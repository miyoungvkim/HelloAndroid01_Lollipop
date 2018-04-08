package app.android.com.helloandroid_lollipop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by kjphoto on 2018-04-09.
 */

public class Layout_Player extends AppCompatActivity {

    private Button btn;

    private static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.player_layout );

        Log.d(TAG," "+new Throwable().getStackTrace()[0].getMethodName()+"()"+"#"+new Throwable().getStackTrace()[0].getLineNumber());

        //버튼에 대한 참조
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Layout_Service.class);
                startActivity(intent);
            }
        });
    }

}