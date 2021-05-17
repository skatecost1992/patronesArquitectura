package com.patrones.estructural.composite;

public class ProgramarProyecto {

	private Proyectos miProyecto;
	private Responsable responsable1, responsable2, responsable3, responsable4, responsable5, responsable6,
			responsable7, responsable8, responsable9, responsable10, responsable11, responsable12, responsable13;

	public ProgramarProyecto() {
		creaResponsables();
		creaProeyectoPrincipal();
		creaSubProyectanAlisas();
		creaSubProDisenoI();
		creaSubProyectoDesarrollo();
		creaSubProyectanAlisas();
		creaSubproyectoPruebas();
		creaSubproyectoImplementacion();
		Proyectos miPyecto;
		miProyecto.imprimir();
	}

	public void creaResponsables() {
		responsable1 = new Responsable("LIZ", "1015432104");
		responsable2 = new Responsable("NICOLAS", "12014563322");
		responsable3 = new Responsable("ANA", "2125460213");
		responsable4 = new Responsable("VANESSA", "14211240042");
		responsable5 = new Responsable("SEBASTIAN ", "1121011");
		responsable6 = new Responsable("DIEGO", "10154321478");
		responsable7 = new Responsable("ANA", "120154320");
		responsable8 = new Responsable("DARIO", "2012540");
		responsable9 = new Responsable("JUAN", "32254100");
		responsable10 = new Responsable("CAMILO", "1254602145");
		responsable11 = new Responsable("ALVARO", "45112142");
		responsable12 = new Responsable("FRNACISCO", "395241602");
		responsable13 = new Responsable("GUZMAN", "1201355254");

	}

	public void creaProeyectoPrincipal() {
		miProyecto = new Proyectos("CREAR UN SOFTWARE", responsable1);

	}

	public void creaSubProyectanAlisas() {
		Proyectos subProyecto = new Proyectos("ANALISIS ", responsable2);
		Entregable entregable = new Entregable("DOCUEMENTO DE ANALISIS");

			Tarea tarea1 = new Tarea("IDENTIFICACION DE EMPRESAS", responsable2, 12);
				Tarea subTarea11 = new Tarea("IDENTIFICACION DE EMPRESAS", responsable3, 12);
				Tarea subTarea12 = new Tarea("IDENTIFICACION TECNICOS", responsable4, 12);
			tarea1.agregarItemTarea(subTarea12);
			tarea1.agregarItemTarea(subTarea11);
	
			Tarea tarea2 = new Tarea("LEVANTAMIENTO DE REQUERIMIENTOS", responsable5, 12);
				Tarea subTarea21 = new Tarea("IDENTIFICACION DE EMPRESAS", responsable5, 12);
				Tarea subTarea22 = new Tarea("IDENTIFICACION TECNICOS", responsable5, 12);
			tarea1.agregarItemTarea(subTarea22);
			tarea1.agregarItemTarea(subTarea21);
		
			Tarea tarea3 =new Tarea("ANALISIS DE REQUERIMIENTOS ",responsable6,12);
		
		subProyecto.agregarItemProyecto(entregable);
		subProyecto.agregarItemProyecto(tarea1);	
		subProyecto.agregarItemProyecto(tarea2);
		subProyecto.agregarItemProyecto(tarea3);
		
		miProyecto.agregarItemProyecto(subProyecto);
	}

	public void creaSubProDisenoI() {
		Proyectos subProyecto = new  Proyectos("DISENO",responsable7);
		Entregable  entregable = new Entregable("DOCUENMENTO DE DISENO");
		
			Tarea  tarea1 =  new Tarea("DISENO DE CASOS DE USO",responsable9,12);
			Tarea  tarea2 =  new Tarea("DISENO DE SECUENCIA",responsable9,25);
			Tarea  tarea3 =  new Tarea("DISENO DE UML",responsable9,12);
	    subProyecto.agregarItemProyecto(entregable);
		subProyecto.agregarItemProyecto(tarea1);	
		subProyecto.agregarItemProyecto(tarea2);
		subProyecto.agregarItemProyecto(tarea3);
		
		miProyecto.agregarItemProyecto(subProyecto);
	}



	public void creaSubProyectoDesarrollo() {
		Proyectos subProyecto = new  Proyectos("DESARROLLO",responsable7);
		Entregable  entregable = new Entregable("DESARROLLAR  CODIGO");
		Tarea  tarea1 =  new Tarea("DEFINICION DEL LENGUAJE A USAR",responsable10,50);
		Tarea  tarea2 =  new Tarea("DESARROLLAR CODIGO",responsable10,50);
			Tarea  subTarea21 =  new Tarea("CODIGO DE CAPA LOGICA",responsable11,30);
			Tarea  subTarea22 =  new Tarea("CODIGO DE CAPA DE PRESENTACION",responsable12,30);
			Tarea  subTarea23 =  new Tarea("CODIGO DE CAPA DE PRESENTACION",responsable12,30);
			
			tarea2.agregarItemTarea(subTarea21);
			tarea2.agregarItemTarea(subTarea22);
			tarea2.agregarItemTarea(subTarea23);
			
		subProyecto.agregarItemProyecto(entregable);
		subProyecto.agregarItemProyecto(tarea1);	
		subProyecto.agregarItemProyecto(tarea2);
		
		
		miProyecto.agregarItemProyecto(subProyecto);

	}

	public void creaSubproyectoPruebas() {
		Proyectos subProyecto  = new Proyectos("PRUEBAS", responsable13);
		Entregable entregable = new Entregable ("DOCUMENTO  DE ACEPTACION");
			
			Tarea tarea1 = new Tarea("REALIZAR PRUEBAS TECNCAS",responsable13,24);
			Tarea tarea2 = new Tarea("REALIZAR PRUEBAS DE USUARIO",responsable13,24);
		
		subProyecto.agregarItemProyecto(entregable);
		subProyecto.agregarItemProyecto(tarea1);
		subProyecto.agregarItemProyecto(tarea1);
		
		miProyecto.agregarItemProyecto(subProyecto);
	}
	
	public void creaSubproyectoImplementacion() {
		Proyectos subProyecto  = new Proyectos("IMPLEMENTACION", responsable13);
		Entregable entregable = new Entregable ("SOFTWARE FUNCIONANDO");
			
			Tarea tarea1 = new Tarea("CONFIGURACION DEL SERVIDOR",responsable13,24);
			Tarea tarea2 = new Tarea("IMPLEMENTACION DEL SOFTWARE",responsable13,24);
		
		subProyecto.agregarItemProyecto(entregable);
		subProyecto.agregarItemProyecto(tarea1);
		subProyecto.agregarItemProyecto(tarea1);
		
		miProyecto.agregarItemProyecto(subProyecto);
	}
	

	
}
