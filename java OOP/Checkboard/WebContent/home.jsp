<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Checkerboard</title>
        <link rel="stylesheet" type="text/css" href="css/main.css">
    </head>

    <body>
        <% if (request.getParameter("width") != null && request.getParameter("height") != null) { %>
            <% 
		int columns = Integer.parseInt(request.getParameter("width")); 
		int rows = Integer.parseInt(request.getParameter("height")); 
	%>

                <!-- displaying the value http://localhost:8080/Checkboard/home.jsp?width=8&height=4 -->

                <div class="checkerboard">

                    <p>
                        <a href="http://localhost:8080/Checkboard/home.jsp">Checkerboard</a>
                    </p>

                    <h1>Checkerboard
                        <%= columns %>w x
                            <%= rows %>h </h1>

                    <!-- Columns -->
                    <% for(int row = 0; row < rows; row++) {  %>

                        <!-- Rows -->
                        <div>
                            <% if ( row % 2 == 0 ) { 
				 for(int col = 0; col < columns; col++) {
					if ( col % 2 == 1 ) { %>
                                <div class="cel blue"></div>
                                <% } else { %>
                                    <div class="cel purple"></div>
                                    <% }
					} %>
                        </div>

                        <% } else { %>

                            <div>
                                <% for(int col = 0; col < columns; col++) {
				if ( col % 2 == 1 ) { %>
                                    <div class="cel purple"></div>
                                    <% } else { %>
                                        <div class="cel blue"></div>
                                        <%}
				} %>
                            </div>

                            <% }
		} %>

                </div>
                <% } else { %>
                    <div class="checkerboard">

                        <h1>Build a new Checkerboard replacing URL params</h1>

                        <h1>Default Checkerboard 5w x 3h </h1>

                        <!-- Columns -->
                        <% for(int row = 0; row < 3; row++) {  %>

                            <!-- Rows -->
                            <div>
                                <% if ( row % 2 == 0 ) { 
				 for(int col = 0; col < 5; col++) {
					if ( col % 2 == 1 ) { %>
                                    <div class="cel blue"></div>
                                    <% } else { %>
                                        <div class="cel purple"></div>
                                        <% }
					} %>
                            </div>

                            <% } else { %>

                                <div>
                                    <% for(int col = 0; col < 5; col++) {
				if ( col % 2 == 1 ) { %>
                                        <div class="cel purple"></div>
                                        <% } else { %>
                                            <div class="cel blue"></div>
                                            <%}
				} %>
                                </div>

                                <% }
		} %>

                    </div>
                    <% } %>

    </body>

    </html>