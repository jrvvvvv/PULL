/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author JRV
 */

import java.awt.*;
import java.awt.event.*;
import static javax.management.Query.*;
import javax.swing.*;

public class Calculator implements ActionListener {

    /**
     * @param args the command line arguments
     */
    
        JFrame calculatorFrame,loginFrame;
     
        JTextField screen,usertextfield;
        JPasswordField passtextfield;
        
       JButton button0,button1, button2,button3,button4,button5,button6,button7,button8,button9,clearbutton,deletebutton,addbutton,subtractbutton,
               multiplybutton,dividebutton,equalsbutton,pointbutton,loginButton;
       
       JLabel usertext,passtext,calc;
 
      static int a=0,b=0,equal=0;
            static  int operator=0;
            
            

            
         Calculator(){
             loginFrame=new JFrame("Login First");
             calculatorFrame=new JFrame("Calculator");
             
             screen=new JTextField();
             usertextfield= new JTextField();
             passtextfield=new JPasswordField();
             
             
             
             loginButton=new JButton("Login");
            usertext=new JLabel("Username:");
            passtext=new JLabel("Password:");
            calc=new JLabel("Calculator");
             
             
             button0=new JButton("0");
             button1=new JButton("1");
             button2=new JButton("2");
             button3=new JButton("3");
             button4=new JButton("4");
             button5=new JButton("5");
             button6=new JButton("6");
             button7=new JButton("7");
             button8=new JButton("8");
             button9=new JButton("9");
             clearbutton= new JButton("C");
            deletebutton= new JButton("del");
             addbutton= new JButton("+");
            subtractbutton= new JButton("-");
            multiplybutton= new JButton("x");
             dividebutton= new JButton("%");
             equalsbutton= new JButton("=");
        // pointbutton=new JButton(".");
        
             //logintextfields
              usertextfield.setBounds(120,80,150,30);
              passtextfield.setBounds(120,120,150,30);
              calc.setBounds(150,20,80,50);
              usertext.setBounds(30,80,80,30);
              passtext.setBounds(30,120,80,30);
              loginButton.setBounds(150,180,100,40);
              loginFrame.add(loginButton);
              loginFrame.add(usertextfield);
              loginFrame.add(passtextfield);
              loginFrame.add(calc);
              loginFrame.add(usertext);
              loginFrame.add(passtext);
             
              
        
              //calculatortextfield
        screen.setBounds(30,10,280,30);
        screen.setEditable(false);
        calculatorFrame.add(screen);
        
          //button
        clearbutton.setBounds(250,50,50,40);
        calculatorFrame.add(clearbutton);
         //button
        deletebutton.setBounds(180,50,55,40);
        calculatorFrame.add(deletebutton);
        
        
       
          //button7
        button7.setBounds(40,100,50,40);
        calculatorFrame.add(button7);
        
        //button8
        button8.setBounds(110,100,50,40);
        calculatorFrame.add(button8);
        
        //button9
        button9.setBounds(180,100,50,40);
        calculatorFrame.add(button9);
        
         //buttondivide
        dividebutton.setBounds(250,100,50,40);
        calculatorFrame.add(dividebutton);
        
        
        
            
        //button4
        button4.setBounds(40,170,50,40);
        calculatorFrame.add(button4);
        
        //button5
        button5.setBounds(110,170,50,40);
        calculatorFrame.add(button5);
                
        //button6
        button6.setBounds(180,170,50,40);
        calculatorFrame.add(button6);
        
          //multiplybutton
        multiplybutton.setBounds(250,170,50,40);
        calculatorFrame.add(multiplybutton);
        
        
        
         //button3
        button3.setBounds(180,240,50,40);
        calculatorFrame.add(button3);
        
        
        //button2
        button2.setBounds(110,240,50,40);
        calculatorFrame.add(button2);
        
       
      //button1 
         button1.setBounds(40,240,50,40); 
         calculatorFrame.add(button1);
         
       //subtractbutton
        subtractbutton.setBounds(250,240,50,40);
        calculatorFrame.add(subtractbutton);
      
        
        
        /*
          //pointbutton
        pointbutton.setBounds(40,310,50,40);
        calculator.add(pointbutton);
        */

        //button0
        button0.setBounds(110,310,50,40);
        calculatorFrame.add(button0);
        
        
        
         //addbutton
        addbutton.setBounds(250,310,50,40);
        calculatorFrame.add(addbutton);
        
          //equalsbutton
        equalsbutton.setBounds(250,380,50,40);
        calculatorFrame.add(equalsbutton);

        loginFrame.setSize(400,400);
        loginFrame.setLayout(null);
        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setDefaultCloseOperation(calculatorFrame.EXIT_ON_CLOSE);
         //theFrame
        calculatorFrame.setSize(350,500);
        calculatorFrame.setLayout(null);
        calculatorFrame.setVisible(false);
        calculatorFrame.setLocationRelativeTo(null);
        calculatorFrame.setDefaultCloseOperation(calculatorFrame.EXIT_ON_CLOSE);
        
        
        
        loginButton.addActionListener(this);
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        addbutton.addActionListener(this);
        subtractbutton.addActionListener(this);
        multiplybutton.addActionListener(this);
        dividebutton.addActionListener(this);
        deletebutton.addActionListener(this);
        clearbutton.addActionListener(this);
        equalsbutton.addActionListener(this);
         }
      
    
    
    
           public void actionPerformed(ActionEvent e ){
            if(e.getSource()==button1)
                     screen.setText(screen.getText().concat("1"));
            
            if(e.getSource()==button2)
                     screen.setText(screen.getText().concat("2"));
            
            if(e.getSource()==button3)
                     screen.setText(screen.getText().concat("3"));
            
            if(e.getSource()==button4)
                     screen.setText(screen.getText().concat("4"));
            
            if(e.getSource()==button5)
                     screen.setText(screen.getText().concat("5"));
            
            if(e.getSource()==button6)
                     screen.setText(screen.getText().concat("6"));
            
            if(e.getSource()==button7)
                     screen.setText(screen.getText().concat("7"));    
            
            if(e.getSource()==button8)
                    screen.setText(screen.getText().concat("8"));
            
            if(e.getSource()==button9)
                     screen.setText(screen.getText().concat("9"));
            
            if(e.getSource()==button0)                
                     screen.setText(screen.getText().concat("0"));
            
          //  if(e.getSource()==pointbutton)                
                //     screen.setText(screen.getText().concat("."));
            
            if(e.getSource()==addbutton){
                a= Integer.parseInt(screen.getText());
                 operator=1;
                 screen.setText("");
            }
            
            if(e.getSource()==subtractbutton){                 
                   a= Integer.parseInt(screen.getText());
                 operator=2;
                 screen.setText("");
                    }
            
             if(e.getSource()==multiplybutton){                 
                   a= Integer.parseInt(screen.getText());
                 operator=3;
                 screen.setText("");
                    }
             
             if(e.getSource()==dividebutton){                 
                   a= Integer.parseInt(screen.getText());
                 operator=4;
                 screen.setText("");
                    }
             
             if(e.getSource()==equalsbutton){
                 b=Integer.parseInt(screen.getText());
                 switch(operator){
                     case 1: equal= a+b;
                     break;
                     
                     case 2: equal = a-b;
                     break;
                     
                     case 3: equal = a*b;
                     break;
                     
                     case 4: equal = a/b;
                     break; 
                     
                     default: equal=0;
                 }
                 screen.setText(""+equal);
             }
              if (e.getSource()==clearbutton){
                  screen.setText("");
              }
              
              if(e.getSource()==deletebutton){
                  String s=screen.getText();
                  screen.setText("");
                  for(int i=0;i<s.length()-1;i++)
                      screen.setText(screen.getText()+s.charAt(i)); 
                  
              }
              
             if(e.getSource()==loginButton){
                 String un=usertextfield.getText();
                 String passw=passtextfield.getText();
                     if (un.equalsIgnoreCase("user name") && passw.equalsIgnoreCase("password")) {
                           JOptionPane.showMessageDialog(null, "Log-in Successful!");
                           loginFrame.setVisible(false);
                           calculatorFrame.setVisible(true);
                            } 
                     
                     else {
                         usertextfield.setText("");
                         passtextfield.setText("");
                    JOptionPane.showMessageDialog(null, "Log-in Failed!");
                       }
                     
                  }
                  
                 
             }
              
            
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
     new Calculator();
      
        
        
    }
    
  
}
    