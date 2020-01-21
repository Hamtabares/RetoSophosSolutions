package com.plazavea.www.tasks;

import com.plazavea.www.userinterfaces.MenuPlazavea;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Seleccionar implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(MenuPlazavea.BTN_ELECTRO_HOGAR),
						 Click.on(MenuPlazavea.BTN_TV_NANOCELL_TARGET));
	}
	
	public static Seleccionar televisorNanocell() {
		return Tasks.instrumented(Seleccionar.class);
	}

}
