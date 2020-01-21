package com.plazavea.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPlazavea {

	public static final Target BTN_ELECTRO_HOGAR=Target.the("Boton Electro Hogar").locatedBy("//li[contains(@class,'NavBar--electro')]");
	public static final Target BTN_TV_NANOCELL_TARGET= Target.the("TV Nanocell").locatedBy("//a[contains(@href,'tv-nanocell')]");
}
