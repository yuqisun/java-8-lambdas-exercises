package mytest.chapter8.command;

/**
 * Created by syq on 7/30/2017.
 */
public class Open implements Action {
    private final Editor editor;

    public Open(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.open();
    }
}
