

import org.junit.*;
public class HashMapClassTest {

    @Test
    public void testIsEmpty() {
        HashMapClass hashMap = new HashMapClass(5);
        Assert.assertEquals(true, hashMap.isEmpty());
        hashMap.put(0,1);
        hashMap.put(0,2);
        Assert.assertEquals(false, hashMap.isEmpty());
    }

    @Test
    public void testContainsKey() {
        HashMapClass hashMap = new HashMapClass(5);
        hashMap.put(null,1);
        hashMap.put(0,null);
        Assert.assertEquals(true, hashMap.containsKey(null));
        Assert.assertEquals(true, hashMap.containsKey(0));
        Assert.assertEquals(false, hashMap.containsKey(1));
    }

    @Test
    public void testGet() {
        HashMapClass hashMap = new HashMapClass(5);
        hashMap.put(null,1);
        hashMap.put(0,null);
        Assert.assertEquals(1, hashMap.get(null));
        Assert.assertEquals(null, hashMap.get(0));
        Assert.assertEquals(null, hashMap.get(1));
    }

    @Test
    public void testPut() {
        HashMapClass hashMap = new HashMapClass(5);
        hashMap.put(null,1);
        hashMap.put(0,"hello");
        Assert.assertEquals(1, hashMap.get(null));
        Assert.assertEquals("hello", hashMap.get(0));
        hashMap.put(0,"goodbye");
        Assert.assertEquals("goodbye", hashMap.get(0));
    }

}