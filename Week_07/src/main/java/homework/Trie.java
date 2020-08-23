package homework;

/**
 * LeetCode-208: 前缀树的实现
 *
 * @author huldar
 * @date 2020-08-18 11:45
 */
public class Trie {

    private TrieNode root;


    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            if (!node.containsKey(ch)) {
                node.put(ch, new TrieNode());
            }
            node = node.get(ch);
        }
        node.setEnd();
    }

    public boolean search(String word) {
        TrieNode trieNode = searchPrefix(word);
        return trieNode != null && trieNode.getEnd();
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private TrieNode searchPrefix(String word) {
        TrieNode node = this.root;
        for (char ch : word.toCharArray()) {
            if (node.containsKey(ch)) {
                node = node.get(ch);
            } else {
                return null;
            }
        }
        return node;
    }


    static class TrieNode {
        private final TrieNode[] links;

        private static final int LENGTH = 26;

        private boolean isEnd;

        public TrieNode() {
            this.links = new TrieNode[LENGTH];
        }

        public boolean containsKey(char ch) {
            return links[ch - 'a'] != null;
        }

        public TrieNode get(char ch) {
            return links[ch - 'a'];
        }

        public void put(char ch, TrieNode trieNode) {
            links[ch - 'a'] = trieNode;
        }

        public void setEnd() {
            isEnd = true;
        }

        public boolean getEnd() {
            return isEnd;
        }

    }

}
