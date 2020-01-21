package com.plazavea.www.question;


import com.plazavea.www.userinterfaces.MenuTelevisorNano;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ElTelevisor implements Question<Boolean>{

	 @Override
	    public Boolean answeredBy(Actor actor) {
	        return Visibility.of(MenuTelevisorNano.TXT_TVAGREGADO).viewedBy(actor).asBoolean();
	        		}

	    public static Question<Boolean> esVisible() { 
	    	return new ElTelevisor();
	    	
	}

		
}
