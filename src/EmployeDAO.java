/*import java.util.ArrayList;
import java.util.List;

public class EmployeDAO {
    private List<Employe> employes;

    public EmployeDAO() {
        employes = new ArrayList<>();
    }

    // Méthode pour ajouter un employé à la liste
    public void addEmployee(Employe employe) {
        employes.add(employe);
    }

    // Méthode pour mettre à jour un employé
    public void updateEmployee(String email, Employe updatedEmploye) {
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getEmail().equals(email)) {
                employes.set(i, updatedEmploye);
                return;
            }
        }
        // Gérer le cas où l'employé n'est pas trouvé
    }

    // Méthode pour supprimer un employé
    public void deleteEmployee(String email) {
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getEmail().equals(email)) {
                employes.remove(i);
                return;
            }
        }
        // Gérer le cas où l'employé n'est pas trouvé
    }

    // Méthode pour afficher un employé par son email
    public Employe getEmployeeByEmail(String email) {
        for (Employe employe : employes) {
            if (employe.getEmail().equals(email)) {
                return employe;
            }
        }
        return null; // Gérer le cas où l'employé n'est pas trouvé
    }

    // Méthode pour afficher tous les employés
    public List<Employe> getAllEmployees() {
        return new ArrayList<>(employes);
    }
}
*/
package test;

//
//Source code recreated from a .class file by IntelliJ IDEA
//(powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeDAO {
    private List<Employe> employes = new ArrayList();

    public EmployeDAO() {
    }

    public void addEmployee(Employe employe) {
        this.employes.add(employe);
    }

    public void updateEmployee(String email, Employe updatedEmploye) {
        for(int i = 0; i < this.employes.size(); ++i) {
            if (((Employe)this.employes.get(i)).getEmail().equals(email)) {
                this.employes.set(i, updatedEmploye);
                return;
            }
        }

    }

    public void deleteEmployee(String email) {
        for(int i = 0; i < this.employes.size(); ++i) {
            if (((Employe)this.employes.get(i)).getEmail().equals(email)) {
                this.employes.remove(i);
                return;
            }
        }

    }

    public Employe getEmployeeByEmail(String email) {
        Iterator var3 = this.employes.iterator();

        while(var3.hasNext()) {
            Employe employe = (Employe)var3.next();
            if (employe.getEmail().equals(email)) {
                return employe;
            }
        }

        return null;
    }

    public List<Employe> getAllEmployees() {
        return new ArrayList(this.employes);
    }
}

