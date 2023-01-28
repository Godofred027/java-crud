package com.taskcrud.crudtask.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "task")
public class TaskModel {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateCrated() {
        return dateCrated;
    }

    public void setDateCrated(Date dateCrated) {
        this.dateCrated = dateCrated;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String tittle;
    @Column
    private String description;
    @Column
    private String status;
    @Column
    private Date dateCrated;
}
