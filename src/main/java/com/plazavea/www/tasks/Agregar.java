package com.plazavea.www.tasks;


import com.plazavea.www.userinterfaces.MenuTelevisorNano;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Agregar implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(MenuTelevisorNano.BTN_AGREGAR),
						Click.on(MenuTelevisorNano.BTN_CARRITO));
		
	}
	
	public static Agregar alCarrito() {
		return Tasks.instrumented(Agregar.class);
		
	}

}
