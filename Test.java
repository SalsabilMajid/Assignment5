import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        CircularlyLinkedList<String>l= new CircularlyLinkedList<>();
        Scanner in= new Scanner(System.in);
        int choice;
        while (true)
        {
            System.out.println("1 add first 2 add last 3 rotate 4 remove first 5 list size 6 is the list empty -1 exit");
            System.out.println("input your choice: ");
            choice=  in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("input your element");
                    l.addFirst(in.next());
                    System.out.println(l.first()+" was added successfully");
                    break;
                case 2:
                    System.out.println("input your element");
                    l.addLast(in.next());
                    System.out.println(l.last()+" was added successfully");
                    break;
                case 3:
                    l.rotate();
                    System.out.println(" list elements were rotated");
                    break;
                case 4:
                    System.out.println(l.removeFirst()+" was removed ");
                    break;
                case 5:
                    System.out.println("list size is "+l.sizeQ2());
                    break;
                case 6:
                    System.out.println("is the list empty? "+l.isEmpty());
                    break;
                case -1:
                    System.out.println("Good Bye");
                    System.exit(0);

            }
            System.out.println("list elements are : "+l.getAll());
        }
    }
}

