public class ListNode<T> {

    private T data;
    private ListNode<T> next;

    public ListNode(T data){
        this.data = data;
        next = null;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public ListNode<T> getNext() {
        return next;
    }
}
