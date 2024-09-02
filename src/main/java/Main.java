public class Main {

    public static void main(String[] args) {
        Post post = new Post();

        post.birthday = new FormDate();
        post.birthday.day = 22;
        post.birthday.month = 1;
        post.birthday.year = 1980;

        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

    }
}


//{
//  "birthday": {
//    "day": 13,
//    "month": 6,
//    "year": 1999
//  },
//  "name": "Иван",
//  "passport": "4444 № 44444444",
//  "patronymic": "Иванович",
//  "phone": "+7 (999)-999-99-99",
//  "surname": "Иванов",
//  "subscription": true
//}
//