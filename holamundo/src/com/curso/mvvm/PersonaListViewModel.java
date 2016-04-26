package com.curso.mvvm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Window;

import com.curso.model.entity.Persona;
import com.curso.model.service.IPersonaService;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class PersonaListViewModel {

	private List<Persona> personaList;
	private Persona selectedPersona;
	private String name;
	
	@WireVariable
	IPersonaService personaService;
	
	@Command
	@NotifyChange("personaList")
	public void search() {
		personaList = personaService.findAll();
	}
	
	@Command
	@NotifyChange("personaList")
	public void addPersona() {
		personaService.addPersona(name);
	}

	@Command
	@NotifyChange({"selectedPersona", "personaList"})
	public void edit() {
		if (selectedPersona != null) {
			Map parameters = new HashMap();
			parameters.put("persona", selectedPersona);
			Component zulComponent = Executions.createComponents("encabezadodetalle.zul", null, parameters);
			if (zulComponent instanceof Window) {
				Window window = (Window) zulComponent;
				window.doModal();
			}
		}
	}
	
	public List<Persona> getPersonaList() {
		return personaList;
	}

	public void setPersonaList(List<Persona> personaList) {
		this.personaList = personaList;
	}

	public Persona getSelectedPersona() {
		return selectedPersona;
	}

	public void setSelectedPersona(Persona selectedPersona) {
		this.selectedPersona = selectedPersona;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
