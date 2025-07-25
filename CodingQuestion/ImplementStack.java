import java.util.Scanner;

public class ImplementStack {
    static final int mazsize=5;
    static int[] stack =new int[mazsize];

    static Scanner sc=new Scanner(System.in);
    //stack operation
    static int index1=-1;

    //push
    public static void push(){
        if(index1==mazsize-1)
        {
            System.out.println("Stack is Full");
        }
        else{

            System.out.println("Enter Any Ele :");
               int  data=sc.nextInt();
                index1++;
                stack[index1]=data;


            System.out.println("Data Instered Successfully");
        }
    }

    //print ele
    public static void print(){
        if(index1==-1){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Elements of Stack :");
            for (int i = index1; i>=0;i--) {
                System.out.print(stack[i]+" ");
            }
        }

    }
    //pop
    public static void pop()
    {
        System.out.println();
        if(index1==-1){
            System.out.println("Stack is Empty");
        }
        else {
            int n=stack[index1];
            index1--;
            System.out.println("Ele is popped"+n);
        }
    }

    //isEmpty()
    public static void Full(){


    }

    public static void Exit(){

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;

        do{
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.print");
            System.out.println("4.Exit");

            System.out.println("Enter Your Choice ");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:push();
                    break;
                case 2:pop();
                    break;
                case 3:print();
                    break;
                case 4:Exit();
                    System.out.println("Program stopped");
                default:
                    System.out.println("Enter valid choce: ");
            }

        }while (choice!=4);

    }
}
