public class ContaPoupanca extends Conta{
	void atualiza(double taxa){
		this.saldo += this.saldo * taxa * 3;	
	}


}
