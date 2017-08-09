package org.formation.jsf.model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="ChemicalList")
@SessionScoped
public class ChemicalList {
	
	private String imgCorrosif="resources/img/corrosif.png";
	private String imgSmiley="resources/img/smiley.png";
	private String imgToxique="resources/img/toxique.png";
	
	private String corrosif="Corrosif";
	private String toxique="Toxique";
	private String smiley="Sans risque";
	
	private List<Chemical> chemicalItems = new ArrayList<>();

	
	
	public ChemicalList() {
		super();
		this.reset();
	}

	public List<Chemical> getChemicalItems() {
		return chemicalItems;
	}

	public void setChemicalItems(List<Chemical> chemicalItems) {
		this.chemicalItems = chemicalItems;
	}
	
	public void reset() {
		chemicalItems.add(new Chemical("Soude", "NaOH", corrosif));
		chemicalItems.add(new Chemical("benzene", "C6H6", toxique));
		chemicalItems.add(new Chemical("Eau", "H2O", smiley));
	}
	
	public void addChemical(String name,String formula,String imageUri) {
		chemicalItems.add(new Chemical(name, formula, imageUri));
	}
	

}
