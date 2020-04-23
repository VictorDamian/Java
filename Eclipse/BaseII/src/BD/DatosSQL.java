package BD;
import java.sql.*;
import javax.swing.JOptionPane;
public class DatosSQL {
	
	private Connection conn;
	private Statement stm;
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost/miBD";
	private String usr="root";
	private String psw="";
	
	public void conectar (){
		try{
			Class.forName(driver);
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "No se pudo cargar el puente mysql.jdbc");
			return;
		}
		try{
			conn = DriverManager.getConnection(url, usr, psw);
			stm = conn.createStatement();
		}catch (SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public ResultSet consultarDatos(String cadena){
		ResultSet rs=null;
		conectar();
		try{
			rs=stm.executeQuery(cadena);
			return rs;
		}catch(SQLException e){
			JOptionPane.showConfirmDialog(null, e.getMessage());
			return null;
		}	
	}
	public String ejecutarSQL(String cadena){
		conectar();
		try{
			int r=stm.executeUpdate(cadena);
			return "La operacion se realizo correctamente, se afectaron"+r+"registros";
		}catch (SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
			return null;
		}
	}
}