/* vector belongs to the ultility packages
default size of vector is 10
*/
public class vec {
    public static void main(String[] args) {
        vec vector = new vec();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("Element at index 1: " + vector.get(1));
        System.out.println("Size of vector: " + vector.getSize());
    }
    private int[] arr;
    private int size;
    private int capacity;

    public vec() {
        this.capacity = 10;
        this.size = 0;
        this.arr = new int[capacity];
    }

    public void add(int value) {
        if (size == capacity) {
            resize();
        }
        arr[size++] = value;
    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return arr[index];
    }

    public int getSize() {
        return size;
    }
}

/* Vector(),Vector(int sixe), Vector(int size, int incr)
Vector<Integer> v = new Vector<Integer>(3, 2);
v.size()
v.capacity()
v.addElement(5);
v.insertElementAt(6,3);
for(int k1:v)
{
    System.out.println(k1);
}
v.removeElementAt(1);
v.firstElement();
v.lastElement();
v.contains(3);
Iterator<Integer> it = v.iterator();
while(it.hasNext())
{
    System.out.println(it.next());
}

//vector can store different data types

Vector<object> v = new Vector<>(3,2);
v.addElement(new Integer(5));
v.addElement(new String("Hello"));
v.addElement(new Double(3.14));
for(Object obj : v) {
    System.out.println(obj);
}
*/
