package id.dicky.uts_10116148;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
Tanggal Pengerjaan : 21 Mei 2019
Nim                : 10116148
Nama               : Dicky Hardiansyah
Kelas              : IF-4
*/

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread t=new Thread() {
            public void run() {

                try {
                    sleep(5000);

                    Intent i=new Intent(SplashActivity.this,OnboardingActivity.class);
                    startActivity(i);

                    finish();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        t.start();
    }
}
