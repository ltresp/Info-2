package main;

import java.util.Map;

public class Constant implements ComputationalNode {

	private double constant;
	
	public Constant(double constant)
	{
		this.constant = constant;
	}
	
	
	@Override
	public double evaluate(String unknowns) {
		// TODO Auto-generated method stub
		return constant;
	}
	
	@Override
	public String toString()
	{
		return Double.toString(constant);
	}

	@Override
	public double evaluate(Map<String, Double> unknowns) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ComputationalNode derivative(String unknown) {
		// TODO Auto-generated method stub
		return new Constant(0);
	}

	@Override
	public ComputationalNode cleanUp() {
		// TODO Auto-generated method stub
		return new Constant(constant);
	}

	@Override
	public boolean isZero() {
		// TODO Auto-generated method stub
		return constant == 0;
	}

	@Override
	public boolean isOne() {
		// TODO Auto-generated method stub
		return constant == 1;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(constant);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Constant other = (Constant) obj;
		if (Double.doubleToLongBits(constant) != Double.doubleToLongBits(other.constant))
			return false;
		return true;
	}

}
