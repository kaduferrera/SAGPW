package br.edu.ifms.sagp.model.enums;

public enum StatusEnum {
	VIVO("Vivo"), MORTO("Morto");
	
	private final String displayValue;
	
	private StatusEnum(String displayValue) {
        this.displayValue = displayValue;
    }
    
    public String getDisplayValue() {
        return displayValue;
    }
}
