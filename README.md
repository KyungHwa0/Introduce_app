# Introduce_app
자기소개 앱 만들기

### 구현 페이지
1. 로그인페이지 (SignInActivity)
* 아이디, 비밀번호를 입력받는 EditText를 넣어야함. (미리보기 글씨 있어야함)
* 비밀번호 EditText는 입력 내용이 가려져야 함.
* 로그인 버튼을 누르면 HomeActivity가 실행(Extra로 아이디를 넘겨줌)
* 아이디/비밀번호 모두 입력 되어야만 로그인 버튼이 실행. (“로그인 성공”이라는  토스트 메세지 출력)
* 아이디/비밀번호 중 하나라도 비어 있다면 “아이디/비밀번호를 확인해주세요” 라는 토스트 메세지 출력
* 회원가입 버튼을 누르면 SignUpActivity가 실행
2. 회원가입 페이지(SignUpActivity)
* 이름, 아이디, 비밀번호 모두 입력 되었을 때만 회원가입 버튼이 눌림
* 셋 중 하나라도 비어있으면 “입력되지 않은 정보가 있습니다.” 라는 토스트 메세지 출력
* 비밀번호 EditText는 입력 내용이 가려져야 함
* 회원가입 버튼이 눌리면 SignInActivity로 이동합니다. (finish 활용)
3. 자기소개 페이지(HomeActivity)
* SignInActivity에서 받은 extra data(아이디)를 화면에 표시
* 종료 버튼이 눌리면 SignInActivity로 이동. (finish 활용)

#### 추가기능
* 회원 가입페이지에서 입력한 아이디/비밀번호가 로그인 화면으로 돌아올 때 자동 입력되는 기능
* 자기소개 페이지가 시작될 때 5장 중 랜덤으로 1장의 사진이 표시

![로그인페이지](http://wagzack.synology.me/login.PNG)
![회원가입페이지](http://wagzack.synology.me/signup.PNG)  
![자기소개페이지](http://wagzack.synology.me/homepage.PNG)
![버튼클릭이벤트](http://wagzack.synology.me/selectButton.png)




