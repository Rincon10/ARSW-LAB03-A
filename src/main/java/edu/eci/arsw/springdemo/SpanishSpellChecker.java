package edu.eci.arsw.springdemo;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("spanish")
public class SpanishSpellChecker implements SpellChecker {

	@Override
	public String checkSpell(String text) {
		return "revisando ("+text+") con el verificador de sintaxis del espanol";
                
                
	}

}
