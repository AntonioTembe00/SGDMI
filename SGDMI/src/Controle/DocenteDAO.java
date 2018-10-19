/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Docente;
import Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Tem
 */
public class DocenteDAO {
    public boolean gravar(Docente docente){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.save(docente);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
    public boolean atualizar(Docente docente){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.update(docente);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
    public boolean remover(Docente docente){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.delete(docente);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
  
     public List<Docente> consular(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        
         Query c = sec.createQuery("from docente");
        List<Docente> list = c.list();
        if(list.size()>0){
            return c.list();
        } else{
            JOptionPane.showMessageDialog(null,"Nao encontrado!");
            return null;
        }
    }
    
}
