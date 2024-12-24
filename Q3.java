public class Q3 {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> list1 = new CircularlyLinkedList<>();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);

        CircularlyLinkedList<Integer> list2 = new CircularlyLinkedList<>();
        list2.addLast(1);
        list2.addLast(2);
        list2.addLast(3);

        System.out.println(list1.equals(list2)); // Output: true

        list2.addLast(4);
        System.out.println(list1.equals(list2)); // Output: false

    }}
