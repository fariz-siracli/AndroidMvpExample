package net.sinam.androidmvpapp.main;

/**
 *  Responsible for handling actions from View and updating Ui as required
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.MvpView mView;

    public MainPresenter(MainContract.MvpView mView) {
        this.mView = mView;
    }
}
