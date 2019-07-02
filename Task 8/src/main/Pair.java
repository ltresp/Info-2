package main;

public class Pair implements IntegerList {

	private int element;
	private IntegerList rest;
	
	public Pair(int _element, IntegerList _rest)
	{
		element = _element;
		rest = _rest;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		if (rest.length() > 0)
		{
			System.out.print(element +", ");			
		}
		else
		{
			System.out.print(element);			
		}
		rest.print();
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 1+ rest.length();
	}

	@Override
	public IntegerList append(int element) {
		// TODO Auto-generated method stub
		return new Pair(this.element, rest.append(element));
	}

	@Override
	public int get(int index) throws Exception {
		// TODO Auto-generated method stub
		if (index == 0)
		{
			return element;
		}
		else
		{
			return rest.get(index -1);
		}
	}

	@Override
	public IntegerList insert(int element, int index) throws Exception {
		// TODO Auto-generated method stub
		if (index == 0)
		{
			return new Pair(element, new Pair(this.element, rest));
		}
		else
		{
			return new Pair(this.element, rest.insert(element,  index -1));
		}
	}

	@Override
	public IntegerList deleteElement(int index) throws Exception {
		// TODO Auto-generated method stub
		if (index == 0) return rest;
		else return new Pair(element, rest.deleteElement(index -1));
	}

	@Override
	public IntegerList reversed() {
		// TODO Auto-generated method stub
		return rest.reversed().append(element);
	}

	@Override
	public IntegerList extend(IntegerList other) {
		// TODO Auto-generated method stub
		return new Pair(element, rest.extend(other));
	}

	@Override
	public int min() {
		// TODO Auto-generated method stub
		return (rest.min() < element ? rest.min(): element);
	}

	@Override
	public boolean isSorted() {
		// TODO Auto-generated method stub
		return rest.isSorted() && element == min();
	}

}
