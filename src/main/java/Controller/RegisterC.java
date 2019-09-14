package Controller;

import com.alibaba.fastjson.JSON;
import pojo.Register;

public class RegisterC {
    public String data;
    public String json;

    public RegisterC() {
    }

    public RegisterC(String data) {
        this.data = data;
    }
    public String Return(String data){
        Register register = JSON.parseObject(data,Register.class);
        int phone = register.getPhone();
        String pwd =register.getPwd();
        String verificationCode =register.getVerificationCode();
        return data;
    }
}
