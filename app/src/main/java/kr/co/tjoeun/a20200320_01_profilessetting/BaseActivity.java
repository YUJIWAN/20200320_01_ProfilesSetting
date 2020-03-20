package kr.co.tjoeun.a20200320_01_profilessetting;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext = this ;
    public abstract void setupEvent();
    public abstract void setValue();
}
