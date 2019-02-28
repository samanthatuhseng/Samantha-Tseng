import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntegerSetTest {
    IntegerSet testSet;

    @Before
    public void setup(){
        testSet = new IntegerSet();
    }


    @Test
    public void testInsertNotThere(){
        //check if number is already in the set
        assertEquals(testSet.size(),0);
        assertFalse(testSet.contains(3));
        //insert a number
        testSet.insert(3);
        //check if number is in the set
        assertEquals(testSet.size(),1);
        assertTrue(testSet.contains(3));
    }

    @Test
    public void testInsertAlreadyThere(){
        //check if number is already in the set
        assertEquals(testSet.size(),0);
        assertFalse(testSet.contains(3));
        //insert a number
        testSet.insert(3);
        //check if number is in the set
        assertEquals(testSet.size(),1);
        assertTrue(testSet.contains(3));

        //check number if already in set
        assertEquals(testSet.size(),1);
        assertTrue(testSet.contains(3));
        //insert number already in set
        testSet.insert(3);
        //number appears only once in set
        assertEquals(testSet.size(),1);
        assertTrue(testSet.contains(3));
    }

    @Test
    public void testRemove(){
        testSet.remove(3);
    }
}
