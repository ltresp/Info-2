package main;

public class EmptyList implements IntegerList {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("\n");
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IntegerList append(int element) {
		// TODO Auto-generated method stub
		return new Pair(element, new EmptyList());
	}

	@Override
	public int get(int index) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Index out of bounds!");
	}

	@Override
	public IntegerList insert(int element, int index) throws Exception {
		// TODO Auto-generated method stub
		if (index > 0) throw new Exception("Index out of bounds!");
		else return new Pair(element, this);
	}

	@Override
	public IntegerList deleteElement(int index) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Index out of bounds!");
	}

	@Override
	public IntegerList reversed() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public IntegerList extend(IntegerList other) {
		// TODO Auto-generated method stub
		return other;
	}

	@Override
	public int min() {
		// TODO Auto-generated method stub
		return Integer.MAX_VALUE;
	}

	@Override
	public boolean isSorted() {
		// TODO Auto-generated method stub
		return true;
	}

}
