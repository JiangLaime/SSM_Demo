<%--
  Created by IntelliJ IDEA.
  User: dzz
  Date: 2022/12/7
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
    <script>
      $(function (){
        var html = "";
        $("#sd").click(function (){
          $.get("${pageContext.request.contextPath}/book/all",function (data){
            console.log(data);
            for (let i = 0; i < data.length; i++) {
              html += "<p>" + data[i].bookName + "</p>"
            }
          });
          console.log("html==" + html);
          $("#ad").html(html);
        })
      })
    </script>
  </head>
  <body>
  <input id="sd" type="button" value="caonima">
  <p id="ad">asd</p>
  </body>
</html>
