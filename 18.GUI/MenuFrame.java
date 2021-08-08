import java.awt.*;
import java.awt.event.*;
class MenuFrame extends Frame implements ActionListener,ItemListener
{
     MenuBar mb;
     Menu menufile,menuformat;
     MenuItem miopen,misave,minew,miclose,miexit;
     MenuItem micut,micopy,mipaste; 
     CheckboxMenuItem chbackground;
     String msg="";
     MenuFrame()
     {
         setTitle("Menu Demo");
         setExtendedState(Frame.MAXIMIZED_BOTH);
         addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}});

        //Menubar
       mb = new MenuBar();
       menufile = new Menu("File");
       minew = new MenuItem("New");
       miopen = new MenuItem("Open");
       miclose = new MenuItem("Close"); 
       misave = new MenuItem("Save");
       miexit = new MenuItem("Exit");
       menufile.add(minew);
       menufile.add(miopen);
       menufile.addSeparator();
       menufile.add(misave);
       menufile.add(miclose);
       menufile.addSeparator();
       menufile.add(miexit);
       mb.add(menufile);
       minew.addActionListener(this);
       miopen.addActionListener(this);
       misave.addActionListener(this);
       miclose.addActionListener(this);
       miexit.addActionListener(this);
       menuformat = new Menu("Format");
       micut = new MenuItem("Cut");
       micopy = new MenuItem("Copy");
       mipaste = new MenuItem("Paste");
       chbackground = new CheckboxMenuItem("Use background color");
       menuformat.add(micut);
       menuformat.add(micopy);
       menuformat.add(mipaste);
       mipaste.setEnabled(false); 
       menuformat.addSeparator();
       menuformat.add(chbackground);
       chbackground.addItemListener(this);
       mb.add(menuformat);
       setMenuBar(mb); 
     }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==miexit)
             System.exit(0);
        else
         msg = "Selected :"+ae.getActionCommand();     
         repaint();
    }
    public void itemStateChanged(ItemEvent ie)
   {
        if(chbackground.getState())
           setBackground(Color.blue);
        else
           setBackground(Color.lightGray);
   }
    public void paint(Graphics g)
    {
          g.drawString(msg,100,200);
    }
     public static void main(String [] args)
    {
        (new MenuFrame()).setVisible(true);
    }
}