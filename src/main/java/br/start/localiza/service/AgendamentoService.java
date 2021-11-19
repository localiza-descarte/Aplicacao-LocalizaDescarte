package br.start.localiza.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.start.localiza.dao.AgendamentoDAO;
import br.start.localiza.model.Agendamento;

@Service
public class AgendamentoService {
	
	@Autowired
	private AgendamentoDAO agendamentoDAO;
	
	// Editar Agendamento
		public Agendamento agendamentoId(Integer id_agendamento) {
			return agendamentoDAO.findById(id_agendamento).get();
		}
	
	// Salvar o Agendamento
		public Agendamento salvarAgendamento(Agendamento agendamento) {
			agendamentoDAO.save(agendamento);
			return agendamentoId (agendamento.getId_agendamento());
		}
}