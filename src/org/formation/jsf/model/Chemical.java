package org.formation.jsf.model;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Chemical {

	private String name = "";
	private String formula = "";
	private String imageUri="";
	private String danger="";

	
	public Chemical() {
		super();
	}


	public Chemical(String name, String formula, String danger) {
		super();
		this.name = name;
		this.formula = formula;
		this.danger = danger;
	}

	
	public String getDanger() {
		return danger;
	}


	public void setDanger(String danger) {
		this.danger = danger;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

}
