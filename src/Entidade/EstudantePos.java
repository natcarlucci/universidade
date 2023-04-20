package Entidade;

public class EstudantePos extends EstudanteGraduacao {

	//Reescrita do metodo => Polimorfismo
	@Override
	public void calcularCredito() {
		int resultado = 2* quantidadeDisciplinas;
		System.out.println("A quantidade de créditos de "+nome+" é: "+resultado);
	}
}
