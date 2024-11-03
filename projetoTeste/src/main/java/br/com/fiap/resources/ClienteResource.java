package br.com.fiap.resources;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;


import br.com.fiap.model.vo.Cliente;
import br.com.fiap.model.bo.ClienteBO;

@Path("/cliente") //nome da página
public class ClienteResource{
	
	private ClienteBO clienteBO = new ClienteBO();

	
	//inserir (POST)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastroRs(Cliente cliente, @Context UriInfo uriInfo) {
		clienteBO.inserirBO(cliente);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder(); //recebe a informação do front (página)
		builder.path(Integer.toString(cliente.getCpf_clie())); //identifica o id do campo (String)
		return Response.created(builder.build()).build(); //composição -> caminho (carrregar o que foi carregado) - http -> 200
	}
	
	//atualizar (PUT)
	@PUT
	@Path("/{cpf}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizaRs(Cliente cliente, @PathParam("cpf") int cpf) {
		clienteBO.atualizarBO(cliente);
		return Response.ok().build();
	}
	
	
	//deletar (DELETE)
	@DELETE
	@Path("/{cpf}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletarRs(@PathParam("cpf") int cpf) {
		clienteBO.deletarBO(cpf);
		return Response.ok().build();
	}
	
	
	//consultar (GET)
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Cliente> selecionarRs() {
		return (ArrayList<Cliente>) clienteBO.selecionarBO();
	}
}
