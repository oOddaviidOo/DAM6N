package practica8ad;

import java.sql.*;

public class U2_P8_5_Statement {

    public static void main(String[] args) {
        
        try {

            Class.forName("org.sqlite.JDBC");

            Connection con = DriverManager.getConnection("jdbc:sqlite:G:/ProyectosAD/Directorio con las Bases/clase/bases/sqlite/ejemplo.db");

             String sql = "select loc,count(profesores.nrp),AVG(profesores.sueldo) from departamentos inner join profesores where departamentos.dept_no=profesores.dept_no group by departamentos.dept_no";

                java.sql.Statement s = con.createStatement();
                ResultSet r = s.executeQuery(sql);

                con.close();
        

        } catch (Exception e) {
        }

    }

}
