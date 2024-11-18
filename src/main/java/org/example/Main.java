package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", "Smith", "asmith", "password123", 2024));
        users.add(new User("Bob", "Johnson", "bjohnson", "password456", 2019));
        users.add(new User("Charlie", "Williams", "cwilliams", "password789", 2021));
        users.add(new User("David", "Brown", "dbrown", "password101", 2018));
        users.add(new User("Eva", "Jones", "ejones", "password112", 2024));
        users.add(new User("Frank", "Garcia", "fgarcia", "password113", 2023));
        users.add(new User("Grace", "Martinez", "gmartinez", "password114", 2017));
        users.add(new User("Hannah", "Rodriguez", "hrodriguez", "password115", 2024));
        users.add(new User("Ian", "Wilson", "iwilson", "password116", 2016));
        users.add(new User("Jack", "Anderson", "janderson", "password117", 2024));

        Role adminRole = new Role("Admin", 1);
        Role userRole = new Role("User", 2);
        Role guestRole = new Role("Guest", 3);

        users.get(0).addRoles(adminRole);
        users.get(1).addRoles(userRole);
        users.get(2).addRoles(userRole);
        users.get(3).addRoles(guestRole);
        users.get(4).addRoles(adminRole);
        users.get(5).addRoles(userRole);
        users.get(6).addRoles(guestRole);
        users.get(7).addRoles(adminRole);
        users.get(8).addRoles(guestRole);
        users.get(9).addRoles(userRole);


        for (User user : users){
            if (user.getDateJoined() < 2023){
                user.updateVip();
            }
        }

        User oldestUser = users.get(0);
        for (int i = 1; i < users.size(); i++){
            if (users.get(i).getDateJoined() < oldestUser.getDateJoined()){
                oldestUser = users.get(i);
            }


        }


        System.out.println("The oldest data joined " + oldestUser.getDateJoined() + " has user - " +  oldestUser.getName());


        int highestPriority = Integer.MIN_VALUE;
        for (User user : users) {
            for (Role role : user.getRoles()) {
                if (role.getPriority() > highestPriority) {
                    highestPriority = role.getPriority();
                }
            }
        }

        int countLow = 0;
        System.out.println("Users with the lowest priority (" + highestPriority + "):");
        for (User user : users) {
            for (Role role : user.getRoles()) {
                if (role.getPriority() == highestPriority) {
                    System.out.println(user.getName() + " ");
                    countLow++;
                    break;
                }
            }
        }
        System.out.println("Count low priority users: " + countLow );


    }
}