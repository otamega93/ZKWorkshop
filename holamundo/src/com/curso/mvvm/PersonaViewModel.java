package com.curso.mvvm;

import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Execution;

import com.curso.model.entity.Persona;

public class PersonaViewModel {

	Persona persona;

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	@Init
	public void init (@ContextParam(ContextType.VIEW) Component view, 
			@ContextParam(ContextType.EXECUTION) Execution execution) {
		persona = (Persona) execution.getArg().get("persona");
	}
}
