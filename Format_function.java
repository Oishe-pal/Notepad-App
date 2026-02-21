import java.awt.Font;


public class Format_function {
    GUI gui;
    Font arial,CSMS,TNR;
    String selectedFont;
    public Format_function(GUI gui)
    {
        this.gui=gui;
    }

    public void Wrap()
    {
        if(gui.Word_wrap==false)
        {
            gui.Word_wrap=true;
            gui.iWordWrap.setText("Word Wrap:on");
            gui.textArea.setLineWrap(true);
            gui.textArea.setWrapStyleWord(true);
        }
        else if(gui.Word_wrap==true)
        {
            gui.Word_wrap=false;
            gui.iWordWrap.setText("Word Wrap:off");
            gui.textArea.setLineWrap(false);
            gui.textArea.setWrapStyleWord(false);
        }
    }
    public void createFont(int fontSize )
    {
       arial=new Font("Arial",Font.PLAIN,fontSize);
       CSMS=new Font("Comic Sans MS",Font.PLAIN,fontSize);
        TNR=new Font("Times New Roman",Font.PLAIN,fontSize);

        setFont(selectedFont);

    }
    public void setFont(String font)
    {
          selectedFont=font ;
          switch (selectedFont) {
            case "Arial":
                gui.textArea.setFont(arial); 
                break;
        
            case "Comic Sans MS":
                gui.textArea.setFont(CSMS);
                break;
            
            case "Times New Roman":
                gui.textArea.setFont(TNR);
                break;
          
            default:
                break;
          }
    }

}
