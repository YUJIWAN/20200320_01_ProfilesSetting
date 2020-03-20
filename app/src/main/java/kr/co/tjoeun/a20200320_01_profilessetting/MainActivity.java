package kr.co.tjoeun.a20200320_01_profilessetting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;

import kr.co.tjoeun.a20200320_01_profilessetting.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        setupEvent();
        setValue();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("화면 재등장","다시 나타낼때마다 실행");

    }

    @Override
    public void setupEvent() {


    }

    @Override
    public void setValue() {

    }
}
