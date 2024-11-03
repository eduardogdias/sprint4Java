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


import br.com.fiap.model.vo.Veiculo;
import br.com.fiap.model.bo.VeiculoBO;

@Path("/veiculo") 
public class VeiculoResource{
	
	private VeiculoBO veiculoBO = new VeiculoBO();

	
	//inserir (POST)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastroRs(Veiculo veiculo, @Context UriInfo uriInfo) {
		veiculoBO.inserirBO(veiculo);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(veiculo.getPlaca_veic());
		//builder.path(Integer.toString(veiculo.getPlaca_veic())); 
		return Response.created(builder.build()).build(); 
	}
	
	//atualizar (PUT)
	@PUT
	@Path("/{placa}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizaRs(Veiculo veiculo, @PathParam("placa") String placa) {
		veiculoBO.atualizarBO(veiculo);
		return Response.ok().build();
	}
	
	
	//deletar (DELETE)
	@DELETE
	@Path("/{placa}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletarRs(@PathParam("placa") String placa) {
		veiculoBO.deletarBO(placa);
		return Response.ok().build();
	}
	
	
	//consultar (GET)
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Veiculo> selecionarRs() {
		return (ArrayList<Veiculo>) veiculoBO.selecionarBO();
	}
}