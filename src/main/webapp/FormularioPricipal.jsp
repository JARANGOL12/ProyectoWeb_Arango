<%-- 
    Document   : FormularioPricipal
    Created on : 28 abr. 2024, 23:02:18
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="styles.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet" />  
        <title>JSP Page</title>
    </head>
    <body>
          <aside class="sidebar">
        <div class="logo">
            <span class="text">Arango</span>
          </div>
        <form class="sidebar__form" >
            <input type="checkbox" id="open-menu">
            <label class="material-symbols-outlined" for="open-menu">close</label>
        </form>
        <picture class="sidebar__picture">
            <source s>
            <img src="arango0.jpg" alt="">
        </picture>
        <nav class="sidebar_nav">
               <ul>
                <li class="sidebar__Item">
                    <span class="material-symbols-outlined">Notifications</span>
                    <a href="AgregarUsuario.jsp">Notifications</a>
                </li>
                <li class="sidebar__Item">
                    <a href="agregarVentas.jsp"></a>
                    <span class="material-symbols-outlined">Mail</span>
                    <a href="listarUsuario">Messages</a>
                </li>
                <li class="sidebar__Item">
                    <span class="material-symbols-outlined">Shopping_cart</span>
                    <a href="#">Shopping</a>
                   
                </li>
                <li class="sidebar__Item">
                    <span class="material-symbols-outlined">account_balance</span>
                    <a href="#">Account_Balance</a>
                </li>
                <li class="sidebar__Item">
                    <span class="material-symbols-outlined">Settings</span>
                    <a href="#">Settings</a>
                </li>
              
               </ul>
        </nav>
        <div class="sidebar__profile">
            <ul>
                <li class="sidebar__Item first-item">
                    <img src="lloro.jpg" alt="">
                    <span class="profile-option">PROFILE</span>
                </li>
                <li class="sidebar__Item item--item">
                    <span class="material-symbols-outlined">logout</span>
                    <a href="#">Logout</a>
                </li>
            </ul>
        </div>
              
        
    </aside>
    </body>
</html>
