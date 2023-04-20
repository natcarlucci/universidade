package Aplicacao;

import Entidade.EstudanteGraduacao;
import Entidade.EstudantePos;

public class Programa {

	public static void main(String[] args) {
		
		EstudanteGraduacao e1 = new EstudanteGraduacao();

		e1.nome = "Ana";
		e1.quantidadeDisciplinas = 5;
		e1.calcularCredito();
		e1.anoDeIngresso = 2013;
		e1.calculaAnos();
		
		EstudantePos e2 = new EstudantePos();
		
		e2.nome = "João";
		e2.quantidadeDisciplinas = 2;
		e2.anoDeIngresso = 2015;
		e2.calculaAnos();
		e2.calcularCredito();
	
	}

}
