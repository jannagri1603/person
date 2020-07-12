public class Main {

    public static void main(String[] args) {
    Age40();
    }
    public static void Age40() {
        person[] person = new person[5];
        person [0] = new person
                ("Игорь", "Иванов", "Александрович", "Advertiser", "igor@mail.ru",
                 "8-999-123-45-67", 50000, 32);
        person[1] = new person
                ("Людмила", "Людмиловна", "Ивановна", "Accountant", "luda@mail.ru",
                 "8-999-000-00-00", 170000, 45);
        person[2] = new person
                ("Владимир", "Путун", "Владимирович", "CEO", "putun@mail.ru",
                 "8-999-111-11-11", 99900, 50);
        person[3] = new person
                ("Николай", "Семенов", "Константинович", "Manager", "lll@mail.ru",
                "8-999-222-22-22", 50000, 21);
        person[4] = new person
                ("Дмитрий", "Дмитров", "Дмитриевич", "Seller", "ddd@mail.ru",
                "8-999-333-33-33", 47000, 24);

        for (int i = 0; i <person.length; i++) {
            if (person[i].getAge() > 40) {
                person[i].info();
            }
        }
    }
}
