import java.io.PrintStream;

public interface MapADT<K, V> {
    // Methods that may change the map
    boolean insert(K key, V value);
    boolean remove(K key);

    // Methods that do not change the map
    V get(K key);
    boolean contains(K key);
    boolean isEmpty();
    int getLength();
    void print(PrintStream out);
}