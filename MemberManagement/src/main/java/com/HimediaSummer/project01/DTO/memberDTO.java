package com.HimediaSummer.project01.DTO;

public class memberDTO {
    int memNum;
    String name;
    int age;

    public memberDTO(int memNum, String name, int age) {
        this.memNum = memNum;
        this.name = name;
        this.age = age;
    }

    public int getMemNum() {
        return memNum;
    }

    public void setMemNum(int memNum) {
        this.memNum = memNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return  "\n" +
                "[회원 코드] = " + "[" + memNum + "]\n" +
                "[회원 이름] = " + "[" + name + "]\n" +
                "[회원 나이] = " + "[" + age + "]";
=======
        return "회원정보 [ " +
                "회원번호 = " + memNum +
                ", 회원이름 = '" + name + '\'' +
                ", 회원나이 = " + age +
                ']';
>>>>>>> 126107da959b65551c5b0581dd1818505b741897
    }
}
