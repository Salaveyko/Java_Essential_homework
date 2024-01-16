package MyDictionary;

public class MyDictionary<K, V> {
    private Entry<K, V>[] array;
    private int size;
    private int length;

    public MyDictionary() {
        this(10);
    }

    public MyDictionary(int size) {
        this.size = size;
        array = (Entry<K, V>[]) new Entry[size];
    }

    public void put(K key, V value) {
        if (length == size) {
            increaseArray();
        }

        for (int i = 0; i < length; i++) {
            if (array[i].getKey().equals(key)) {
                array[i].setValue(value);
                return;
            }
        }

        array[length++] = new Entry<>(key, value);
    }

    public V get(K key) {
        for (int i = 0; i < length; i++) {
            if(array[i].getKey().equals(key)) return array[i].getValue();
        }
        throw new NoSuchKeyException("Key '" + key + "' not found");
    }

    public int getLength(){
        return length;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Dictionary:\n");
        for(int i = 0; i < length; i++) {
            sb.append(array[i].getKey()).append(" - ").append(array[i].getValue()).append("\n");
        }
        return sb.toString();
    }

    private void increaseArray() {
        size *= 2;
        Entry<K, V>[] newArr = (Entry<K, V>[]) new Entry[size];
        System.arraycopy(array, 0, newArr, 0, length);
        array = newArr;
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

    }
}
