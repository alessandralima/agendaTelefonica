/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

import agendatelefonica.dao.PessoaDAO;
import agendatelefonica.menu.Menu;

/**
 *
 * @author alesa
 */
public class AgendaTelefonica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu.montaMenuPrincipal();
        
        PessoaDAO pessoa = new PessoaDAO();
        
        pessoa.conectar();
                
           
    }
    
}
