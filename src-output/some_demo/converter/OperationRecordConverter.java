package template.some_demo.converter;


package .repository.converter;

import .dal.dataobject.OperationRecordDO;
import .repository.model.OperationRecord;

import java.util.ArrayList;
import java.util.List;


public class OperationRecordRepositoryConverter {

    public static OperationRecordDO convert2OperationRecordDO(OperationRecord source) {
        OperationRecordDO target = new OperationRecordDO();
    
        target.setUserId(source.getUserId());
        target.setIpAddr(source.getIpAddr());
        target.setOperationTime(source.getOperationTime());
        target.setOperationMove(source.getOperationMove());
        target.setOperationStatus(source.getOperationStatus());
        target.setOperationResult(source.getOperationResult());
        target.setOperationType(source.getOperationType());
        target.setOperationRemark(source.getOperationRemark());
        target.setExt1(source.getExt1());
        target.setExt2(source.getExt2());
        
        return target;
    }

    public static List<OperationRecordDO> convert2OperationRecordDOList(Iterable<OperationRecord> list) {
        List<OperationRecordDO> results = new ArrayList();
        for(OperationRecord source : list) {
            results.add(convert2OperationRecordDO(source));
        }
        return results;
    }

    
    public static OperationRecord convert2OperationRecord(OperationRecordDO source) {
        OperationRecord target = new OperationRecord();
    
        target.setUserId(source.getUserId());
        target.setIpAddr(source.getIpAddr());
        target.setOperationTime(source.getOperationTime());
        target.setOperationMove(source.getOperationMove());
        target.setOperationStatus(source.getOperationStatus());
        target.setOperationResult(source.getOperationResult());
        target.setOperationType(source.getOperationType());
        target.setOperationRemark(source.getOperationRemark());
        target.setExt1(source.getExt1());
        target.setExt2(source.getExt2());
        
        return target;
    }

    public static List<OperationRecord> convert2OperationRecordList(Iterable<OperationRecordDO> list) {
        List<OperationRecord> results = new ArrayList();
        for(OperationRecordDO source : list) {
            results.add(convert2OperationRecord(source));
        }
        return results;
    }

    
    
}
        
