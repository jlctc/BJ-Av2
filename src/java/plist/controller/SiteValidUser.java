/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plist.controller;

import java.util.ArrayList;
import plist.BO.User;
import plist.DAO.UserDAO;

public class SiteValidUser {
    
        static public boolean Valid(String ulogin, String usenha) {
        
        UserDAO siteDAO = new UserDAO();
        ArrayList<User> lista = siteDAO.ler();
        String login;
        String senha;
        for(int i=0; i< lista.size(); i++)
        {
            login = lista.get(i).getLogin();
            senha = lista.get(i).getPass();
            
            if (login.equals(ulogin) && usenha.equals(senha)) {
                return true;
            }
            
        }
        
        return false;
        
    }


}