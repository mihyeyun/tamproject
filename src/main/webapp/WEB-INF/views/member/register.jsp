<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ include file="../includes/header.jsp" %>
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">member Register</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                          	member Register
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                          <h1></h1>
                       		 <form action="/member/register" method="post">
                       		
                       			<div class="form-group">
                                    <label>userid</label>
                                    <input class="form-control" name="userid">
                                </div>
                                
                       			<div class="form-group">
                                    <label>username</label>
                                    <input name="username" class="form-control">
                                </div>
                                
                       			<div class="form-group">
                                    <label>userpw</label>
                                    <input class="form-control" name="userpw">
                                </div>
                       			<div class="form-group">
                                    <label>email</label>
                                    <input class="form-control" name="email">
                                </div>
                       			<div class="form-group">
                                    <label>birth</label>
                                    <input class="form-control" name="birth">
                                </div>
                       			<div class="form-group">
                                    <label>gender</label>
                                    <input class="form-control" name="gender">
                                </div>
                                <button type="submit" class="btn btn-default">Submit Button</button>
                                <button type="reset" class="btn btn-default">Reset Button</button>
                       		</form> 
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
          	<!-- row -->
          
           
     <%@ include file="../includes/footer.jsp" %>