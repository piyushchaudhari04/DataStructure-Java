import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LinkedListTest {

   public LinkedList<Integer> setup(){

       LinkedList<Integer> list = new LinkedList<Integer>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);
       return list;
   }

    @Test
    public void shouldAddElementInTheListCorrectly(){
       LinkedList<Integer> list = new LinkedList<Integer>();

       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);

        List<Integer> expected = Arrays.asList(1,2,3,4,5,6);

        Assert.assertEquals(expected,list.getData());
    }

    @Test
    public void shouldReverseTheList(){

       //Arrange
        LinkedList<Integer> list = setup();
        List<Integer> expected =Arrays.asList(6,5,4,3,2,1);
        //Act
        list.reverseList();

        //Assert
        Assert.assertEquals(expected,list.getData());
    }

    @Test
    public void shouldRemoveDuplicatesFromList(){
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(6);
        List<Integer> expected = Arrays.asList(1,2,3,4,5,6);
        list.removeDuplicateSortedList();
        Assert.assertEquals(expected,list.getData());
    }

    @Test
    public void shouldRemoveTheMentionedElement(){

       LinkedList<Integer> list = setup();
       List<Integer> expected = Arrays.asList(1,2,3,5,6);

       list.remove(4);

       Assert.assertEquals(expected,list.getData());

       list.remove(1);
       expected = Arrays.asList(2,3,5,6);
       Assert.assertEquals(expected,list.getData());
    }
}
