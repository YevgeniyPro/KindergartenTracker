package com.myproject.kgtracker.model;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Yevg on 10.09.2014.
 */
public class Group
{

    public static ArrayList<Group> groups = new ArrayList<>();
    private String name;
    private ArrayList<com.myproject.kgtracker.model.Person> members;
    DefaultListModel defListModelgroups = new DefaultListModel();



    public void addGroup(String groupName){ //adding a group

        //Check if such group name exists
        if (groups.contains(groupName)) System.out.println("Such group name already exists");
        else groups.add(new Group(groupName));


    }
    public void addGroup(Group groupName){ //adding a group

        //Check if such group name exists
        if (groups.contains(groupName)) System.out.println("Such group name already exists");
        else groups.add(groupName);


    }

    public Group (String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void addMember(com.myproject.kgtracker.model.Person person){   //add member to the group(each group is also a list)
        this.members.add(person);
    }
    public void delMember(com.myproject.kgtracker.model.Person person){   //delete certain member from the group(each group is also a list)
        this.members.remove(person);
    }


    public void delGroup(Object groupName){

        //Check if such group name exists
        if (!groups.contains(groupName)) System.out.println("Such group name not found");
        else groups.remove(groupName);
    }
    void printGroup(Group group){
        for(com.myproject.kgtracker.model.Person p : group.members) System.out.println();
    }



    public static JList showGroups() {


        String[] groupsList = new String[groups.size()];
        for (int i = 0; i < groups.size(); i++)
            groupsList[i] = groups.get(i).getName();

        JList groupListShow = new JList(groupsList);
        groupListShow.setPreferredSize(new Dimension(70, 100));
        groupListShow.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


        return groupListShow;}

   }


