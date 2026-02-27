public class Function_Edit {
    GUI gui;
    public Function_Edit(GUI gui) {
        this.gui = gui;
    }
    public void Undo() {
        gui.um.undo();
    }
    public void Redo() {
        gui.um.redo();
}
}
