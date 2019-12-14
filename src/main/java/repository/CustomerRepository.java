package repository;

import customer.Customer;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {

    private final String servername="localhost";
    private final String database="practice";
    private final String  user="host";
    private final String password="4405";
    private final String serverencoding="UTF-8";
    private final String url="jdbc:mysql://localhost:3306/"+database;
    private final String select ="select * from customer";


    public List<Customer> getAllCustomerInfo(){
        List<Customer> list = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection(url,user,password);
                PreparedStatement ps =connection.prepareStatement(select)){

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  list;
    }



}
