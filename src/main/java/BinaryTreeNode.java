public class BinaryTreeNode<K extends Comparable<K>> implements NodeInf<K>{
	K key;
	BinaryTreeNode<K> left;
	BinaryTreeNode<K> right;
	
	public BinaryTreeNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
	
	public BinaryTreeNode<K> getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode<K> left) {
		this.left = left;
	}

	public BinaryTreeNode<K> getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode<K> right) {
		this.right = right;
	}
	
	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key =key;
	}

	@Override
	public NodeInf getNext() {
		return null;
	}

	@Override
	public void setNext(NodeInf next) {
		
	}
}
