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
		
		if(i % 3 == 0)
			respuesta = "Fizz";
		
		if(i % 5 == 0)
			respuesta += "Buzz";
		
		if(respuesta.equals(""))
			respuesta = String.valueOf(i);
		
		return respuesta;
	}

}
