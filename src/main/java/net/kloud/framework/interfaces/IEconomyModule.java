package net.kloud.framework.interfaces;

public interface IEconomyModule extends IModule {
	
	public void incrBal(double amount, String accountHolder);
	public void decrBal(double amount, String accountHolder);
	public double getBal(String accountHolder);
	public boolean isBalSuf(double amount, String accountHolder);
	

}
