/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  Controle;

import java.util.List;
import javax.swing.JOptionPane;
import Modelo.Estudante;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import Util.HibernateUtil;
import org.hibernate.Query;

/**
 *
 * @author 
 */
public class EstudanteDAO {
      public boolean gravar(Estudante estudante){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.save(estudante);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
    public boolean atualizar(Estudante estudante){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.update(estudante);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
    public boolean remover(Estudante estudante){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.delete(estudante);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
  
     public List<Estudante> consular(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        
         Query c = sec.createQuery("from estudante");
        List<Estudante> list = c.list();
        if(list.size()>0){
            return c.list();
        } else{
            JOptionPane.showMessageDialog(null,"Nao encontrado!");
            return null;
        }
    }
     
     
}
