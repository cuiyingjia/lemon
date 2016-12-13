package template.java_test.$

/*
 * Powered By JavaGen
 * Web Site: http://www.springside.cn
 * Since 2013 - 2016
 */

package .service;

import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;

import cn.org.rapid_framework.test.context.TestMethodContext;
import static junit.framework.Assert.*;

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


public class OperationRecordManagerTest extends BaseManagerTestCase{

	private OperationRecordManager manager;
	
	@Autowired
	public void setOperationRecordManager(OperationRecordManager manager) {
		this.manager = manager;
	}

    @Override
    protected String[] getDbUnitDataFiles() {
        //通过 TestMethodContext.getMethodName() 可以得到当前正在运行的测试方法名称
        return new String[]{"classpath:testdata/common.xml","classpath:testdata/OperationRecord.xml",
                            "classpath:testdata/OperationRecord_"+TestMethodContext.getMethodName()+".xml"};
    }

	//数据库单元测试前会开始事务，结束时会回滚事务，所以测试方法可以不用关心测试数据的删除
	@Test
	public void crud() {

		OperationRecord obj = newOperationRecord();
		manager.save(obj);
		manager.getEntityDao().flush();
		
		manager.update(obj);
		manager.getEntityDao().flush();
		
		assertNotNull(obj.getOperationRecordId());
		
		manager.removeById(obj.getOperationRecordId());
		manager.getEntityDao().flush();
	
	}
	
	public static OperationRecord newOperationRecord() {
		OperationRecord obj = new OperationRecord();
		
	  	obj.setUserId(new java.lang.Integer("1"));
	  	obj.setIpAddr(new java.lang.String("1"));
	  	obj.setOperationTime(new java.util.Date(System.currentTimeMillis()));
	  	obj.setOperationMove(new java.lang.String("1"));
	  	obj.setOperationStatus(new java.lang.String("1"));
	  	obj.setOperationResult(new java.lang.String("1"));
	  	obj.setOperationType(new java.lang.String("1"));
	  	obj.setOperationRemark(new java.lang.String("1"));
	  	obj.setExt1(new java.lang.String("1"));
	  	obj.setExt2(new java.lang.String("1"));
		return obj;
	}
}
