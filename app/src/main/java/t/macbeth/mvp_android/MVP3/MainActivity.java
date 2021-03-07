package t.macbeth.mvp_android.MVP3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import t.macbeth.mvp_android.R;

public class MainActivity extends AppCompatActivity implements ActivityInterface {

    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        presenter = new Presenter(this);
        presenter.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.stop();
    }

    private void handleEvent1() {
        presenter.doSomething1();
    }

    private void handleEvent2() {
        presenter.doSomething2();
    }

    @Override
    public void updateUserInterface1() {
        /* Update the Activity in some way */
    }

    @Override
    public void updateUserInterface2() {
        /* Update the Activity in some way */
    }

    @Override
    public Context getContext() {
        return this;
    }
}