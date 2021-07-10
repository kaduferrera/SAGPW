package br.edu.ifms.sagp.model.enums;

public enum OrigemEnum {
	MONTA("Monta");
	
	private final String displayValue;
	
	private OrigemEnum(String displayValue) {
        this.displayValue = displayValue;
    }
    
    public String getDisplayValue() {
        return displayValue;
    }
}
