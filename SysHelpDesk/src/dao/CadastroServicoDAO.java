/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.CadastroServico;

/**
 *
 * @author itamar.souza
 */
public class CadastroServicoDAO {
      private final Connection connection;
      long controleservico;
      String nomeservico;
    
          
     public CadastroServicoDAO(){
       //usando o sql server 2008   
       this.connection = new ConnectionFactory().getConnectionSqlServer();
       //usando o Oracle XE 
      // this.connection = new ConnectionFactory().getConnectionOracle();
    }
     
    
     
       public void adiciona(CadastroServico cadastroservico){
        String sql = "INSERT INTO TB_SERVICO"
                    + "(horachamado) VALUES(?)";
        try {

            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, cadastroservico.getNomeservico());
                stmt.execute();
            }

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
       
    /**
     *
     * @return
     * @throws SQLException
     */
    public List<CadastroServico> getList() throws SQLException{  
        String sql = "select * from TB_SERVICO";  
        List<CadastroServico> minhaLista;  
        
          try (PreparedStatement seleciona = this.connection.prepareStatement(sql)) {
              ResultSet rs = seleciona.executeQuery();
              minhaLista = new ArrayList<CadastroServico>();
            
              while(rs.next()){
                  CadastroServico cadastroservico  = new CadastroServico();
                  cadastroservico.setNomeservico(nomeservico);
                  minhaLista.add(cadastroservico);
              }    
              rs.close();
          }  
        return minhaLista;  
          
    }  
          
  
   public void altera(CadastroServico cadastroservico) throws SQLException{  
   String sql = "update TB_SERVICO set nomeservico=? where controleservico=?";  
     
          try (PreparedStatement atualisa = connection.prepareStatement(sql)) {
              atualisa.setLong(1, cadastroservico.getControleservico());
              atualisa.setString(2, cadastroservico.getNomeservico() );
              
              atualisa.execute();
          }  
        
                  
          
   }     
      
      
}
