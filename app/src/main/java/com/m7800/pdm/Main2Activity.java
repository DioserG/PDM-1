package com.m7800.pdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity{

        final String TAG = "App";
@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //A activity está sendo criada
        Log.d(TAG, "onCreate");
        }

        @Override
        protected void onStart() {
                super.onStart();
                Log.d(TAG, "onStart");
                //A activity está prestes a se tornar visível
        }

        @Override
        protected void onResume() {
                super.onResume();
                Log.d(TAG, "onResume");
                //A activity está visivel
        }

        @Override
        protected void onRestart() {
                super.onRestart();
                Log.d(TAG, "onRestart");
                //A activity está voltando a receber o foco, depois de estar pausada.
        }

        @Override
        protected void onPause() {
                super.onPause();
                Log.d(TAG, "onPause");
                //Outra activity está recebendo o foco. Esta activity ficará pausada
        }

        @Override
        protected void onStop() {
                super.onStop();
                Log.d(TAG, "onStop");
                //A activity não está mais visivel mas permanece em memória
        }

        @Override
        protected void onDestroy() {
                super.onDestroy();
                Log.d(TAG, "onDestroy");
                //A activity está prestes a ser destruída (removida da memoria).
        }
}
