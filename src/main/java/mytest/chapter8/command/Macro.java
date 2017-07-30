package mytest.chapter8.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by syq on 7/30/2017.
 */
public class Macro {
    private final List<Runnable> actions;

    public Macro() {
        actions = new ArrayList<>();
    }

    public void record(Runnable action) {
        actions.add(action);
    }

    public void run() {
        actions.stream().forEach(Runnable::run);
    }
}
