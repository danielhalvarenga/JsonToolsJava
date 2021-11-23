package com.json.leitura;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.json.arquivo.JSONArquivo;

public class JSONLeitura {

	private JSONArquivo arquivo;

	public JSONLeitura(JSONArquivo arquivo) {
		this.arquivo = arquivo;
	}

	public HashMap<String, Object> lerArquivo(JSONArquivo arquivo) {
		String diretorio = arquivo.getNome();
		if(arquivo.getDiretorio() != null) {
			diretorio = arquivo.getDiretorio() + diretorio;
		}
		try {
			JSONObject jsonObject = (JSONObject) new JSONParser().parse(new FileReader(diretorio));
			Set<String> key = jsonObject.keySet();
			
			
			HashMap<String, Object> lista = new HashMap<>();
			lista.put(diretorio, lista)
			
			return null;
		} catch (IOException | ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

}
