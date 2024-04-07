package com.example.servlets.ServletTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeDAO {
    private List<Employe> employes = new ArrayList<>();
   
    public EmployeDAO() {
        Employe employee1 = new Employe("chaimaa","chaimaa@gmail.com","060908776","informatique","ingenieure");
        Employe employee2 = new Employe("inas","inas@gmail.com","060908446","Physique","technicienne");
        Employe employee3 = new Employe("alae","alaa@gmail.com","060922776","Chimie","doctorante");
        
        employes.add(employee1);
        employes.add(employee2);
        employes.add(employee3);
    }

    public void addEmployee(Employe employe) {
        employes.add(employe);
    }

    public void updateEmployee(String email, Employe updatedEmploye) {
        for (int i = 0; i < employes.size(); ++i) {
            if (employes.get(i).getEmail().equals(email)) {
                employes.set(i, updatedEmploye);
                return;
            }
        }
    }

    public void deleteEmployee(String email) {
        Iterator<Employe> iterator = employes.iterator();
        while (iterator.hasNext()) {
            Employe employe = iterator.next();
            if (employe.getEmail().equals(email)) {
                iterator.remove();
                return;
            }
        }
    }

    public Employe getEmployeeByEmail(String email) {
        for (Employe employe : employes) {
            if (employe.getEmail().equals(email)) {
                return employe;
            }
        }
        return null;
    }

    public List<Employe> getAllEmployees() {
        return new ArrayList<>(employes);
    }
}
