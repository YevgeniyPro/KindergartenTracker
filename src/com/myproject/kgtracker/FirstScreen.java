package com.myproject.kgtracker;

/**
 * Created by Yevg on 10.09.2014.
 */

import java.awt.*;
import javax.swing.*;


public class FirstScreen extends BasicFrame

{   static JPanel panelFSbody = new JPanel();
    public static void main(String[] arsg){

        BasicFrame FirstScreen =  new BasicFrame();

        //JLabel labelBodyPanel = new JLabel("The main panel where everything will take place");
        //panelFSbody.setLayout(new BorderLayout());

        JPanel panelFSbodyGroups = new JPanel();
        panelFSbodyGroups.setPreferredSize(new Dimension(400, 400));

        panelFSbodyGroups.setBorder(BorderFactory.createLineBorder(Color.black));
        panelFSbodyGroups.add(showgroups);


        //panelFSbodyGroups.add(new JLabel("Groups"));

        JLabel labelFSGrous = new JLabel("People");
        labelFSGrous.setToolTipText("Choose a groups and press \" Show \" ");

        //panelFSbodyGroups.add(labelFSGrous);

        JPanel panelFSbodyPeople = new JPanel();
        panelFSbodyPeople.setPreferredSize(new Dimension(400, 400));
        panelFSbodyPeople.setBorder(BorderFactory.createLineBorder(Color.black));

        //JLabel labelFSPeople = new JLabel("People");




       // panelFSbody.add(labelBodyPanel, BorderLayout.NORTH);



        panelFSbody.add(panelFSbodyGroups);
        panelFSbody.add(panelFSbodyPeople);
        //panelFSbody.add(labelBodyPanel, BorderLayout.SOUTH);



    };

    public static JPanel getContent (){


        return panelFSbody;
    }













}
