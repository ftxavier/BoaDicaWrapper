package br.eti.ftxavier.boadica.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import br.eti.ftxavier.boadica.model.Fabricante;

@Component
public class BoaDicaWrapperDao {
	
	@Value("${boadica.url.produtos}")
	private String boaDicaProductsUrl;

	public List<Fabricante> getManufacturers() {
		List<Fabricante> fabricantes = new ArrayList<Fabricante>();
		try {
			Document doc = Jsoup.connect(boaDicaProductsUrl).get();
			Elements links = doc.select("html body table tbody tr td font table tbody tr td a");
			for (Element link : links) {
				Fabricante fab = new Fabricante(link.text(), link.attr("href"));
				fabricantes.add(fab);
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fabricantes;
	}

}
