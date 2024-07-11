package com.HimediaSummer.project01.member;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        manageMent manageMent = new manageMent();

        int memNum;
        String name;
        int age;

        boolean loop = true;

        while (loop == true) {

            System.out.println("=======================");
            System.out.println("  회원 관리 프로그램");
            System.out.println("  1. 회원 추가");
            System.out.println("  2. 회원 조회");
            System.out.println("  3. 회원 수정");
            System.out.println("  4. 회원 삭제");
            System.out.println("  9. 종료");
            System.out.println("=======================");
            System.out.print("메뉴를 선택하세요: ");

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            switch (num){
                case 1:
                    System.out.print("추가할 회원이름: ");
                    name = sc.next();
                    System.out.print("추가할 회원코드: ");
                    memNum = sc.nextInt();
                    System.out.print("추가할 회원나이: ");
                    age = sc.nextInt();
                    manageMent.addMember(memNum, name, age);
                    break;

                case 2:
                    System.out.print("조회할 회원코드: ");
                    memNum = sc.nextInt();
                    System.out.println("memNum =  " + memNum);
                    manageMent.getMember(memNum);
                    break;

                case 3:
                    System.out.print("수정할 회원코드 : ");
                    memNum = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("수정할 회원이름 : ");
                    name  = sc.nextLine();
                    System.out.print("수정할 회원나이 : ");
                    age = sc.nextInt();
                    manageMent.updateMember(memNum, name, age);
                    break;

                case 4:
                    System.out.print("삭제할 회원코드 : ");
                    memNum = sc.nextInt();
                    manageMent.deleteMember(memNum);
                    break;

                case 9:
                    System.out.println("-------- End Of Program -------");
                    System.out.println("---------- 감사합니다 ---------");
                    sc.close();
                    return;

                default:
                    System.out.println(" >>>>>>>> [ERROR] 잘못된 입력입니다.");
            }
        }
    }
}
