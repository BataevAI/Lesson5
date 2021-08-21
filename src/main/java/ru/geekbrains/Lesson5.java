package ru.geekbrains;

public class Lesson5


{

    public static void main(String []args){
        Worker work = new Worker("Bataev", "Andrey", "Director", "bataev@me.com", "89639112331", 150000, 36);
        work.printInfo();
        int size = 5;
        int year = 40;

        Worker [] person = new Worker[size];

        person[1] = new Worker("Segal", "Stiven", "producer", "sig@me.com", "32546278323", 35000, 57);
        person[2] = new Worker("Petrova", "Barbara", "meneger", "ev2@me.com", "89645625871", 74000, 24);
        person[3] = new Worker("Lee", "Bruce", "actor", "Aev@me.com", "8917000521", 120000, 4631);
        person[4] = new Worker("Vechkanov", "Dima", "meneger", "TYev@me.com", "898788812341", 90000, 43);
        person[0] = new Worker("Donec", "Nikitos", "leader", "donecNA@me.com", "89278112357", 150000, 50);

        for (int i = 0; i < size; i++) {

            if (person[i].getAge() > year) {
                person[i].printInfo() ;
            }

        }

    }


     static class Worker {

        private String lastName;
        private String firstName;
        private String position;
        private String email;
        private String phoneNumber;
        private int income;
        private int age;

        public Worker (String lastName, String firstName, String position, String email, String phoneNumber, int income, int age ) {

            this.lastName = lastName;
            this.firstName = firstName;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.income = income;
            this.age = age;
        }

        public void setAge (int age) {

            if (age > 0) {
                this.age = age;
            }

            else  System.out.println("Введен некорректный возраст");
        }
            public void setIncome (int income) {

                if (income > 0 ) {
                    this.income = income;
                }

            else  System.out.println("Введен некорректный доход");
        }

        public int getAge () {
            return age;
        }

         public int getIncome () {
             return income;
         }

        public  void printInfo() {

            System.out.println("Фамилия: " + lastName + ", " + "Имя: " + firstName + ". " + "Должность: " + position + ". Контакты: " + email + ", " + phoneNumber + ". " + "Персональные данные:" + income + ", " + age);
        }
    }


}
