package aula_polimorfismo;

public class EmpregadoTipo1 extends Empregado {
	
	public EmpregadoTipo1 () {
		
	}
	public EmpregadoTipo1 (int tipo) {
		this.tipo = tipo;
	}
	public EmpregadoTipo1(int tipo, double salario) {
		this.salario = salario;
	}

	public String toString() {
		return String.format("%.2f", salario);
	}

}
