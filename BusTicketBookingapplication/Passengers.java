
package busticketbookingapplication;

public class Passengers {
    public void passdisplay()
    {
        try
            {
            Class.forName("com.mysql.jdbc.Driver");
            String sql="SELECT * FROM passengerdetails";
            java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/busticketmanagement?zeroDateTimeBehavior=convertToNull","root","");
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);
            java.sql.ResultSet r=ps.executeQuery();
            while(true)
            {
                if(r.next())
                {
                    System.out.println("-------------------------------------");
                    System.out.println("USERNAME        : "+r.getString("username"));
                    System.out.println("TRAVELSTATE     : "+r.getString("travelstate"));
                    System.out.println("PRICE           : "+r.getString("price"));
                    System.out.println("NO OF PASSENGER : "+r.getString("noofpassenger"));
                    System.out.println("======================================");
                }
                else
                {
                    System.err.println("           >>>   NOTHING MORE   <<<            ");
                    break;

                }
            }
            
        }catch(Exception e){}
    }
}
