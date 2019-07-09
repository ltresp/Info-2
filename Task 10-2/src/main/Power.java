package main;

import java.util.Map;

public class Power implements ComputationalNode {
	
	private ComputationalNode x;
	private double power;
	
	public Power(ComputationalNode x, double power)
	{
		this.x = x;
		this.power = power;
	}
	
	public String toString()
	{
		return x.toString() + "^" + Double.toString(power);
	}

	@Override
	public double evaluate(String unknowns) {
		// TODO Auto-generated method stub
		return Math.pow(x.evaluate(unknowns), power);
	}

	@Override
	public double evaluate(Map<String, Double> unknowns) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ComputationalNode derivative(String unknown) {
		// TODO Auto-generated method stub
		return new Multiply(new Multiply(new Constant(power), new Power(x, power-1)), x.derivative(unknown));
	}

	@Override
	public ComputationalNode cleanUp() {
		// TODO Auto-generated method stub
		x = x.cleanUp();
		if (x.isZero())
			return new Constant(0);
		else if (x.isOne())
			return new Constant(1);
		else if (power == 0)
			return new Constant(1);
		else if (power == 1)
			return x;
		return new Power(x, power);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(power);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((x == null) ? 0 : x.hashCode());
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
		Power other = (Power) obj;
		if (Double.doubleToLongBits(power) != Double.doubleToLongBits(other.power))
			return false;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
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
