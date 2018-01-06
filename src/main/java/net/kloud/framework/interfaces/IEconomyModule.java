package net.kloud.framework.interfaces;

public interface IEconomyModule extends IModule {
	
	public void incrBal(double amount);
	public void decrBal(double amount);
	public double getBal();
	public boolean isBalSuf(double amount);
	

}
