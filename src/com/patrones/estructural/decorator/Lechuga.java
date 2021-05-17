package com.patrones.estructural.decorator;
	
public class Lechuga extends DecoradorHamburguesa {
	
	private Hamburguesa hamburguesa;
	
	public Lechuga (Hamburguesa  hamburguesa) {
		this.hamburguesa = hamburguesa;
	}

	@Override
	public String getDescripcion() {
		return  hamburguesa.getDescripcion()+"+Lechuga";
		
	}
}
