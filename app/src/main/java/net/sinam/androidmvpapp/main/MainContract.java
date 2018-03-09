package net.sinam.androidmvpapp.main;

import android.view.View;

/**
 *  Defines the contract between View(@link {@link MainActivity}) and Presenter (@link {@link MainPresenter}
 */

public interface MainContract {


    interface MvpView{
        void showSignInScreen();
        void showSignUpScreen();

    }
    interface Presenter {
        void handleSignInButtonClick(View view);
        void handleSignUpButtonClick(View view);

    }
}
