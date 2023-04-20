package Entidade;

import java.time.Year;

public class EstudanteGraduacao {

	public String matricula; 
	public String nome; 
	public String curso;
	public int anoDeIngresso;
	public int quantidadeDisciplinas;
	public double vaorMensalidade;
	
	
	public void calcularCredito() {
		int resultado = 4* quantidadeDisciplinas;
		System.out.println("A quantidade de créditos de "+nome+" é: "+resultado);
	}
	
	public void calculaAnos() {
		int anoAtual = Year.now().getValue();
		int resultado = anoAtual - anoDeIngresso;
		System.out.println(nome+" já tem "+resultado+" anos na Universidade");
	}
}
