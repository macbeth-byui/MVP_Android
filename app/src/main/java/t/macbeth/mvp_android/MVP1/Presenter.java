package t.macbeth.mvp_android.MVP1;

public class Presenter {

    private final MainActivity activity;
    private final Model model;

    public Presenter(MainActivity activity) {
        this.activity = activity;
        model = new Model();
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
}
