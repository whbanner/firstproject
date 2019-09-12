package pojo;

import lombok.Data;

@Data
public class Register {
    private int phone;
    private String pwd;
    private String verificationCode;

}
