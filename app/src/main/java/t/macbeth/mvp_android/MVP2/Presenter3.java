package t.macbeth.mvp_android.MVP2;

public class Presenter3 implements ModelListener {
    private final MainActivity3 activity;
    private final Model model;

    public Presenter3(MainActivity3 activity) {
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
        model.data1 = "Change 5";
        activity.updateUserInterface5();
    }

    public void doSomething2() {
        /* Do Something Here and show result */
        model.data2 = "Change 6";
        activity.updateUserInterface6();
    }

    @Override
    public void notifyDataUpdated() {
        /* Read the data and do something with it */
        activity.updateUserInterface5();
    }
}
