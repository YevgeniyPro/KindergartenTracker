package com.myproject.kgtracker;

/**
 * Created by Yevg on 10.09.2014.
 */

import java.awt.*;
import javax.swing.*;


public class FirstScreen extends BasicFrame

{
    public static void main(String[] arsg){

        BasicFrame FirstScreen =  new BasicFrame();

        JPanel panelFSbody = new JPanel();
        JLabel labelBodyPanel = new JLabel("The main panel where everything will take place");
        panelFSbody.add(labelBodyPanel);

        FirstScreen.add(panelFSbody, BorderLayout.CENTER);


    };














}
