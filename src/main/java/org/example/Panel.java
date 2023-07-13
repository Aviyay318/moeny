package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Panel extends JPanel {
    private JButton firstCurrency;
    private JButton secondCurrency;
    private JButton thirdCurrency;
    private JButton fourthCurrency;
    private JButton fifthCurrency;
    private JLabel moneyExchange;
    //  private ChromeDrive chromeDrive;
    public Panel(){
        this.setBounds(0,0,1100,900);
        this.setBackground(Color.pink);
        firstButton();
        secondButton();
        thirdButton();
        fourthButton();
        fifthButton();
        addMoneyExchange();
    }
    private void firstButton(){
        this.firstCurrency= new JButton("USD/NIS");
        this.firstCurrency.setBounds(0,100,100,100);
        this.add(this.firstCurrency);
        this.firstCurrency.setVisible(true);
        this.firstCurrency.addActionListener((e)->{
            removeButton();
        });
    }

    private void secondButton(){
        this.secondCurrency=new JButton("GBP/EUR");
        this.secondCurrency.setBounds(this.firstCurrency.getX(),this.firstCurrency.getY()+120,this.firstCurrency.getWidth(),this.firstCurrency.getHeight());
        this.add(this.secondCurrency);
        this.secondCurrency.setVisible(true);
        this.secondCurrency.addActionListener((e)->{
            removeButton();
        });
    }
    private void thirdButton(){
        this.thirdCurrency=new JButton("EUR/NIS");
        this.thirdCurrency.setBounds(this.secondCurrency.getX(),this.secondCurrency.getY()+120,this.secondCurrency.getWidth(),this.secondCurrency.getHeight());
        this.add(this.thirdCurrency);
        this.thirdCurrency.setVisible(true);
        this.thirdCurrency.addActionListener((e)->{
            removeButton();
        });
    }
    private void fourthButton(){
        this.fourthCurrency=new JButton("AUD/USD");
        this.fourthCurrency.setBounds(this.thirdCurrency.getX(),this.thirdCurrency.getY()+120,this.thirdCurrency.getWidth(),this.thirdCurrency.getHeight());
        this.add(this.fourthCurrency);
        this.fourthCurrency.setVisible(true);
        this.fourthCurrency.addActionListener((e)->{
            removeButton();
        });
    }
    private void fifthButton(){
        this.fifthCurrency= new JButton("NIS/GBP");
        this.fifthCurrency.setBounds(this.fourthCurrency.getX(),this.fourthCurrency.getY()+120,this.fourthCurrency.getWidth(),this.fourthCurrency.getHeight());
        this.add(this.fifthCurrency);
        this.fifthCurrency.setVisible(true);
        this.fifthCurrency.addActionListener((e)->{
            removeButton();
        });
    }
    private void removeButton() {
        this.firstCurrency.setVisible(false);
        this.secondCurrency.setVisible(false);
        this.thirdCurrency.setVisible(false);
        this.fourthCurrency.setVisible(false);
        this.fifthCurrency.setVisible(false);
        addLabel();
    }
    private void addLabel(){
        this.moneyExchange = new JLabel("money exchange");
        this.moneyExchange.setBounds(200,200,400,400);
        this.add(this.moneyExchange);

    }

    private void addMoneyExchange(){
        try {
            Document website = Jsoup.connect("https://il.investing.com/currencies/").userAgent("Chrome/114.0.5735.199").get();
            Elements element = website.getElementsByClass("genTbl closedTbl crossRatesTbl");
            System.out.println(element);
        } catch (IOException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
//    Document document;
//       try{
//           document = Jsoup.connect("https://il.investing.com/currencies/").get();
//               String data = document.body().text();
//               System.out.println(data);
//       }catch (IOException e){
//           System.out.println("soo");
//       }
    }

}
