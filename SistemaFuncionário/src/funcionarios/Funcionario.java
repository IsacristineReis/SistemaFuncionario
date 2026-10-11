package funcionarios;

public abstract class Funcionario<T> {

	protected int id;
	protected T nome;
	protected double salario;
	
	public Funcionario(int id, T nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public abstract double bonus();
	
	public Funcionario() {
		
	}
	
	public T getNome() {
		return nome;
	}
	
	public void setNome(T nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
