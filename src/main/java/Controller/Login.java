package Controller;

import com.alibaba.fastjson.JSON;
import pojo.User;


public class Login {
    public String data;
    public String json;
    public Login(String data) {
        this.data = data;
    }

    public Login() {
    }

    public String Return(String data){

        System.out.println("aaa"+data);
        //讲json已kv的形式存入User中
        User user= JSON.parseObject(data,User.class);
        String uid= user.getUid();
        String pwd= user.getPwd();
        System.out.println("==============="+data);
//        if (RedisOperating.exits(uid)){
//            if (pwd==RedisOperating.get(uid)){
//                return "t";
//            }
//            else
//                return "f";
//        }
//        else {
//            HbaseUtils hbaseUtils = new HbaseUtils();
//            Map<String,String> map = hbaseUtils.selectData("user",uid);
//            String res = map.get("pwd");
//            if (pwd==res)
//                return "t";
//            else
//                return "f";
//        }
        return data;
    }


}
