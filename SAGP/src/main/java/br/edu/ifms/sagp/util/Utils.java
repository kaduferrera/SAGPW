package br.edu.ifms.sagp.util;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifms.sagp.model.enums.EstadoEnum;
import br.edu.ifms.sagp.model.enums.NivelPermissaoEnum;
import br.edu.ifms.sagp.model.enums.PaisEnum;

public abstract class Utils {

	public static List<String> getListSelectItemEnum(Class<? extends Enum> type){
		
		List<String> listSelectItem = new ArrayList<>();
		
		for (Enum e : type.getEnumConstants()) {
			listSelectItem.add(e.toString());
		}

		return listSelectItem;
	}
	
public static Enum getEnumPorName(Class<? extends Enum> type, String name){
		
		List<String> listSelectItem = new ArrayList<>();
		
		for (Enum e : type.getEnumConstants()) {
			if(e.name().contains(name))
				return e;
		}

		return null;
	}


}
