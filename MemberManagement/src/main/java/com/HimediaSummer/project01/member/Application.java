package com.HimediaSummer.project01.member;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int memNum;
        String name;
        int age;

        managerMent managerMent = new managerMent();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원 추가");
            System.out.println("2. 회원 조회");
            System.out.println("3. 회원 수정");
            System.out.println("4. 회원 삭제");
            System.out.println("9. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int num = sc.nextInt();
            sc.nextLine();

            switch (num){
                case 1:
                    System.out.print("추가할 회원이름: ");
                    name = sc.nextLine();
                    System.out.print("추가할 회원코드: ");
                    memNum = sc.nextInt();
                    System.out.print("추가할 회원나이: ");
                    age = sc.nextInt();
                    managerMent.addMember(memNum, name, age);
                    break;

                case 2:
                    System.out.print("조회할 회원코드: ");
                    memNum = sc.nextInt();
                    System.out.println("조회한 코드: " + memNum);
                    managerMent.getMember(memNum);
                    break;

                case 3:
                    System.out.print("수정할 회원코드 : ");
                    memNum = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("수정할 회원이름 : ");
                    name  = sc.nextLine();
                    System.out.print("수정할 회원나이 : ");
                    age = sc.nextInt();
                    managerMent.updateMember(memNum, name, age);
                    break;

                case 4:
                    System.out.print("삭제할 회원코드 : ");
                    memNum = sc.nextInt();
                    managerMent.deleteMember(memNum);
                    break;

                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
