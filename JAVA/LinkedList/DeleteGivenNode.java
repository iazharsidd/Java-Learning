package LinkedList;

public class DeleteGivenNode 
{
    public static void main(String[] args) 
    {
        LinkedList l = new LinkedList();
        l.insertAtidx(0, 1);
        l.insertAtidx(1, 2);
        l.insertAtidx(2, 3);
        l.insertAtidx(3, 4);
        l.print();
        l.deleteAt(3);
        l.print();
    }
}
