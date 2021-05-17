package com.patrones.estructural.composite;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tarea implements ItemProyecto {

	private String nombre;
	private Responsable responsable;
	private int tiempoRequerido;
	private ArrayList<ItemProyecto> itemsTareas = new ArrayList<ItemProyecto>();

	public Tarea(String nombre, Responsable responsable, int tiempoRequerido) {
		this.nombre = nombre;
		this.responsable = responsable;
		this.tiempoRequerido = tiempoRequerido;
	}

	public void agregarItemTarea(ItemProyecto ipr) {
		if (!itemsTareas.contains(ipr)) {
			itemsTareas.add(ipr);
		}
	}

	@Override
	public int getTiempo() {
		int   tiempoTotal =  tiempoRequerido;
		for(ItemProyecto item : itemsTareas) {
			tiempoTotal+=item.getTiempo();
		}
		return tiempoTotal;
	}

	@Override
	public void imprimir() {
		System.out.println("\t"+ this.nombre+" Horas: " + getTiempo());
		for(ItemProyecto item : itemsTareas) {
			System.out.print("\t\t");
			item.imprimir();
		}
	}

}
