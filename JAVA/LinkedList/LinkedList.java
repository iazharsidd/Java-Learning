package LinkedList;

public class LinkedList 
{
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        // Print the linked list
        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }
        
        public void printrev(Node head) {
            if (head == null) {
                return;
            }
            printrev(head.next);
            System.out.print(head.val + " ");
        }
        void inserAtBegining(int val) {
            Node temp = new Node(val);
            if (head == null)// Empty List
            {
                head = temp;
                tail = temp;
            } else // non Empty
            {
                temp.next = head;
                temp = head;
            }
            size++;
        }

        void insertAtidx(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size) {
                insertAtEnd(val);
                return;
            }
            if (idx == 0) {
                inserAtBegining(val);
                return;
            }
            for (int i = 1; i < idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getAt(int idx) {
            if (idx < 0 || idx > size) {
                System.out.println("Wrong idx");
                return -1;
            }
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            return temp.val;
        }

        void deleteAt(int idx) {
            if (idx == 0) {
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (idx == size - 1) {
                tail = temp;
            }
            size--;
        }
        
        public Node reverse(Node head)
        {
            if(head.next == null)
            {
                return head;
            }
            Node newHead = reverse(head.next);
            head.next.next = head;
            head.next =  null;
            return newHead;
        }
    }
