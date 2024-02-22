package interfaces;
import java.lang.*;
import classes.*;
import classes.Account;

public interface IAccountOperation{
	public void addMenuItem(String name, double price);
	public void removeMenuItem(String Name);
	public void searchRecipe(String Name);
	
}