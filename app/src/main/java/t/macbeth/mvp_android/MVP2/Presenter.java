package t.macbeth.mvp_android.MVP2;

public class Presenter implements ModelListener {

    private final MainActivity activity;
    private final Model model;

    public Presenter(MainActivity activity) {
        this.activity = activity;
        model = new Model(this);  // By passing `this` we are registering for updates
    }

    public void start() {
        model.loadData(activity);
        /* Do other things required when activity starts */
    }

    public void stop() {
        model.saveData(activity);
        /* Do other things required when activity stops */
    }

    public void doSomething1() {
        /* Do Something Here and show result */
        model.data1 = "Change 1";
        activity.updateUserInterface1();
    }

    public void doSomething2() {
        /* Do Something Here and show result */
        model.data2 = "Change 2";
        activity.updateUserInterface2();
    }

    @Override
    public void notifyDataUpdated() {
        /* Read the data and do something with it */
        activity.updateUserInterface1();
    }
}
