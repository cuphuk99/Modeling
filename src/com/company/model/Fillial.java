package com.company.model;

/*
 * @author Vlad Ishtukin
 * @project Modeling
 * @class Fillial
 * @version 1.0.0
 * @since 16.07.2021 - 09.30
 */

import java.time.LocalDateTime;
import java.util.Objects;

public class Fillial {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String address;
    private String phone;

    public Fillial() {
    }

    public Fillial(String name, String description, String address, String phone) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.phone = phone;
    }

    public Fillial(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updatedAt, String address, String phone) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.address = address;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fillial fillial = (Fillial) o;
        return getId().equals(fillial.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Fillial{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    
}
