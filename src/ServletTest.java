

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
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/ServletTest")
public class ServleTest extends HttpServlet {
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
                    // Gérer les autres cas si nécessaire
                    break;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer la liste des employés depuis la base de données
        List<Employe> employes = employeDAO.getAllEmployees();
        // Ajouter la liste des employés à l'objet request
        request.setAttribute("employeList", employes);
        // Transférer le contrôle à la JSP pour afficher la liste des employés
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
        response.sendRedirect("addConfirmation.jsp");
    }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        // Récupérer les autres informations mises à jour de l'employé depuis le formulaire
        // Mettre à jour l'employé dans la base de données avec les nouvelles informations
        // Rediriger vers une page de confirmation de mise à jour
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        employeDAO.deleteEmployee(email);
        response.sendRedirect("deleteConfirmation.jsp");
    }
}


