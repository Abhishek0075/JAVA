import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

class calculator implements ActionListener{
    JFrame jf;
    JLabel displayLabel;
    JButton buttonOne,buttonTwo,buttonThree,buttonFour,
            buttonFive,buttonSix,buttonSeven,buttonEight,buttonNine,buttonDot,buttonZero,
            buttonEqual,buttonDivision,buttonMultiply,buttonAdd,buttonSubtract,clearButton;
    boolean isOperatorClicked=false;
    String oldValue,newValue;
    JButton operator;
    public calculator(){
        jf=new JFrame("calculator");
        jf.setLayout(null);
        jf.setLocation(350,60);
        jf.setSize(500,600);

        displayLabel=new JLabel("");
        displayLabel.setFont(new Font("monospace", Font.PLAIN, 14));
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setBackground(Color.gray);
        displayLabel.setForeground(Color.white);
        displayLabel.setOpaque(true);
        //setting the dimensions of the component here
        // label,(x position,y position,width,height)
        displayLabel.setBounds(30,40,440,40);
        jf.add(displayLabel);


        buttonSeven=new JButton("7");
        buttonSeven.setBounds(30,130,80,80);
        buttonSeven.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonSeven.addActionListener(this);
        jf.add(buttonSeven);

        buttonEight=new JButton("8");
        buttonEight.setBounds(140,130,80,80);
        buttonEight.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonEight.addActionListener(this);
        jf.add(buttonEight);

        buttonNine=new JButton("9");
        buttonNine.setBounds(250,130,80,80);
        buttonNine.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonNine.addActionListener(this);
        jf.add(buttonNine);


        buttonSix=new JButton("6");
        buttonSix.setBounds(30,230,80,80);
        buttonSix.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonSix.addActionListener(this);
        jf.add(buttonSix);

        buttonFive=new JButton("5");
        buttonFive.setBounds(140,230,80,80);
        buttonFive.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonFive.addActionListener(this);
        jf.add(buttonFive);

        buttonFour=new JButton("4");
        buttonFour.setBounds(250,230,80,80);
        buttonFour.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonFour.addActionListener(this);
        jf.add(buttonFour);


        buttonThree=new JButton("3");
        buttonThree.setBounds(30,330,80,80);
        buttonThree.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonThree.addActionListener(this);
        jf.add(buttonThree);

        buttonTwo=new JButton("2");
        buttonTwo.setBounds(140,330,80,80);
        buttonTwo.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonTwo.addActionListener(this);
        jf.add(buttonTwo);

        buttonOne=new JButton("1");
        buttonOne.setBounds(250,330,80,80);
        buttonOne.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonOne.addActionListener(this);
        jf.add(buttonOne);


        buttonDot=new JButton(".");
        buttonDot.setBounds(30,430,80,80);
        buttonDot.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonDot.addActionListener(this);
        jf.add(buttonDot);

        buttonZero=new JButton("0");
        buttonZero.setBounds(140,430,80,80);
        buttonZero.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonZero.addActionListener(this);
        jf.add(buttonZero);

        buttonEqual=new JButton("=");
        buttonEqual.setBounds(250,430,80,80);
        buttonEqual.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonEqual.addActionListener(this);
        jf.add(buttonEqual);


        buttonMultiply=new JButton("X");
        buttonMultiply.setBounds(360,130,80,80);
        buttonMultiply.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonMultiply.addActionListener(this);
        jf.add(buttonMultiply);

        buttonDivision=new JButton("/");
        buttonDivision.setBounds(360,230,80,80);
        buttonDivision.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonDivision.addActionListener(this);
        jf.add(buttonDivision);

        buttonAdd=new JButton("+");
        buttonAdd.setBounds(360,330,80,80);
        buttonAdd.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonAdd.addActionListener(this);
        jf.add(buttonAdd);

        buttonSubtract=new JButton("-");
        buttonSubtract.setBounds(360,430,80,80);
        buttonSubtract.setFont(new Font("Arial", Font.PLAIN, 40));
        buttonSubtract.addActionListener(this);
        jf.add(buttonSubtract);


        clearButton=new JButton("C");
        clearButton.setBounds(30,520,410,30);
        clearButton.setFont(new Font("Arial",Font.PLAIN,25));
        clearButton.addActionListener(this);
        jf.add(clearButton);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new calculator();
    }

