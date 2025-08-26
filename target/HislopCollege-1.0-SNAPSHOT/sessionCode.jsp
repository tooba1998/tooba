<%
    if (session.getAttribute("session_id") == null) {
        response.sendRedirect("index.jsp?msg=Please Login First");

    }
%> 