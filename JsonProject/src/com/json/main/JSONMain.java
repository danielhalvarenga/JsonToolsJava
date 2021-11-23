package com.json.main;

import java.util.Arrays;
import java.util.HashMap;

import com.json.arquivo.JSONArquivo;
import com.json.escrita.JSONEscrita;

public class JSONMain {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("nome", "Daniel");
		map.put("idade", 20);
		map.put("celular", Arrays.asList("172836217836", "wkljwqlekj"));
		
		new JSONEscrita(new JSONArquivo("arquivoNome", "D:\\java_projects\\"), map);
	}

}
