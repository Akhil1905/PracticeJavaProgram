package StrategyDesignPattern;

public class Context {
	
	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy=strategy;
	}

	
	public float docalculation(float a, float b){
		
		return strategy.calculation(a, b);
		
	}
}
