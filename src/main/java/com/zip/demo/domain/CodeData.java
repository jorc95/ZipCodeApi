/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zip.demo.domain;

import lombok.Data;

/**
 *
 * @author T470P
 */

@Data
public class CodeData {
    String d_codigo;
    String d_asenta;
    String d_tipo_asenta;
    String D_mnpio;
    String d_estado;
    String d_ciudad;
    String d_CP;
    String c_estado;
    String c_oficina;
    String c_CP;
    String c_tipo_asenta;
    String c_mnpio;
    String id_asenta_cpcons;
    String d_zona;
    String c_cve_ciudad;

    public void setAll(String data[]){
       
        this.setD_codigo(data[0]);
        this.setD_asenta(data[1]);
        this.setD_tipo_asenta(data[2]);
        this.setD_mnpio(data[3]);
        this.setD_estado(data[4]);
        this.setD_ciudad(data[5]);
        this.setD_CP(data[6]);
        this.setC_estado(data[7]);
        this.setC_oficina(data[8]);
        this.setC_CP(data[9]);
        this.setC_tipo_asenta(data[10]);
        this.setC_mnpio(data[11]);
        this.setId_asenta_cpcons(data[12]);
        this.setD_zona(data[13]);
        // cuando el valor al final de la fila es vacio es representado | en vez de || 
        // para esos casos la longitud del arreglo es menor
        try{
            this.setC_cve_ciudad(data[14]);
        }catch(java.lang.ArrayIndexOutOfBoundsException exception){
            this.setC_cve_ciudad("");
        }
    }

}
