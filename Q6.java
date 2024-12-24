public class Q6 {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> list = new CircularlyLinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);

        System.out.println("Original List: " + list.getAll());

        CircularlyLinkedList<Integer> clonedList = list.clone(); // استنساخ القائمة
        System.out.println("Cloned List: " + clonedList.getAll());
    }
    }

