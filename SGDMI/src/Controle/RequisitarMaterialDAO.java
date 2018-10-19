/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.RequisitarMaterial;
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
public class RequisitarMaterialDAO {
         public boolean gravar(RequisitarMaterial requisitarMaterial){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.save(requisitarMaterial);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
    public boolean atualizar(RequisitarMaterial requisitarMaterial){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.update(requisitarMaterial);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
    public boolean remover(RequisitarMaterial requisitarMaterial){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.delete(requisitarMaterial);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
  
     public List<RequisitarMaterial> consultar(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        
         Query c = sec.createQuery("from requisitarmaterial");
        List<RequisitarMaterial> list = c.list();
        if(list.size()>0){
            return c.list();
        } else{
            JOptionPane.showMessageDialog(null,"Nao encontrado!");
            return null;
        }
    }
    
}
