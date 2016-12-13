<%@page import=".model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title><%=OperationRecord.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form:form modelAttribute="operationrecord"  >
		<input type="button" value="返回列表" onclick="window.location='${ctx}/operationrecord'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="operationRecordId" name="operationRecordId" value="${operationRecord.operationRecordId}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel"><%=OperationRecord.ALIAS_USER_ID%></td>	
				<td><c:out value='${operationRecord.userId}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=OperationRecord.ALIAS_IP_ADDR%></td>	
				<td><c:out value='${operationRecord.ipAddr}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=OperationRecord.ALIAS_OPERATION_TIME%></td>	
				<td><c:out value='${operationRecord.operationTimeString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=OperationRecord.ALIAS_OPERATION_MOVE%></td>	
				<td><c:out value='${operationRecord.operationMove}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=OperationRecord.ALIAS_OPERATION_STATUS%></td>	
				<td><c:out value='${operationRecord.operationStatus}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=OperationRecord.ALIAS_OPERATION_RESULT%></td>	
				<td><c:out value='${operationRecord.operationResult}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=OperationRecord.ALIAS_OPERATION_TYPE%></td>	
				<td><c:out value='${operationRecord.operationType}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=OperationRecord.ALIAS_OPERATION_REMARK%></td>	
				<td><c:out value='${operationRecord.operationRemark}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=OperationRecord.ALIAS_EXT1%></td>	
				<td><c:out value='${operationRecord.ext1}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=OperationRecord.ALIAS_EXT2%></td>	
				<td><c:out value='${operationRecord.ext2}'/></td>
			</tr>
		</table>
	</form:form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%@ include file="base.jsp" %>