
import org.junit.*;

public class HashTableClassTest {

    @Test
    public void testPut() {
        HashTableClass hashTable = new HashTableClass(5);
        hashTable.put(0,0);
        hashTable.put(4,10);
        Assert.assertEquals(0, hashTable.get(0));
        Assert.assertEquals(10, hashTable.get(4));
        hashTable.put(4,5);
        Assert.assertEquals(5, hashTable.get(4));
        hashTable.put(9,10);
        Assert.assertEquals(10, hashTable.get(9));
        Assert.assertEquals(5, hashTable.get(4));
    }

    @Test
    public void testRemove() {
        HashTableClass hashTable = new HashTableClass(5);
        hashTable.put(0,0);
        hashTable.put(1,2);
        hashTable.put(2,4);
        hashTable.put(3,6);
        hashTable.put(4,8);
        hashTable.put(9,10);
        Assert.assertEquals(0, hashTable.remove(0));
        Assert.assertEquals(4, hashTable.remove(2));
        Assert.assertEquals(8, hashTable.remove(4));
        Assert.assertEquals(10, hashTable.remove(9));
    }


    @Test
    public void testGetFoundItem() {
        HashTableClass hashTable = new HashTableClass(5);
        hashTable.put(0,0);
        hashTable.put(1,2);
        hashTable.put(6,4);
        Assert.assertEquals(2, hashTable.get(1));
        Assert.assertEquals(4, hashTable.get(6));
    }

    @Test
    public void testGetNotFoundItem() {
        HashTableClass hashTable = new HashTableClass(5);
        hashTable.put(0,0);
        hashTable.put(1,2);
        hashTable.put(6,4);
        Assert.assertEquals(null, hashTable.get(2));
    }


    @Test
    public void testGetIndex() {
        HashTableClass hashTable = new HashTableClass(5);
        Assert.assertEquals(2, hashTable.getIndex(2));
        hashTable.put(2,0);
        Assert.assertEquals(2, hashTable.getIndex(-2));
        hashTable.put(-2,1);
        Assert.assertEquals(2, hashTable.getIndex(7));
        hashTable.put(7,2);
        Assert.assertEquals(0, hashTable.get(2));
        Assert.assertEquals(1, hashTable.get(-2));
        Assert.assertEquals(2, hashTable.get(7));
    }

    @Test
    public void testContainsFoundItem() {
        HashTableClass hashTable = new HashTableClass(5);
        hashTable.put(0,0);
        hashTable.put(1,2);
        Assert.assertEquals(true, hashTable.contains(1));
    }

    @Test
    public void testContainsNotFoundItem() {
        HashTableClass hashTable = new HashTableClass(5);
        hashTable.put(0,0);
        hashTable.put(1,2);
        Assert.assertEquals(false, hashTable.contains(2));
    }



}