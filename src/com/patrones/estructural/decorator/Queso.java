package com.patrones.estructural.decorator;

public class Queso extends DecoradorHamburguesa {

	private Hamburguesa hamburguesa;

	public Queso (Hamburguesa  hamburguesa) {
		this.hamburguesa = hamburguesa;
	}

	@Override
	public String getDescripcion() {
		return hamburguesa.getDescripcion() + "+Queso";

	}

}
