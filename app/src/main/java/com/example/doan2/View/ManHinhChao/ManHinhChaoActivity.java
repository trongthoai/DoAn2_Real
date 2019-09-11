package com.example.doan2.View.ManHinhChao;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doan2.R;
import com.example.doan2.View.TrangChu.TrangChuActivity;

public class ManHinhChaoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinhchao_layout);


    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            } finally {
                Intent iTrangchu = new Intent(ManHinhChaoActivity.this, TrangChuActivity.class);
                startActivity(iTrangchu);
            }
        }
    });
    thread.start();
    }
}

