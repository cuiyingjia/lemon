package template.java_src.$


package .model;

public class OperationRecord  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;

	//alias
	public static final String TABLE_ALIAS = "OperationRecord";
	public static final String ALIAS_OPERATION_RECORD_ID = "operationRecordId";
	public static final String ALIAS_USER_ID = "用户ID";
	public static final String ALIAS_IP_ADDR = "ipAddr";
	public static final String ALIAS_OPERATION_TIME = "operationTime";
	public static final String ALIAS_OPERATION_MOVE = "操作动作 01同意";
	public static final String ALIAS_OPERATION_STATUS = "操作状态";
	public static final String ALIAS_OPERATION_RESULT = "操作结果";
	public static final String ALIAS_OPERATION_TYPE = "操作类型 PROD02擒庄2号";
	public static final String ALIAS_OPERATION_REMARK = "备注";
	public static final String ALIAS_EXT1 = "扩展字段";
	public static final String ALIAS_EXT2 = "扩展字段";

//	
//	
//	
//	
//	
//	
//	
//	
//	public static final String FORMAT_OPERATION_TIME = DATE_FORMAT;
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	

	private java.lang.Integer operationRecordId; //operationRecordId
	private java.lang.Integer userId; //用户ID
	private java.lang.String ipAddr; //ipAddr
	private java.util.Date operationTime; //operationTime
	private java.lang.String operationMove; //操作动作 01同意
	private java.lang.String operationStatus; //操作状态
	private java.lang.String operationResult; //操作结果
	private java.lang.String operationType; //操作类型 PROD02擒庄2号
	private java.lang.String operationRemark; //备注
	private java.lang.String ext1; //扩展字段
	private java.lang.String ext2; //扩展字段



	public void setOperationRecordId(java.lang.Integer value) {
		this.operationRecordId = value;
	}
	
	public java.lang.Integer getOperationRecordId() {
		return this.operationRecordId;
	}

	public void setUserId(java.lang.Integer value) {
		this.userId = value;
	}
	
	public java.lang.Integer getUserId() {
		return this.userId;
	}

	public void setIpAddr(java.lang.String value) {
		this.ipAddr = value;
	}
	
	public java.lang.String getIpAddr() {
		return this.ipAddr;
	}

	public void setOperationTime(java.util.Date value) {
		this.operationTime = value;
	}
	
	public java.util.Date getOperationTime() {
		return this.operationTime;
	}

	public void setOperationMove(java.lang.String value) {
		this.operationMove = value;
	}
	
	public java.lang.String getOperationMove() {
		return this.operationMove;
	}

	public void setOperationStatus(java.lang.String value) {
		this.operationStatus = value;
	}
	
	public java.lang.String getOperationStatus() {
		return this.operationStatus;
	}

	public void setOperationResult(java.lang.String value) {
		this.operationResult = value;
	}
	
	public java.lang.String getOperationResult() {
		return this.operationResult;
	}

	public void setOperationType(java.lang.String value) {
		this.operationType = value;
	}
	
	public java.lang.String getOperationType() {
		return this.operationType;
	}

	public void setOperationRemark(java.lang.String value) {
		this.operationRemark = value;
	}
	
	public java.lang.String getOperationRemark() {
		return this.operationRemark;
	}

	public void setExt1(java.lang.String value) {
		this.ext1 = value;
	}
	
	public java.lang.String getExt1() {
		return this.ext1;
	}

	public void setExt2(java.lang.String value) {
		this.ext2 = value;
	}
	
	public java.lang.String getExt2() {
		return this.ext2;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("OperationRecordId",getOperationRecordId())
			.append("UserId",getUserId())
			.append("IpAddr",getIpAddr())
			.append("OperationTime",getOperationTime())
			.append("OperationMove",getOperationMove())
			.append("OperationStatus",getOperationStatus())
			.append("OperationResult",getOperationResult())
			.append("OperationType",getOperationType())
			.append("OperationRemark",getOperationRemark())
			.append("Ext1",getExt1())
			.append("Ext2",getExt2())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getOperationRecordId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof OperationRecord == false) return false;
		if(this == obj) return true;
		OperationRecord other = (OperationRecord)obj;
		return new EqualsBuilder()
			.append(getOperationRecordId(),other.getOperationRecordId())
			.isEquals();
	}
}

