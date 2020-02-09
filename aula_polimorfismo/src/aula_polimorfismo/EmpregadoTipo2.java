package aula_polimorfismo;

public class EmpregadoTipo2 extends Empregado {
	
	public EmpregadoTipo2 () {
		
	}
	
	public EmpregadoTipo2 (int tipo) {
		this.tipo = tipo;
	}
	
	public EmpregadoTipo2(int tipo, double salario, double percentualComissao) {
		this.salario = salario;
		this.percentualComissao = percentualComissao;
	}

	public String toString() {
		return String.format("%.2f", salario + salario * percentualComissao);
	}

}
