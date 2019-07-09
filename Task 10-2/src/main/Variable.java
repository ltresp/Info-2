package main;

import java.util.Map;

public class Variable implements ComputationalNode {
	
	private String Label;
	
	public Variable(String Label)
	{
		this.Label = Label;
	}
	
	@Override
	public String toString()
	{
		return Label;
	}

	@Override
	public double evaluate(String unknowns) {
		// TODO Auto-generated method stub
		if (!unknowns.contains(Label))
			throw new IllegalArgumentException("Label not included in unknowns");
		return evaluate(ComputationalNodeHelper.parseUnknowns(unknowns));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Label == null) ? 0 : Label.hashCode());
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
		Variable other = (Variable) obj;
		if (Label == null) {
			if (other.Label != null)
				return false;
		} else if (!Label.equals(other.Label))
			return false;
		return true;
	}

	@Override
	public double evaluate(Map<String, Double> unknowns) {
		// TODO Auto-generated method stub
		return unknowns.get(Label);
		
	}

	@Override
	public ComputationalNode derivative(String unknown) {
		// TODO Auto-generated method stub
		return (Label == unknown ? new Constant(1) : new Constant(0));
	}

	@Override
	public ComputationalNode cleanUp() {
		// TODO Auto-generated method stub
		return new Variable(Label);
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
