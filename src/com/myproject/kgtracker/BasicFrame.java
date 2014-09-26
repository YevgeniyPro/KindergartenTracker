package com.myproject.kgtracker;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Yevg on 15.09.2014.
 */
public class BasicFrame extends JFrame
{
    public  BasicFrame()
    {

        this.setSize(Constants.MAINWINDOW_WIDTH, Constants.MAINWINDOW_HEIGTH);
        this.setVisible(true);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        Dimension ulCorner = new Dimension((dim.width / 2) - (Constants.MAINWINDOW_WIDTH / 2), (dim.height / 2) - (Constants.MAINWINDOW_HEIGTH / 2));

        this.setLocation(ulCorner.width, ulCorner.height);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("KGTracker Prototype v1.01");


        JPanel containerPanel = new JPanel();
        containerPanel.setLayout(new BorderLayout());
        containerPanel.add(setFSmenupanel(), BorderLayout.NORTH);
        containerPanel.add(FirstScreen.getContent());
        containerPanel.add(setFooterPanel(), BorderLayout.SOUTH);


        this.add(containerPanel);



    }


    private JPanel setFSmenupanel ()
    {
        JPanel panelFSmenue = new JPanel();
        panelFSmenue.setLayout(new FlowLayout(FlowLayout.CENTER));

       /* JLabel labelPanelMenu_FS = new JLabel("Please select a section in the menu or on screen");
        panelFSmenue.add(labelPanelMenu_FS);
        labelPanelMenu_FS.setToolTipText("Text");*/

        JButton menuMainButton = new JButton("Main");

        menuMainButton.setToolTipText("To Main Page");
        panelFSmenue.add(menuMainButton);

        JButton menuGroupsButton = new JButton("Groups");

        menuGroupsButton.setToolTipText("To Groups Page");
        panelFSmenue.add(menuGroupsButton);

        JButton menuPeopleButton = new JButton("People");

        menuPeopleButton.setToolTipText("To People Page");
        panelFSmenue.add(menuPeopleButton);

        JButton menuReportsButton = new JButton("Reports");

        menuReportsButton.setToolTipText("To Reports ");
        panelFSmenue.add(menuReportsButton);
        return panelFSmenue;
    }
    private Box setFooterPanel ()
    {

        Box theBox = Box.createHorizontalBox();
        theBox.setSize(Constants.MAINWINDOW_WIDTH, Constants.MAINWINDOW_HEIGTH/5);

        JButton helpButton = new JButton("Help");
        helpButton.setToolTipText("To Help");

        JLabel footerPanelLabel = new JLabel("Here you choose either Help or Settings");
        footerPanelLabel.setToolTipText("Help or Settings");

        JButton settingsButton = new JButton("Settings");
        settingsButton.setToolTipText("To Settings ");
        theBox.add(Box.createHorizontalStrut(10));
        //theBox.add(Box.createVerticalStrut(10));
        theBox.add(helpButton);
        theBox.add(Box.createHorizontalGlue());
        theBox.add(footerPanelLabel);
        theBox.add(Box.createHorizontalGlue());
        theBox.add(settingsButton);
        theBox.add(Box.createHorizontalStrut(10));



        return theBox;
    }
}
