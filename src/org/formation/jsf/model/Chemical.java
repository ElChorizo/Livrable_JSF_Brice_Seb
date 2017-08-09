package org.formation.jsf.model;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Chemical {

	private String name = "";
	private String formula = "";
	private String imageUri="resources/img/corrosif.png";

	

	
	public Chemical() {
		super();

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
