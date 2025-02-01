package calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class MyClassTest {

    @Test
    public void testAdd(){
        MyClass myClass = new MyClass();
        assertEquals(3, myClass.add(1,2));
        assertEquals(0, myClass.add(-1,1));
        assertEquals(0, myClass.add(0,0));

    }
}
