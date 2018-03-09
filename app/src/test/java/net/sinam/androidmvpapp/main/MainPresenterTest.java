package net.sinam.androidmvpapp.main;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Created by iOSdeveloper on 07/03/2018.
 * Local Unit test for the Main Presenter
 */
public class MainPresenterTest {

    @Mock
    private MainContract.MvpView mvpView;
    private MainPresenter mainPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mainPresenter = new MainPresenter(mvpView);
    }

    @Test
    public void handleSignInButtonClick() throws Exception {
        mainPresenter.handleSignInButtonClick(null);
        verify(mvpView).showSignInScreen();
    }

    @Test
    public void handleSignUpButtonClick() throws Exception {
        mainPresenter.handleSignUpButtonClick(null);
        verify(mvpView).showSignUpScreen();
    }

}