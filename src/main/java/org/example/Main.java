package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        // заполните другие поля
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "4444 № 444444";
        post.phoneNumber = "+79263972676";
        post.birthday = new FormDate();
        post.birthday.day =19;
        post.birthday.month = 12;
        post.birthday.year=1999;
        post.subscription = true;
    }

}