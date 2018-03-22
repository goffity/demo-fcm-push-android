package push.fcm.demo.goffity.com.demo_fcm_push_android;

import com.google.firebase.iid.FirebaseInstanceId;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToken();
    }

    public void showToken() {
        Log.i("token", FirebaseInstanceId.getInstance().getToken());
    }
}
