package com.HimediaSummer.project01.member;

import com.HimediaSummer.project01.DTO.memberDTO;

public class manageMent {

    private memberController memberController;

    public manageMent() {
        memberController = new memberController();
    }

    public void addMember(int memNum, String name, int age ){
        memberDTO memdto = new memberDTO(memNum, name, age);

//        cafe.addMember(memdto);
        memberController.addMember(memdto);

        System.out.println(" >>>>>>>> 회원이 추가되었습니다.");

    }

    public void getMember(int memNum){

        memberDTO memdto = memberController.getMember(memNum);


        System.out.println(" 조회된 회원 :  " + memberController.getMember(memNum));

        if ( memberController.getMember(memNum) == null) {
            System.out.println(" >>>>>>>> 등록된 회원을 찾을 수 없습니다.");
        }

    }

    public void updateMember(int memNum, String name, int age ){

        memberController.updateMember(memNum, name, age);
        System.out.println(" >>>>>>>> 회원정보를 수정 했습니다. ");


    }

    public void deleteMember(int memNum){

        memberController.deleteMember(memNum);
        System.out.println(" >>>>>>>> 회원정보를 삭제 했습니다.");

    }


}
