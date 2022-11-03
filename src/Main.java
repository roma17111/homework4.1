public class Main {
    public static void main(String[] args)
    {
        int age = 36;
        boolean baby = age >= 2 && age <= 6;
        boolean pyupl = age >=7 && age <= 18;
        boolean student = age  >18 && age < 24;
        if (baby) {System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");}
        else if (pyupl) {System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");}
        else if (student) {System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");}
        else {System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");}

        int age1 = 16;
        boolean people1 = age1< 5 && age1 > 0;
        boolean people2 = age1 >= 5 && age1 <14;
        if (people1) {System.out.println("Если ребенку " + age1 + " года, то он не может кататься на " +
                "аттракционе.");}
        else if (people2) {System.out.println("Если ребёнку " + age1 + " лет," +
                " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");}
        else {System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.");}

        int one = 7;
        int two = 1;
        int three = 9;
        if (one > two && one > three) {System.out.println("Максимальное число " + one);}
        else if (two > one && two > three) {System.out.println("Максимальное число " + two);}
        else if (three > two && three > one) {System.out.println("Максимальное число " + three);}
         else {System.out.println("числа равны");}


    }
}