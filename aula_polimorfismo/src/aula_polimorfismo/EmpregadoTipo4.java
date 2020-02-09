package aula_polimorfismo;

public class EmpregadoTipo4 extends Empregado {

	public EmpregadoTipo4 () {
		
	}
	public EmpregadoTipo4 (int tipo) {
		this.tipo = tipo;
	}

	public EmpregadoTipo4(double bonus) {
		this.bonus = bonus;
	}

	public String toString() {
		return String.format("%.2f", bonus);
	}
}
