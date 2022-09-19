<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../includes/header.jsp"%>


<div class="row">
  <div class="col-lg-12">
    <h1 class="page-header">Board Modify/Delete</h1>
  </div>
  <!-- /.col-lg-12 -->
</div>
<!-- /.row -->

<div class="row">
  <div class="col-lg-12">
    <div class="panel panel-default">

      <div class="panel-heading">Board get</div>
      <!-- /.panel-heading -->
      <div class="panel-body">
      
		<form>
          <div class="form-group">
          <label>Bno</label> <input class="form-control" name='bno'
            value='<c:out value="${board.bno }"/>' readonly="readonly">
        </div>

        <div class="form-group">
          <label>Title</label> <input class="form-control" name='title'
            value='<c:out value="${board.title }"/>' readonly="readonly" >
        </div>

        <div class="form-group">
          <label>Text area</label>
          <textarea class="form-control" rows="3" name='content' readonly="readonly"
           ><c:out value="${board.content}" /></textarea>
        </div>

        <div class="form-group">
          <label>Writer</label> <input class="form-control" name='writer' readonly="readonly"
            value='<c:out value="${board.writer }"/>'>
        </div>
	
		<form id='actionForm' action="/board/list" method='get'>
			<input type='hidden' name='pageNum' value='${cri.pageNum}'>
			<input type='hidden' name='amount' value='${cri.amount}'>
			<input type='hidden' name='bno' value='${board.bno}'>
			<input type='hidden' name='type' value='${cri.type}'>
			<input type='hidden' name='keyword' value='${cri.keyword}'>
			
		
		</form>
	
		<button data-oper='modify' class="btn btn-default">
        <a href="/board/modify?bno=<c:out value="${board.bno}"/>">Modify</a></button>
        <button data-oper='list' class="btn btn-info">
        <a href="/board/list">List</a></button>


	
	<%-- 	<form id='operForm' action="/boad/modify" method="get">
		  <input type='hidden' id='bno' name='bno' value='<c:out value="${board.bno}"/>'>
		</form>


		<form id='operForm' action="/boad/modify" method="get">
		  <input type='hidden' id='bno' name='bno' value='<c:out value="${board.bno}"/>'>
		  <input type='hidden' name='pageNum' value='<c:out value="${cri.pageNum}"/>'>
		  <input type='hidden' name='amount' value='<c:out value="${cri.amount}"/>'>
		  <input type='hidden' name='keyword' value='<c:out value="${cri.keyword}"/>'>
		  <input type='hidden' name='type' value='<c:out value="${cri.type}"/>'>  
		 
		</form>  --%>


	</form>
      </div>
      <!--  end panel-body -->

    </div>
    <!--  end panel-body -->
  </div>
  <!-- end panel -->
</div>
<!-- /.row -->

<script type="text/javascript">
$(document).ready(function() {
  	
	var formObj = $("form");
	
	$('.btn').click(function(e){
		
		e.preventDefault();
		
		var operation = $(this).data("oper");
		
		console.log(operation);
		
		if(operation == 'list'){
			
			self.location = "/board/list";
			
		}else if(operation == 'modify'){
			formObj.attr("action", "/board/modify")
				   .attr("method", "post");
			formObj.submit();
		} 
	})
	
  
});
</script>


<%@include file="../includes/footer.jsp"%>