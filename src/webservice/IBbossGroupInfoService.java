package webservice;

import java.rmi.RemoteException;

public interface IBbossGroupInfoService {


    String groupInfo(long groupNo) throws Exception, RemoteException;

    String groupSubHistoryInfo(long groupNo) throws Exception;
}
