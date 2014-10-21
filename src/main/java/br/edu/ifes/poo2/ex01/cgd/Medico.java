/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.ex01.cgd;

import java.util.ArrayList;



/**
 *
 * @author 20121bsi0082
 */
public class Medico extends Pessoa {
    
    private String crm;
    private ArrayList<Especialidade> especialidades;
    private ArrayList<HorarioAtendimento> horarios;
    private ArrayList<PlanoSaude> planos;
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
    public String obterPlanosConveniados(){
        return "";
    }
    
    public String obterHorarios(){
        return "";
    }
    
    public String obterConsultas(){
        return "";
    }
    
    
}
