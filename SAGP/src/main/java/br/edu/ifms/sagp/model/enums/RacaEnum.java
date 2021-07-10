package br.edu.ifms.sagp.model.enums;

public enum RacaEnum {
	NELORE("Raça");
	
private final String displayValue;
    
    private RacaEnum(String displayValue) {
        this.displayValue = displayValue;
    }
    
    public String getDisplayValue() {
        return displayValue;
    }
}
