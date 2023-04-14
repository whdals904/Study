1장. Vue.js 소개

______양방향 데이터 바인딩
______가상 돔
______Vue.js의 장점
______Vue.js 현재와 향후 전망
__1.1 Vue.js 시작하기
____1.1.1 Node.js 설치 및 NPM 명령어 이해
________package.json을 만들기 위한 npm init
________패키지 설치를 위한 npm install, 삭제를 위한 npm uninstall
________npm start 명령을 이용한 실행
__1.1.2 VUE/CLI
__1.1.3 Visual Studio Code
________새로운 폴더 생성과 doc + tab 키를 이용한 index.html 기본 구조 만들기
________프로젝트를 실행하거나 패키지를 설치하는 방법
________scaffolding 기능
________Emmet 기능
________Lorem 문자열 입력하기
__1.1.4 Live Server
__1.1.5 Vue.js devtools 설치하기
__1.1.6 화살표 함수

2장. Vue.js 애플리케이션의 시작 - 뷰 인스턴스

__2.1 template 프로퍼티
__2.2 methods 프로퍼티
__2.3 computed 프로퍼티
____2.3.1 computed 프로퍼티를 이용한 필터링
__2.4 props 프로퍼티
__2.5 watch 프로퍼티
__2.6 한 페이지 내에서 다수의 뷰 인스턴스
__2.7 뷰 인스턴스 생존 주기

3장. 엘리먼트에 기능을 덧붙이는 디렉티브

__3.1 v-if, v-for를 이용한 흐름제어
____3.1.1 v-if, v-if … v-else, v-if … v-else-if … v-else 구문
____3.1.2 v-if와 v-show의 비교
____3.1.3 v-for를 이용한 반복 처리
__3.2 v-bind를 이용한 데이터 바인딩
____3.2.1 스타일을 적용하기 위한 v-bind:class, v-bind:style
____3.2.3 이미지 연결을 위한 v-bind:src와 링크 연결을 위한 v:bind:href
__3.3 v-model을 이용한 양방향 데이터 바인딩
__3.4 v-on을 이용한 이벤트 처리
____3.4.1 v-for를 이용해 컬렉션 이벤트 처리하기
____3.4.2 하나의 HTML 엘리먼트에 여러 개의 이벤트 적용하기
____3.4.3 이벤트 수식어

4장. 재사용이 가능한 레고(Lego)와 같은 컴포넌트

__4.1 컴포넌트의 정의 및 등록
____4.1.1 CDN을 이용한 방법
____4.1.2 VUE/CLI를 이용한 방법
__4.2 컴포넌트 적용 범위 이해하기
____4.2.1 CDN을 이용한 전역(global), 지역(local) 적용 이해하기
____4.2.2 VUE/CLI를 이용한 전역(global), 지역(local) 적용 이해하기
__4.3 컴포넌트 간 데이터 전달하기
____4.3.1 props 프로퍼티를 이용해 부모 컴포넌트에서 자녀 컴포넌트로 데이터 전달
____4.3.2 $emit( ) 메서드로 자녀 컴포넌트에서 부모 컴포넌트로 데이터 전달
________CDN을 이용한 방법
________Vue CLI를 이용한 방법
____4.3.3 이벤트 버스를 이용한 데이터 전달
________이벤트 버스의 초기화
________이벤트 버스의 사용
________CDN을 이용한 방법
________Vue CLI를 이용한 방법
__4.4 슬롯 사용하기
____4.4.1 Unnamed slot
____4.4.2 Named slot
____4.4.3 Scoped slot
____4.4.4 v-slot

5장 다양한 장치 디자인에 적합한 Materialize, Vuetify

