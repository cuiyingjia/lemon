<%@page import=".model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="operationRecordId" name="operationRecordId" value="${operationRecord.operationRecordId}"/>

	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=OperationRecord.ALIAS_USER_ID%>:
		</td>		
		<td>
		<form:input path="userId" id="userId" cssClass="required validate-integer max-value-2147483647" maxlength="10" />
		<font color='red'><form:errors path="userId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=OperationRecord.ALIAS_IP_ADDR%>:
		</td>		
		<td>
		<form:input path="ipAddr" id="ipAddr" cssClass="required " maxlength="45" />
		<font color='red'><form:errors path="ipAddr"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=OperationRecord.ALIAS_OPERATION_TIME%>:
		</td>		
		<td>
		<input value="${operationRecord.operationTimeString}" onclick="WdatePicker({dateFmt:'<%=OperationRecord.FORMAT_OPERATION_TIME%>'})" id="operationTimeString" name="operationTimeString"  maxlength="0" class="required " />
		<font color='red'><form:errors path="operationTime"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=OperationRecord.ALIAS_OPERATION_MOVE%>:
		</td>		
		<td>
		<form:input path="operationMove" id="operationMove" cssClass="" maxlength="45" />
		<font color='red'><form:errors path="operationMove"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=OperationRecord.ALIAS_OPERATION_STATUS%>:
		</td>		
		<td>
		<form:input path="operationStatus" id="operationStatus" cssClass="" maxlength="45" />
		<font color='red'><form:errors path="operationStatus"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=OperationRecord.ALIAS_OPERATION_RESULT%>:
		</td>		
		<td>
		<form:input path="operationResult" id="operationResult" cssClass="" maxlength="45" />
		<font color='red'><form:errors path="operationResult"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=OperationRecord.ALIAS_OPERATION_TYPE%>:
		</td>		
		<td>
		<form:input path="operationType" id="operationType" cssClass="" maxlength="45" />
		<font color='red'><form:errors path="operationType"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=OperationRecord.ALIAS_OPERATION_REMARK%>:
		</td>		
		<td>
		<form:input path="operationRemark" id="operationRemark" cssClass="" maxlength="45" />
		<font color='red'><form:errors path="operationRemark"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=OperationRecord.ALIAS_EXT1%>:
		</td>		
		<td>
		<form:input path="ext1" id="ext1" cssClass="" maxlength="45" />
		<font color='red'><form:errors path="ext1"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=OperationRecord.ALIAS_EXT2%>:
		</td>		
		<td>
		<form:input path="ext2" id="ext2" cssClass="" maxlength="45" />
		<font color='red'><form:errors path="ext2"/></font>
		</td>
	</tr>	
	
		