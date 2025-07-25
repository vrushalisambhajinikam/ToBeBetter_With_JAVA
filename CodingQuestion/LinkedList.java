import java.util.Scanner;

class Node{
    int info;
    Node link;

}

public class LinkedList {

    static Scanner sc = new Scanner(System.in);
    static Node Start = null;

    public static Node CreateNode() {
        return new Node();
    }

    public static void InsertNode() {
        Node temp = CreateNode();
        System.out.println("Enter any Element : ");
        temp.info = sc.nextInt();
        temp.link = null;

        if (Start == null) {
            Start = temp;
        } else {
            Node t1 = Start;
            while (t1.link != null) {
                t1 = t1.link;
            }
            t1.link = temp;
        }
    }

    public static void delete() {
        if (Start == null) {
            System.out.println("List is Empty ");
        } else {
            Start = Start.link;

        }

    }

    public static void Display() {
        if (Start == null) {
            System.out.println("List is Empty");
        } else {
            Node t2 = Start; //head
            while (t2 != null) {
                System.out.print(t2.info + "->");
                t2 = t2.link;

            }
            System.out.println();
        }

    }

    public static int menu() {
        System.out.println("1. Add Menu \n 2.Delete  \n 3.Print");
        System.out.println("Enter Your Choice : ");
        return sc.nextInt();
    }

    public static void main(String[] args) {

        while (true) {
            switch (menu()) {
                case 1:
                    InsertNode();
                    break;

                case 2:
                    delete();
                    break;

                case 3:
                    Display();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Plz Enter valid choice ");
            }
        }

    }
}
