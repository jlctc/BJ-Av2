/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plist.controller;

import java.util.ArrayList;
import plist.BO.Site;
import plist.DAO.SiteDAO;

public class SiteGetSitesTable {
    
        static public String getTables() {
        
        
           //try { Class.forName("org.postgresql.Driver"); } 
            //catch (ClassNotFoundException ex) { Logger.getLogger(InserirServlet.class.getName()).log(Level.SEVERE, null, ex); }

        SiteDAO usuarioDAO = new SiteDAO();
        ArrayList<Site> lista = usuarioDAO.ler();
        String HTML = "";
        int stars = 5;

        HTML = HTML + "<table class='lerTable'>";
        HTML = HTML + "<tr class='titletr'>";
        HTML = HTML + "<td>Nome</td><td>ImgLink</td><td>Estrelas</td><td>Tipo</td>";
        HTML = HTML + "</tr>";

        for(int i=0; i< lista.size(); i++)
        {
            HTML = HTML + "<tr>";

            HTML = HTML + "<td>";
            HTML = HTML + lista.get(i).getNome();
            HTML = HTML + "</td>";
            HTML = HTML + "<td>";
            HTML = HTML + "<a href='" + lista.get(i).getLink() + "' />";
            HTML = HTML + "<img src='" + lista.get(i).getLIMG() + "' class=' tableimg' />";
            HTML = HTML + "</td>";
            HTML = HTML + "<td>";
            
            stars = (int)lista.get(i).getStars();
            
            for (int s=0;s < stars;s++){
                HTML = HTML + "<img src='Images/star.png' class='tablestars' >";
            }
            
            HTML = HTML + "</td>";
            HTML = HTML + "<td>";
            HTML = HTML + lista.get(i).getTipo();
            HTML = HTML + "</td>";

            HTML = HTML + "</tr>";
            
        }

        HTML = HTML + "<table>";
        
       

        return HTML;
        
    }


}