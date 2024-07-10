package com.HimediaSummer.project01.member;

import com.HimediaSummer.project01.DTO.memberDTO;

public class managerMent {

    private Cafe cafe ;

    public managerMent() {
        cafe = new Cafe();
    }

    public void addMember(int memNum, String name, int age ){
        memberDTO memdto = new memberDTO(memNum, name, age);

        memberDTO.addMember(memdto);

        view.displayMessage("도서가 추가되었습니다.");

    }

    public void getMember(int memNum){

    }

    public void updateMember(int memNum, String name, int age ){

    }

    public void deleteMember(int memNum){

    }


}
