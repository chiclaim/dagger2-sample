package com.chiclaim.dagger.sample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.chiclaim.dagger.sample.R;

public class AddMenuBalanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayout);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.content, new AddMenuBalanceFragment()).commit();
    }


}
