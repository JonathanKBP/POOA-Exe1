package aula_polimorfismo;

public class EmpregadoTipo3 extends Empregado {
	
	public EmpregadoTipo3 () {
		
	}
	public EmpregadoTipo3 (int tipo) {
		this.tipo = tipo;
	}
	public EmpregadoTipo3(double salario, double percentualComissao, double bonus) {
		this.salario = salario;
		this.percentualComissao = percentualComissao;
		this.bonus = bonus;
	}

	
	public String toString() {
		return String.format("%.2f", salario + salario + percentualComissao + bonus);
	}
	

}
