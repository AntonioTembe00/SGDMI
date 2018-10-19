/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Computador;
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
public class ComputadorDAO {
    public boolean gravar(Computador computador){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.save(computador);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
    public boolean atualizar(Computador computador){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.update(computador);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
    public boolean remover(Computador computador){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.delete(computador);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
  
     public List<Computador> consular(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        
         Query c = sec.createQuery("from computador");
        List<Computador> list = c.list();
        if(list.size()>0){
            return c.list();
        } else{
            JOptionPane.showMessageDialog(null,"Nao encontrado!");
            return null;
        }
    }
    
}
