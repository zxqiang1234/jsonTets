package webservice;

import java.rmi.RemoteException;

public class IBbossGroupInfoServiceImpl implements IBbossGroupInfoService {
    @Override
    public String groupInfo(long groupNo) throws Exception, RemoteException {
        String xml = "<message>public_groupInfo</message>";
        //为了测试，返回的
        return xml;
    }

    @Override
    public String groupSubHistoryInfo(long groupNo) throws Exception {
        //方法体我省略了，为了测试我仅加入一句打印语句
        System.out.println("我是一个公共的方法，作用是根据集团编号查询集团订购历史");
        String xml = "<message>public_groupSubHistoryInfo</message>";
        //为了测试，返回的信息我也是随便写的一个字符串
        return xml;
    }
}
