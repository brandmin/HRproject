# ⭐️Portfolio - HRproject

<!-- contents -->
<details open="open">
  <summary>Contents</summary>
  <ol>
    <li>
      <a href="#개요">개요</a>
    </li>
    <li>
      <a href="#내용">내용</a>
    </li>
    <li><a href="#구현기능">구현기능</a>
      <ul>
        <li><a href="#notice">공지사항 게시판</a></li>
        <li><a href="#member">관리자 - 사원관리</a></li>
        <li><a href="#board">관리자 - 사원업무관리</a></li>
        <li><a href="#reply">관리자 - 부서관리</a></li>
        <li><a href="#member">사원 - 사원조회</a></li>
        <li><a href="#board">사원 - 사원업무조회</a></li>
        <li><a href="#reply">사원 - 부서조회</a></li>
      </ul>
    </li>
  </ol>
</details>

----------
# 📝개요

* 프로젝트 명: HRProject

* 일정: 2023년 10월 31일 ~ 2023년 11월 9일

* 개발 목적: 오라클 데이터베이스 테이블을 활용하여 인사관리 할 수 있는 웹사이트 제작

* 개발 환경
  - Server: Apache-tomcat-9.0.0
  - Java EE: Eclipse (version 2023-06)
  - Database: Oracle SQL developer
  - Language: Java, jsp/Servlet, HTML, CSS, JavaScript, SQL
  - Framework: Spring Tool suite 3.9.1
----------
  # 📝내용
  
* 팀원 역할
  - 공통:  웹사이트 UI 기획, ERD 설계
  - 신민하: 총괄 및 조장, ppt준비, 사원메뉴 데이터 조회기능 구현
  - 신수인: 공지사항 및 게시판 CRUD
  - 임지선: 웹사이트 UI설계,  반응형 웹 메뉴바 구현
  - 이도민: 관리자, 사원 홈페이지 조회 기능 중 검색창 구현, 사원메뉴 전체 조회와 조인한 테이블 정보 기능 구현
  - 심기훈: 로그인 UI 폼 구현
  - 김보성: 로그인 UI 폼 구현, 코드 유지보수
  - 박다진솔: 업무 조회 구현(조인 관련 기능)

* 구현 기능
  - 공지사항/게시판 CRUD
  - 로그인 UI 및 로그인 폼 구현
  - 관리자 기능(사원관리, 부서관리, 업무관리) CRUD
  - 사원 기능(사원관리, 부서관리, 업무관리) Read

 * DB ERD 설계
