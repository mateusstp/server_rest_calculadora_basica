package com.server.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.operacaobasica.OperacaoBasica;
/**
 * Classe que implenta os médtodos de GET e POST do servisor RESTful.
 * As definições no arquivo WebContent/WEB-INF/web.xml importam a biblioteca POJOMappingFeature da API jersey-json.
 * Essa biblioteca realiza a conversão dos objetos java em JSON e vice-versa. 
 * @author Mateus Oliveira dos Santos
 *
 */
@Path("/server_op")
public class ServerRestCalc {

	/**
	 * O método gera uma operaçãõ de teste e a retorna.  
	 * @return OperacaoBasica - Retorna uma OperacaoBasica de teste (5*6=30) convertida para JSON.
	 */
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public OperacaoBasica getOperacaoBasicaJSON() {

		OperacaoBasica operacaoBasica = new OperacaoBasica();
		operacaoBasica.setA(5.0);
		operacaoBasica.setB(6.0);
		operacaoBasica.setOperador('*');
		operacaoBasica.executaOperacaoBasica();
		return operacaoBasica;
	}
	/**
	 * O métodp recebe como parâmetro um JSON convertido para uma OperacaoBasica, 
	 * efetua a operação matemática e retorna uma operação básica.
	 * @param operacaoBasica - JSON convertido para uma OperacaoBasica. 
	 * @return OperacaoBasica - OperacaoBasica convertida para um JSON.
	 */

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public OperacaoBasica postOperacaoBasicaJSON(OperacaoBasica operacaoBasica) {
		operacaoBasica.executaOperacaoBasica();
		return operacaoBasica;

	}

}
