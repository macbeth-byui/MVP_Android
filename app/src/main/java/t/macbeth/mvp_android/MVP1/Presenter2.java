package t.macbeth.mvp_android.MVP1;

public class Presenter2 {
    private final MainActivity2 activity;
    private final Model model;

    public Presenter2(MainActivity2 activity) {
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
        model.data1 = "Change 3";
        activity.updateUserInterface3();
    }

    public void doSomething2() {
        /* Do Something Here and show result */
        model.data2 = "Change 4";
        activity.updateUserInterface4();
    }
}