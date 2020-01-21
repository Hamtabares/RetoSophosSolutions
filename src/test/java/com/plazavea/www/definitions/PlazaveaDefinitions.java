package com.plazavea.www.definitions;

import org.openqa.selenium.WebDriver;

import com.plazavea.www.question.ElTelevisor;
import com.plazavea.www.tasks.Abrir;
import com.plazavea.www.tasks.Agregar;
import com.plazavea.www.tasks.Seleccionar;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class PlazaveaDefinitions {
	

	@Managed(driver = "chrome", options = "--start-maximized")
	WebDriver browser;
	Actor fabio = Actor.named("fabio");
	

	@Given("^que el usuario se encuentra en plazavea$")
	public void queElUsuarioSeEncuentraEnPlazavea() {
		fabio.can(BrowseTheWeb.with(browser));
		fabio.wasAbleTo(Abrir.laPagina());
		
	}

	@When("^el usuario selecciona opcion de televisores en electrohogar$")
	public void elUsuarioSeleccionaOpcionDeTelevisoresEnElectrohogar() {
		fabio.attemptsTo(Seleccionar.televisorNanocell());
		fabio.wasAbleTo(Agregar.alCarrito());

	}

	@Then("^el debera visualizar el carrito con su articulo agregado$")
	public void elDeberaVisualizarElCarritoConSuArticuloAgregado() {
	    fabio.should(seeThat(ElTelevisor.esVisible()));
	}


}
