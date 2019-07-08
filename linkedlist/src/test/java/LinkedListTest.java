import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LinkedListTest {

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
}
