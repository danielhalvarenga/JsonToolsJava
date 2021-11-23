package com.json.arquivo;

import java.io.FileWriter;

import org.json.simple.JSONObject;

public class JSONArquivo {

	private String nome;
	private String diretorio;

	public JSONArquivo(String nome) {
		this.nome = nome;
	}

	public JSONArquivo(String nome, String diretorio) {
		this.nome = nome;
		this.diretorio = diretorio;
	}

	public void criarArquivo(JSONObject json) {
		try {
			FileWriter fileWriter = new FileWriter(diretorio + nome + ".json");
			fileWriter.write(json.toString());
			fileWriter.close();
			System.out.println("Arquivo criado com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getNome() {
		return nome;
	}

	public String getDiretorio() {
		return diretorio;
	}
}
