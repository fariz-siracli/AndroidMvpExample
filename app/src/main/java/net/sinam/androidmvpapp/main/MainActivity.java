package net.sinam.androidmvpapp.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.sinam.androidmvpapp.R;
import net.sinam.androidmvpapp.main.MainContract;
import net.sinam.androidmvpapp.main.MainPresenter;


/*
*   Displays main screen
*
*/
public class MainActivity extends AppCompatActivity implements MainContract.MvpView{

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter(this);

    }
}

