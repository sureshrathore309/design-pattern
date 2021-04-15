package com.elite.builder;

public class UserBuilderDemo {
    public static void main(String[] args) {
        User user1 = new UserBuilder("Lokesh", "Gupta")
                .phone("9876543212")
                .address("Hyderabad")
                .age(20)
                .build();
        System.out.println(user1);
        User user2 = new UserBuilder("Jack", "Reacher")
                .age(40)
                .phone("5655")
                //no address
                .build();

        System.out.println(user2);

        User user3 = new UserBuilder("Super", "Man")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);
    }
}