__5.1 Materialize를 이용한 스타일링
________Materialize 다운로드 및 설치
____5.1.1 색, 정렬
____5.1.2 Image, Icon, Video
____5.1.3 장치의 화면 크기에 따른 Hide/Show Content 기능
____5.1.4 Grid
________반응형 레이아웃
________offset
________컬럼의 순서 바꾸기 push, pull
____5.1.5 Button
____5.1.6 Table
____5.1.7 Card
____5.1.8 Navbar
____5.1.9 Slider
____5.1.10 Autocomplete
____5.1.11 Scrollspy
__5.2 Vuetify를 이용한 스타일링
____5.2.1 Color, Text
____5.2.2 v-btn, v-icon
________v-btn
________v-icon
____5.2.3 Breakpoints, Visibility
____5.2.4 그리드 시스템
________v-container
________v-layout
________v-flex
____5.2.5 v-dialog
________Modal 형태의 대화상자
________Form 형태의 대화상자
____5.2.6 v-toolbar, v-navigation-drawer
__5.3 Vue.js + Cloud Firestore를 이용한 실시간 채팅 프로그램 만들기
________채팅 프로그램 구조
____5.3.1 Firebase 설정하기
____5.3.2 Vue 프로젝트 생성
________Firebase 연결을 위한 파일 추가
________디자인을 위한 css, icon 추가
________라우팅 기능을 위한 router.js 설정하기

6장. 사용자로부터 데이터 입력 및 서버로 데이터 전달을 위한 Forms

__6.1 Form 관련 엘리먼트에 대한 이해
____6.1.1 한 행(row) 텍스트 입력을 위한 input 엘리먼트와 v-model
____6.1.2 멀티 행 텍스트 입력을 위한 textarea 엘리먼트와 v-model
____6.1.3 옵션 선택 가능한 checkbox와 v-model
____6.1.4 선택 가능한 다수의 아이템을 바인딩하는 select
____6.1.5 v-model 수식어을 이용한 공백 제거, data 프로퍼티 지연 업데이트
__6.2 유효성 검사
____6.2.1 vue.js에서의 기본적인 유효성 검사
____6.2.2 Vuetify를 이용한 form 유효성 검사

7장. 웹사이트 탐색을 위한 라우팅

__7.1 vue-router로 라우팅 프로젝트 생성하기
__7.2 라우터 뷰, 라우터 링크, 리다이렉트
__7.3 중첩된 라우트
__7.4 Named Routes와 Named Views
________Named Route
________Named View
__7.5 네비게이션 가드
____7.5.1 컴포넌트 수준의 Guard 메서드
________beforeRouteEnter( ) 메서드
________beforeRouteLeave( ) 메서드
________beforeRouteUpdate() 메서드
____7.5.2 Per-Route Guard
____7.5.3 전역 Navigation Guard

8장. 효율적인 데이터 관리를 위한 Vuex

__8.1 Vuex 패키지 설치하기
__8.2 Getters
__8.3 Mutations
__8.4 Actions
__8.5 mapState, mapGetters, mapMutations, mapActions
__8.6 Mutations와 Actions의 차이점

9장. MEVN(MongoDB, Express, Vue, Node.js) 기반 RESTful 서비스

__9.1 REST 정의 및 개념 이해하기
________REST의 정의
________REST의 제약 조건
________RESTful 웹서비스
__9.2 콜백, promise 이해하기
____9.2.1 동기와 비동기
____9.2.2 콜백함수, callback Hell
____9.2.3 Promise
________promise 생성하기
________promise.then() 메서드
________promise.catch() 메서드
____9.2.4 Promise Chaining
____9.2.5 async/await를 이용한 비동기 처리
__9.3 Axios
____9.3.1 GET 요청
________응답 객체
________에러 객체
____9.3.2 POST request
____9.3.3 PUT request
____9.3.4 DELETE request
__9.4 MongoDB
________다운로드 및 설치
____9.4.1 데이터 추가(CREATE)
____9.4.2 데이터 검색(READ)
____9.4.3 데이터 수정(UPDATE)
____9.4.4 데이터 삭제(DELETE)
____9.4.5 save( ) 메서드로 데이터 추가, 수정
__9.5 Node.js + MongoDB를 이용한 RESTful 서비스 만들기
____9.5.1 Express.js
____9.5.2 RESTful 서비스 서버 + MongoDB
____9.5.3 Postman을 이용한 REST 서비스 테스팅
________데이터 추가(POST)
________데이터 검색(GET)
________데이터 업데이트(PUT)
________데이터 삭제(DELETE)
__9.6 Vue.js + RESTful 서비스 + MongoDB
________데이터 추가하기
________데이터 수정하기
________데이터 삭제하기