package com.plazavea.www.tasks;

import com.plazavea.www.userinterfaces.PaginaInicialPlazavea;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(new PaginaInicialPlazavea()));
	}

	public static Abrir laPagina() {
		return Tasks.instrumented(Abrir.class);
		}
}
