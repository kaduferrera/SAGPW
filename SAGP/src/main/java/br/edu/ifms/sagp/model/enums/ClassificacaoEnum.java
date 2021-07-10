package br.edu.ifms.sagp.model.enums;

public enum ClassificacaoEnum {
BEZERRO("Bezerro"), BOI("Boi"), BEZERRA("Bezerra"), NOVILHA("Novilha");
	
	private final String displayValue;
	
	private ClassificacaoEnum(String displayValue) {
        this.displayValue = displayValue;
    }
    
    public String getDisplayValue() {
        return displayValue;
    }
}