![image](https://github.com/brandmin/HRproject/assets/82518048/98e49363-37c6-4e54-96c6-b16e7d2e9ff5)

----------   
# 📝구현기능

## 로그인 UI, 로그인 실패했을 때
![image](https://github.com/brandmin/HRproject/assets/82518048/c0abcae2-f6c3-4b14-8446-1ac351c617d9)
![image](https://github.com/brandmin/HRproject/assets/82518048/e00b4456-0a85-4550-9a51-ac1a606521f2)

* 설명
  - 관리자 사번을 100번을 ID로 지정하고 사원 사번 101번~109번을 지정.
  - 아이디와 비밀번호 둘 중 하나를 잘못 입력했을경우 로그인 실패 경고창을 띄움

## 로그인 성공했을때 관리자와 사원 화면
![image](https://github.com/brandmin/HRproject/assets/82518048/6c789abc-be6a-4d95-b4b5-f62f1bac4f96)
![image](https://github.com/brandmin/HRproject/assets/82518048/fec18191-987d-40c0-9581-c49fa3a8f133)

* 설명
  - 관리자/사원으로 로그인했을경우 해당 UI화면 출력

## 관리자용 공지사항/게시판 페이지
![image](https://github.com/brandmin/HRproject/assets/82518048/b6e8af3f-98d4-495d-aa77-e17bee355ad3)
![image](https://github.com/brandmin/HRproject/assets/82518048/5100778c-9baf-4530-8453-16311c9eb16a)
![image](https://github.com/brandmin/HRproject/assets/82518048/1ad68f62-e558-48a2-94ac-7c6e31820403)

* 설명
  - 관리자는 공지사항/게시판에 작성버튼을 누르면 해당 게시글을 작성할 수 있고 등록버튼을 누르면 글이 게시됨.
  - 사원도 이용이 가능하지만 현재 공지사항/게시판 기능은 읽기 조회만 가능하도록 하였음
  
## 관리자용 사원등록
![image](https://github.com/brandmin/HRproject/assets/82518048/035e8a11-cf4a-4117-a29f-b675240a0fc3)
![image](https://github.com/brandmin/HRproject/assets/82518048/ba2158ee-ec87-4034-aa83-01487fb1852f)

* 설명
  - 상단 메뉴바에 사원등록을 클릭하면 해당 사원등록UI 폼이 나오게 됨.
  - department_id는 department 테이블에서 가져온 외래키이기 때문에 department테이블의 값들을 가져와야함
  - register 버튼을 누르게 되면 해당 데이터가 출력.

## 관리자용 전체 사원 조회 및 수정
![image](https://github.com/brandmin/HRproject/assets/82518048/ee8e943e-b0a7-4e48-80e8-e10ad7c29525)
![image](https://github.com/brandmin/HRproject/assets/82518048/76b86b65-5763-40ef-9cf9-9426d6f050cd)
![image](https://github.com/brandmin/HRproject/assets/82518048/90ae50cd-f8f4-488c-b5c3-9426a343b3e6)

* 설명
  - 상단 메뉴바 전체 사원 조회 및 수정을 클릭하면 아래에 직원정보 데이터 출력.
  - 해당 직원의 사번을 입력 후 조회버튼 클릭시 해당 사번의 데이터만 출력되게 구현.
  - 이메일 링크를 클릭하면 한명의 데이터가 화면에 출력되고 수정 혹은 삭제가 가능하다.
  - 현재 수정은 이메일만 변경이 가능하도록 구현하였음.

## 관리자용 사원 업무 관리(등록, 조회, 수정)
![image](https://github.com/brandmin/HRproject/assets/82518048/c8b20b40-5d59-4e96-9640-cbf501a78d9f)
![image](https://github.com/brandmin/HRproject/assets/82518048/2de82101-2b51-40e9-8c62-65b4666dc426)
![image](https://github.com/brandmin/HRproject/assets/82518048/3ecba9d9-08de-47f2-ad15-707fc3da44b1)
![image](https://github.com/brandmin/HRproject/assets/82518048/94b9bf7a-c588-4731-8ab4-b70858acdfbd)

* 설명
  - 사원 업무 관리 메뉴바에서 사원업무 조회 및 수정을 클릭시 아래에 해당 데이터 출력
  - 해당 업무 데이터를 입력 후 조회버튼을 누르면 특정 데이터 화면에 출력
  - 사원 업무 관리 메뉴바 중 사원업무 등록 클릭시 사원 업무를 등록할 수 있는 해당 링크로 이동되어 폼 출력.
  - job_title을 클릭하면 최소 월급이 얼마인지 확인이 가능하고 수정버튼을 누르면 수정이 가능하도록 구현.

## 관리자용 부서관리(등록, 조회, 수정)
![image](https://github.com/brandmin/HRproject/assets/82518048/3edbbb1d-01c6-4407-ae65-6cb946f0c57f)
![image](https://github.com/brandmin/HRproject/assets/82518048/840273f6-b27e-4845-ac4f-12fcfc817587)
![image](https://github.com/brandmin/HRproject/assets/82518048/81e7c180-b2b1-4a5f-b753-5245cabb8101)

* 설명
  - 해당 부서 데이터를 등록하면 부서 정보 데이터가 화면에 출력이 되고 부서ID를 검색하면 해당 데이터가 출력
  - 수정 버튼을 누르면 부서 담당매니저 ID를 수정할 수 있게 활성화함.

## 사원용 사원관리(사원 조회, 직원 및 부서 정보 조회)
![image](https://github.com/brandmin/HRproject/assets/82518048/1ef5e606-469f-4dfd-8905-0ecd50031c68)
![image](https://github.com/brandmin/HRproject/assets/82518048/bd893cce-25e1-4d80-bcc7-8b9aeb56dea2)
![image](https://github.com/brandmin/HRproject/assets/82518048/bff1e96d-4ab4-4719-aa87-377410562ea8)
![image](https://github.com/brandmin/HRproject/assets/82518048/7c49f912-a7b3-472d-9da9-11b09919dd8f)
![image](https://github.com/brandmin/HRproject/assets/82518048/348bc856-d4d9-484d-af18-3469825a7ed2)
![image](https://github.com/brandmin/HRproject/assets/82518048/7b0f7471-afe3-4fd4-afef-52a961f9690e)
![image](https://github.com/brandmin/HRproject/assets/82518048/69587ee3-8bca-43f5-a405-66ed66729cf6)

* 설명
  - 사원은 해당 사번을 입력하면 사원의 데이터가 출력.
  - 사원은 조회만 가능.
  - 메인 홈페이지로 이동 하이퍼링크를 설정하여 해당 링크로 이동하게 구현.
  - 사원 업무관리에서 job_id를 입력 후 검색하면 해당 데이터 화면에 출력
  - 부서관리에서 department_id를 입력하면 해당 데이터 화면에 출력
---

# 📝 프로젝트 하면서 부족했던 점
- 학원에서 배운 토대로 해당 아이디와 비밀번호 입력 후 로그인 버튼을 누르면 로그인 성공페이지로 이동하기 위한 서블릿 코드 경로를 구현하였지만 해당 데이터가 출력되질 않음.
  그래서, 학원에서 배운 예제를 기반으로 복습 후 경로 다시 설정하였더니 출력됨. 여전히 부족하다고 생각하여 servlet에 대한 유튜브 영상을 참고하여 학습할 생각.
