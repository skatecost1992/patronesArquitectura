package com.patrones.estructural.composite;

import java.util.ArrayList;

public class Proyectos implements ItemProyecto{
	
	private String nombre;
	private Responsable responsable;
	private  ArrayList<ItemProyecto> itemsProyecto =  new ArrayList<ItemProyecto>();
	
	public  Proyectos(String nombre, Responsable responsable) {
		this.nombre =  nombre;
		this.responsable =  responsable;
	}
	
	@Override
	public int getTiempo() {
		int tiempoTotal =0;
		for(ItemProyecto item: itemsProyecto) {
			tiempoTotal +=item.getTiempo();
		}
		
		return tiempoTotal;
	}

	@Override
	public void imprimir() {
		System.out.println(getNombre()+"Horas"+getTiempo());
		for (ItemProyecto item : itemsProyecto) {
			System.out.print("\t");
			item.imprimir();
		}
					
	}
	
	public void agregarItemProyecto(ItemProyecto ipr) {
		if(!itemsProyecto.contains(ipr)) {
			itemsProyecto.add(ipr);			
		}	
	}

	public String getNombre() {
		return nombre;
	}

	
	

}
