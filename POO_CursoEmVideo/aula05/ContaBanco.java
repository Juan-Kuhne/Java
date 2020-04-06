package aula05;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	
	public void estadoAtual() {
		System.out.println("Conta: " + this.numConta);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Dono: " + this.dono);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Status: "+ this.status);
	}

	public void abrirConta(String t) {
		setTipo(t);
		setStatus(true);
		if(t == "CC") {
			setSaldo(50);
		}else if(t == "CP") {
			setSaldo(150);
		}
	}
	public void fecharConta() {
		if(this.saldo > 0) {
			System.out.println("Negado! Conta com dinheiro");
		}else if(this.saldo < 0 ) {
			System.out.println("Nagado! Conta em debito");
		}else {
			setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}
	public void depositar(float v) {
		if(this.status == true) {
			setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado com sucesso");
		}else {
			System.out.println("Impossivel depositar");
		}
	}
	public void sacar(float v) {
		if(this.getStatus() == true) {
			if  (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() + v);
				System.out.println("Saque realizado");
			}else {
				System.out.println("Saldo insuficiente");
			}
		}else {
			System.out.println("Impossivel sacar");
		}
	}
	public void pagarMensal() {
		float v = 0;
		if(this.getTipo() == "CC") {
			v = 12;
		}else if (this.getTipo() == "CP") {
			v = 20;
		}
		if(this.getStatus() == true) {
			if(this.getSaldo() > v) {
				setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso");
			}
		}else {
			System.out.println("Impossivel pagar");
		}
	}
	public void setNumConta(int nc) {
		this.numConta = nc;
	}
	public int getNumConta() {
		return this.numConta;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	public String getTipo() {
		return this.tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
