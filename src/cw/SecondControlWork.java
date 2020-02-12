package cw;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class SecondControlWork {
    /**
 * Студент Асхадуллина Диляра
 * Группа 11-908
 * Высшая школа информационных технологий и систем
 * Казанский (Приволжский) федеральный университет
 *
 * Контрольная работа №2.
 *
 */

    public static void main(String[] args) throws FileNotFoundException {
        String filename = "MOCK_DATA.csv";
        System.out.println("Удачи!");
        Users users = new Users(filename);
        users.getUserById(2);
    }
}


    /**
     * 1. Считать файл csv в массив, каждая строка (кроме первой) которого является объектом типа User (см. задание 2).
     * Реализовать методы load, save, saveAs.
     * Реализовать метод getUserById, получающий объект типа User, по id (id != номер строки).
     *
     */
    class Users {
        String filename;
        User[] users;

        public void load() throws FileNotFoundException {
            FileReader fr = new FileReader(filename);
            Scanner sc = new Scanner(fr);
            sc.nextLine();
            sc.useDelimiter(";");
            int i = 0;
            while (sc.hasNextLine()) {
                users[i] = new User(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next() == "Male" ? Gender.Male : Gender.Female,
                        sc.next(), sc.next(), sc.next());
            }
        }

        public Users(String filename) throws FileNotFoundException {
            this.filename = filename;
            users = new User[300];
            this.load();
//
        }

        public void save() throws IOException {
            FileWriter fw = new FileWriter(filename);
            fw.write("id;first_name;last_name;email;gender;money;country;job\n");
            for (User user : users) {
                fw.write(user.toString() + "\n");
            }
        }

        public void saveAs(String filename) throws IOException {
            FileWriter fw = new FileWriter(filename);
            fw.write("id;first_name;last_name;email;gender;money;country;job\n");
            for (User user : users) {
                fw.write(user.toString() + "\n");
            }
        }

        public User getUserById(int id) {
            for (User user : users) {
                if (user.getId() == id) {
                    return user;
                }
            }
            return null;
        }

    /**
     * 2. Создать класс юзер, с полями из CSV файла. Все геттеры/сеттеры + toString. Пол через Enum.
     * 3. В первой строке файла содержатся заголовки таблицы.
     * Создать метод, позволяющий получить номер столбца, по его названию, например, getColByName("name").
     * 4. Создать boolean метод, возвращающий true если пара название/номер столбца и значение соответствует введенным.
     * Используя его, создать метод в тестовом классе, который получит строки по названию опрделенной должности/стране,
     * и сохранит его в другой файл csv.
     */
    class User {
         protected int id;
         protected String first_name;
         protected String last_name;
         protected String email;
         protected Gender gender;
         protected String  money;
         protected String country;
         protected String job;

        public User(int id, String firstName, String lastName, String email, Gender gender, String money, String country, String job) {
            this.id = id;
            this.first_name = firstName;
            this.last_name = lastName;
            this.email = email;
            this.money = money;
            this.country = country;
            this.job = job;
            this.gender = gender;
        }
          public int getId() {
              return id;
            }

            public String getFirst_name() {
              return first_name;
            }

         public String getLast_name() {
            return last_name;
         }

        public String getEmail() {
            return email;
        }

        public Gender getGender() {
            return gender;
        }

        public String getMoney() {
            return money;
        }

        public String getJob() {
            return job;
        }

        public String getCountry() {
            return country;
        }

        public int setId() {
               return this.id = id;
        }

        public String setFirst_name() {
               return this.first_name = first_name;
        }

        public String setLast_name() {
            return this.last_name = last_name;
        }

        public String setEmail() {
            return this.email = email;
        }

        public Gender setGender() {
            return this.gender = gender;
        }

        public String setCountry() {
            return this.country = country;
        }

        public String setJob() {
            return this.job = job;
        }

        public String setMoney() {
            return this.money = money;
        }

        @Override
        public String toString() {
              return ("id:" + id+ " first name: " + first_name + " last name "+ last_name + " email:" + email + " gender:" + gender + " money:" + money + " country:" + country + " job:" + job);
          }
    }


enum Gender {
    Male, Female
}


        public int getColById(String name) throws FileNotFoundException {
            FileReader fr = new FileReader(filename);
            Scanner sc = new Scanner(fr);
            sc.useDelimiter(";");
            int i = 0;
            while (sc.hasNext()) {
                if (sc.next().equals(name)) {
                    return i;
                }
                i++;
            }
            return -1;
        }

        public void findUsersWithParam(String haystack, String needle, String fileName) throws IOException {
            FileWriter fw = new FileWriter(fileName);
            switch (haystack) {
                case "id": {
                    for (User user : users){
                        if (("" + user.getId()).equals(needle)){
                            fw.write(user.toString());
                        }
                    }
                }
                case "first_name": {
                    for (User user : users){
                        if (user.getFirst_name().equals(needle)){
                            fw.write(user.toString());
                        }
                    }
                }
                case "last_name": {
                    for (User user : users){
                        if (user.getLast_name().equals(needle)){
                            fw.write(user.toString());
                        }
                    }
                }
                case "email": {
                    for (User user : users){
                        if (user.getEmail().equals(needle)){
                            fw.write(user.toString());
                        }
                    }
                }
                case "gender": {
                    for (User user : users){
                        if (("" + user.getGender()).equals(needle)){
                            fw.write(user.toString());
                        }
                    }
                }
                case "money": {
                    for (User user : users){
                        if (user.getMoney().equals(needle)){
                            fw.write(user.toString());
                        }
                    }
                }
                case "country": {
                    for (User user : users){
                        if (user.getCountry().equals(needle)){
                            fw.write(user.toString());
                        }
                    }
                }
            }
        }
    }


    /**
     * 5. Имплементировать класс User, от интерфейса Measurable.
     * Реализовать метод getMeasure().
     * Реализовать статичные и дефолтные методы в интерфейсе.
     * Добавить в main-е выполнение этих методов.
     */
    interface Measurable {
        double getMeasure();

        static double getAverage(Measurable[] list) {
            return 0;
        }

        static double getMaximum(Measurable[] list) {
            return 0;
        }

        static double getMinimum(Measurable[] list) {
            return 0;
        }

        default boolean isGreaterThan(Measurable other){
            return false;
        }
    }


