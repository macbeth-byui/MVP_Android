package t.macbeth.mvp_android.MVP2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import t.macbeth.mvp_android.R;

public class MainActivity extends AppCompatActivity {

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

    private void handleUserEvent1() {
        presenter.doSomething1();
    }

    private void handleUserEvent2() {
        presenter.doSomething2();
    }

    public void updateUserInterface1() {
        /* Update the Activity in some way */
    }

    public void updateUserInterface2() {
        /* Update the Activity in some way */
    }
}