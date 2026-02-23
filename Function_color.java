import java.awt.Color;

public class Function_color {
    GUI gui;

    public Function_color(GUI gui)
    {
        this.gui=gui;
    }

    public void setColor(String color)
    {
        switch (color) {
            case "White":
                gui.window.getContentPane().setBackground(Color.WHITE);
                gui.textArea.setBackground(Color.WHITE);
                gui.textArea.setForeground(Color.BLACK); 
                break;

            case "Black":
                gui.window.getContentPane().setBackground(new Color(56,59,57));
                gui.textArea.setBackground(new Color(56,59,57));
                gui.textArea.setForeground(Color.WHITE);
                break;
            
            case "Brown":
                gui.window.getContentPane().setBackground(new Color(200,157,124));
                gui.textArea.setBackground(new Color(200,157,124));
                gui.textArea.setForeground(Color.WHITE);
                break;
        
            default:
                break;
        }
    }
}
