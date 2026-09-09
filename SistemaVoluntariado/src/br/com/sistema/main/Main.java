/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.main;

import br.com.sistema.view.FrmLogin;

import br.com.sistema.jdbc.ConnectionFactory;
import br.com.sistema.view.FrmVoluntario;
import javax.swing.JOptionPane;

/**
 *
 * @author Isabel
 */
public class Main {
    
    public static void main(String[] args){
        
       /* FrmLogin frmLogin = new FrmLogin();
          frmLogin.setVisible(true);
        */
        new FrmVoluntario().setVisible(true);
    }
    
}
