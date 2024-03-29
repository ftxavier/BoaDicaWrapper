package br.eti.ftxavier.boadica.model;

public class Fabricante {
	private String name;
	private String url;
	
	public Fabricante(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Fabricante: {Name: "+getName()+", Url: "+getUrl()+"}";
	}
	

}
