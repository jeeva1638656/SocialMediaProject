package com.example.HelloWorldDemo.SocialMediaDemo;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Component
public class UserService {

    private static List<User> UserList = new ArrayList<>();

     private static int idCount =0;
    static {
        UserList.add(new User(idCount++,"jeeva", LocalDate.now().minusYears(30)));
        UserList.add(new User(idCount++,"ajay",LocalDate.now().minusYears(30)));
        UserList.add(new User(idCount++,"jayaprakash",LocalDate.now().minusYears(30)));

//
//        UserList.add(new User(4, "jeeva", LocalDate.now().minusYears(30)));
//        UserList.add(new User(3, "kjsjhh", LocalDate.now().minusYears(30)));
//        UserList.add(new User(5, "djeidf", LocalDate.now().minusYears(30)));
    }

    public List<User> findAllUsers() {
        return UserList;
    }

    public User findUserById(int id) {
        for (User user : UserList) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }


    public User save(User user) {

        if (user.getId() == idCount) //if we want define like user Id from user then we have go to use this
            user.setId(idCount++);
        UserList.add(user);
        return user;
    }
    public User updateUser(int id,User updateUser)
    {
        User existingUser = null;
        for (User user:UserList)
        {
            if(user.getId()==id)


                UserList.set(id,updateUser);

        }
        return existingUser;
    }



}
