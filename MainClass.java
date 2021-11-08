
import javax.swing.*;

// import jdk.internal.org.objectweb.asm.tree.analysis.Frame;

import java.awt.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.nio.charset.Charset;
import static javax.swing.JOptionPane.showMessageDialog;

 class SplashScreenDemo {

   String lastfilenamerefernce;
   private JTextArea area;
   private JLabel options;
   private JTextField textfield1;
   private JTextField textfield2;
   private JTextField textfield3;
   private JTextField textfield4;
   private JTextField textfield5;
   private JLabel statusLabel;
   private JLabel statusLabel1;
   private JPanel controlPanel;

   private JLabel filename;
   final JTextField tf=new JTextField();  
   final JLabel label=new JLabel();

    private JLabel id;
    static int j =1 ;
    private static ImageIcon icon;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JLabel l5;
    private JLabel l6;
    private JButton reset;
    private JButton next;
    private JButton finish;
    private JButton Aiken,Ese;
    private JTextField markLabel;
    private JLabel mark;
    private JTextField unitField;
    private JLabel unit;
    private JLabel choose;

    JFrame f,frame1;
   
    JFrame frame;//Creating object of JFrame
    JLabel image=new JLabel(new ImageIcon("ezgif.com-gif-maker.gif"));
    JLabel text=new JLabel("Walchand college of Engineering,Sangli");//Creating object of JLabel and adding image using the ImageIcon class
    JProgressBar progressBar=new JProgressBar();
    JLabel message=new JLabel();



    SplashScreenDemo()//Creating constructor of the class
    {
        createGUI();
        addImage();
        addText();
        addProgressBar();
        addMessage();
        runningPBar();
       
     
    }

    public void createGUI(){
        frame=new JFrame();
        frame.getContentPane().setLayout(null);//setting layout to null
        frame.setUndecorated(true);//Turning off Title bar
        frame.setSize(1000,500);//Setting size
        frame.setLocationRelativeTo(null);//Setting location to the center of screen
        frame.getContentPane().setBackground(Color.black);//setting background color
        frame.setVisible(true);//setting visibility
 
    }

    public void addImage(){
        image.setSize(1000,500);//Setting size of the image
        frame.add(image);//Adding image to the frame
    }
    public void addText()
    {
        text.setFont(new Font("arial",Font.BOLD,30));//Setting font size of text
        text.setBounds(190,0,600,40);//Setting size and location
        text.setForeground(Color.magenta);//Setting foreground color
        frame.add(text);//adding text to the frame
    }
     public void addProgressBar(){
        progressBar.setBounds(0,480,1000,20);//Setting Location and size
        progressBar.setBorderPainted(true);//Setting border painted property
        progressBar.setStringPainted(true);//Setting String painted property
        progressBar.setBackground(Color.BLACK);//setting background color
        progressBar.setForeground(Color.GREEN);//setting foreground color
        progressBar.setValue(0);//setting progress bar current value
        frame.add(progressBar);//adding progress bar to frame
    }

    void optional(){
        frame1 = new JFrame("Choose Format");
        Font font = new Font("Comic Sans Ms",Font.PLAIN,30);
        Font font2 = new Font("Comic Sans Ms",Font.PLAIN,18);
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);

        Icon icon = new ImageIcon("icons8-delete-100 (black).png");
        JButton close = new JButton(icon);
        close.setBounds(650,20,20,20);
        close.setOpaque(false);
        close.setContentAreaFilled(false);
        close.setBorderPainted(false);
        frame1.add(close);

        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
               frame1.dispose();
            }
        });


        choose = new JLabel("Choose Either of the Format");
        choose.setBounds(150,70,450,50);
        choose.setFont(font);
        choose.setForeground(Color.white);
        frame1.add(choose);


        Aiken=new JButton("AIKEN FORMAT");
        Aiken.setBounds(140,200,200,40);
        Aiken.setFont(font2);
        Aiken.setCursor(cur);

        Aiken.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Aiken.setBackground(Color.decode("#0ff1ce"));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Aiken.setBackground(UIManager.getColor("control"));
            }
        });
        frame1.add(Aiken);

        Aiken.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                frame1.dispose();
                prepareGUIforfile();
            }
        });


        Ese=new JButton("ESE FORMAT");
        Ese.setBounds(370,200,200,40);
        Ese.setFont(font2);
        Ese.setCursor(cur);

        Ese.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ese.setBackground(Color.decode("#0ff1ce"));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ese.setBackground(UIManager.getColor("control"));
            }
        });
        frame1.add(Ese);


        Ese.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                frame1.dispose();
                prepareGUIforfile2();
            }
        });



        controlPanel = new JPanel();
        controlPanel.setBackground(Color.decode("#303134"));
        frame1.add(controlPanel);
        frame1.setBounds(400,150,700,400);
         
        frame1.setUndecorated(true);
        frame1.setVisible(true); 
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });

    }



    void prepareGUIforfile(){
        f=new JFrame("Dialog for File input");
       
        Font font = new Font("Comic Sans Ms",Font.PLAIN,18);
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        



        Icon icon = new ImageIcon("icons8-delete-100 (black).png");
        JButton close = new JButton(icon);
        close.setBounds(650,20,20,20);
        close.setOpaque(false);
        close.setContentAreaFilled(false);
        close.setBorderPainted(false);
        f.add(close);

        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
               f.dispose();
            }
        });


        filename = new JLabel("Name Your Aiken File");
        filename.setBounds(20,80,350,50);
        filename.setFont(font);
        f.add(filename);

        tf.setBounds(250,80,400,50); 
        tf.setFont(font);
        f.add(tf);

        label.setBounds(250,180,350,50); 
        f.add(label);  
        
        Button b=new Button("Create file");  
        b.setFont(font);
        b.setBounds(520,280,100,30);  
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b.setBackground(Color.GREEN);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b.setBackground(UIManager.getColor("control"));
            }
        });
        f.add(b);
        
          
        
    
        
        f.setBounds(400,150,700,400);
        f.setLayout(null);  
        f.setUndecorated(true);
        f.setVisible(true); 
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        b.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent ee){  
                String filename1= tf.getText()+".txt";

                if(tf.getText().isEmpty())
                {
                        
                    showMessageDialog(null, "File name cannot be empty");
                    return;

                
                
                }
                

                else{
                    try {
                        File myObj = new File(filename1);
                        if (myObj.createNewFile()) {
                            label.setText("File created: " + myObj.getName());
                            lastfilenamerefernce=myObj.getName();
                            f.dispose();
                            prepareGUI();
                            showButtonDemo(); 
                        } 
                        else {
                            label.setText("File already exists.");
                            Button but2=new Button("Still Continue");
                            but2.setBounds(200,230,150,30);
                            but2.setFont(font);
                            f.add(but2);
                            f.setVisible(true);

                            but2.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e){
                                File myObj = new File(filename1);
                                lastfilenamerefernce=myObj.getName();
                                f.dispose();
                                prepareGUI();
                                showButtonDemo();
                                }
                            });

                        }     
                    } 
                    catch (IOException e) {
                        label.setText("An error occurred.");
                        e.printStackTrace();
                    }
                }
            }  
        }); 

    }


    void prepareGUIforfile2(){
        f=new JFrame("Dialog for File input");
       
        Font font = new Font("Comic Sans Ms",Font.PLAIN,18);
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        



        Icon icon = new ImageIcon("icons8-delete-100 (black).png");
        JButton close = new JButton(icon);
        close.setBounds(650,20,20,20);
        close.setOpaque(false);
        close.setContentAreaFilled(false);
        close.setBorderPainted(false);
        f.add(close);

        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
               f.dispose();
            }
        });


        filename = new JLabel("Name Your ESE File");
        filename.setBounds(20,80,350,50);
        filename.setFont(font);
        f.add(filename);

        tf.setBounds(250,80,400,50); 
        tf.setFont(font);
        f.add(tf);

        label.setBounds(250,180,350,50); 
        f.add(label);  
        
        Button b=new Button("Create file");  
        b.setFont(font);
        b.setBounds(520,280,100,30);  
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b.setBackground(Color.GREEN);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b.setBackground(UIManager.getColor("control"));
            }
        });
        f.add(b);
        
          
        
    
        
        f.setBounds(400,150,700,400);
        f.setLayout(null);  
        f.setUndecorated(true);
        f.setVisible(true); 
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        b.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent ee){  
                String filename1= tf.getText()+".txt";

                if(tf.getText().isEmpty())
                {
                        
                    showMessageDialog(null, "File name cannot be empty");
                    return;

                
                
                }
                

                else{
                    try {
                        File myObj = new File(filename1);
                        if (myObj.createNewFile()) {
                            label.setText("File created: " + myObj.getName());
                            lastfilenamerefernce=myObj.getName();
                            f.dispose();
                            prepareGUI2();
                            showButtonDemo2(); 
                        } 
                        else {
                            label.setText("File already exists.");
                            Button but2=new Button("Still Continue");
                            but2.setBounds(200,230,150,30);
                            but2.setFont(font);
                            f.add(but2);
                            f.setVisible(true);

                            but2.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e){
                                File myObj = new File(filename1);
                                lastfilenamerefernce=myObj.getName();
                                f.dispose();
                                prepareGUI2();
                                showButtonDemo2();
                                }
                            });

                        }     
                    } 
                    catch (IOException e) {
                        label.setText("An error occurred.");
                        e.printStackTrace();
                    }
                }
            }  
        }); 

    }
     

    void prepareGUI(){
        frame = new JFrame("Java Aiken Application");
        Font font = new Font("Comic Sans Ms",Font.PLAIN,18);
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);

      
        frame.setLocationRelativeTo(null);
        frame.setBounds(300,110,1000,700);
        frame.setUndecorated(true);
      
        //   frame.setLayout(null);


        Icon icon = new ImageIcon("icons8-delete-100.png");
        JButton close = new JButton(icon);
        close.setBounds(940,20,30,30);
        close.setOpaque(false);
        close.setContentAreaFilled(false);
        close.setBorderPainted(false);
        frame.add(close);

        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
               frame.dispose();
            }
        });



        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });


        
      
        id = new JLabel("ID                            " + j); 
        id.setFont(font);
        id.setBounds(50,50,700,45);
        id.setForeground(Color.WHITE);
        frame.add(id);


        l1 = new JLabel("Question ");
        l1.setBounds(50,100,300,45);
        l1.setFont(font);
        l1.setForeground(Color.white);
        frame.add(l1);


        area = new JTextArea();
        area.setBounds(220,100,630,80);
        area.setFont(font);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setBackground(Color.decode("#D5E6FE"));
        frame.add(area);


        l2 = new JLabel("Option A.");
        l2.setBounds(50,210,300,45);
        l2.setFont(font);
        l2.setForeground(Color.white);
        frame.add(l2);


        textfield1 = new JTextField();
        
        textfield1.setBounds(220,210,500,45);
        textfield1.setFont(font);
        textfield1.setBackground(Color.decode("#D5E6FE"));
        frame.add(textfield1);


        l3 = new JLabel("Option B.");
        l3.setBounds(50,280,300,45);
        l3.setFont(font);
        l3.setForeground(Color.white);
        frame.add(l3);


        textfield2 = new JTextField();
        textfield2.setBounds(220,280,500,45);
        textfield2.setFont(font);
        textfield2.setBackground(Color.decode("#D5E6FE"));
        frame.add(textfield2);



        l4 = new JLabel("Option C.");
        l4.setBounds(50,350,300,45);
        l4.setFont(font);
        l4.setForeground(Color.white);
        frame.add(l4);


        textfield3 = new JTextField();
        textfield3.setBounds(220,350,500,45);
        textfield3.setFont(font);
        textfield3.setBackground(Color.decode("#D5E6FE"));
        frame.add(textfield3);



        l5 = new JLabel("Option D.");
        l5.setBounds(50,420,300,45);
        l5.setFont(font);
        l5.setForeground(Color.white);
        frame.add(l5);

        textfield4 = new JTextField();
        textfield4.setBounds(220,420,500,45);
        textfield4.setFont(font);
        textfield4.setBackground(Color.decode("#D5E6FE"));
        frame.add(textfield4);




        l6 = new JLabel("Correct Option.");
        l6.setBounds(50,485,300,45);
        l6.setFont(font);
        l6.setForeground(Color.white);
        frame.add(l6);


        textfield5 = new JTextField();
        textfield5.setBounds(220,485,200,45);
        textfield5.setFont(font);
        textfield5.setBackground(Color.decode("#D5E6FE"));
        frame.add(textfield5);
        
      
    
    
     

        controlPanel = new JPanel();
        controlPanel.setBackground( Color.decode("#232F34") );
        frame.add(controlPanel);
        frame.setVisible(true);
   }
    void prepareGUI2(){
        frame = new JFrame("Java Aiken Application");
        Font font = new Font("Comic Sans Ms",Font.PLAIN,18);
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);

    
        frame.setLocationRelativeTo(null);
        frame.setBounds(300,70,1000,780);
        frame.setUndecorated(true);




        Icon icon = new ImageIcon("icons8-delete-100.png");
        JButton close = new JButton(icon);
        close.setBounds(940,20,30,30);
        close.setOpaque(false);
        close.setContentAreaFilled(false);
        close.setBorderPainted(false);
        frame.add(close);

        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
            }
        });



        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });



        




       


        controlPanel = new JPanel();
        controlPanel.setBackground( Color.decode("#232F34") ); 



        id = new JLabel("ID                            " + j); 
        id.setFont(font);
        id.setBounds(50,50,700,45);
        id.setForeground(Color.WHITE);
        frame.add(id);


        l1 = new JLabel("Question ");
        l1.setBounds(50,100,300,45);
        l1.setFont(font);
        l1.setForeground(Color.white);
        frame.add(l1);


        area = new JTextArea();
        area.setBounds(220,100,630,80);
        area.setFont(font);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setBackground(Color.decode("#D5E6FE"));
        frame.add(area);


        l2 = new JLabel("Option A.");
        l2.setBounds(50,210,300,45);
        l2.setFont(font);
        l2.setForeground(Color.white);
        frame.add(l2);


        textfield1 = new JTextField();
        
        textfield1.setBounds(220,210,500,45);
        textfield1.setFont(font);
        textfield1.setBackground(Color.decode("#D5E6FE"));
        frame.add(textfield1);


        l3 = new JLabel("Option B.");
        l3.setBounds(50,280,300,45);
        l3.setFont(font);
        l3.setForeground(Color.white);
        frame.add(l3);


        textfield2 = new JTextField();
        textfield2.setBounds(220,280,500,45);
        textfield2.setFont(font);
        textfield2.setBackground(Color.decode("#D5E6FE"));
        frame.add(textfield2);



        l4 = new JLabel("Option C.");
        l4.setBounds(50,350,300,45);
        l4.setFont(font);
        l4.setForeground(Color.white);
        frame.add(l4);


        textfield3 = new JTextField();
        textfield3.setBounds(220,350,500,45);
        textfield3.setFont(font);
        textfield3.setBackground(Color.decode("#D5E6FE"));
        frame.add(textfield3);



        l5 = new JLabel("Option D.");
        l5.setBounds(50,420,300,45);
        l5.setFont(font);
        l5.setForeground(Color.white);
        frame.add(l5);

        textfield4 = new JTextField();
        textfield4.setBounds(220,420,500,45);
        textfield4.setFont(font);
        textfield4.setBackground(Color.decode("#D5E6FE"));
        frame.add(textfield4);




        l6 = new JLabel("Correct Option.");
        l6.setBounds(50,485,300,45);
        l6.setFont(font);
        l6.setForeground(Color.white);
        frame.add(l6);


        textfield5 = new JTextField();
        textfield5.setBounds(220,485,200,45);
        textfield5.setFont(font);
        textfield5.setBackground(Color.decode("#D5E6FE"));
        frame.add(textfield5);
        


        mark = new JLabel("Marks ");
        mark.setBounds(50,550,150,45);
        mark.setFont(font);
        mark.setForeground(Color.white);
        frame.add(mark);

        markLabel = new JTextField();
        markLabel.setBounds(220,550,150,45);
        markLabel.setFont(font);
        markLabel.setBackground(Color.decode("#D5E6FE"));
        frame.add(markLabel);

        markLabel.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
            String value = markLabel.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                markLabel.setEditable(true);
            
            } else {
                
                

                JOptionPane.showMessageDialog(null,"Enter only numeric digits(0-9)","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed
                    return;
            }
            }
        });





        unit = new JLabel("Unit ");
        unit.setBounds(50,615,150,45);
        unit.setFont(font);
        unit.setForeground(Color.white);
        frame.add(unit);

        unitField = new JTextField();
        unitField.setBounds(220,615,300,45);
        unitField.setFont(font);
        unitField.setBackground(Color.decode("#D5E6FE"));
        frame.add(unitField);




        frame.add(controlPanel);
        frame.setVisible(true);
    }



    void showButtonDemo(){


        Font font = new Font("Comic Sans Ms",Font.PLAIN,18);
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);

        // JButton okButton = new JButton("Test");
        reset=new JButton("RESET");
        reset.setBounds(500,615,120,40);
        reset.setFont(font);
        reset.setCursor(cur);

        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reset.setBackground(Color.GREEN);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reset.setBackground(UIManager.getColor("control"));
            }
        });
      
      
        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {      
                area.setText("");
                textfield1.setText("");
                textfield2.setText("");
                textfield3.setText("");
                textfield4.setText("");
                textfield5.setText("");
                
                
                
            }
        });

        frame.add(reset);




        next=new JButton("NEXT");
        next.setBounds(650,615,120,40);
        next.setFont(font);
        next.setCursor(cur);

        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
               next.setBackground(Color.GREEN);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                next.setBackground(UIManager.getColor("control"));
            }
        });
        
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                 
                   
                String file="/Users/C:Rohit Jindamwar/Desktop/New folder/"+ lastfilenamerefernce;
                String question=area.getText();
                String optionA="A. "+textfield1.getText();
                String optionB="B. "+textfield2.getText();
                String optionC="C. "+textfield3.getText();
                String optionD="D. "+textfield4.getText();

                String answer="ANSWER: "+textfield5.getText();

                if(question.equals("") || textfield1.getText().equals("") || textfield2.getText().equals("") || textfield3.getText().equals("") || textfield4.getText().equals("") || textfield5.getText().equals("") )

                {
                       
					   JOptionPane.showMessageDialog(null,"Incomplete input values provided.","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed
				       return;
                
                }
                else if(textfield5.getText().equals("A") || textfield5.getText().equals("B") || textfield5.getText().equals("C") || textfield5.getText().equals("D") || textfield5.getText().equals("a") || textfield5.getText().equals("b") || textfield5.getText().equals("c") || textfield5.getText().equals("d"))
                {
                
                    try
                    {
                        FileWriter  writer=new FileWriter(file,true);
                        writer.write("\n"+question+"\n"+optionA+"\n"+optionB+"\n"+optionC+"\n"+optionD+"\n"+answer+"\n");
                        writer.close();
                        // statusLabel.setText("File written");
                        JOptionPane.showMessageDialog(null,"File Written","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed
                        area.setText("");
                        textfield1.setText("");
                        textfield2.setText("");
                        textfield3.setText("");
                        textfield4.setText("");
                        textfield5.setText("");
                        
                        j++;
                        id.setText("ID                            "+j);
                    }
                    catch(Exception ee)
                    {
                        JOptionPane.showMessageDialog(null,"Error while creating file","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed
                        // statusLabel.setText("Error while creating file");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Answer should be either A/B/C/D.","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed
                    
                }


            }   
        });  

        frame.add(next);

        

        finish=new JButton("FINISH");
        finish.setBounds(800,615,120,40);
        finish.setFont(font);
        finish.setCursor(cur);

        finish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                finish.setBackground(Color.GREEN);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                finish.setBackground(UIManager.getColor("control"));
            }
        });

        finish.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            
                 
                String file="C:/Users/Rohit Jindamwar/Desktop/New folder/"+lastfilenamerefernce;
                String question=area.getText();
                String optionA="A. "+textfield1.getText();
                String optionB="B. "+textfield2.getText();
                String optionC="C. "+textfield3.getText();
                String optionD="D. "+textfield4.getText();
                String answer="ANSWER: "+textfield5.getText();

                if(question.equals("") || textfield1.getText().equals("") || textfield2.getText().equals("") || textfield3.getText().equals("") || textfield4.getText().equals("") || textfield5.getText().equals("") )

                    {
                        // statusLabel.setText("Data not entered correctly");
                        JOptionPane.showMessageDialog(null,"Incomplete input values provided.","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed
                        return;
                    
                    }
                else if(textfield5.getText().equals("A") || textfield5.getText().equals("B") || textfield5.getText().equals("C") || textfield5.getText().equals("D") || textfield5.getText().equals("a") || textfield5.getText().equals("b") || textfield5.getText().equals("c") || textfield5.getText().equals("d"))
                {
                    
                    try
                    {
                            FileWriter  writer=new FileWriter(file,true);
                            writer.write("\n"+question+"\n"+optionA+"\n"+optionB+"\n"+optionC+"\n"+optionD+"\n"+answer+"\n");
                            writer.close();
                            
                            JOptionPane.showMessageDialog(null,"File Written","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed

                            area.setText("");
                            textfield1.setText("");
                            textfield2.setText("");
                            textfield3.setText("");
                            textfield4.setText("");
                            textfield5.setText("");
                            frame.setVisible(false);
                            
                            

                    }
                    catch(Exception ee)
                    {
                            JOptionPane.showMessageDialog(null,"Error while creating file","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed
                            
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Answer should be either A/B/C/D.","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed
                return;
                }
        
            }
        }); 

        frame.add(finish);

        //controlPanel.add(okButton);
        
        
        frame.add(controlPanel);
        frame.setVisible(true);
    }  

    void showButtonDemo2(){


        Font font = new Font("Comic Sans Ms",Font.PLAIN,18);
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);

        // JButton okButton = new JButton("Test");
        reset=new JButton("RESET");
        reset.setBounds(500,695,120,40);
        reset.setFont(font);
        reset.setCursor(cur);

        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reset.setBackground(Color.GREEN);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reset.setBackground(UIManager.getColor("control"));
            }
        });
      
      
        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {      
                area.setText("");
                textfield1.setText("");
                textfield2.setText("");
                textfield3.setText("");
                textfield4.setText("");
                textfield5.setText("");
                markLabel.setText("");
                unitField.setText("");
                
                
                
            }
        });

        frame.add(reset);




        next=new JButton("NEXT");
        next.setBounds(650,695,120,40);
        next.setFont(font);
        next.setCursor(cur);

        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
               next.setBackground(Color.GREEN);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                next.setBackground(UIManager.getColor("control"));
            }
        });
        
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                 
                   
                String file="C:/Users/Rohit Jindamwar/Desktop/New folder/"+ lastfilenamerefernce;
                String question=area.getText();
                String optionA="A         "+textfield1.getText();
                String optionB="B         "+textfield2.getText();
                String optionC="C         "+textfield3.getText();
                String optionD="D         "+textfield4.getText();

                String answer="Answer    "+textfield5.getText();
                String marks ="Mark      " + markLabel.getText();
                String units ="Unit      " + unitField.getText();

                if(question.equals("") || textfield1.getText().equals("") || textfield2.getText().equals("") || textfield3.getText().equals("") || textfield4.getText().equals("") || textfield5.getText().equals("") )

                {
                       
					   JOptionPane.showMessageDialog(null,"Incomplete input values provided.","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed
				       return;
                
                }
                else if(textfield5.getText().equals("A") || textfield5.getText().equals("B") || textfield5.getText().equals("C") || textfield5.getText().equals("D") || textfield5.getText().equals("a") || textfield5.getText().equals("b") || textfield5.getText().equals("c") || textfield5.getText().equals("d"))
                {
                
                    try
                    {
                        FileWriter  writer=new FileWriter(file,true);
                        writer.write("\n"+"ID        "+j+"\n"+"Question  "+question+"\n"+optionA+"\n"+optionB+"\n"+optionC+"\n"+optionD+"\n"+answer+"\n"+marks+"\n"+units+"\n");
                        writer.close();
                        // statusLabel.setText("File written");
                        JOptionPane.showMessageDialog(null,"File Written","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed
                        area.setText("");
                        textfield1.setText("");
                        textfield2.setText("");
                        textfield3.setText("");
                        textfield4.setText("");
                        textfield5.setText("");
                        markLabel.setText("");
                        unitField.setText("");
                        
                        j++;
                        id.setText("ID                            "+j);
                    }
                    catch(Exception ee)
                    {
                        JOptionPane.showMessageDialog(null,"Error while creating file","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed
                        // statusLabel.setText("Error while creating file");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Answer should be either A/B/C/D.","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed
                    
                }


            }   
        });  

        frame.add(next);

        

        finish=new JButton("FINISH");
        finish.setBounds(800,695,120,40);
        finish.setFont(font);
        finish.setCursor(cur);

        finish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                finish.setBackground(Color.GREEN);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                finish.setBackground(UIManager.getColor("control"));
            }
        });

        finish.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            
                 
                String file="C:/Users/Rohit Jindamwar/Desktop/New folder/"+lastfilenamerefernce;
                String question=area.getText();
                String optionA="A         "+textfield1.getText();
                String optionB="B         "+textfield2.getText();
                String optionC="C         "+textfield3.getText();
                String optionD="D         "+textfield4.getText();

                String answer="Answer    "+textfield5.getText();
                String marks ="Mark      " + markLabel.getText();
                String units ="Unit      " + unitField.getText();
                if(question.equals("") || textfield1.getText().equals("") || textfield2.getText().equals("") || textfield3.getText().equals("") || textfield4.getText().equals("") || textfield5.getText().equals("") )

                    {
                        // statusLabel.setText("Data not entered correctly");
                        JOptionPane.showMessageDialog(null,"Incomplete input values provided.","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed
                        return;
                    
                    }
                else if(textfield5.getText().equals("A") || textfield5.getText().equals("B") || textfield5.getText().equals("C") || textfield5.getText().equals("D") || textfield5.getText().equals("a") || textfield5.getText().equals("b") || textfield5.getText().equals("c") || textfield5.getText().equals("d"))
                {
                    
                    try
                    {
                            FileWriter  writer=new FileWriter(file,true);
                            writer.write("\n"+"ID        "+j+"\n"+"Question  "+question+"\n"+optionA+"\n"+optionB+"\n"+optionC+"\n"+optionD+"\n"+answer+"\n"+marks+"\n"+units+"\n");
                            writer.close();
                            
                            JOptionPane.showMessageDialog(null,"File Written","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed

                            area.setText("");
                            textfield1.setText("");
                            textfield2.setText("");
                            textfield3.setText("");
                            textfield4.setText("");
                            textfield5.setText("");
                            markLabel.setText("");
                            unitField.setText("");
                            frame.setVisible(false);
                            
                            

                    }
                    catch(Exception ee)
                    {
                            JOptionPane.showMessageDialog(null,"Error while creating file","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed
                            
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Answer should be either A/B/C/D.","Warning",JOptionPane.WARNING_MESSAGE);//Warning displayed
                return;
                }
        
            }
        }); 

        frame.add(finish);

        //controlPanel.add(okButton);
        
        
        frame.add(controlPanel);
        frame.setVisible(true);
    }




    public void addMessage(){
        message.setBounds(250,320,200,40);//Setting the size and location of the label
        message.setForeground(Color.black);//Setting foreground Color
        message.setFont(new Font("arial",Font.BOLD,15));//Setting font properties
        frame.add(message);//adding label to the frame
    }
    public void runningPBar(){
        int i=0;//Creating an integer variable and intializing it to 0
 
        while( i<=100)
        {
            try{
                Thread.sleep(50);//Pausing execution for 50 milliseconds
                progressBar.setValue(i);//Setting value of Progress Bar
                message.setText("LOADING "+Integer.toString(i)+"%");//Setting text of the message JLabel
                i=i+2 ;
                if(i==100)
                {     
                    frame.dispose();
                    optional();
                    // prepareGUIforfile();

                }
            }catch(Exception e){
                e.printStackTrace();
            }
 
 
 
        }
    }
}
    
public class MainClass
{
	public static void main(String[] args) {
		
        SplashScreenDemo swingControlDemo = new SplashScreenDemo();
     // swingControlDemo.showButtonDemo();
	}

	
}