package org.example.dataStructures;

public class AdvancedNode<K, V> {
    K key;
    V value;
    AdvancedNode<K, V> next;

    public AdvancedNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
