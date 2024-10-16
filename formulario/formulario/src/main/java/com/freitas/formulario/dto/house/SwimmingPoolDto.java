package com.freitas.formulario.dto.house;

public class SwimmingPoolDto {
    private String type;
    private String size;
    private boolean heated;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isHeated() {
        return heated;
    }

    public void setHeated(boolean heated) {
        this.heated = heated;
    }
}
