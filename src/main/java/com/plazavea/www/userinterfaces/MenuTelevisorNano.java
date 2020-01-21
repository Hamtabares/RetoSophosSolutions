package com.plazavea.www.userinterfaces;



import net.serenitybdd.screenplay.targets.Target;

public class MenuTelevisorNano {

	public static final Target BTN_AGREGAR = Target.the("boton agregar").locatedBy("//li[1]//div[contains(text(),'Agregar')]");
	public static final Target MSJ_CARRITO = Target.the("mensaje se agrego al carrito").locatedBy("//div[@class='minicart__snackbar minicart__snackbar--success']");
	public static final Target BTN_CARRITO = Target.the("carrito").locatedBy("//div[@class='cart__cart']");
	public static final Target TXT_TVAGREGADO = Target.the("msj carro agregado").locatedBy("//a[@class='minicart__card__name']");
	
}
