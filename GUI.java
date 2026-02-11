import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.BorderLayout;

public class GUI {
 JFrame window;
 JTextArea textArea;
 JScrollPane scrollPane;
 JMenuBar menuBar;
 JMenu menuFile,menuEdit,menuFormat,menuColor;
 JMenuItem iNew, iOpen, iSaveAs,iSave,iExit;
 public GUI()
{
    createWindow();
    createTextArea();
    createMenu();
    createFileMenu();
    window.setVisible(true);
  
    
}
public void createWindow()
{
     window=new JFrame("My Notepad App" );
     window.setSize(800,600);
     window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     window.getContentPane().setBackground(new Color(255,229,180));
        ImageIcon image= new ImageIcon("Notepad logo.jpeg");
     window.setIconImage(image.getImage());
   
    window.setLayout(new BorderLayout());
}
public void createTextArea()
{
       textArea= new JTextArea();
       window.add(textArea,BorderLayout.CENTER);
       textArea.setBackground(new Color(255, 220, 180)); 
        textArea.setForeground(Color.BLACK);
        scrollPane=new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        window.add(scrollPane);

}
public void createMenu()
{
    menuBar=new JMenuBar();
    window.setJMenuBar(menuBar);
    menuFile=new JMenu("File");
    menuEdit=new JMenu("Edit");
    menuColor=new JMenu("Color");
    menuFormat=new JMenu("Format");

    menuBar.add(menuFile);
    menuBar.add(menuEdit);
    menuBar.add(menuFormat);
    menuBar.add(menuColor);
}
public void createFileMenu(){
   iNew=new JMenuItem("New");
   menuFile.add(iNew);
   iOpen=new JMenuItem("Open");
   menuFile.add(iOpen);
   iSaveAs=new JMenuItem("Save As");
   menuFile.add(iSaveAs);
   iSave= new JMenuItem("Save");
   menuFile.add(iSave);
   iExit=new JMenuItem("Exit");
   menuFile.add(iExit);
}

    public static void main(String[] args) {
        new GUI();
    }
}

