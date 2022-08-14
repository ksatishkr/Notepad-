
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.awt.Font;
import java.awt.Color;

import java.awt.Toolkit;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.undo.*;
import javax.swing.event.UndoableEditEvent;
import javax.swing.undo.UndoManager;

public final class TextEditor extends javax.swing.JFrame {
   File fi,file;
   UndoManager um = new UndoManager();
    public TextEditor() {
       
        initComponents();
        setIcon();
        setLocationRelativeTo(null);
        um = new UndoManager();
        undoredo();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        new1 = new javax.swing.JMenuItem();
        New = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        save = new javax.swing.JMenuItem();
        saveas = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cut = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        copy = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        paste = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        selectall = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        fontsize = new javax.swing.JMenuItem();
        un = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        redo = new javax.swing.JMenuItem();
        cyne = new javax.swing.JMenu();
        dark = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        white = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        pink = new javax.swing.JMenuItem();
        cyan = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        contact = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        chat = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        author = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Untitled - MyNotepade");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open.setText("Open ");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        jMenu1.add(open);
        jMenu1.add(jSeparator1);

        new1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        new1.setText("New");
        new1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new1ActionPerformed(evt);
            }
        });
        jMenu1.add(new1);

        New.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        New.setText("New Window");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        jMenu1.add(New);
        jMenu1.add(jSeparator2);

        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jMenu1.add(save);

        saveas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveas.setText("Save As...");
        saveas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveasActionPerformed(evt);
            }
        });
        jMenu1.add(saveas);
        jMenu1.add(jSeparator11);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cut.setText("Cut");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        jMenu2.add(cut);
        jMenu2.add(jSeparator4);

        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        jMenu2.add(copy);
        jMenu2.add(jSeparator5);

        paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        paste.setText("Paste");
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });
        jMenu2.add(paste);
        jMenu2.add(jSeparator6);

        selectall.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        selectall.setText("Select all");
        selectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectallActionPerformed(evt);
            }
        });
        jMenu2.add(selectall);
        jMenu2.add(jSeparator7);

        fontsize.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        fontsize.setText("Font size");
        fontsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontsizeActionPerformed(evt);
            }
        });
        jMenu2.add(fontsize);

        un.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        un.setText("Undo");
        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });
        jMenu2.add(un);
        jMenu2.add(jSeparator3);

        redo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        redo.setText("Redo");
        redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoActionPerformed(evt);
            }
        });
        jMenu2.add(redo);

        jMenuBar2.add(jMenu2);

        cyne.setText("View");

        dark.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        dark.setText("Dark");
        dark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkActionPerformed(evt);
            }
        });
        cyne.add(dark);
        cyne.add(jSeparator8);

        white.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        white.setText("White");
        white.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteActionPerformed(evt);
            }
        });
        cyne.add(white);
        cyne.add(jSeparator9);

        pink.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        pink.setText("Pink");
        pink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinkActionPerformed(evt);
            }
        });
        cyne.add(pink);

        cyan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        cyan.setText("Cyne");
        cyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cyanActionPerformed(evt);
            }
        });
        cyne.add(cyan);

        jMenuBar2.add(cyne);

        jMenu4.setText("Help");

        contact.setText("Contact us");
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jMenu4.add(contact);
        jMenu4.add(jSeparator10);

        chat.setText("Chat with us");
        chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatActionPerformed(evt);
            }
        });
        jMenu4.add(chat);
        jMenu4.add(jSeparator12);

        author.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        author.setText("About Author");
        author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorActionPerformed(evt);
            }
        });
        jMenu4.add(author);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("finalicon.png")));
    }
    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
        if(evt.getSource()==cut){
            textArea.cut();
        }
        
    }//GEN-LAST:event_cutActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
       if(evt.getSource()==copy){
            textArea.copy();
             
        }
    }//GEN-LAST:event_copyActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
       if(evt.getSource()==paste){
            textArea.paste();
        }
    }//GEN-LAST:event_pasteActionPerformed

    private void selectallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectallActionPerformed
        if(evt.getSource()==selectall){
            textArea.selectAll();
        }
    }//GEN-LAST:event_selectallActionPerformed

    private void fontsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontsizeActionPerformed
        if (evt.getSource()==fontsize){

            String sizeOfFont = JOptionPane.showInputDialog(this,"Enter Font Size",JOptionPane.OK_CANCEL_OPTION);

                if (sizeOfFont != null){

                    int convertSizeOfFont = Integer.parseInt(sizeOfFont);

                    Font font = new Font(Font.SANS_SERIF,Font.PLAIN,convertSizeOfFont);

                    textArea.setFont(font);

                }      }
    }//GEN-LAST:event_fontsizeActionPerformed

    private void darkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkActionPerformed
       if (evt.getSource()==dark){
            textArea.setBackground(Color.DARK_GRAY);//dark Theme
            textArea.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_darkActionPerformed

    private void whiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteActionPerformed
        if (evt.getSource()==white){
            textArea.setBackground(Color.WHITE);//white Theme
            textArea.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_whiteActionPerformed

    private void pinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinkActionPerformed
        if (evt.getSource()==pink){
            textArea.setBackground(Color.PINK);//pink Theme
            textArea.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_pinkActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
         if (evt.getSource()==open){
            JFileChooser chooseFile = new JFileChooser();
            int i = chooseFile.showOpenDialog(this);
            if (i == JFileChooser.APPROVE_OPTION){
                 file = chooseFile.getSelectedFile(); //select the file
               String filePath = file.getPath(); //get the file path
                String fileNameToShow = file.getName(); //get the file name
                this.setTitle(fileNameToShow+" - MyNotepad");
               try {
                     try (BufferedReader readFile = new BufferedReader(new FileReader(filePath))) {
                         String tempString1 = "";
                         String tempString2 = "";
                         while ((tempString1 = readFile.readLine()) != null){
                             tempString2 += tempString1 + "\n";
                         }
                         textArea.setText(tempString2);
                     }
               }catch (IOException ae){
               }
            }
        }
    }//GEN-LAST:event_openActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
      if(this.getTitle().equals("Untitled - MyNotepade")){
          saveTheFile2();
      }else{
          saveTheFile3();
      }
    }//GEN-LAST:event_saveActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        if (evt.getSource()==New){
            
            TextEditor nte=new TextEditor();
           nte.setVisible(true);
        nte.setLocationRelativeTo(null);
       nte.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        }
    }//GEN-LAST:event_NewActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       int responce=JOptionPane.showConfirmDialog(this,"Do you want to Exit?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       if(responce==JOptionPane.YES_OPTION){
           if(evt.getSource()==exit){
           System.exit(0);
       }else{    
           }
       }
    }//GEN-LAST:event_exitActionPerformed

    private void saveasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveasActionPerformed
         if (evt.getSource()==saveas){
            saveTheFile2();
        }
    }//GEN-LAST:event_saveasActionPerformed

    private void new1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new1ActionPerformed
        if (evt.getSource()==new1){
            textArea.setText("");
        }
    }//GEN-LAST:event_new1ActionPerformed
    public void undoredo(){
    textArea.getDocument().addUndoableEditListener((UndoableEditEvent e) -> {
        um.addEdit(e.getEdit());
    });
    }
    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed

        try {
	um.undo();
	} catch (CannotUndoException ex) {
	}
    }//GEN-LAST:event_unActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void redoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoActionPerformed

        try {
	um.redo();
	} catch (CannotRedoException ex){
	}
    }//GEN-LAST:event_redoActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
     JOptionPane.showMessageDialog(this,"Temporarily this feature is not available..!");
    }//GEN-LAST:event_contactActionPerformed

    private void chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatActionPerformed
       JOptionPane.showMessageDialog(this,"Temporarily this feature is not available..!");
    }//GEN-LAST:event_chatActionPerformed

    private void authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorActionPerformed
       String s="Hey user, I'm Satish kumar and i am very happy to\nintroduce MyNodepad textEditor Application for \nuser who like darkmode"
               + "or any other mode as a \nprogrammer.Then this application is useful for those \nguys. For that you can click on view "
               + "option and select \nyour favorite thames.I added all the \nfeatures which required for a textEditor you will see \nwhen you visited all the "
               + "all the options.once again\n                         Thanks User!!";
       JOptionPane.showMessageDialog(this,s);
    }//GEN-LAST:event_authorActionPerformed

    private void cyanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cyanActionPerformed
       if (evt.getSource()==cyan){
            textArea.setBackground(Color.cyan);        //cyan Theme
            textArea.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_cyanActionPerformed
    public void saveTheFile3(){
       String content=textArea.getText();
       String fileNameToShow=fi.getName();
          this.setTitle(fileNameToShow+" - MyNotepad");
       try{
          FileWriter fw1;
                if(fi!=null){
                    fw1=new FileWriter(fi.getPath());
                }
                else{
                   fw1=new FileWriter(file.getPath()); 
                }
                fw1.write(content);
                fw1.flush();
                fw1.close();
        }catch(IOException e2){
     }  
    }   
//////////////////////////////////
    public void saveTheFile2(){
        JFileChooser fs=new JFileChooser(new File("c:\\"));
        fs.setDialogTitle("Save a File");
        fs.setFileFilter(new FileTypeFilter(".txt","Text File"));
        int result=fs.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            String content=textArea.getText();
           fi=fs.getSelectedFile();
           String fileNameToShow=fi.getName();
          this.setTitle(fileNameToShow+" - MyNotepad");
            try{
                try (FileWriter fw = new FileWriter(fi.getPath())) {
                    fw.write(content);
                    fw.flush();
                }
            }catch(IOException e2){
                JOptionPane.showMessageDialog(null,e2.getMessage());
            }
        }
    }
    //Operation on text Area..........
    
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       //</editor-fold>
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TextEditor().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem New;
    private javax.swing.JMenuItem author;
    private javax.swing.JMenuItem chat;
    private javax.swing.JMenuItem contact;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenuItem cyan;
    private javax.swing.JMenu cyne;
    private javax.swing.JMenuItem dark;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem fontsize;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem new1;
    private javax.swing.JMenuItem open;
    private javax.swing.JMenuItem paste;
    private javax.swing.JMenuItem pink;
    private javax.swing.JMenuItem redo;
    private javax.swing.JMenuItem save;
    private javax.swing.JMenuItem saveas;
    private javax.swing.JMenuItem selectall;
    public static javax.swing.JTextArea textArea;
    private javax.swing.JMenuItem un;
    private javax.swing.JMenuItem white;
    // End of variables declaration//GEN-END:variables

    private void saveTheFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
