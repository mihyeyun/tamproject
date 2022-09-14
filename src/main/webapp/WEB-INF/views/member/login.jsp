<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
                       		 <div class="container">	
								<h2>로그인폼</h2>
								<form>
								    <div class="form-group">
								        <label for="userid">ID</label>
								        <input type="text" class="form-control" id="userid" name="userid" placeholder="ID">
								    </div>
								    <div class="form-group">
								        <label for="userpw">Password</label>
								        <input type="password" class="form-control" id="userpw" name="userpw" placeholder="Password">
								    </div>
								    <div class="form-group">
								        <label class="form-check-label"><input type="checkbox"> Remember me</label>
								    </div>
								    <button type="submit" class="btn btn-primary">Sign in</button>
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
</div>
</body>
</html>