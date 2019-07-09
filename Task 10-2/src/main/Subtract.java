package main;

import java.util.Map;

public class Subtract implements ComputationalNode {
	
	private ComputationalNode k1;
	private ComputationalNode k2;
	
	public Subtract(ComputationalNode k1, ComputationalNode k2)
	{
		this.k1 = k1;
		this.k2 = k2;
	}
	
	public String toString()
	{
		return "("+k1.toString() + " - " + k2.toString()+")";
	}

	@Override
	public double evaluate(String unknowns) {
		// TODO Auto-generated method stub
		return k1.evaluate(unknowns) - k2.evaluate(unknowns);
	}

	@Override
	public double evaluate(Map<String, Double> unknowns) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ComputationalNode derivative(String unknown) {
		// TODO Auto-generated method stub
		return new Subtract(k1.derivative(unknown), k2.derivative(unknown));
	}

	@Override
	public ComputationalNode cleanUp() {
		// TODO Auto-generated method stub
		k1 = k1.cleanUp();
		k2 = k2.cleanUp();
		if (k1 instanceof Constant && k2 instanceof Constant)
			return new Constant(this.evaluate("i bims 1 Subtraktion"));
		else if (k2.isZero())
			return k1;
		return new Subtract(k1, k2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((k1 == null) ? 0 : k1.hashCode());
		result = prime * result + ((k2 == null) ? 0 : k2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subtract other = (Subtract) obj;
		if (k1 == null) {
			if (other.k1 != null)
				return false;
		} else if (!k1.equals(other.k1))
			return false;
		if (k2 == null) {
			if (other.k2 != null)
				return false;
		} else if (!k2.equals(other.k2))
			return false;
		return true;
	}

	@Override
	public boolean isZero() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isOne() {
		// TODO Auto-generated method stub
		return false;
	}

}
