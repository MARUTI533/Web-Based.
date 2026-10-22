
import java.io.*;
import java.net.*;

class ChatClientX {
  public static void main(String A[])

  {
    try {

      Socket sobj = new Socket("localhost", 5100);
      System.out.println("client gets connected with server successfully");
      PrintStream pobj = new PrintStream(sobj.getOutputStream());

      BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
      BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("marvellouse client is running");

      String str1 = null, str2 = null;
      System.out.println("enter msg for server:");
      while (!(str1 = bobj2.readLine()).equals("end")) {
        pobj.println(str1);
        str2 = bobj1.readLine();
        System.out.println("server says:" + str2);
        System.out.println("enter msg for server :");
      }
      pobj.close();
      bobj1.close();
      bobj2.close();
      sobj.close();

    } // end of try

    catch (Exception eobj) {
      System.out.println(eobj);
    }

  }// end of main
}// end of class
