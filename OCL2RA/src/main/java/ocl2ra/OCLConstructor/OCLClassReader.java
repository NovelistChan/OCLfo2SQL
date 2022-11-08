package ocl2ra.OCLConstructor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Objects;

public class OCLClassReader {


    public static String readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile), "utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static OCLClass readClassFromFile(String fileName) {
        String path = Objects
            .requireNonNull(OCLClassReader.class.getClassLoader().getResource(fileName)).getPath();
        String s = readJsonFile(path);
        JSONObject jObj = JSON.parseObject(s);
        String className = jObj.getString("class");
        JSONArray attributes = jObj.getJSONArray("attributes");
        ArrayList<String> attrs = new ArrayList<>();
        for (Object attr : attributes) {
            attrs.add(((JSONObject) attr).getString("name"));
        }
        JSONArray ends = jObj.getJSONArray("ends");
        ArrayList<OCLAssociation> associations = new ArrayList<>();
        for (Object end : ends) {
            String srcClass = className;
            String tarClass = ((JSONObject) end).getString("target");
            String srcEnd = ((JSONObject) end).getString("name");
            String tarEnd = ((JSONObject) end).getString("opp");
            associations.add(new OCLAssociation(srcEnd, tarEnd, srcClass, tarClass));
        }

        return new OCLClass(className, attrs, associations);
    }

}
