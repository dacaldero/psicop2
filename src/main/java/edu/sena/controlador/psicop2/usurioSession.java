/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.controlador.psicop2;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
@Named(value = "usurioSession")
@SessionScoped
public class usurioSession implements Serializable {

    /**
     * Creates a new instance of usurioSession
     */
    public usurioSession() {
    }
    
}
