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
     * The method reverses the linked list
     */
    public void reverseList(){
        ListNode<T> present = head, back=null;
        while(present!=null){
            ListNode<T> temp = present.getNext();
            present.setNext(back);
            back = present;
            present = temp;
        }
        head = back;
    }

    /**
     * The method removes the duplicate elements and keeps only one copy of an element in a sorted list.
     */
    public void removeDuplicateSortedList(){
        ListNode<T> present = head, back =null;
        if (head ==null){
            return;
        }
        while(present!=null){

            if(back!=null && back.getData().equals(present.getData())){
                back.setNext(present.getNext());
                present = present.getNext();
            }else{
                back = present;
                present = present.getNext();
            }
        }
    }

    public void remove(T data){

        if(head == null){
            return;
        }
        ListNode<T> present = head, back = null;
        while(present!=null){
            if(present.getData().equals(data)){
                if(back!=null){
                    back.setNext(present.getNext());
                }
                else{
                    head = head.getNext();
                }
                break;
            }
            back=present;
            present = present.getNext();
        }
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
