package com.ocean.pojo;

import com.ocean.annotation.groups.NameCheck;

import javax.validation.constraints.Max;

public class User {
    @Max(value = 1,message = "请注意大小！最大值为1！",groups = {NameCheck.class})
    private int male;

    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }
}
