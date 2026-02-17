import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
public class Function_file 
{
    GUI gui;
    String fileName;
    String fileAddress;
    public  Function_file(GUI gui)
    {
        this.gui=gui;
    }
    public void newFile()
    {
        gui.textArea.setText("");
        gui.window.setTitle("New Tab");
        fileName=null;
        fileAddress=null;
    }
    public void Open()
    {
        FileDialog fd=new FileDialog(gui.window,"Open",FileDialog.LOAD );
        fd.setVisible(true);
        if(fd.getFile()!=null)
        {
            fileName=fd.getFile();
            fileAddress=fd.getDirectory();
            gui.window.setTitle(fileName);

            
            gui.textArea.setText("");
        try{

            BufferedReader br=new BufferedReader(new FileReader(fileAddress+fileName));
            String line=null;
            while((line=br.readLine())!=null)
            {
                gui.textArea.append(line+"\n");
            }
            br.close();

        }
        catch(Exception e)
        {
            System.out.println("File not found");
        }
        }
    }
    public void SaveAS()
    {
        FileDialog fd=new FileDialog(gui.window,"Save",FileDialog.SAVE);
        fd.setVisible(true);

        if((fd.getFile())!=null)
        {
            fileName=fd.getFile();
            fileAddress=fd.getDirectory();
            gui.window.setTitle(fileName);
        }
        try{

            FileWriter fw=new FileWriter(fileAddress+fileName);
            fw.write(gui.textArea.getText());
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("System Error!!!");
        }
    }
    public void Save()
    {
        if(fileName==null)
        {
            SaveAS();
        }
        else
        {
            try
            {
                  FileWriter fw=new FileWriter(fileAddress+fileName);
                  fw.write(gui.textArea.getText());
                  fw.close();
            }
            catch(Exception e)
            {
                System.out.println("System Error!!!");
            }
        }
    }
    public void Exit()
    {
        System.exit(0);
    }
}
    

