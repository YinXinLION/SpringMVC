import org.json.JSONException;
import org.json.JSONObject;



import java.util.HashMap;
import java.util.Map;

/**
 * Created by yinxin on 16-11-24.
 */
public class JsonObjectSample {
    public static void main(String[] args) throws JSONException {
        createJsonByMap();
    }
    private static void JSONObject() throws JSONException {
        JSONObject wangxiaoer = new JSONObject();
        Object nullObj = null;
        wangxiaoer.put("name","王小二");
        wangxiaoer.put("age",25.2);
        wangxiaoer.put("birthday","1990-01-01");
        wangxiaoer.put("school","蓝翔");
        wangxiaoer.put("major",new String[]{"理发","挖掘机 "});
        wangxiaoer.put("has_girlfriend",false);
        wangxiaoer.put("car",nullObj);
        wangxiaoer.put("house",nullObj);
        wangxiaoer.put("comment","这是一个注释");
        System.out.println(wangxiaoer.toString());
    }
    public static void createJsonByMap(){
        Map<String,Object> wangxiaoer = new HashMap<String,Object>();
        Object nullObj = null;
        wangxiaoer.put("name","王小二");
        wangxiaoer.put("age",25.2);
        wangxiaoer.put("birthday","1990-01-01");
        wangxiaoer.put("school","蓝翔");
        wangxiaoer.put("major",new String[]{"理发","挖掘机"});
        wangxiaoer.put("has_girlfriend",false);
        wangxiaoer.put("car",nullObj);
        wangxiaoer.put("house",nullObj);
        wangxiaoer.put("comment","这是一个注释");
        System.out.println(wangxiaoer.toString());
    }
}

//{
//    "name" : "王小二",
//        "age" : 25.2,
//        "birthday" : "1990-01-01",
//        "school" : "蓝翔",
//        "major" : [
//                "理发",
//        "挖掘机"
//                ]
//        "has_girlfriend" : false;
//        "car" : null,
//        "house" : null,
//        "comment" : "这是一个注释"
//        }