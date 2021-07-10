package br.edu.ifms.sagp.model.enums;

public enum PaisEnum {
	
	BRASIL("Brasil");
	
	private final String displayValue;
	
	private PaisEnum(String displayValue) {
        this.displayValue = displayValue;
    }
    
    public String getDisplayValue() {
        return displayValue;
    }

}
