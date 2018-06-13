package helloworldweb;

public class TestBankAccount {
	int balance = 1000;
	
	public void withdraw(int amount){
		if(balance >= amount){
			balance-=amount;
		}
	}

}
