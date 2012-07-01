package com.solveet;

public class FizzBuzz {
	public String generaResultados(int n){
		String resultado = "";
		
		for(int i = 1; i <= n; i++){
			resultado += this.obtieneRespuesta(i) + "\n";
		}
		
		return resultado;
	}

	public String obtieneRespuesta(int i){
		String respuesta = "";
		
		if(i % 3 == 0 || this.contiene(i, "3"))
			respuesta = "Fizz";
		
		if(i % 5 == 0 || this.contiene(i, "5"))
			respuesta += "Buzz";
		
		if(respuesta.equals(""))
			respuesta = String.valueOf(i);
		
		return respuesta;
	}

	private boolean contiene(int i, String aguja) {
		String iString = String.valueOf(i);
		
		if(iString.contains(aguja))
			return true;
		
		return false;
	}

}
