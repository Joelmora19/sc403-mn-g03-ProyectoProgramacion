/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LaHuellita.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Monserrat Najera
 */
@Data
@Entity
@Table(name="users")
public class Users implements Serializable{
    
     private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsers;
    private String fullName;
    private String userName;
    private String contraseña;
    private String telefono;
    private String genero;

    public Users() {
    }

    public Users(Long idUsers, String fullName, String userName, String contraseña, String telefono, String genero) {
        this.idUsers = idUsers;
        this.fullName = fullName;
        this.userName = userName;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.genero = genero;
    }
    
}
