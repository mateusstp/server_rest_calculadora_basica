package com.operacaobasica;
/**
 * A classe representa uma operação matemática básica (+, -, *, /) entre dois valores double. 
 * @author Mateus Oliveira dos Santos
 *
 */
public class OperacaoBasica {
	/**
	 * Atributos da classe.
	 */
	private double A;
	private double B;
	private double Resultado;
	private char Operador;
	
	/**
	 * O construtor inicialiva os atributos A, B e Resultado com zero(0.0) e
	 * o atributo Operador com a operação de adição(+).
	 */
	public OperacaoBasica(){
		A=0.0;
		B=0.0;
		Resultado=0.0;
		Operador='+';
	}

	/**O método de execução da operação básica assume que
	 * os valores dos atributos foram validados no momento de envio do JSON. 
	 * Retorna o valor da operação matemática básica(A operando B).
	 * @return double - Retorna (A operando B).  Divisão por zero retorna valor zero. 
	 *
	 */
	public double executaOperacaoBasica(){
		
		if(B==0.0 && A==0.0){
			return 0.0;
		}else if(B==0.0 && A!=0.0 && Operador=='/'){
			return 0.0;
		}
		
		switch(Operador){
			case '+': Resultado=A+B; break;
			case '-': Resultado=A-B; break;
			case '*': Resultado=A*B; break;
			case '/': Resultado=A/B; break;
			default : Resultado=0.0; break;
		}
		
		return Resultado;
	}
	public double getA() {
		return A;
	}

	public void setA(double a) {
		A = a;
	}

	public double getB() {
		return B;
	}

	public void setB(double b) {
		B = b;
	}

	public double getResultado() {
		return Resultado;
	}

	public void setResultado(double resultado) {
		Resultado = resultado;
	}

	public char getOperador() {
		return Operador;
	}

	public void setOperador(char operador) {
		Operador = operador;
	}
	/**
	 * @return String - "OperacaoBasica[A:"+A+", B: "+B+", Operador: "+Operador+", Resultado: "+Resultado+"]";
	 */
	@Override
	public String toString(){
		return "OperacaoBasica[A:"+A+", B: "+B+", Operador: "+Operador+", Resultado: "+Resultado+"]";
	}
	
	
}
