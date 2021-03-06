package com.pro.medneanchief.model;

public class DoctorProcedureProcent {
	
    private Integer procedureId;
    private Integer procent;

    public DoctorProcedureProcent() {}

    public DoctorProcedureProcent(Integer procedureId, Integer procent) {
        this.procedureId = procedureId;
        this.procent = procent;
    }

    public Integer getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(Integer procedureId) {
        this.procedureId = procedureId;
    }

    public Integer getProcent() {
        return procent;
    }

    public void setProcent(Integer procent) {
        this.procent = procent;
    }
}
