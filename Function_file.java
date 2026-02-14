import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
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
        }
        try{

            BufferedReader br=new BufferedReader(new FileReader(fileAddress+fileName));
            String line=null;
            while((line=br.readLine())!=null)
            {
                gui.textArea.append(line+"\n");
            }

        }
        catch(Exception e)
        {
            System.out.println("File not found");
        }
    }
}
    

