package com.darwinsys.lang;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Pendiente transcribirlo TODO
 * javasrc-master/main/src/main/java/environ/GetOptDemo.java
 * Es una herramienta adecuada para el procesamiento de opcioes de linea de comandos
 * Otros métodos para trabajar con líneas de comandos: http://jakarta.apache.org/commons/cli
 */

public class GetOpt {

	/** La lista de nombres de archivo encontrados con args */
	protected List fileNameArguments;
	
	/** Conjunto de caracteristicas que se deben buscar */
	protected GetOptDesc[] options;
	
	/** Ubicación en las opciones */
	protected int optind = 0;
	
	/** Constante publica para "no hay más opciones" */
	public static final int DONE = 0;
	
	/** Indicador interno si se han realizado todas las opciones */
	protected boolean done = false;
	
	/** El argumento de opción actual */
	protected String optarg;
	
	/** Recuperar el argumento de opción actual */
	public String optarg() {
		return optarg;
	}
	
	/* Construye un analizador GetOpt, dadas las especificaciones de la opción
	 * en una matriz de objetos GetOptDesc. Éste es el constructor preferido. 
	 */
	public GetOpt(GetOptDesc[] options) {
		this.options = options;
	}
}

