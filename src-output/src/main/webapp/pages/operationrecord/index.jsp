<%@page import=".model.*" %>

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title><%=OperationRecord.TABLE_ALIAS%> 维护</title>
	
	<script src="${ctx}/scripts/rest.js" ></script>
	<link href="<c:url value="/widgets/simpletable/simpletable.css"/>" type="text/css" rel="stylesheet">
	<script type="text/javascript" src="<c:url value="/widgets/simpletable/simpletable.js"/>"></script>
	
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm',${page.thisPageNumber},${page.pageSize},'${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel"><%=OperationRecord.ALIAS_USER_ID%></td>		
					<td>
						<input value="${query.userId}" id="userId" name="userId" maxlength="10"  class="validate-integer max-value-2147483647"/>
					</td>
					<td class="tdLabel"><%=OperationRecord.ALIAS_IP_ADDR%></td>		
					<td>
						<input value="${query.ipAddr}" id="ipAddr" name="ipAddr" maxlength="45"  class=""/>
					</td>
					<td class="tdLabel"><%=OperationRecord.ALIAS_OPERATION_TIME%></td>		
					<td>
						<input value="<fmt:formatDate value='${query.operationTimeBegin}' pattern='<%=OperationRecord.FORMAT_OPERATION_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=OperationRecord.FORMAT_OPERATION_TIME%>'})" id="operationTimeBegin" name="operationTimeBegin"   />
						<input value="<fmt:formatDate value='${query.operationTimeEnd}' pattern='<%=OperationRecord.FORMAT_OPERATION_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=OperationRecord.FORMAT_OPERATION_TIME%>'})" id="operationTimeEnd" name="operationTimeEnd"   />
					</td>
					<td class="tdLabel"><%=OperationRecord.ALIAS_OPERATION_MOVE%></td>		
					<td>
						<input value="${query.operationMove}" id="operationMove" name="operationMove" maxlength="45"  class=""/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel"><%=OperationRecord.ALIAS_OPERATION_STATUS%></td>		
					<td>
						<input value="${query.operationStatus}" id="operationStatus" name="operationStatus" maxlength="45"  class=""/>
					</td>
					<td class="tdLabel"><%=OperationRecord.ALIAS_OPERATION_RESULT%></td>		
					<td>
						<input value="${query.operationResult}" id="operationResult" name="operationResult" maxlength="45"  class=""/>
					</td>
					<td class="tdLabel"><%=OperationRecord.ALIAS_OPERATION_TYPE%></td>		
					<td>
						<input value="${query.operationType}" id="operationType" name="operationType" maxlength="45"  class=""/>
					</td>
					<td class="tdLabel"><%=OperationRecord.ALIAS_OPERATION_REMARK%></td>		
					<td>
						<input value="${query.operationRemark}" id="operationRemark" name="operationRemark" maxlength="45"  class=""/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel"><%=OperationRecord.ALIAS_EXT1%></td>		
					<td>
						<input value="${query.ext1}" id="ext1" name="ext1" maxlength="45"  class=""/>
					</td>
					<td class="tdLabel"><%=OperationRecord.ALIAS_EXT2%></td>		
					<td>
						<input value="${query.ext2}" id="ext2" name="ext2" maxlength="45"  class=""/>
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}/operationrecord'"/>
			<input type="button" class="stdButton" style="width:80px" value="新增" onclick="window.location = '${ctx}/operationrecord/new'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="doRestBatchDelete('${ctx}/operationrecord','items',document.forms.queryForm)"/>
		<div>
	
	</div>
	
	<div class="gridTable">
	
		<simpletable:pageToolbar page="${page}">
		显示在这里是为了提示你如何自定义表头,可修改模板删除此行
		</simpletable:pageToolbar>
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="user_id" ><%=OperationRecord.ALIAS_USER_ID%></th>
				<th sortColumn="ip_addr" ><%=OperationRecord.ALIAS_IP_ADDR%></th>
				<th sortColumn="operation_time" ><%=OperationRecord.ALIAS_OPERATION_TIME%></th>
				<th sortColumn="operation_move" ><%=OperationRecord.ALIAS_OPERATION_MOVE%></th>
				<th sortColumn="operation_status" ><%=OperationRecord.ALIAS_OPERATION_STATUS%></th>
				<th sortColumn="operation_result" ><%=OperationRecord.ALIAS_OPERATION_RESULT%></th>
				<th sortColumn="operation_type" ><%=OperationRecord.ALIAS_OPERATION_TYPE%></th>
				<th sortColumn="operation_remark" ><%=OperationRecord.ALIAS_OPERATION_REMARK%></th>
				<th sortColumn="ext1" ><%=OperationRecord.ALIAS_EXT1%></th>
				<th sortColumn="ext2" ><%=OperationRecord.ALIAS_EXT2%></th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="${item.operationRecordId}"></td>
				
				<td><c:out value='${item.userId}'/>&nbsp;</td>
				<td><c:out value='${item.ipAddr}'/>&nbsp;</td>
				<td><c:out value='${item.operationTimeString}'/>&nbsp;</td>
				<td><c:out value='${item.operationMove}'/>&nbsp;</td>
				<td><c:out value='${item.operationStatus}'/>&nbsp;</td>
				<td><c:out value='${item.operationResult}'/>&nbsp;</td>
				<td><c:out value='${item.operationType}'/>&nbsp;</td>
				<td><c:out value='${item.operationRemark}'/>&nbsp;</td>
				<td><c:out value='${item.ext1}'/>&nbsp;</td>
				<td><c:out value='${item.ext2}'/>&nbsp;</td>
				<td>
					<a href="${ctx}/operationrecord/${item.operationRecordId}">查看</a>&nbsp;&nbsp;
					<a href="${ctx}/operationrecord/${item.operationRecordId}/edit">修改</a>&nbsp;&nbsp;
					<a href="${ctx}/operationrecord/${item.operationRecordId}" onclick="doRestDelete(this,'你确认删除?');return false;">删除</a>
				</td>
			  </tr>
			  
		  	  </c:forEach>
		  </tbody>
		</table>
	
		<simpletable:pageToolbar page="${page}">
		显示在这里是为了提示你如何自定义表头,可修改模板删除此行
		</simpletable:pageToolbar>
		
	</div>
	</form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%@ include file="base.jsp" %>
