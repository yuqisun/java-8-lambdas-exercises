package mytest.chapter8.command;

/**
 * Created by syq on 7/30/2017.
 */
public class Close implements Action {
    private final Editor editor;

    public Close(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.close();
    }
}
