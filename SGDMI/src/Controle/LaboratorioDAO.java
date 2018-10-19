/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Laboratorio;
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
public class LaboratorioDAO {
     public boolean gravar(Laboratorio laboratorio){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.save(laboratorio);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
    public boolean atualizar(Laboratorio laboratorio){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.update(laboratorio);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
    public boolean remover(Laboratorio laboratorio){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.delete(laboratorio);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
  
     public List<Laboratorio> consular(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        
         Query c = sec.createQuery("from laboratorio");
        List<Laboratorio> list = c.list();
        if(list.size()>0){
            return c.list();
        } else{
            JOptionPane.showMessageDialog(null,"Nao encontrado!");
            return null;
        }
    }
    
}
