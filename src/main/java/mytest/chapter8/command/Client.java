package mytest.chapter8.command;

/**
 * Created by syq on 7/30/2017.
 */
public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor() {
            @Override
            public void save() {
                System.out.println("save");
            }

            @Override
            public void open() {
                System.out.println("open");
            }

            @Override
            public void close() {
                System.out.println("close");
            }
        };

        Macro macro = new Macro();
        /*macro.record(new Save(editor));
        macro.record(new Open(editor));
        macro.record(new Close(editor));*/

        macro.record(() -> editor.save());
        macro.record(editor::open);
        macro.record(editor::close);
        macro.run();
    }
}
