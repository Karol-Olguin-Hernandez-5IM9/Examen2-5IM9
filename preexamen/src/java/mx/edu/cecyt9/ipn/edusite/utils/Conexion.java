/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cecyt9.ipn.edusite.utils;

/**
 *
 * @author eog
 */
import java.sql.*;
import java.util.ArrayList;
public class Conexion {
    String url;
    String User;
    String Pass;
    Connection con;
    Statement sta;
    ResultSet res;
    
    public Conexion(){
        url="jdbc:mysql://localhost/Examen2";
        User="root";
        Pass="n0m3l0";
    }
    
    public String Con(String nombre, String contra){
        String ok="No";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, User, Pass);
            sta=con.createStatement();
            
            res=sta.executeQuery("select * from Usuario where usua='"+nombre+"' and contra='"+contra+"';");
            if(res.next()){
                ok="Oka";
            }
            else{
                ok="Falso";
            }
        }
        
        catch(Exception e){
            ok=e.getMessage();
            System.out.println(e.getMessage());
        }
         
        return ok;
    }
    
    
   
    public ArrayList Mostrar(){
        ArrayList<String> M= new <String>ArrayList();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, User, Pass);
            sta=con.createStatement();
            
            res=sta.executeQuery("select * from Usuario where idrol=3;");
            while(res.next()){
                String Nom=res.getString("Nom");
                String Ap=res.getString("ApeM");
                String Am=res.getString("ApeP");
                
                int Flag=0;
                Flag= Flag + 1;
                M.add(Nom +" "+ Ap+ " "+ Am);
            }

        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return M;
         
    }
    
    public String MostrarS(){
        String M="No hay Usuarios";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, User, Pass);
            sta=con.createStatement();
            
            res=sta.executeQuery("select * from Usuario where idrol=3;");
            while(res.next()){
                String Nom=res.getString("Nom");
                String Ap=res.getString("ApeM");
                String Am=res.getString("ApeP");
                
                int Flag=0;
                Flag= Flag + 1;
                M= Nom +" "+ Ap+ " "+ Am;
            }

        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return M;
         
    }
    
     public String Insert(String Usu,String Contra, String N, String Esc, String Ap, String Am, String tel, String M, String D, int R){
        String ok="No funciona esta cosa";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, User, Pass);
            sta=con.createStatement();
            
            sta.executeUpdate("insert into Registro values('"+N+"','"+Ap+"','"+Am+"','"+Usu+"','"+Contra+"','"+tel+"','"+Esc+"','"+M+"','"+D+"','"+R+"');");
            ok="Usuario Dado de alta";
        }
        
        catch(Exception e){
            ok=e.getMessage();
            System.out.println(e.getMessage());
        }
        return ok;
    }
     
    public String IngRol(String Nom, String Ap, String Am){
        String Rol="";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, User, Pass);
            sta=con.createStatement();
            
            res=sta.executeQuery("select * from Registro where Nom='"+Nom+"' and AP='"+Ap+"' and AM='"+Am+"';");
            if(res.next()){
                String Usuario=res.getString("Usu");
                String Con=res.getString("Pas");
                
                Rol="El Usuario es:" + Nom +" " +" " +  Ap +" "+ Am +" "+ "Su Nickname: " + Usuario + " Y su contraseña: " + " " + Con;
            }
            else
                Rol="Usuario no encontrado";
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
         
        return Rol;
    }
}
