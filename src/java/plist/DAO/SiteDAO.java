/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plist.DAO;

import plist.conn.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import plist.BO.Site;

public class SiteDAO {
    
    private Connection connection;
    
    public SiteDAO()
    {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    
    public boolean inserir(Site site)
    {
        String sql = "insert into site (nome, limg, link, estrelas, tipo) values (?, ?, ?, ?)";
        
        try{
            //prepared statment para inserir
            PreparedStatement query = connection.prepareStatement(sql);
                
            //define os valores dos parametros
            query.setString(1, site.getNome() ); 
            query.setString(3, site.getLIMG() );
            query.setString(4, site.getLink() ); 
            query.setInt(2, site.getStars() );
            query.setString(4, site.getTipo() ); 

            //executa
            query.execute();
            query.close();
        } catch (SQLException ex) {
            Logger.getLogger(SiteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        return true;
    }
    
    /**
     *
     * @param site
     * @return
     */
    public boolean atualizar(Site site)
    {
        String sql = "update tb_aluno set matricula = ?, endereco = ? where nome = ?";
        
        try{
            //prepared statment para inserir
            PreparedStatement query = connection.prepareStatement(sql);
                
            //define os valores dos parametros
            query.setInt(1, site.getStars() );
            query.setString(2, site.getLIMG() );
            query.setString(3, site.getNome() ); 

            //executa
            query.execute();
            query.close();
        } catch (SQLException ex) {
            Logger.getLogger(SiteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        return true;
    }
    
    /**
     *
     * @param site
     * @return
     */
    public boolean excluir(Site site)
    {
        String sql = "delete from tb_aluno where nome = ? ";
        
        try{
            //prepared statment para inserir
            PreparedStatement query = connection.prepareStatement(sql);
                
            //define os valores dos parametros
            query.setString(1, site.getNome() );    

            //executa
            query.execute();
            query.close();
        } catch (SQLException ex) {
            Logger.getLogger(SiteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        return true;
    }

    public ArrayList<Site> ler()
    {
        String sql = "select * from site";
        ArrayList<Site> listSite = new ArrayList<Site>();
        try{
            //prepared statment para inserir
            PreparedStatement query = connection.prepareStatement(sql);
            
            ResultSet rs =  query.executeQuery();
            
            while(rs.next())
            {
                //le os valores dos parametros
                Site site = new Site();
                site.setNome(rs.getString("nome"));
                site.setLIMG(rs.getString("limg"));
                site.setLink(rs.getString("link"));
                site.setStars(rs.getInt("estrelas"));
                site.setTipo(rs.getString("tipo"));
                
                listSite.add(site);
            }
    
            //fecha
            rs.close();
            query.close();
        } catch (SQLException ex) {
            Logger.getLogger(SiteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listSite;
    }
    public ArrayList<Site> ler(String Tipo)
    {
        String sql = "select * from site where tipo = '" + Tipo +"'" ;
        ArrayList<Site> listSite = new ArrayList<Site>();
        try{
            //prepared statment para inserir
            PreparedStatement query = connection.prepareStatement(sql);
            
            ResultSet rs =  query.executeQuery();
            
            while(rs.next())
            {
                //le os valores dos parametros
                Site site = new Site();
                site.setNome(rs.getString("nome"));
                site.setLIMG(rs.getString("limg"));
                site.setLink(rs.getString("link"));
                site.setStars(rs.getInt("estrelas"));
                site.setTipo(rs.getString("tipo"));
                
                listSite.add(site);
            }
    
            //fecha
            rs.close();
            query.close();
        } catch (SQLException ex) {
            Logger.getLogger(SiteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listSite;
    }

}