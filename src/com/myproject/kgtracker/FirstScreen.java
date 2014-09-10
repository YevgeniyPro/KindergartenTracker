package com.myproject.kgtracker;

/**
 * Created by Yevg on 10.09.2014.
 */

import java.awt.*;
import javax.swing.*;


public class FirstScreen extends JFrame

{
    public static void main(String[] arsg){

        new FirstScreen();
    };


    public FirstScreen(){

         this.setSize(Constants.MAINWINDOW_WIDTH, Constants.MAINWINDOW_HEIGTH);
         this.setVisible(true);

         Toolkit tk = Toolkit.getDefaultToolkit();
         Dimension dim = tk.getScreenSize();
        Dimension ulCorner = new Dimension((dim.width/2) - (Constants.MAINWINDOW_WIDTH/2), (dim.height/2) - (Constants.MAINWINDOW_HEIGTH/2));

         this.setLocation(ulCorner.width, ulCorner.height );
         this.setResizable(false);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("KGTracker Prototype v1.01");

        JPanel panelMenu_FS = new JPanel();
        this.add(panelMenu_FS);

         /*JLabel labelPanelMenu_FS = new JLabel("Inital Screen");
            panelMenu_FS.add(labelPanelMenu_FS);
            labelPanelMenu_FS.setToolTipText("Text");*/

        JButton menuMainButton = new JButton("Main");

            menuMainButton.setToolTipText("To Main Page");
        panelMenu_FS.add(menuMainButton);

        JButton menuGroupsButton = new JButton("Groups");

            menuGroupsButton.setToolTipText("To Groups Page");
        panelMenu_FS.add(menuGroupsButton);

        JButton menuPeopleButton = new JButton("People");

            menuPeopleButton.setToolTipText("To People Page");
        panelMenu_FS.add(menuPeopleButton);

        JButton menuReportsButton = new JButton("Reports");

            menuReportsButton.setToolTipText("To Reports ");
        panelMenu_FS.add(menuReportsButton);






    };




}
