package com.myproject.kgtracker;

/**
 * Created by Yevg on 10.09.2014.
 */

import java.awt.*;
import javax.swing.*;


public class FirstScreen extends BasicFrame {




    static JPanel panelFSbody = new JPanel();
    public static void main(String[] arsg){

        BasicFrame FirstScreen =  new BasicFrame();
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        //JLabel labelBodyPanel = new JLabel("The main panel where everything will take place");
        //panelFSbody.setLayout(new BorderLayout());

        JPanel panelFSbodyGroups = new JPanel();
        panelFSbodyGroups.setPreferredSize(new Dimension(400, 400));

        panelFSbodyGroups.setBorder(BorderFactory.createLineBorder(Color.black));
        panelFSbodyGroups.setLayout(new FlowLayout());



        JLabel labelFSGroups = new JLabel("Groups");
        labelFSGroups.setToolTipText("Choose a groups and press \" Show \" ");
        panelFSbodyGroups.add(labelFSGroups);


        // Filling otu the list to for testing purposes
        Group group1 = new Group("Sonechko");
       Group group2 = new Group("Sadochok");
        Group group3 = new Group("Malyatko");
        Group group4 = new Group("KOKOKO");
        //group1.addMember(new Person("Alina", "Babayeva", "9876519"));

        Group.groups.add(group1);
        Group.groups.add(group2);
        Group.groups.add(group3);
        Group.groups.add(group4);

        panelFSbodyGroups.add(Group.showGroups());





        panelFSbodyGroups.add(labelFSGroups);
        button1.setSize(10, 30);
        panelFSbodyGroups.add(button1);
        panelFSbodyGroups.add(button2);
        panelFSbodyGroups.add(button3);

        JScrollPane listPane = new JScrollPane();
        JList gList = Group.showGroups();
        listPane.setViewportView(gList);






        JPanel panelFSbodyPeople = new JPanel();
        panelFSbodyPeople.setPreferredSize(new Dimension(400, 400));
        panelFSbodyPeople.setBorder(BorderFactory.createLineBorder(Color.black));

        JLabel labelFSPeople = new JLabel("People");
        panelFSbodyPeople.add(labelFSPeople);
        panelFSbodyPeople.add(listPane);




       //panelFSbody.add(labelBodyPanel, BorderLayout.NORTH);



        panelFSbody.add(panelFSbodyGroups);
        panelFSbody.add(panelFSbodyPeople);
        //panelFSbody.add(labelBodyPanel, BorderLayout.SOUTH);





    };

    public static JPanel getContent (){


        return panelFSbody;
    }













}
