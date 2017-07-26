package desidime.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by SURAJ on 7/25/2017.
 */

public class MessageActivity extends Activity {

    Button veify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobile_reg);

        veify = (Button)findViewById(R.id.veify);

        veify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MessageActivity.this, Otp.class);
                startActivity(intent);
            }
        });
    }
}
