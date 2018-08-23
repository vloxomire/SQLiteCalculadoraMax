package com.max.sqlitecalculadoramax.Models;

public class Operacion {
    private Integer id;
    private String operacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Operacion(Integer id, String operacion) {
        this.id = id;
        this.operacion = operacion;
    }
}
