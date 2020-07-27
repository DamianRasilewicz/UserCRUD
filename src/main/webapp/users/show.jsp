<%--
  Created by IntelliJ IDEA.
  User: damian
  Date: 23.07.2020
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%@ include file="/header.jsp" %>
            <!-- Begin Page Content -->
            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="d-sm-flex align-items-center justify-content-between mb-4">
                    <h1 class="h3 mb-0 text-gray-800">userCRUD</h1>
                    <a href="/user/list" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-download fa-sm text-white-50"></i>Lista użytkowników</a>
                    <!-- UserList -->
                </div>
                <div class="col-xl-12 col-lg-7">
                    <div class="card shadow mb-4">
                        <!-- Card Header - Dropdown -->
                        <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                            <h6 class="m-0 font-weight-bold text-primary">Szczegóły użytkownika</h6>
                            <div class="dropdown no-arrow">
                            </div>
                        </div>
                        <table class="table table-hover">
                            <tr><th>Id</th><th>Nazwa użytkownika</th><th>Email</th></tr>
                               <tr><td><c:out value="${user.id}"/> </td>
                                <td><c:out value="${user.userName}"/> </td>
                                <td><c:out value="${user.email}"/> </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
            </table>
<%@ include file="/footer.jsp" %>
</html>
