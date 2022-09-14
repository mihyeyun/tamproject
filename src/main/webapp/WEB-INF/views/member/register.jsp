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
                       		 <form id="register_form" method="post">
                       		
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
                                	<input type="date" class="form-control" value="<fmt:formatDate value="${birth}" pattern = "yyyy-MM-dd"/>">
                                </div>
                       			<div class="form-group">
                                    <label>gender</label>
                                    <input class="form-control" name="gender">
                                </div>
                                <button type="button" class="register_button btn btn-default">Submit Button</button>
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
<script type="text/javascript">
	$(document).ready(function(){
		//회원가입 버튼(회원가입 기능 작동)
		$(".register_button").click(function(){
			$("#register_form").attr("action", "/member/register");
			$("#register_form").submit();
		});
	});
</script>
           
     <%@ include file="../includes/footer.jsp" %>