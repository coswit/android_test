package xyz.coswit.jnitest;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";

    static {
        System.loadLibrary("test_jni");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv = findViewById(R.id.text);

        findViewById(R.id.click1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(stringFromJNI("java传递数据"));
            }
        });

    }

    private void showDialog() {
        AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                .setIcon(R.mipmap.ic_launcher_round)
                .setCancelable(true)
                .setTitle("dialog")
                .show();
    }

    public native String stringFromJNI(String to);


    @Override
    protected void onStart() {
        Log.d(TAG, "onStart方法正在执行");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume方法正在执行");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause方法正在执行");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop方法正在执行");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy方法正在执行");
        super.onDestroy();
    }
}
