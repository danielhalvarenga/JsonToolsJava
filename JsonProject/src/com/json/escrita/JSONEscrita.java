package com.json.escrita;

import java.util.HashMap;

import org.json.simple.JSONObject;

import com.json.arquivo.JSONArquivo;

public class JSONEscrita {

	private JSONArquivo arquivo;
	
	public JSONEscrita(JSONArquivo arquivo, HashMap<String, Object> lista) {
		this.arquivo = arquivo;
		escreverArquivo(lista);
	}
	
	@SuppressWarnings("unchecked")
	private void escreverArquivo(HashMap<String, Object> lista) {
		if(lista == null || lista.isEmpty()) {
			System.out.println("Não foram encontrados registros na lista.");
			return;
		}
		JSONObject json = new JSONObject();
		lista.forEach((key, objeto) -> {
			json.put(key, objeto);
		});
		arquivo.criarArquivo(json);
	}
}
