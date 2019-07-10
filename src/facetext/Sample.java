package facetext;

import com.baidu.aip.face.AipFace;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * @description: ajda
 * @author: xuqiang
 * @createDate: 2019-04-28 15:38
 **/
public class Sample {
    public static final String APP_ID = "16132976";
    public static final String API_KEY = "RF7inwXrV1FyhWDYkRjI5isi";
    public static final String SECRET_KEY = "ur9UMffwoWc1obT0LjGNAS2TOxLvsQjC";

    public static void main(String[] args) {
        // 初始化一个AipFace
        AipFace client = new AipFace(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", 8080);  // 设置http代理
//        client.setSocketProxy("proxy_host", "proxy_port");  // 设置socket代理

        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");
        // 调用接口
        String path = "test.jpg";
        JSONObject res = client.detect(path,"BASE64", new HashMap<String, String>());
        System.out.println(res.toString(2));

    }
}
