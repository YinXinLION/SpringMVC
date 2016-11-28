import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

/**
 * Created by yinxin on 16-11-24.
 */
public class ReadJsonSample {
    public static void main(String[] args) throws IOException, JSONException {
        File file = new File("./wangxiaoer.json");
        String content = FileUtils.readFileToString(file);
        JSONObject jsonObject = new JSONObject(content);
        System.out.println("姓名是"+jsonObject.getString("name"));
        System.out.println("年龄是"+jsonObject.getDouble("age"));
        System.out.println("是否有女朋友"+jsonObject.getBoolean("has_girlfriend"));
        JSONArray majorArray = jsonObject.getJSONArray("major");
        for (int i = 0; i < majorArray.length();i++){
            String m = (String)majorArray.get(i);
            System.out.println("专业-"+(i+1)+m);
        }
    }
}
