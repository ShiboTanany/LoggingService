/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientsystem.entities;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author shibo
 */
public class RowEntity implements Serializable {

    private Integer id;
    private String rowName;
    private String rowNumber;
    private Date now;

    public RowEntity(Integer id, String rowName, String rowNumber, Date now) {
        this.id = id;
        this.rowName = rowName;
        this.rowNumber = rowNumber;
        this.now = now;
    }

    public RowEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRowName() {
        return rowName;
    }

    public void setRowName(String rowName) {
        this.rowName = rowName;
    }

    public String getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(String rowNumber) {
        this.rowNumber = rowNumber;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    @Override
    public String toString() {
        return "RowEntity{" + "id=" + id + ", rowName=" + rowName + ", rowNumber=" + rowNumber + ", now=" + now + '}';
    }

}
