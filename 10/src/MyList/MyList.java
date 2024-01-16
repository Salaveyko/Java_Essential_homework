package MyList;

public class MyList<T> {
    private T[] array;
    private int length;
    private int size;

    public MyList() {
        this(10);
    }

    public MyList(int size) {
        this.size = size;
        length = 0;
        array = (T[]) new Object[size];
    }

    public int add(T obj) {
        if (length == size) {
            increaseArraySize();
        }
        array[length] = obj;

        return length++;
    }

    public T get(int index) {
        if (index < 0 || index >= length)
            throw new ArrayIndexOutOfBoundsException("Incorrect index.");

        return array[index];
    }

    public int getLength() {
        return length;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyList { ");
        for (int i = 0; i < length; i++) {
            sb.append(array[i]).append(" ");
        }
        sb.append("}");

        return sb.toString();
    }

    private void increaseArraySize() {
        size *= 2;
        T[] newArr = (T[]) new Object[size];
        System.arraycopy(array, 0, newArr, 0, length);
        array = newArr;
    }
}
