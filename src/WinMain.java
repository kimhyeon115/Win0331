import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

import GBB_game.WinGBB;

import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.InputEvent;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class WinMain extends JDialog {
   private JLabel lblPic;
private JTextArea textArea;
private JScrollPane scrollPane;
   
   
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               WinMain dialog = new WinMain();
               dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
               dialog.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }


   /**
    * Create the dialog.
    */
   public WinMain() {      
      setBounds(100, 100, 433, 375);
      
      JMenuBar menuBar = new JMenuBar();
      setJMenuBar(menuBar);
      
      JMenu mnuFile = new JMenu("File");
      mnuFile.setMnemonic('F');
      menuBar.add(mnuFile);
      
      JMenuItem mnuOpen = new JMenuItem("Open Image...");
      mnuOpen.setIcon(null);
      mnuOpen.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("이미지파일", "png","gif","jpg");
            chooser.setFileFilter(filter);
            
            if( chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
               ImageIcon icon = new ImageIcon(chooser.getSelectedFile().getPath());
               Image img = icon.getImage();
               img = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
               ImageIcon pic = new ImageIcon(img);
               lblPic.setIcon(pic);   
            }
            
         }
      });
      mnuFile.add(mnuOpen);
      
      JMenuItem mnuOpenTxt = new JMenuItem("Open txt file...");
      mnuOpenTxt.addActionListener(new ActionListener() {
         private AbstractButton taContents;

		public void actionPerformed(ActionEvent e) {
            //텍스트 파일(txt, java)을 읽어와서 taContents에 넣으시오.
            JFileChooser chooser = new JFileChooser("C:\\FileIO");
            FileNameExtensionFilter filter = new FileNameExtensionFilter("텍스트파일", "txt","java");
            chooser.setFileFilter(filter);
            if(JFileChooser.APPROVE_OPTION == chooser.showOpenDialog(null)) {
               try {
                  FileReader fr = new FileReader(chooser.getSelectedFile().getPath());
                  int c;
                  String content="";
                  while((c = fr.read()) != -1) {
                     content = content + (char)c;
                  }
                  taContents.setText(content);
                  
               } catch (FileNotFoundException e1) {
                  // TODO Auto-generated catch block
                  e1.printStackTrace();
               } catch (IOException e1) {
                  // TODO Auto-generated catch block
                  e1.printStackTrace();
               }
            }            
         }
      });
      mnuOpenTxt.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK));
      mnuFile.add(mnuOpenTxt);
      
      JMenuItem mnuSave = new JMenuItem("Save");
      mnuFile.add(mnuSave);
      

      
      JMenuItem mnExit = new JMenuItem("Exit");
      mnExit.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		System.exit(-1);
      	}
      });
      mnuFile.add(mnExit);
      
      JMenu mnuColor = new JMenu("Color");
      mnuColor.setMnemonic('C');
      menuBar.add(mnuColor);
      
      JMenuItem mnuRed = new JMenuItem("Red");
      mnuRed.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK));
      mnuRed.setMnemonic('R');
      mnuRed.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            getContentPane().setBackground(new Color(255, 0, 0));
         }
      });
      mnuColor.add(mnuRed);
      
      JMenuItem mnuGreen = new JMenuItem("Green");
      mnuGreen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_DOWN_MASK));
      mnuGreen.setMnemonic('G');
      mnuGreen.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            getContentPane().setBackground(Color.GREEN);
         }
      });
      mnuColor.add(mnuGreen);
      
      JMenuItem mnuBlue = new JMenuItem("Blue");
      mnuBlue.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK));
      mnuBlue.setMnemonic('B');
      mnuBlue.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            getContentPane().setBackground(Color.BLUE);
         }
      });
      mnuColor.add(mnuBlue);
      
      JMenu mnuHelp = new JMenu("Help");
      mnuHelp.setMnemonic('e');
      menuBar.add(mnuHelp);
      
      JMenuItem mnuInfo = new JMenuItem("Info...");
      mnuInfo.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null, "만든사람: 홍길동");
            WinGBB winGBB = new WinGBB();
            winGBB.setModal(true);
            winGBB.setVisible(true);
         }
      });
      mnuInfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
      mnuHelp.add(mnuInfo);
      
      lblPic = new JLabel("");
      getContentPane().add(lblPic, BorderLayout.WEST);
      
      scrollPane = new JScrollPane();
      getContentPane().add(scrollPane, BorderLayout.CENTER);
      
      textArea = new JTextArea();
      scrollPane.setViewportView(textArea);

   }


private void addSeparator() {
	// TODO Auto-generated method stub
	
}

}