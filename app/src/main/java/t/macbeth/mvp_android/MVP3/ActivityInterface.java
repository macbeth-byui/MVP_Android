package t.macbeth.mvp_android.MVP3;

import android.content.Context;

/**
 * The functions in this interface must be implemented by all Activity classes
 * that interact with the common Presenter class.  Its possible that an activity
 * may not have an implementation for every function.  While not ideal, if this
 * happens then the function in the Activity class should do nothing.
 */

public interface ActivityInterface {

    void updateUserInterface1();
    void updateUserInterface2();
    Context getContext();
}
