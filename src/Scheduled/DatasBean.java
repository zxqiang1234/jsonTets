package Scheduled;

/**
 * @description:
 * @author: xuqiang
 * @createDate: 2019-05-07 15:48
 **/
public class DatasBean {

    public static void main(String[] args) {
        System.out.println(cnToUnicode("碎碎碎"));
//        List<String> idList = Arrays.asList("试验参数::;试样编号:2018-TPB-065:;加载速度:0.5:KN/s;试样龄期:28:天;强度等级:C35:;试件块数:3:;试件规格:150*150*150:mm;修正系数:1:;".split(";"));
//
//        Map<String, List<String>> appleMap = idList.stream().collect(Collectors.groupingBy(ss -> ss.split(":")[0]));
//        Gson gson = new Gson();
//        DatasBean datasBean = new DatasBean();
//        List<Double> time=new ArrayList<>();
//        time.add(1.1111);
//        time.add(2.1111);
//        time.add(3.1111);
//        time.add(4.1111);
//        time.add(5.1111);
//        datasBean.setTime(time);
//        String json = gson.toJson(datasBean);
    }

    private static String cnToUnicode(String cn) {
        char[] chars = cn.toCharArray();
        String returnStr = "";
        for (int i = 0; i < chars.length; i++) {
            returnStr += "\\u" + Integer.toString(chars[i], 16);
        }
        return returnStr;
    }
//
//    @SerializedName("_Time_")
//    private List<Double> time;
//
//    public List<Double> getTime() {
//        return time;
//    }
//
//    public void setTime(List<Double> time) {
//        this.time = time;
//    }
}
