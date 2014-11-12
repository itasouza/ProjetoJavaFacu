/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import javax.xml.crypto.Data;
import modelo.CadastroChamados;
/**
 *
 * @author itamar.souza
 */
public class CadastroChamadosDAO {
    private Connection connection;
    long controlealteracao ; 
    long controleusuario;  //vem da tabela usuário
    long controleempresa;  //vem da tabela empresa
    long controleservico; //vem da tabela serviço 
    String tipo;  
    String sumario;
    String descricao;
    String nomeformulario;
    String emailfuncionario;
    String severidade;
    String status; 
    String situacaochamado;
    String marca;
    Data  data_inc;
    Data data_hab;
    Data data_alt;
    String descricaoresposta;
    Time horachamado;
    
    
     public CadastroChamadosDAO(){
       //usando o sql server 2008   
       this.connection = new ConnectionFactory().getConnectionSqlServer();
       //usando o Oracle XE 
      // this.connection = new ConnectionFactory().getConnectionOracle();

    }
     
    
        public void adiciona(CadastroChamados cadastrochamados){
        String sql = "INSERT INTO TB_CADASTRO_ALTERACOES"
                + "(controleusuario,"
                + "controleempresa,"
                + "controleservico,"
                + "tipo,"
                + "sumario,"
                + "descricao,"
                + "nomeformulario,"
                + "emailfuncionario,"
                + "severidade,"
                + "status,"
                + "situacaochamado,"
                + "marca,"
                + "data_inc,"
                + "data_alt,"
                + "descricaoresposta,"
                + "horachamado) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setInt(1, (int) cadastrochamados.getControleusuario());
           stmt.setInt(2, (int) cadastrochamados.getControleempresa());
           stmt.setInt(3, (int) cadastrochamados.getControleservico());
           stmt.setString(4, cadastrochamados.getTipo());
           stmt.setString(5, cadastrochamados.getSumario() );
           stmt.setString(6, cadastrochamados.getDescricao() );
           stmt.setString(7, cadastrochamados.getNomeformulario() );
           stmt.setString(8, cadastrochamados.getEmailfuncionario() );
           stmt.setString(9, cadastrochamados.getSeveridade() );
           stmt.setString(10, cadastrochamados.getStatus());
           stmt.setString(11, cadastrochamados.getSituacaochamado());
           stmt.setString(12, cadastrochamados.getMarca());
           stmt.setDate(13, (Date) cadastrochamados.getData_inc());
           stmt.setDate(14, (Date) cadastrochamados.getData_alt());
           stmt.setString(15, cadastrochamados.getDescricaoresposta());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
     
     
}