    public void actionPerformed(ActionEvent e){
        String labelText=displayLabel.getText();
        if(isOperatorClicked==true){
            isOperatorClicked=false;
        }
        if(e.getSource()==buttonOne){
            jf.getContentPane().setBackground(Color.black);
            displayLabel.setText(labelText+"1");
        }
        else if(e.getSource()==buttonTwo){
            jf.getContentPane().setBackground(Color.red);
            displayLabel.setText(labelText+"2");
        }
        else if(e.getSource()==buttonThree){
            jf.getContentPane().setBackground(Color.green);
            displayLabel.setText(labelText+"3");
        }
        else if(e.getSource()==buttonFour){
            jf.getContentPane().setBackground(Color.CYAN);
            displayLabel.setText(labelText+"4");
        }
        else if(e.getSource()==buttonFive){
            jf.getContentPane().setBackground(Color.DARK_GRAY);
            displayLabel.setText(labelText+"5");
        }
        else if(e.getSource()==buttonSix){
            jf.getContentPane().setBackground(Color.LIGHT_GRAY);
            displayLabel.setText(labelText+"6");
        }
        else if(e.getSource()==buttonSeven){
            jf.getContentPane().setBackground(Color.MAGENTA);
            displayLabel.setText(labelText+"7");
        }
        else if(e.getSource()==buttonEight){
            jf.getContentPane().setBackground(Color.ORANGE);
            displayLabel.setText(labelText+"8");
        }
        else if(e.getSource()==buttonNine){
            jf.getContentPane().setBackground(Color.YELLOW);
            displayLabel.setText(labelText+"9");
        }
        else if(e.getSource()==buttonDot){
            jf.getContentPane().setBackground(Color.decode("#C2E812"));
            displayLabel.setText(labelText+".");
        }
        else if(e.getSource()==buttonZero){
            jf.getContentPane().setBackground(Color.decode("#C2EABD"));
            displayLabel.setText(labelText+"0");
        }
        else if(e.getSource()==buttonEqual){
            jf.getContentPane().setBackground(Color.decode("#AD5D4E"));
            newValue=displayLabel.getText();
            float oldValueF=Float.parseFloat(oldValue);
            float newValueF=Float.parseFloat(newValue);

            float result;
            if(operator==buttonAdd){
                result=oldValueF+newValueF;
            }
            else if(operator==buttonSubtract){
                result=oldValueF-newValueF;
            }
            else if(operator==buttonMultiply){
                result=oldValueF*newValueF;
            }else{
                result=oldValueF/newValueF;
            }
            
            displayLabel.setText(""+result);
        }
        else if(e.getSource()==buttonMultiply){
            jf.getContentPane().setBackground(Color.decode("#9C92A3"));
            oldValue=labelText;
            isOperatorClicked=true;
            operator=buttonMultiply;
            displayLabel.setText("");
        }
        else if(e.getSource()==buttonDivision){
            jf.getContentPane().setBackground(Color.decode("#704C5E"));
            oldValue=labelText;
            isOperatorClicked=true;
            operator=buttonDivision;
            displayLabel.setText("");
        }
        else if(e.getSource()==buttonAdd){
            jf.getContentPane().setBackground(Color.decode("#88A09E"));
            oldValue=labelText;
            isOperatorClicked=true;
            operator=buttonAdd;
            displayLabel.setText("");
        }
        else if(e.getSource()==buttonSubtract){
            jf.getContentPane().setBackground(Color.decode("#2D080A"));
            oldValue=labelText;
            isOperatorClicked=true;
            operator=buttonSubtract;
            displayLabel.setText("");
        }
        else if(e.getSource()==clearButton){
            displayLabel.setText("");
        }
    }
}