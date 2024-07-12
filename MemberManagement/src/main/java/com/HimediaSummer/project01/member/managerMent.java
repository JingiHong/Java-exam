package com.HimediaSummer.project01.member;

import com.HimediaSummer.project01.DTO.memberDTO;

public class managerMent {

    private Members members ;

    public managerMent() {
        members = new Members();
    }

    public void addMember(int memNum, String name, int age ){
        memberDTO memdto = new memberDTO(memNum, name, age);
        members.addMember(memdto);

        System.out.println(name + " 회원(이)가 추가되었습니다.");

    }

    public void getMember(int memNum){

        memberDTO memdto = members.getMember(memNum);

        System.out.println(" 조회한 회원 :  " + members.getMember(memNum));

        if (memNum == 0) {
            System.out.println("회원을 찾을 수 없습니다.");
        }

    }

    public void updateMember(int memNum, String name, int age ){

        members.updateMember(memNum, name, age);
        System.out.println(name + " 회원을 update 했습니다.");


    }

    public void deleteMember(int memNum){

        members.deleteMember(memNum);
        System.out.println("맴버를 delete 했습니다.");

    }


}
