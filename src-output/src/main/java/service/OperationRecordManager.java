package template.java_src.$

/*
 * Powered By JavaGen
 * Web Site: http://www.springside.cn
 * Since 2013 - 2016
 */

package .service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	private OperationRecordMapper operationRecordMapper;

	public void setOperationRecordMapper(OperationRecordMapper mapper) {
		this.operationRecordMapper = mapper;
	}
	public EntityDao getEntityMapper() {
		return this.operationRecordMapper;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(OperationRecordQuery query) {
		return operationRecordMapper.findPage(query);
	}
	
}
