package jdbc.demodaojdbc.application;

import jdbc.demodaojdbc.model.dao.DaoFactory;
import jdbc.demodaojdbc.model.dao.DepartmentDao;
import jdbc.demodaojdbc.model.dao.SellerDao;
import jdbc.demodaojdbc.model.entities.Department;
import jdbc.demodaojdbc.model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // A factory centraliza a criação dos DAOs e evita acoplamento com as implementações JDBC.
            SellerDao sellerDao = DaoFactory.createSellerDao();
            DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

            System.out.println("=== TEST 1: seller findById ===");
            Seller seller = sellerDao.findById(3);
            System.out.println(seller);

            System.out.println("\n=== TEST 2: seller findByDepartment ===");
            Department department = new Department(2, null);
            List<Seller> list = sellerDao.findByDepartment(department);
            for (Seller sellerObj : list) {
                System.out.println(sellerObj);
            }

            System.out.println("\n=== TEST 3: seller findAll ===");
            list = sellerDao.findAll();
            for (Seller sellerObj : list) {
                System.out.println(sellerObj);
            }

            System.out.println("\n=== TEST 4: seller insert ===");
            Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
            sellerDao.insert(newSeller);
            System.out.println("Inserted! New id = " + newSeller.getId());

            System.out.println("\n=== TEST 5: seller update ===");
            seller = sellerDao.findById(1);
            seller.setName("Martha Waine");
            sellerDao.update(seller);
            System.out.println("Update completed");

            System.out.println("\n=== TEST 6: seller delete ===");
            System.out.print("Enter id for delete test: ");
            int id = sc.nextInt();
            sellerDao.deleteById(id);
            System.out.println("Delete completed");

            System.out.println("\n=== TEST 7: department insert ===");
            Department newDepartment = new Department(null, "Music");
            departmentDao.insert(newDepartment);
            System.out.println("Inserted! New id = " + newDepartment.getId());

            System.out.println("\n=== TEST 8: department update ===");
            department = departmentDao.findById(1);
            department.setName("Books");
            departmentDao.update(department);
            System.out.println("Update completed");

            System.out.println("\n=== TEST 9: department delete ===");
            System.out.print("Enter id for delete test: ");
            id = sc.nextInt();
            departmentDao.deleteById(id);
            System.out.println("Delete completed");

            System.out.println("\n=== TEST 10: department findAll ===");
            List<Department> departmentList = departmentDao.findAll();
            for (Department departmentObj : departmentList) {
                System.out.println(departmentObj);
            }

            System.out.println("\n=== TEST 11: department findById ===");
            department = departmentDao.findById(2);
            System.out.println(department);
        }
    }
}
