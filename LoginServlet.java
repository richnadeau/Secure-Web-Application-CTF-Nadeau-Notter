Compiled from "LoginServlet.java"
public class com.example.log4shell.LoginServlet extends javax.servlet.http.HttpServlet {
  public com.example.log4shell.LoginServlet();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method javax/servlet/http/HttpServlet."<init>":()V
       4: return

  protected void doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) throws javax.servlet.ServletException, java.io.IOException;
    Code:
       0: aload_1
       1: ldc           #2                  // String uname
       3: invokeinterface #3,  2            // InterfaceMethod javax/servlet/http/HttpServletRequest.getParameter:(Ljava/lang/String;)Ljava/lang/String;
       8: astore_3
       9: aload_1
      10: ldc           #4                  // String password
      12: invokeinterface #3,  2            // InterfaceMethod javax/servlet/http/HttpServletRequest.getParameter:(Ljava/lang/String;)Ljava/lang/String;
      17: astore        4
      19: aload_2
      20: ldc           #5                  // String text/html
      22: invokeinterface #6,  2            // InterfaceMethod javax/servlet/http/HttpServletResponse.setContentType:(Ljava/lang/String;)V
      27: aload_2
      28: invokeinterface #7,  1            // InterfaceMethod javax/servlet/http/HttpServletResponse.getWriter:()Ljava/io/PrintWriter;
      33: astore        5
      35: aload         5
      37: ldc           #8                  // String <html><body>
      39: invokevirtual #9                  // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
      42: aload_3
      43: ldc           #10                 // String admin
      45: invokevirtual #11                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      48: ifeq          71
      51: aload         4
      53: ldc           #4                  // String password
      55: invokevirtual #11                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      58: ifeq          71
      61: aload         5
      63: ldc           #12                 // String Welcome Back Admin
      65: invokevirtual #9                  // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
      68: goto          93
      71: ldc           #13                 // class com/example/log4shell/log4j
      73: invokestatic  #14                 // Method org/apache/logging/log4j/LogManager.getLogger:(Ljava/lang/Class;)Lorg/apache/logging/log4j/Logger;
      76: astore        6
      78: aload         6
      80: aload_3
      81: invokeinterface #15,  2           // InterfaceMethod org/apache/logging/log4j/Logger.error:(Ljava/lang/String;)V
      86: aload         5
      88: ldc           #16                 // String <code> the password you entered was invalid, <u> we will log your information </u> </code>
      90: invokevirtual #9                  // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
      93: return

  public void destroy();
    Code:
       0: return
}
