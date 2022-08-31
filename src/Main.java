public class Main {
    public static void main(String[] args) {

        //ЗАДАНИЕ 1

        { String firstName = "Ivan ";
            String middleName = "Ivanovich ";
            String lastName = "Ivanov ";
            String fullName = "Фамилия Имя Отчество";
            System.out.print(fullName + " - " + lastName + firstName + middleName ); }


        System.out.println();
        //ЗАДАНИЕ 2

        {
            String fullName = "Ivanov Ivan Ivanov ";
            fullName = fullName.replace("Ivanov Ivan Ivanov", "IVANOV IVAN IVANOVICH");
            System.out.print("Данные ФИО сотрудника для заполнения отчета - " + fullName );
        }

        System.out.println();

        //ЗАДАНИЕ 3

        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.print("Данные ФИО сотрудника  - " + fullName );


    }
}