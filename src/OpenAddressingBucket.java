@SuppressWarnings("unchecked,rawtypes")
public class OpenAddressingBucket<K,V> {
    public K key;
    public V value;

    public static final OpenAddressingBucket EMPTY_SINCE_START = new OpenAddressingBucket(null, null);
    public static final OpenAddressingBucket EMPTY_AFTER_REMOVAL = new OpenAddressingBucket(null, null);

    public OpenAddressingBucket(K itemKey, V itemValue) {
        key = itemKey;
        value = itemValue;
    }

    public boolean isEmpty() {
        return this == EMPTY_SINCE_START || this == EMPTY_AFTER_REMOVAL;
    }

    public boolean isEmptyAfterRemoval() {
        return this == EMPTY_AFTER_REMOVAL;
    }

    public boolean isEmptySinceStart() {
        return this == EMPTY_SINCE_START;
    }

    @Override
    public String toString() {
        if( this == EMPTY_SINCE_START) { return "EMPTY_SINCE_START"; }
        if( this == EMPTY_AFTER_REMOVAL) { return "EMPTY_AFTER_REMOVAL"; }
        return key.toString() + " " + value.toString();
    }
}
