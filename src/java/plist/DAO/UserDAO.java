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
import plist.BO.User;

public class UserDAO {
    
    private Connection connection;
    
    public UserDAO()
    {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    
    public boolean inserir(User user)
    {
        String sql = "insert into cadastros (id, password, login, nome, adm) values (?, ?, ?, ?, ?)";
        
        try{
            //prepared statment para inserir
            PreparedStatement query = connection.prepareStatement(sql);
                
            //define os valores dos parametros
            //query.setString(1, user.getNome() ); 
            //query.setString(3, user.getLIMG() );
            //query.setString(4, user.getLink() ); 
            //query.setInt(2, user.getStars() );
            //query.setString(4, user.getTipo() ); 

            //executa
            query.execute();
            query.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        return true;
    }
    
    /**
     *
     * @param user
     * @return
     */
    public boolean atualizar(User user)
    {
        String sql = "update tb_aluno set matricula = ?, endereco = ? where nome = ?";
        
        try{
            //prepared statment para inserir
            PreparedStatement query = connection.prepareStatement(sql);
                
            //define os valores dos parametros
            //query.setInt(1, user.getStars() );
            //query.setString(2, user.getLIMG() );
            //query.setString(3, user.getNome() ); 

            //executa
            query.execute();
            query.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        return true;
    }
    
    /**
     *
     * @param user
     * @return
     */

    public ArrayList<User> ler()
    {
        String sql = "select * from cadastros";
        ArrayList<User> listUser = new ArrayList<User>();
        try{
            //prepared statment para inserir
            PreparedStatement query = connection.prepareStatement(sql);
            
            ResultSet rs =  query.executeQuery();
            
            while(rs.next())
            {
                //le os valores dos parametros
                User user = new User();
                user.setID(rs.getInt("id"));
                user.setPass(rs.getString("password"));
                user.setLogin(rs.getString("login"));
                user.setName(rs.getString("nome"));
                user.setAdm(rs.getInt("adm"));
                
                listUser.add(user);
            }
    
            //fecha
            rs.close();
            query.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listUser;
    }

}