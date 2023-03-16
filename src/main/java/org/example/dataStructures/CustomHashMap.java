package org.example.dataStructures;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Optional;

public class CustomHashMap<K, V> {

    private final ArrayList<LinkedList<Node<K, V>>> arrayList;
    private int capacity;

    public CustomHashMap(int capacity){
        this.setCapacity(capacity);
        this.arrayList =  new ArrayList<>(capacity);

        //TODO Very ugly implementation, improve at some point
        while (arrayList.size() < capacity) {
            arrayList.add(null);
        }
    }

    public void put(K key, V value){
        int arrayIndex = this.getHashIndex(key);
        LinkedList<Node<K, V>> linkedList = arrayList.get(arrayIndex);
        Node<K, V> node = new Node<>(key, value);

        if (linkedList == null){
            linkedList = new LinkedList<>();
        }

        linkedList.add(node);

        this.arrayList.add(arrayIndex, linkedList);
    }

    public Optional<V> get(K key){
        int arrayIndex = getHashIndex(key);
        LinkedList<Node<K, V>> linkedList = arrayList.get(arrayIndex);


        if (linkedList!=null){
            for (Node<K, V> node : linkedList) {
                if (node.key==key){
                    return Optional.of(node.value);
                }
            }
        }

        return Optional.empty();
    }

    private int getHashIndex(K key){
        int hashCode = key.hashCode();
        return hashCode % capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

    private void setCapacity(int capacity){
        this.capacity = capacity;
    }
}
