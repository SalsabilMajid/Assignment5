public class CircularlyLinkedList<E> {
    private static class Node<E>{
        private  E element;
        private Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    private Node<E>tail=null;
    private int size=0;
    public CircularlyLinkedList(){}
    public int size(){return size;}
    //Q2
    public int sizeQ2() {
        if (tail == null) return 0;
        int count = 1;
        Node<E> current = tail.next;
        while (current != tail) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty()
    {return size==0;}
    public E first()
    {
        if (isEmpty())return null;
        return tail.getNext().getElement();

    }
    public E last()
    {
        if (isEmpty())return null;
        return tail.getElement();

    }
    public void rotate(){
        if (tail!=null)
            tail=tail.next;
    }
    //Q1:
    public void addFirst(E e) {
        if (size == 0) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            tail.setNext(new Node<>(e, tail.getNext()));
        }
        size++;
    }


    public void addLast(E e)
    {
        addFirst(e);
        tail=tail.next;
    }
    public E removeFirst()
    {
        if (isEmpty())return null;
        Node<E>x=tail.next;
        if (x==tail)
            tail=null;
        else
            tail.setNext(x.getNext());
        size--;
        return x.element;
    }
    //Q3
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference
        if (obj == null || getClass() != obj.getClass()) return false; // Type check
        CircularlyLinkedList<?> other = (CircularlyLinkedList<?>) obj;

        // Check size equality
        if (this.size() != other.size()) return false;

        // Compare elements
        Node<E> currentA = this.tail == null ? null : this.tail.next; // Start at head of this list
        Node<?> currentB = other.tail == null ? null : other.tail.next; // Start at head of other list

        for (int i = 0; i < this.size(); i++) {
            if (!currentA.getElement().equals(currentB.getElement())) {
                return false; // Elements are not equal
            }
            currentA = currentA.getNext(); // Move to the next node
            currentB = currentB.getNext(); // Move to the next node
        }

        return true; // All elements matched
    }

    public String getAll()
    {
        if (isEmpty())return "";
        String all="";
        Node<E>x=tail.next;
        for (int i = 0; i <size ; i++) {
            all=all+x.element+"  ";
            x=x.next;

        }
        return all;
    }
    //Q6
    public CircularlyLinkedList<E> clone() {
        CircularlyLinkedList<E> newList = new CircularlyLinkedList<>();

        if (isEmpty()) {
            return newList;
        }

        Node<E> current = tail.getNext();
        for (int i = 0; i < size; i++) {
            newList.addLast(current.getElement());
            current = current.getNext();
        }

        return newList;
    }
}

