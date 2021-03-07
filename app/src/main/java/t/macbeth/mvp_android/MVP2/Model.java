package t.macbeth.mvp_android.MVP2;

import android.content.Context;

public class Model {

    public String data1;
    public String data2;
    private ModelListener listener;

    public Model(ModelListener listener) {
        this.listener = listener;
    }

    public void saveData(Context context) {

    }

    public void loadData(Context context) {


    }

    public void remoteDataChanged() {
        /* Common use case is that cloud database reports to your app that the data
           has changed.  We update the data in this function and then notify
           the listener (the presenter) that something has changed.
         */
        listener.notifyDataUpdated();
    }
}
