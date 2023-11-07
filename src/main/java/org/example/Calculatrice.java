package org.example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class Calculatrice extends JFrame implements ActionListener, KeyListener {

    private JButton b0 = new JButton("0");
    private JButton b1 = new JButton("1");
    private JButton b2 = new JButton("2");
    private JButton b3 = new JButton("3");
    private JButton b4 = new JButton("4");
    private JButton b5 = new JButton("5");
    private JButton b6 = new JButton("6");
    private JButton b7 = new JButton("7");
    private JButton b8 = new JButton("8");
    private JButton b9 = new JButton("9");
    private JButton bAdd = new JButton("+");
    private JButton bSubtract = new JButton("-");
    private JButton bMultiply = new JButton("*");
    private JButton bDivide = new JButton("/");
    private JButton bEqual = new JButton("=");
    private JButton bClear = new JButton("C");
    private JLabel result = new JLabel("result");
    private String resultText = "";


    public Calculatrice(String name) {
        super(name);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //changer la taille de la fenêtre
        this.setSize(350, 250);
        // Changer le placement de la fenêtre de façon manuel
        this.setLocation(100, 10);
        //centrer la fenetre
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        JPanel panel = (JPanel) this.getContentPane();
        JPanel panelResult = new JPanel();
        JPanel panelButton = new JPanel();
        panelResult.setLayout(new FlowLayout());
        panelResult.add(this.result);

        panelButton.setLayout(new GridLayout(4, 4, 10, 10));
        panelButton.add(this.b7);
        panelButton.add(this.b8);
        panelButton.add(this.b9);
        panelButton.add(this.bDivide);
        panelButton.add(this.b4);
        panelButton.add(this.b5);
        panelButton.add(this.b6);
        panelButton.add(this.bMultiply);
        panelButton.add(this.b1);
        panelButton.add(this.b2);
        panelButton.add(this.b3);
        panelButton.add(this.bSubtract);
        panelButton.add(this.bClear);
        panelButton.add(this.b0);
        panelButton.add(this.bEqual);
        panelButton.add(this.bAdd);

        panel.addKeyListener(this);


        this.b0.addActionListener(this);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.b3.addActionListener(this);
        this.b4.addActionListener(this);
        this.b5.addActionListener(this);
        this.b6.addActionListener(this);
        this.b7.addActionListener(this);
        this.b8.addActionListener(this);
        this.b9.addActionListener(this);
        this.bAdd.addActionListener(this);
        this.bMultiply.addActionListener(this);
        this.bDivide.addActionListener(this);
        this.bSubtract.addActionListener(this);
        this.bEqual.addActionListener(this);
        this.bClear.addActionListener(this);


        panel.setLayout(new BorderLayout(20, 20));
        panel.add(panelResult, BorderLayout.NORTH);
        panel.add(panelButton, BorderLayout.SOUTH);
        panel.setBackground(Color.DARK_GRAY);
        panelResult.setBackground(Color.DARK_GRAY);
        panelButton.setBackground(Color.DARK_GRAY);
        this.bAdd.setBackground(Color.GRAY);
        this.bMultiply.setBackground(Color.GRAY);
        this.bSubtract.setBackground(Color.GRAY);
        this.bDivide.setBackground(Color.GRAY);
        this.bEqual.setBackground(Color.CYAN);
        this.bClear.setBackground(Color.CYAN);
        this.result.setBackground(Color.WHITE);
        this.result.setForeground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        switch (((JButton) e.getSource()).getText()) {
            case "0": {
                System.out.println(this.b0.getText());
                resultText += this.b0.getText();
                this.result.setText(resultText);
                break;
            }
            case "1": {
                System.out.println(this.b1.getText());
                resultText += this.b1.getText();
                this.result.setText(resultText);
                break;
            }
            case "2": {
                System.out.println(this.b2.getText());
                resultText += this.b2.getText();
                this.result.setText(resultText);
                break;
            }
            case "3": {
                System.out.println(this.b3.getText());
                resultText += this.b3.getText();
                this.result.setText(resultText);
                break;
            }
            case "4": {
                System.out.println(this.b4.getText());
                resultText += this.b4.getText();
                this.result.setText(resultText);
                break;
            }
            case "5": {
                System.out.println(this.b5.getText());
                resultText += this.b5.getText();
                this.result.setText(resultText);
                break;
            }
            case "6": {
                System.out.println(this.b6.getText());
                resultText += this.b6.getText();
                this.result.setText(resultText);
                break;
            }
            case "7": {
                System.out.println(this.b7.getText());
                resultText += this.b7.getText();
                this.result.setText(resultText);
                break;
            }
            case "8": {
                System.out.println(this.b8.getText());
                resultText += this.b8.getText();
                this.result.setText(resultText);
                break;
            }
            case "9": {
                System.out.println(this.b9.getText());
                resultText += this.b9.getText();
                this.result.setText(resultText);
                break;
            }
            case "+": {
                System.out.println(this.bAdd.getText());
                resultText += this.bAdd.getText();
                this.result.setText(resultText);
                break;
            }
            case "-": {
                System.out.println(this.bSubtract.getText());
                resultText += this.bSubtract.getText();
                this.result.setText(resultText);
                break;
            }
            case "*": {
                System.out.println(this.bMultiply.getText());
                resultText += this.bMultiply.getText();
                this.result.setText(resultText);
                break;
            }
            case "/": {
                System.out.println(this.bDivide.getText());
                resultText += this.bDivide.getText();
                this.result.setText(resultText);
                break;
            }
            case "=": {
                System.out.println(this.bEqual.getText());
                String result = calcul(resultText);
                System.out.println(result);
                this.result.setText(resultText + " = " + result);
                break;
            }
            case "C": {
                System.out.println(this.bClear.getText());
                this.result.setText("");
                resultText = "";
                break;
            }
            default: {
                System.out.println("TEST");
            }

        }
    }

    public String calcul(String calcul) {
        int calculLength = calcul.length();

        String numbers[] = calcul.split("[+-/*]");

        int indexNumber = 0;
        int resultat = Integer.parseInt(numbers[0]);

        for (int i = 1; i < calculLength; i++) {
            char operator = calcul.charAt(i);

            switch (operator) {
                case '+':
                    indexNumber++;
                    resultat += Integer.parseInt(numbers[indexNumber]);
                    break;
                case '-':
                    indexNumber++;
                    resultat -= Integer.parseInt(numbers[indexNumber]);
                    break;
                case '*':
                    indexNumber++;
                    resultat *= Integer.parseInt(numbers[indexNumber]);
                    break;
                case '/':
                    indexNumber++;
                    resultat /= Integer.parseInt(numbers[indexNumber]);
                    break;
                default:
            }
        }
        return Integer.toString(resultat);
    }


    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        if (e.getKeyCode() == KeyEvent.VK_0)
            b0.addActionListener(this);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }



}