package template.java_src.$

/*
 * Powered By JavaGen
 * Web Site: http://www.springside.cn
 * Since 2013 - 2016
 */

package .vo.query;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

import java.util.List;

import .model.*;
import .dao.*;
import .service.*;
import .vo.query.*;

/**
 * 工具自动生成
 * @author  email:xiaoming(a)wallaw.cn
 * @version 1.0
 * @since 1.0
 *  该文件创建于 2016-11-21 02:37:04
 */


public class OperationRecordQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** operationRecordId */
	private java.lang.Integer operationRecordId;
	/** 用户ID */
	private java.lang.Integer userId;
	/** ipAddr */
	private java.lang.String ipAddr;
	/** operationTime */
	private java.util.Date operationTimeBegin;
	private java.util.Date operationTimeEnd;
	/** 操作动作 01同意 */
	private java.lang.String operationMove;
	/** 操作状态 */
	private java.lang.String operationStatus;
	/** 操作结果 */
	private java.lang.String operationResult;
	/** 操作类型 PROD02擒庄2号 */
	private java.lang.String operationType;
	/** 备注 */
	private java.lang.String operationRemark;
	/** 扩展字段 */
	private java.lang.String ext1;
	/** 扩展字段 */
	private java.lang.String ext2;

	public java.lang.Integer getOperationRecordId() {
		return this.operationRecordId;
	}
	
	public void setOperationRecordId(java.lang.Integer value) {
		this.operationRecordId = value;
	}
	
	public java.lang.Integer getUserId() {
		return this.userId;
	}
	
	public void setUserId(java.lang.Integer value) {
		this.userId = value;
	}
	
	public java.lang.String getIpAddr() {
		return this.ipAddr;
	}
	
	public void setIpAddr(java.lang.String value) {
		this.ipAddr = value;
	}
	
	public java.util.Date getOperationTimeBegin() {
		return this.operationTimeBegin;
	}
	
	public void setOperationTimeBegin(java.util.Date value) {
		this.operationTimeBegin = value;
	}	
	
	public java.util.Date getOperationTimeEnd() {
		return this.operationTimeEnd;
	}
	
	public void setOperationTimeEnd(java.util.Date value) {
		this.operationTimeEnd = value;
	}
	
	public java.lang.String getOperationMove() {
		return this.operationMove;
	}
	
	public void setOperationMove(java.lang.String value) {
		this.operationMove = value;
	}
	
	public java.lang.String getOperationStatus() {
		return this.operationStatus;
	}
	
	public void setOperationStatus(java.lang.String value) {
		this.operationStatus = value;
	}
	
	public java.lang.String getOperationResult() {
		return this.operationResult;
	}
	
	public void setOperationResult(java.lang.String value) {
		this.operationResult = value;
	}
	
	public java.lang.String getOperationType() {
		return this.operationType;
	}
	
	public void setOperationType(java.lang.String value) {
		this.operationType = value;
	}
	
	public java.lang.String getOperationRemark() {
		return this.operationRemark;
	}
	
	public void setOperationRemark(java.lang.String value) {
		this.operationRemark = value;
	}
	
	public java.lang.String getExt1() {
		return this.ext1;
	}
	
	public void setExt1(java.lang.String value) {
		this.ext1 = value;
	}
	
	public java.lang.String getExt2() {
		return this.ext2;
	}
	
	public void setExt2(java.lang.String value) {
		this.ext2 = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

