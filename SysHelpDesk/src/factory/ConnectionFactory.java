/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author itamar.souza
 */
public class ConnectionFactory {
    
           //conexão ao sql server
	public Connection getConnectionSqlServer() {
        try {
            return DriverManager.getConnection("jdbc:sqlserver://probarsrvdsv01\\ESTOQUE:1433;databaseName=ICATU_BKP","os","osame");            
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
        
  
       //conexão Oracle
	public Connection getConnectionOracle() {
        try {
            return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","os","osame");            
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
