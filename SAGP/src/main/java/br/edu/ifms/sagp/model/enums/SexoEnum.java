package br.edu.ifms.sagp.model.enums;

public enum SexoEnum {
	MACHO("Macho"), FEMEA("Fêmea");
	
	private final String displayValue;
	
	private SexoEnum(String displayValue) {
        this.displayValue = displayValue;
    }
    
    public String getDisplayValue() {
        return displayValue;
    }
}
