package com.example.servlets.ServletTest;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private EmployeDAO employeDAO;

    @Override
    public void init() throws ServletException {
        employeDAO = new EmployeDAO();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null) {
            switch (action) {
                case "add":
                    addEmployee(request, response);
                    List<Employe> employes = employeDAO.getAllEmployees();
                    System.out.println("Liste des employés après l'ajout :");
                    for (Employe employe : employes) {
                        System.out.println(employe.getNom() + " " + employe.getEmail());
                    }
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
         request.setAttribute("employeList", employes);
        request.getRequestDispatcher("display.jsp").forward(request, response);
    }
    
    
    private void addEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephone");
        String departement = request.getParameter("departement");
        String poste = request.getParameter("poste");

        Employe employe = new Employe(nom, email, telephone, departement, poste);
        employeDAO.addEmployee(employe);
        response.sendRedirect("ServletTest");
    }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        Employe employe = employeDAO.getEmployeeByEmail(email);
        if (employe != null) {
            employe.setNom(request.getParameter("nom"));
            employe.setTelephone(request.getParameter("telephone")); // Met à jour le téléphone
            employe.setDepartement(request.getParameter("departement"));
            employe.setPoste(request.getParameter("poste")); // Met à jour le poste
            employeDAO.updateEmployee(email, employe);
        }
        response.sendRedirect("ServletTest");
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        employeDAO.deleteEmployee(email);
        response.sendRedirect("ServletTest");
    }
}


