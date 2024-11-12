package main;

import company.Employe;
import company.SocieteArrayList;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Add employees
        Employe e1 = new Employe(1, "Ben Ali", "Sami", "IT", 3);
        Employe e2 = new Employe(2, "Hammami", "Yassine", "Finance", 4);
        Employe e3 = new Employe(3, "Bouaziz", "Rania", "IT", 2);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        // Display all employees
        System.out.println("Liste des employés:");
        societe.displayEmploye();

        // Search for an employee by name
        System.out.println("\nRecherche d'un employé par nom (Ben Ali):");
        System.out.println(societe.rechercherEmploye("Ben Ali") ? "Employé trouvé" : "Employé non trouvé");

        // Sort employees by ID
        System.out.println("\nTrier les employés par ID:");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Sort employees by department name and grade
        System.out.println("\nTrier les employés par Nom Département et Grade:");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();
    }
}
