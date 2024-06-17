public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
        post.name = "Иван";
        post.passport = "1234 № 567890";
        post.patronymic = "Иванович";
        post.phone = "+7 (999) 1234567";
        post.surname = "Иванеов";
        post.subscription = true;
    }
}