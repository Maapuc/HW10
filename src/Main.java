import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Задача № 1 ");
        System.out.println();
        {
            String firstName = "Ivanov";
            String middleName = "Ivan";
            String lastName = "Ivanovich";
            String fullName = firstName + " " + middleName + " " + lastName;
            System.out.println(" Ф. И. О. сотрудника — " + fullName);

            System.out.println();
            System.out.println(" Задача № 2 ");
            System.out.println();
            {
                System.out.println(" Ф. И. О. сотрудника — " + fullName.toUpperCase(Locale.ROOT));
            }
        }
        System.out.println();
        System.out.println(" Задача № 3 ");
        System.out.println();
        {
            String firstName = "Иванов";
            String middleName = "Семён";
            String lastName = "Семёнович";
            String fullName = firstName + " " +  middleName + " " + lastName;
            System.out.println(" Ф. И. О. сотрудника — " + fullName);
            fullName = fullName.replace("ё", "е");
            System.out.println(" Ф. И. О. сотрудника — " + fullName);
        }
    }
}