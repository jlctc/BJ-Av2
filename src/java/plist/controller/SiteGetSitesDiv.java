/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plist.controller;

import java.util.ArrayList;
import plist.BO.Site;
import plist.DAO.SiteDAO;    
import javax.servlet.http.Cookie;

public class SiteGetSitesDiv {
    
    
    
        static public String getBlocks() {
        
        
           //try { Class.forName("org.postgresql.Driver"); } 
            //catch (ClassNotFoundException ex) { Logger.getLogger(InserirServlet.class.getName()).log(Level.SEVERE, null, ex); }

        SiteDAO siteDAO = new SiteDAO();
        ArrayList<Site> lista = siteDAO.ler();
        String HTML = "";
        int stars = 5;

        HTML = HTML + "<div class='sitescontainer'>";

        for(int i=0; i< lista.size(); i++)
        {
            HTML = HTML + "<div class='wrapblock'>";
            HTML = HTML + "<div class='siteblockhover'>";
            HTML = HTML + "<a href='" + lista.get(i).getLink() + "' class='blocka'>";
            HTML = HTML + "<div class='blockname blockdivs'>" + lista.get(i).getNome() + "</div>";
            stars = (int)lista.get(i).getStars();
            
            HTML = HTML + "<div class='blockstars blockdivs'>";
            for (int s=0;s < stars;s++){
                HTML = HTML + "<img src='Images/star.png' class='tablestars' >";
            }
            HTML = HTML + "</div>";
            HTML = HTML + "<div class='blockdivs'>";
            HTML = HTML + lista.get(i).getTipo();
            HTML = HTML + "</div>";
            
            HTML = HTML + "</a>";
            HTML = HTML + "</div>";
            
            
            HTML = HTML + "<div class='siteblock'>";
            HTML = HTML + "<img src='" + lista.get(i).getLIMG() + "' class=' tableimg' />";
            HTML = HTML + "</div>";
            
            HTML = HTML + "</div>";
        }

        HTML = HTML + "</div>";
        
       

        return HTML;
        
    }
        
        
        
        
        static public String getBlocks(String Tipo) {
        
        
           //try { Class.forName("org.postgresql.Driver"); } 
            //catch (ClassNotFoundException ex) { Logger.getLogger(InserirServlet.class.getName()).log(Level.SEVERE, null, ex); }
        
            
        SiteDAO siteDAO = new SiteDAO();
        ArrayList<Site> lista = siteDAO.ler(Tipo);
        String HTML = "";
        int stars = 5;

        HTML = HTML + "<div class='sitescontainer'>";

        for(int i=0; i< lista.size(); i++)
        {
            HTML = HTML + "<div class='wrapblock'>";
            HTML = HTML + "<div class='siteblockhover'>";
            HTML = HTML + "<a href='" + lista.get(i).getLink() + "' class='blocka'>";
            HTML = HTML + "<div class='blockname blockdivs'>" + lista.get(i).getNome() + "</div>";
            stars = (int)lista.get(i).getStars();
            
            HTML = HTML + "<div class='blockstars blockdivs'>";
            for (int s=0;s < stars;s++){
                HTML = HTML + "<img src='Images/star.png' class='tablestars' >";
            }
            HTML = HTML + "</div>";
            HTML = HTML + "<div class='blockdivs'>";
            HTML = HTML + lista.get(i).getTipo();
            HTML = HTML + "</div>";
            
            HTML = HTML + "</a>";
            HTML = HTML + "</div>";
            
            
            HTML = HTML + "<div class='siteblock'>";
            HTML = HTML + "<img src='" + lista.get(i).getLIMG() + "' class=' tableimg' />";
            HTML = HTML + "</div>";
            
            HTML = HTML + "</div>";
        }

        HTML = HTML + "</div>";
        
       

        return HTML;
        
    }


}