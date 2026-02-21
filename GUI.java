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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class GUI implements ActionListener {
 JFrame window;
 JTextArea textArea;
 JScrollPane scrollPane;
 JMenuBar menuBar;
//menu bar
 JMenu menuFile,menuEdit,menuFormat,menuColor;
 //file part
 JMenuItem iNew, iOpen, iSaveAs,iSave,iExit;
//Format part
JMenuItem iWordWrap;
JMenu iFont,iFontSize;
JMenuItem iFontArial,iFontCSMS,iFontTNR;
JMenuItem iFontSize8,iFontSize10,iFontSize12,iFontSize14,iFontSize16,iFontSize18,iFontSize20;

boolean Word_wrap=false;


Function_file file=new Function_file(this);
Format_function format=new Format_function(this);
 public GUI()
{
    createWindow();
    createTextArea();
    createMenu();
    createFileMenu();
    createFormat();


    format.selectedFont="Arial";
    format.Wrap();
    format.createFont(10);


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
   iNew.addActionListener(this);
   iNew.setActionCommand("New");
   menuFile.add(iNew);
   iOpen=new JMenuItem("Open");
   iOpen.addActionListener(this);
   iOpen.setActionCommand("Open");
   menuFile.add(iOpen);
   iSaveAs=new JMenuItem("Save As");
   iSaveAs.addActionListener(this);
   iSaveAs.setActionCommand("Save As");
   menuFile.add(iSaveAs);
   iSave= new JMenuItem("Save");
   iSave.addActionListener(this);
   iSave.setActionCommand("Save");
   menuFile.add(iSave);
   iExit=new JMenuItem("Exit");
   iExit.addActionListener(this);
   iExit.setActionCommand("Exit");
   menuFile.add(iExit);
}

public void createFormat()
{
    iWordWrap=new JMenuItem("Word Wrap:off");
    iWordWrap.addActionListener(this);
    iWordWrap.setActionCommand("Word Wrap");
    menuFormat.add(iWordWrap);

    iFont=new JMenu("Font");
    menuFormat.add(iFont);



    iFontArial=new JMenuItem("Arial");
    iFontArial.addActionListener(this);
    iFontArial.setActionCommand("Arial");
    iFont.add(iFontArial);

    iFontCSMS=new JMenuItem("Comic Sans MS");
    iFontCSMS.addActionListener(this);
    iFontCSMS.setActionCommand("Comic Sans MS");
    iFont.add(iFontCSMS);


    iFontTNR=new JMenuItem("Times New Roman");
    iFontTNR.addActionListener(this);
    iFontTNR.setActionCommand("Times New Roman");
    iFont.add(iFontTNR);


    iFontSize=new JMenu("Font Size");
    menuFormat.add(iFontSize);
   

    iFontSize8=new JMenuItem("8");
    iFontSize8.addActionListener(this);
    iFontSize8.setActionCommand("8");
    iFontSize.add(iFontSize8);

    iFontSize10=new JMenuItem("10");
    iFontSize10.addActionListener(this);
    iFontSize10.setActionCommand("10");
    iFontSize.add(iFontSize10);


    iFontSize12=new JMenuItem("12");
    iFontSize12.addActionListener(this);
    iFontSize12.setActionCommand("12");
    iFontSize.add(iFontSize12);


    iFontSize14=new JMenuItem("14");
    iFontSize14.addActionListener(this);
    iFontSize14.setActionCommand("14");
    iFontSize.add(iFontSize14);


    iFontSize16=new JMenuItem("16");
    iFontSize16.addActionListener(this);
    iFontSize16.setActionCommand("16");
    iFontSize.add(iFontSize16);


    iFontSize18=new JMenuItem("18");
    iFontSize18.addActionListener(this);
    iFontSize18.setActionCommand("18");
    iFontSize.add(iFontSize18);


    iFontSize20=new JMenuItem("20");
    iFontSize20.addActionListener(this);
    iFontSize20.setActionCommand("20");
    iFontSize.add(iFontSize20);



}

public void actionPerformed(ActionEvent e)
{
    String command=e.getActionCommand();
    switch (command) {
        case "New":
            file.newFile();
            break;
        case "Open":
                file.Open();
            break;
        case "Save As":
            file.SaveAS();
            break;
        case "Save":
            file.Save();
            break;
        case "Exit":
            file.Exit();
            break;
        case "Word Wrap":
            format.Wrap();
            break;
        case "8":
            format.createFont(8);
            break;
        case "10":
            format.createFont(10);
            break;
        case "12":
            format.createFont(12);
            break;
        case "14":
            format.createFont(14);
            break;
        case "16":
            format.createFont(16);
            break;
        case "18":
            format.createFont(18);
            break;
        case "20":
            format.createFont(20);
        

        case "Arial":
            format.setFont(command);
            break;

        case "Comic Sans MS":
            format.setFont(command);
            break;
        case "Times New Roman":
            format.setFont(command);
            break;
            
    
        default:
            break;
    }
}
    public static void main(String[] args) {
        new GUI();
    }
}

