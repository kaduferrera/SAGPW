package br.edu.ifms.sagp.model.enums;

public enum NivelPermissaoEnum {
	
	PEAO("Peão"), 
	CAPATAZ("Capataz"), 
	COCHEIRO("Cocheiro"), 
	PROPRIETARIO("Proprietario"), 
	ADMINISTRADOR("Administrador");
	
	private final String displayValue;
	
	private NivelPermissaoEnum(String displayValue) {
        this.displayValue = displayValue;
    }
    
    public String getDisplayValue() {
        return displayValue;
    }

}
