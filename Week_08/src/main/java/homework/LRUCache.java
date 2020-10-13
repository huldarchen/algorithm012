package homework;

import vo.singly.DoubleList;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode: LRUcache
 *
 * @author huldar
 * @date 2020-08-31 22:25
 */
public class LRUCache {
    private final Map<Integer, DoubleList.Node> map;
    private final DoubleList doubleList;

    public LRUCache(int capacity) {
        doubleList = new DoubleList(capacity);
        map = new HashMap<>();

    }

    public int get(int key) {
        if (map.containsKey(key)) {
            DoubleList.Node node = map.get(key);
            doubleList.removeFirst(node);
            return node.getValue();
        }
        return -1;
    }


    public void put(int key, int value) {
        if (map.containsKey(key)) {
            DoubleList.Node node = map.get(key);
            node.setValue(value);
            doubleList.removeFirst(node);
        } else {
            if (doubleList.getSize() >= doubleList.getCapacity()) {
                DoubleList.Node node = doubleList.getTailNode();
                map.remove(node.getKey());
                doubleList.remove(node);
            }
            DoubleList.Node newNode = new DoubleList.Node(key, value);
            map.put(key, newNode);
            doubleList.addFirst(newNode);
        }
    }

}
