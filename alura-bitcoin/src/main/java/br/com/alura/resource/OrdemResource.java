package br.com.alura.resource;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import br.com.alura.repository.OrdemRepository;
import br.com.alura.model.Ordem;
import br.com.alura.service.OrdemService;

@Path("/ordens")
public class OrdemResource {

	@Inject
	OrdemService ordemService;

	@POST
	@RolesAllowed("user")
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public String inserir(@Context SecurityContext securityContext, Ordem ordem) {
		ordemService.inserir(securityContext, ordem);
		return "Ordem inserida com sucesso!";
	}

	@GET
	@RolesAllowed("admin")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Ordem> listar() {
		return ordemService.listAll();
	}
}
