/*
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {
    private EmployeDAO employeDAO;

    public void init() throws ServletException {
        employeDAO = new EmployeDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephone");
        String departement = request.getParameter("departement");
        String poste = request.getParameter("poste");

        Employe employe = new Employe(nom, email, telephone, departement, poste);
        employeDAO.addEmployee(employe);
    }
}*/
package test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {
    private EmployeDAO employeDAO;

    public void init() throws ServletException {
        employeDAO = new EmployeDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null) {
            switch (action) {
                case "add":
                    addEmployee(request, response);
                    break;
                case "update":
                    updateEmployee(request, response);
                    break;
                case "delete":
                    deleteEmployee(request, response);
                    break;
                default:
                    break;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employe> employes = employeDAO.getAllEmployees();

        Employe employee1 = new Employe("chaimaa","chaimaa@gmail.com","060908776","informatique","ingenieure");
        Employe employee2 = new Employe("inas","inas@gmail.com","060908446","Physique","technicienne");
        Employe employee3 = new Employe("alae","alaa@gmail.com","060922776","Chimie","doctorante");

        employes.add(employee1);
        employes.add(employee2);
        employes.add(employee3);

        request.setAttribute("employeList", employes);
        request.getRequestDispatcher("employeeList.jsp").forward(request, response);
    }


    private void addEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephone");
        String departement = request.getParameter("departement");
        String poste = request.getParameter("poste");

        Employe employe = new Employe(nom, email, telephone, departement, poste);
        employeDAO.addEmployee(employe);
    }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        // Implémentez la mise à jour de l'employé ici
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        employeDAO.deleteEmployee(email);
    }
}
