package net.sinam.androidmvpapp.main;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import net.sinam.androidmvpapp.R;
import net.sinam.androidmvpapp.databinding.MainActivityBinding;


/*
*   Displays main screen
*
*/
public class MainActivity extends AppCompatActivity implements MainContract.MvpView{

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.main_activity);
        MainActivityBinding mainActivityBinding = DataBindingUtil.setContentView(this, R.layout.main_activity);

        mPresenter = new MainPresenter(this);
        mainActivityBinding.setPresenter(mPresenter);

    }


    // MvpView  methods

    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "Take to the user screen", Toast.LENGTH_LONG).show();

    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Take to the sign up screen", Toast.LENGTH_LONG).show();
    }
}

