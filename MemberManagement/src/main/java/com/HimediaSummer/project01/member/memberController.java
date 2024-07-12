package com.HimediaSummer.project01.member;

import com.HimediaSummer.project01.DTO.memberDTO;

import java.util.ArrayList;
import java.util.List;

<<<<<<<< HEAD:MemberManagement/src/main/java/com/HimediaSummer/project01/member/Members.java
public class Members {

    private List<memberDTO> members;

    public Members() {
========
public class memberController {

    private List<memberDTO> members;

    public memberController() {
>>>>>>>> 126107da959b65551c5b0581dd1818505b741897:MemberManagement/src/main/java/com/HimediaSummer/project01/member/memberController.java
        members = new ArrayList<>();
    }

    public void addMember(memberDTO memberNum) {
        members.add(memberNum);
    }

    public void addName(memberDTO memberName){
        members.add(memberName);
    }

    public memberDTO getMember(int memNum) {
        for (memberDTO memdto : members) {
            if (memdto.getMemNum() == memNum) {
                return memdto;
            }
        }
        return null;
    }

    public void updateMember(int memNum, String name, int age) {
        memberDTO memdto = getMember(memNum);
        if (memdto != null) {
            memdto.setName(name);
            memdto.setAge(age);
        }
    }

    public void deleteMember(int memNum) {
        members.removeIf(memdto -> memdto.getMemNum() == memNum);
    };

}
