import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {

    ListNode<T> head;

    public LinkedList(){
        head = null;
    }

    /**
     * The method adds an element to the linkedlist
     * @param data
     */
    public void add(T data){
        ListNode<T> newNode = new ListNode<T>(data);
        if(head ==null){
            head = newNode;
            return;
        }
        ListNode<T> traveller = head;
        while(traveller.getNext()!=null){
            traveller = traveller.getNext();
        }
        traveller.setNext(newNode);
    }

    /**
     * The method returns the data in the list.
     * @return
     */
    public List<T> getData(){

        ArrayList<T> listData = new ArrayList<T>();
        if(head == null){
            return listData;
        }
        ListNode<T> traveller = head;
        while(traveller!=null){
            listData.add(traveller.getData());
            traveller = traveller.getNext();
        }
        return listData;
    }
}
