package test.ZiguanglTest;

import com.alibaba.fastjson.JSON;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {


    public static void getMethod_4(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            int count = 0;
            int count_2 = 0;
            int temp = 0;
            for (int i = 0; i < nums.length; i = i + count) {
                if (i == nums.length - 1) {
                    temp = 1;
                    break;
                }
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                    continue;
                }
                if (count > count_2) {
                    count_2 = count;
                    map.put(count_2, nums[i]);
                }

            }
            System.out.println(map.get(count_2));

        }

    public static void main(String[] args){
//        String temp[]=ss.split(",");
//        List<String> stringB = Arrays.asList(temp);


        String timestamp =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
String ss="{\"sBeamCode\":\"清水河4#特大桥Z30-1-20190327\",\"sSitesName\":\"清水河4号特大桥\",\"sPlaceName\":\"7-1号梁场\",\"sProPlace\":\"aaa\",\"sBeamType\":\"预制箱梁\",\"nBeamLength\":\"29.70m\",\"nHoleNum\":\"0\",\"dCastingDate\":\"2019-03-20\",\"dTensionDate\":\"2019-03-27 11:29:07\",\"nTensionNum\":\"0\",\"nConDesignStr\":\"50.0\",\"nConStrength\":\"46.8\",\"nConLasMod\":\"7\",\"nSteelStrand\":\"1860.0\",\"nSteelStress\":\"1860.0\",\"nDevicesNum\":\"0\",\"sConOperator\":\" \",\"sSupervisors\":\" \",\"sQuaInspector\":\" \",\"sManufacturers\":\"柳州泰姆\",\"nTenEnvTemp\":\"7\",\"result\":1,\"reportAddress\":\"\",\"ukey\":\"32032180107清水河4#特大桥Z30-1-20190327\",\"beamDevInfo\":[{\"nIndex\":\"17150028\",\"sDevCode\":\"YDCQ17150028\",\"sJackCode\":\"218010817150028\",\"nCalibrateA\":\"0\",\"nCalibrateB\":\"0\",\"sCheckDate\":\"2019-02-23\"},{\"nIndex\":\"17150026\",\"sDevCode\":\"YDCQ17150026\",\"sJackCode\":\"218010817150026\",\"nCalibrateA\":\"0\",\"nCalibrateB\":\"0\",\"sCheckDate\":\"2019-02-23\"},{\"nIndex\":\"18150001\",\"sDevCode\":\"YDCQ18150001\",\"sJackCode\":\"218010818150001\",\"nCalibrateA\":\"0\",\"nCalibrateB\":\"0\",\"sCheckDate\":\"2019-02-23\"},{\"nIndex\":\"18150002\",\"sDevCode\":\"YDCQ18150002\",\"sJackCode\":\"218010818150002\",\"nCalibrateA\":\"0\",\"nCalibrateB\":\"0\",\"sCheckDate\":\"2019-02-23\"}],\"beamTenResData\":[{\"sSteelCode\":\"N1左\",\"nTotEloValue\":\"216.2\",\"nTheElonValue\":\"212.84\",\"nEloDeviation\":\"1.6\",\"sSliBroInfo\":\"无\",\"sRemarks\":\"1\"},{\"sSteelCode\":\"N1右\",\"nTotEloValue\":\"217.5\",\"nTheElonValue\":\"212.84\",\"nEloDeviation\":\"2.2\",\"sSliBroInfo\":\"无\",\"sRemarks\":\"1\"},{\"sSteelCode\":\"N4左\",\"nTotEloValue\":\"217.0\",\"nTheElonValue\":\"212.56\",\"nEloDeviation\":\"2.09\",\"sSliBroInfo\":\"无\",\"sRemarks\":\"1\"},{\"sSteelCode\":\"N4右\",\"nTotEloValue\":\"220.0\",\"nTheElonValue\":\"212.56\",\"nEloDeviation\":\"3.5\",\"sSliBroInfo\":\"无\",\"sRemarks\":\"1\"},{\"sSteelCode\":\"N3左\",\"nTotEloValue\":\"216.2\",\"nTheElonValue\":\"211.69\",\"nEloDeviation\":\"2.1\",\"sSliBroInfo\":\"无\",\"sRemarks\":\"1\"},{\"sSteelCode\":\"N3右\",\"nTotEloValue\":\"218.2\",\"nTheElonValue\":\"211.69\",\"nEloDeviation\":\"3.1\",\"sSliBroInfo\":\"无\",\"sRemarks\":\"1\"},{\"sSteelCode\":\"N2左\",\"nTotEloValue\":\"213.7\",\"nTheElonValue\":\"212.26\",\"nEloDeviation\":\"0.7\",\"sSliBroInfo\":\"无\",\"sRemarks\":\"1\"},{\"sSteelCode\":\"N2右\",\"nTotEloValue\":\"218.0\",\"nTheElonValue\":\"212.26\",\"nEloDeviation\":\"2.7\",\"sSliBroInfo\":\"无\",\"sRemarks\":\"1\"}],\"beamTenFeaData\":[{\"sSteelCode\":\"N1左\",\"nIndex\":\"17150028\",\"nTenOrder\":\"0\",\"n1TenPreRatio\":\"0.100\",\"n1TenPress\":\"100.6\",\"n1EloLength\":\"2.6\",\"n2TenPreRatio\":\"0.200\",\"n2TenPress\":\"201.2\",\"n2EloLength\":\"12.4\",\"n3TenPreRatio\":\"1\",\"n3TenPress\":\"1005.8\",\"n3EloLength\":\"105.4\",\"nDesignStress\":\"1005.8\",\"nTenRetraction\":\"5.9\"},{\"sSteelCode\":\"N1左\",\"nIndex\":\"17150026\",\"nTenOrder\":\"0\",\"n1TenPreRatio\":\"0.100\",\"n1TenPress\":\"100.6\",\"n1EloLength\":\"42.4\",\"n2TenPreRatio\":\"0.200\",\"n2TenPress\":\"201.2\",\"n2EloLength\":\"54.7\",\"n3TenPreRatio\":\"1\",\"n3TenPress\":\"1005.8\",\"n3EloLength\":\"150.3\",\"nDesignStress\":\"1005.8\",\"nTenRetraction\":\"5.6\"},{\"sSteelCode\":\"N1右\",\"nIndex\":\"18150001\",\"nTenOrder\":\"0\",\"n1TenPreRatio\":\"0.100\",\"n1TenPress\":\"100.6\",\"n1EloLength\":\"36.5\",\"n2TenPreRatio\":\"0.200\",\"n2TenPress\":\"201.2\",\"n2EloLength\":\"49.6\",\"n3TenPreRatio\":\"1\",\"n3TenPress\":\"1005.8\",\"n3EloLength\":\"144.0\",\"nDesignStress\":\"1005.8\",\"nTenRetraction\":\"5.3\"},{\"sSteelCode\":\"N1右\",\"nIndex\":\"18150002\",\"nTenOrder\":\"0\",\"n1TenPreRatio\":\"0.100\",\"n1TenPress\":\"100.6\",\"n1EloLength\":\"32.9\",\"n2TenPreRatio\":\"0.200\",\"n2TenPress\":\"201.2\",\"n2EloLength\":\"42.6\",\"n3TenPreRatio\":\"1\",\"n3TenPress\":\"1005.8\",\"n3EloLength\":\"136.7\",\"nDesignStress\":\"1005.8\",\"nTenRetraction\":\"5.7\"},{\"sSteelCode\":\"N4左\",\"nIndex\":\"17150028\",\"nTenOrder\":\"0\",\"n1TenPreRatio\":\"0.100\",\"n1TenPress\":\"100.6\",\"n1EloLength\":\"46.9\",\"n2TenPreRatio\":\"0.200\",\"n2TenPress\":\"201.2\",\"n2EloLength\":\"61.5\",\"n3TenPreRatio\":\"1\",\"n3TenPress\":\"1005.8\",\"n3EloLength\":\"157.6\",\"nDesignStress\":\"1005.8\",\"nTenRetraction\":\"5.1\"},{\"sSteelCode\":\"N4左\",\"nIndex\":\"17150026\",\"nTenOrder\":\"0\",\"n1TenPreRatio\":\"0.100\",\"n1TenPress\":\"100.6\",\"n1EloLength\":\"35.0\",\"n2TenPreRatio\":\"0.200\",\"n2TenPress\":\"201.2\",\"n2EloLength\":\"43.7\",\"n3TenPreRatio\":\"1\",\"n3TenPress\":\"1005.8\",\"n3EloLength\":\"134.6\",\"nDesignStress\":\"1005.8\",\"nTenRetraction\":\"5.2\"},{\"sSteelCode\":\"N4右\",\"nIndex\":\"18150001\",\"nTenOrder\":\"0\",\"n1TenPreRatio\":\"0.100\",\"n1TenPress\":\"100.6\",\"n1EloLength\":\"39.5\",\"n2TenPreRatio\":\"0.200\",\"n2TenPress\":\"201.2\",\"n2EloLength\":\"54.3\",\"n3TenPreRatio\":\"1\",\"n3TenPress\":\"1005.8\",\"n3EloLength\":\"147.6\",\"nDesignStress\":\"1005.8\",\"nTenRetraction\":\"5.5\"},{\"sSteelCode\":\"N4右\",\"nIndex\":\"18150002\",\"nTenOrder\":\"0\",\"n1TenPreRatio\":\"0.100\",\"n1TenPress\":\"100.6\",\"n1EloLength\":\"26.7\",\"n2TenPreRatio\":\"0.200\",\"n2TenPress\":\"201.2\",\"n2EloLength\":\"35.4\",\"n3TenPreRatio\":\"1\",\"n3TenPress\":\"1005.8\",\"n3EloLength\":\"131.7\",\"nDesignStress\":\"1005.8\",\"nTenRetraction\":\"5.1\"},{\"sSteelCode\":\"N3左\",\"nIndex\":\"17150028\",\"nTenOrder\":\"0\",\"n1TenPreRatio\":\"0.100\",\"n1TenPress\":\"100.6\",\"n1EloLength\":\"36.3\",\"n2TenPreRatio\":\"0.200\",\"n2TenPress\":\"201.2\",\"n2EloLength\":\"45.2\",\"n3TenPreRatio\":\"1\",\"n3TenPress\":\"1005.8\",\"n3EloLength\":\"136.6\",\"nDesignStress\":\"1005.8\",\"nTenRetraction\":\"5.7\"},{\"sSteelCode\":\"N3左\",\"nIndex\":\"17150026\",\"nTenOrder\":\"0\",\"n1TenPreRatio\":\"0.100\",\"n1TenPress\":\"100.6\",\"n1EloLength\":\"42.0\",\"n2TenPreRatio\":\"0.200\",\"n2TenPress\":\"201.2\",\"n2EloLength\":\"55.5\",\"n3TenPreRatio\":\"1\",\"n3TenPress\":\"1005.8\",\"n3EloLength\":\"152.1\",\"nDesignStress\":\"1005.8\",\"nTenRetraction\":\"5.5\"},{\"sSteelCode\":\"N3右\",\"nIndex\":\"18150001\",\"nTenOrder\":\"0\",\"n1TenPreRatio\":\"0.100\",\"n1TenPress\":\"100.6\",\"n1EloLength\":\"47.4\",\"n2TenPreRatio\":\"0.200\",\"n2TenPress\":\"201.2\",\"n2EloLength\":\"60.8\",\"n3TenPreRatio\":\"1\",\"n3TenPress\":\"1005.8\",\"n3EloLength\":\"156.4\",\"nDesignStress\":\"1005.8\",\"nTenRetraction\":\"5.3\"},{\"sSteelCode\":\"N3右\",\"nIndex\":\"18150002\",\"nTenOrder\":\"0\",\"n1TenPreRatio\":\"0.100\",\"n1TenPress\":\"100.6\",\"n1EloLength\":\"41.4\",\"n2TenPreRatio\":\"0.200\",\"n2TenPress\":\"201.2\",\"n2EloLength\":\"51.1\",\"n3TenPreRatio\":\"1\",\"n3TenPress\":\"1005.8\",\"n3EloLength\":\"144.1\",\"nDesignStress\":\"1005.8\",\"nTenRetraction\":\"5.7\"},{\"sSteelCode\":\"N2左\",\"nIndex\":\"17150028\",\"nTenOrder\":\"0\",\"n1TenPreRatio\":\"0.100\",\"n1TenPress\":\"100.6\",\"n1EloLength\":\"42.1\",\"n2TenPreRatio\":\"0.200\",\"n2TenPress\":\"201.2\",\"n2EloLength\":\"51.8\",\"n3TenPreRatio\":\"1\",\"n3TenPress\":\"1005.8\",\"n3EloLength\":\"143.8\",\"nDesignStress\":\"1005.8\",\"nTenRetraction\":\"5.1\"},{\"sSteelCode\":\"N2左\",\"nIndex\":\"17150026\",\"nTenOrder\":\"0\",\"n1TenPreRatio\":\"0.100\",\"n1TenPress\":\"100.6\",\"n1EloLength\":\"46.0\",\"n2TenPreRatio\":\"0.200\",\"n2TenPress\":\"201.2\",\"n2EloLength\":\"58.8\",\"n3TenPreRatio\":\"1\",\"n3TenPress\":\"1005.8\",\"n3EloLength\":\"152.1\",\"nDesignStress\":\"1005.8\",\"nTenRetraction\":\"5.5\"},{\"sSteelCode\":\"N2右\",\"nIndex\":\"18150001\",\"nTenOrder\":\"0\",\"n1TenPreRatio\":\"0.100\",\"n1TenPress\":\"100.6\",\"n1EloLength\":\"40.2\",\"n2TenPreRatio\":\"0.200\",\"n2TenPress\":\"201.2\",\"n2EloLength\":\"53.4\",\"n3TenPreRatio\":\"1\",\"n3TenPress\":\"1005.8\",\"n3EloLength\":\"149.4\",\"nDesignStress\":\"1005.8\",\"nTenRetraction\":\"5.1\"},{\"sSteelCode\":\"N2右\",\"nIndex\":\"18150002\",\"nTenOrder\":\"0\",\"n1TenPreRatio\":\"0.100\",\"n1TenPress\":\"100.6\",\"n1EloLength\":\"37.8\",\"n2TenPreRatio\":\"0.200\",\"n2TenPress\":\"201.2\",\"n2EloLength\":\"48.1\",\"n3TenPreRatio\":\"1\",\"n3TenPress\":\"1005.8\",\"n3EloLength\":\"139.7\",\"nDesignStress\":\"1005.8\",\"nTenRetraction\":\"5.0\"}],\"operateType\":\"1\"}";

//       String tempbusiParams = "{\"beamCode\":\"ZF2-2\",\"projectID\":0,\"sectionID\":0,\"sitesName\":\"K167+935\",\"placeName\":\"1#梁场\",\"proPlace\":\"K167+935\",\"beamType\":\"30m箱梁\",\"beamLength\":0.0,\"holeNum\":8,\"castingDate\":\"2018-08-22\",\"groutNum\":4,\"stepName\":\"N4L-N3L,N2L-N1L,N4R-N3R,N2R-N1R,\",\"groutingDate\":\"2017-11-20 22:00:30\",\"groDevCode\":\"2265\",\"cementGrade\":\"协宝\",\"groAgenName\":\"压浆料\",\"groAspect\":\"南-北\",\"stirTime\":300.0,\"initialFluidity\":18.0,\"slurryTemperature\":0.0,\"ehsTemperature\":0.0,\"mixtureProportion\":\"200.0:0.00:56.0\",\"conOperator\":\" \",\"supervisors\":\"\",\"quaInspector\":\"\",\"manufacturers\":\"西安璐江\",\"result\":1,\"reportAddress\":\"\",\"beamGroutResData\":[{\"index\":2,\"steelCode\":\"N4R-N3R\",\"grouBeginTime\":\"2017-11-20 22:00:30\",\"grouEndTime\":\"2017-11-20 22:09:56\",\"inSlurryPressure\":0.52,\"antiSlurryPressure\":0.54,\"pressureTime\":213.0,\"waterBinderRatio\":0.0,\"remarks\":\"\"},{\"index\":1,\"steelCode\":\"N2L-N1L\",\"grouBeginTime\":\"2017-11-20 21:44:38\",\"grouEndTime\":\"2017-11-20 21:50:29\",\"inSlurryPressure\":0.54,\"antiSlurryPressure\":0.52,\"pressureTime\":198.0,\"waterBinderRatio\":0.0,\"remarks\":\"\"},{\"index\":0,\"steelCode\":\"N4L-N3L\",\"grouBeginTime\":\"2017-11-20 21:33:42\",\"grouEndTime\":\"2017-11-20 21:40:00\",\"inSlurryPressure\":0.56,\"antiSlurryPressure\":0.53,\"pressureTime\":186.0,\"waterBinderRatio\":0.0,\"remarks\":\"\"},{\"index\":3,\"steelCode\":\"N2R-N1R\",\"grouBeginTime\":\"2017-11-20 22:18:26\",\"grouEndTime\":\"2017-11-20 22:25:09\",\"inSlurryPressure\":0.56,\"antiSlurryPressure\":0.52,\"pressureTime\":196.0,\"waterBinderRatio\":0.0,\"remarks\":\"\"}],\"operateType\":0,\"ukey\":\"3190:32\"}";
//       String busiParams="";
//        for(int i=0;i<stringB.size();i++){
//             busiParams = tempbusiParams.replace("3190:32", stringB.get(i));

        Map<String,String> signMap = new TreeMap<String,String>();
        /**
         * //注册时获取的appKey
         */
        signMap.put("app_key", "a570f0fd-308a-4c3c-aae9-d68095cf2136");
        /**
         * //业务参数名
         */
        signMap.put("method", "prestressTension");
        signMap.put("timestamp", timestamp);
        signMap.put("data", ss);
        /**
         * //密钥加密
         */
        String sign = MD5Util.getSignature("gsunis_mpms_qs",signMap);
        Map<String,String> requestParamMap = new HashMap<String,String>();
        requestParamMap.put("timestamp", timestamp);
        /**
         * //业务参数名
         */
        requestParamMap.put("method", "prestressTension");
        /**
         * //注册时获取的APPKEY
         */
        requestParamMap.put("app_key", "a570f0fd-308a-4c3c-aae9-d68095cf2136");
        requestParamMap.put("sign", sign != null ? sign : "");
        requestParamMap.put("data", ss);

        String string = JSON.toJSONString(requestParamMap);

      HttpClientResponseResult result = HttpClientUtil.requestPost("http://47.95.42.211/api/public/external/quality", requestParamMap);
            System.out.println(result);
        }

        /**

//
//        String orgIdString = new BigDecimal(String.valueOf("14.234E52")).toPlainString();
//        /**
//         *  // 组织机构ID
//         */
//        long orgId =Long.valueOf(orgIdString);

//        try {
//            showExcel();
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
    public static  void showExcel() throws Exception {
        HSSFWorkbook workbook=new HSSFWorkbook(new FileInputStream(new File("C:\\Users\\dell\\Desktop\\z55-2 9.21 压浆.xls")));
        HSSFSheet sheet=null;
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            //获取每个Sheet表
            sheet=workbook.getSheetAt(i);
            for (int j = 0; j < sheet.getPhysicalNumberOfRows(); j++) {
                //获取每行
                HSSFRow row=sheet.getRow(j);
                if (row!=null) {
                    for (int k = 0; k < row.getPhysicalNumberOfCells(); k++) {
                        //获取每个单元格

                        if (row.getCell(k) != null) {
                            System.out.print(row.getCell(k) + "\t");
                        }
                    }
                }
                System.out.println("---Sheet表"+sheet.getSheetName()+"处理完毕---");
            }
        }
    }


    public List<String> fullJustify(String[] words, int maxWidth) {
//
//        for (int i=0;i<words.length;i++){
//            if (words[i].length())
//            if (words[i].length()+words[i+1])
//        }
        return null;

    }



}
