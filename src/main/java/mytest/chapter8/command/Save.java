package mytest.chapter8.command;

/**
 * Created by syq on 7/30/2017.
 */
public class Save implements Action {
    private final Editor editor;

    public Save(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.save();
    }
}
