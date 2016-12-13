package template.java_test.$

/*
 * Powered By JavaGen
 * Web Site: http://www.springside.cn
 * Since 2013 - 2016
 */

package .dao;

import java.util.List;

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


public class OperationRecordDaoTest extends BaseDaoTestCase{
	
	private OperationRecordDao dao;
	
	@Autowired
	public void setOperationRecordDao(OperationRecordDao dao) {
		this.dao = dao;
	}

	@Override 
	protected String[] getDbUnitDataFiles() {
	    //通过 TestMethodContext.getMethodName() 可以得到当前正在运行的测试方法名称
		return new String[]{"classpath:testdata/common.xml","classpath:testdata/OperationRecord.xml",
		                    "classpath:testdata/OperationRecord_"+TestMethodContext.getMethodName()+".xml"};
	}
	
	//数据库单元测试前会开始事务，结束时会回滚事务，所以测试方法可以不用关心测试数据的删除
	@Test
	public void findPage() {

		OperationRecordQuery query = newOperationRecordQuery();
		Page page = dao.findPage(query);
		
		assertEquals(pageNumber,page.getThisPageNumber());
		assertEquals(pageSize,page.getPageSize());
		List resultList = (List)page.getResult();
		assertNotNull(resultList);
		
	}
	
	static int pageNumber = 1;
	static int pageSize = 10;	
	public static OperationRecordQuery newOperationRecordQuery() {
		OperationRecordQuery query = new OperationRecordQuery();
		query.setPageNumber(pageNumber);
		query.setPageSize(pageSize);
		query.setSortColumns(null);
		
	  	query.setUserId(new Integer("1"));
	  	query.setIpAddr(new String("1"));
		query.setOperationTimeBegin(new Date(System.currentTimeMillis()));
		query.setOperationTimeEnd(new Date(System.currentTimeMillis()));
	  	query.setOperationMove(new String("1"));
	  	query.setOperationStatus(new String("1"));
	  	query.setOperationResult(new String("1"));
	  	query.setOperationType(new String("1"));
	  	query.setOperationRemark(new String("1"));
	  	query.setExt1(new String("1"));
	  	query.setExt2(new String("1"));
		return query;
	}
	
}
