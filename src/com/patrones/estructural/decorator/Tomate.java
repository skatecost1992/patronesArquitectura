package com.patrones.estructural.decorator;

public class Tomate extends DecoradorHamburguesa{
	
	private Hamburguesa hamburguesa;
	
	public Tomate (Hamburguesa  hamburguesa) {
		this.hamburguesa = hamburguesa;
	}

	@Override
	public String getDescripcion() {
		return  hamburguesa.getDescripcion()+"+Tomate";
		
	}
}
