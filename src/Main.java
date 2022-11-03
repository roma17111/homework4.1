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

    }
}