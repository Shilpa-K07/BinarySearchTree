public class BinaryTree<K extends Comparable<K>> {
	
	private BinaryTreeNode<K> root;
	
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}
	
	private BinaryTreeNode<K> addRecursively(BinaryTreeNode<K> current, K key){
		if(current == null)
			return new BinaryTreeNode<>(key);
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0)
			return current;
		if(compareResult < 0)
			current.left = addRecursively(current.left, key);
		else
			current.right = addRecursively(current.right, key);
		return current;
	}

	public int getSize() {
		return this.getSizeRecursively(root);
	}

	private int getSizeRecursively(BinaryTreeNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursively(current.left) 
				+ this.getSizeRecursively(current.right);
	}

	public boolean search(K key) {
		BinaryTreeNode<K> current = this.searchRecursively(this.root, key);
		if(current != null )
			return true;
		else
			return false;
	}

	private BinaryTreeNode<K> searchRecursively(BinaryTreeNode<K>root, K key) {
		while(root != null) {
			if(root.key == key || root.key == null)
				return root;
			if(root.key.compareTo(key) > 0)
				return searchRecursively(root.left, key);
			return searchRecursively(root.right, key);
		}
		return null;
	}
}
