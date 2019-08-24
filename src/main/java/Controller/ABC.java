package Controller;


import com.alibaba.fastjson.JSON;
import pojo.Kk;


public class ABC{
    public String data;
    public String json;
    public ABC(String data){this.data=data;}

    public ABC() {
    }

    public String Return(String data){
        System.out.println("aaa"+data);
        Kk k1= JSON.parseObject(data,Kk.class);
        String aa=k1.getSay();

        return "t";
    }
}
