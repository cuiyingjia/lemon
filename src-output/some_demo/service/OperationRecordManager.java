package template.some_demo.$

/*
 * Powered By JavaGen
 * Web Site: http://www.springside.cn
 * Since 2013 - 2016
 */

package .service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

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

@Service
@Transactional
public class OperationRecordManager extends BaseManager<OperationRecord,java.lang.Integer>{

	private OperationRecordDao operationRecordDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setOperationRecordDao(OperationRecordDao dao) {
		this.operationRecordDao = dao;
	}
	
	public EntityDao getEntityDao() {
		return this.operationRecordDao;
	}
	
	/** */
	public OperationRecord createOperationRecord(OperationRecord operationRecord) {
	    Assert.notNull(operationRecord,"'operationRecord' must be not null");
	    initDefaultValuesForCreate(operationRecord);
	    new OperationRecordChecker().checkCreateOperationRecord(operationRecord);
	    this.operationRecordDao.save(operationRecord);
	    return operationRecord;
	}
	
    public OperationRecord updateOperationRecord(OperationRecord operationRecord) {
        Assert.notNull(operationRecord,"'operationRecord' must be not null");
        new OperationRecordChecker().checkUpdateOperationRecord(operationRecord);
        this.operationRecordDao.update(operationRecord);
        return operationRecord;
    }	

    public void deleteOperationRecordById(java.lang.Integer id) {
        Assert.notNull(id,"'id' must be not null");
        this.operationRecordDao.deleteById(id);
    }
    
    public OperationRecord getOperationRecordById(java.lang.Integer id) {
        Assert.notNull(id,"'id' must be not null");
        return this.operationRecordDao.getById(id);
    }
    
	@Transactional(readOnly=true)
	public Page findPage(OperationRecordQuery query) {
	    Assert.notNull(query,"'query' must be not null");
		return operationRecordDao.findPage(query);
	}
	
    
    public void initDefaultValuesForCreate(OperationRecord v) {
    }
    
    public class OperationRecordChecker {
        /**可以在此检查只有更新才需要的特殊检查 */
        public void checkUpdateOperationRecord(OperationRecord v) {
            checkOperationRecord(v);
        }
    
        /**可以在此检查只有创建才需要的特殊检查 */
        public void checkCreateOperationRecord(OperationRecord v) {
            checkOperationRecord(v);
        }
        
        /** 检查到有错误请直接抛异常，不要使用 return errorCode的方式 */
        public void checkOperationRecord(OperationRecord v) {
            //各个属性的检查一般需要分开写几个方法，如 checkProperty1(v),checkProperty2(v)
        }
    }
}
