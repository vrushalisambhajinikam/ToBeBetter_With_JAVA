public class p7_leepYear {

    public static void main(String[] args) {
        int year = 2020;
        if (year % 400 == 0) {
            System.out.println("yes");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("yes");
        } else {
            System.out.println("not");
        }
    }
}
