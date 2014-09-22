package com.myproject.kgtracker;

import com.javarush.test.level14.lesson08.home03.*;
import com.javarush.test.level14.lesson08.home03.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yevg on 10.09.2014.
 */
public class Group
{

    static List<Group> groups = new ArrayList<>();
    String name;
    ArrayList<Person> members;


   public void addGroup(String groupName){ //adding a group

       //Check if such group name exists
       if (groups.contains(groupName)) System.out.println("Such group name already exists");
       else groups.add(new Group(groupName));


   }

    void addMember( Person person){   //add member to the group(each group is also a list)
            this.members.add(person);
    }
    void delMember( Person person){   //delete certain member from the group(each group is also a list)
        this.members.remove(person);
    }

    Group (String name) {
        this.name = name;
    }

    public void delGroup(Object groupName){

        //Check if such group name exists
        if (!groups.contains(groupName)) System.out.println("Such group name not found");
        else groups.remove(groupName);
    }
    void showGroup(Group group){
        for(Person p : group.members) System.out.println();
    }



}
