package Controller;

import com.alibaba.fastjson.JSON;
import pojo.User;
import pojo.firstpopup;

public class FirstPopup {
    public String data;
    public String json;

    public FirstPopup() {
    }

    public FirstPopup(String data) {
        this.data = data;
    }
    public String Return(String data){
        firstpopup fp = JSON.parseObject(data, firstpopup.class);
        String age=fp.getAge();
        String sex = fp.getSex();
        String weight = fp.getWeight();
        String height = fp.getHeight();

        return  "t";
    }
}
