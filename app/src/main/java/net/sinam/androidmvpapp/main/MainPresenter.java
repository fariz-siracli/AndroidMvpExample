package net.sinam.androidmvpapp.main;

import android.view.View;

/**
 *  Responsible for handling actions from View and updating Ui as required
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.MvpView mView;

    public MainPresenter(MainContract.MvpView mView) {
        this.mView = mView;
    }

//    Presenter methods
    @Override
    public void handleSignInButtonClick(View view) {
        mView.showSignInScreen();
    }

    @Override
    public void handleSignUpButtonClick(View view) {
        mView.showSignUpScreen();
    }
}
