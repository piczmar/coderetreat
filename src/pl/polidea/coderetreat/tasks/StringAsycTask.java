package pl.polidea.coderetreat.tasks;

import android.content.Context;
import pl.polidea.coderetreat.activity.TaskActivity;

public class StringAsycTask extends MyRoboAsycTask<String> {
    /**
     *
     */
    private final TaskActivity taskActivity;

    public StringAsycTask(final TaskActivity taskActivity, final Context context) {
        super(context);
        this.taskActivity = taskActivity;
    }

    @Override
    public String call() throws Exception {
        return "WebText";
    }

    @Override
    public void onSuccess(final String t) throws Exception {
        super.onSuccess(t);
        this.taskActivity.setAsyncTest(t);
    }
}