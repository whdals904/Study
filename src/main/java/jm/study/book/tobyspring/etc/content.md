1장 오브젝트와 의존관계
1.1 초난감 DAO
1.1.1 User
1.1.2 UserDao
1.1.3 main()을 이용한 DAO 테스트 코드
1.2 DAO의 분리
1.2.1 관심사의 분리
1.2.2 커넥션 만들기의 추출
UserDao의 관심사항
중복 코드의 메소드 추출
변경사항에 대한 검증: 리팩토링과 테스트
1.2.3 DB 커넥션 만들기의 독립
상속을 통한 확장
1.3 DAO의 확장
1.3.1 클래스의 분리
1.3.2 인터페이스의 도입
1.3.3 관계설정 책임의 분리
1.3.4 원칙과 패턴
개방 폐쇄 원칙
높은 응집도와 낮은 결합도
전략 패턴
1.4 제어의 역전(IoC)
1.4.1 오브젝트 팩토리
팩토리
설계도로서의 팩토리
1.4.2 오브젝트 팩토리의 활용
1.4.3 제어권의 이전을 통한 제어관계 역전
1.5 스프링의 IoC
1.5.1 오브젝트 팩토리를 이용한 스프링 IoC
애플리케이션 컨텍스트와 설정정보
DaoFactory를 사용하는 애플리케이션 컨텍스트
1.5.2 애플리케이션 컨텍스트의 동작방식
1.5.3 스프링 IoC의 용어 정리
1.6 싱글톤 레지스트리와 오브젝트 스코프
1.6.1 싱글톤 레지스트리로서의 애플리케이션 컨텍스트
서버 애플리케이션과 싱글톤
싱글톤 패턴의 한계
싱글톤 레지스트리
1.6.2 싱글톤과 오브젝트의 상태
1.6.3 스프링 빈의 스코프
1.7 의존관계 주입(DI)
1.7.1 제어의 역전(IoC)과 의존관계 주입
1.7.2 런타임 의존관계 설정
의존관계
UserDao의 의존관계
UserDao의 의존관계 주입
1.7.3 의존관계 검색과 주입
1.7.4 의존관계 주입의 응용
기능 구현의 교환
부가기능 추가
1.7.5 메소드를 이용한 의존관계 주입
1.8 XML을 이용한 설정
1.8.1 XML 설정
connectionMaker() 전환
userDao() 전환
XML의 의존관계 주입 정보
1.8.2 XML을 이용하는 애플리케이션 컨텍스트
1.8.3 DataSource 인터페이스로 변환
DataSource 인터페이스 적용
자바 코드 설정 방식
XML 설정 방식
1.8.4 프로퍼티 값의 주입
값 주입
value 값의 자동 변환
1.9 정리
2장 테스트
2.1 UserDaoTest 다시 보기
2.1.1 테스트의 유용성
2.1.2 UserDaoTest의 특징
웹을 통한 DAO 테스트 방법의 문제점
작은 단위의 테스트
자동수행 테스트 코드
지속적인 개선과 점진적인 개발을 위한 테스트
2.1.3 UserDaoTest의 문제점
2.2 UserDaoTest 개선
2.2.1 테스트 검증의 자동화
2.2.2 테스트의 효율적인 수행과 결과 관리
JUnit 테스트로 전환
테스트 메소드 전환
검증 코드 전환
JUnit 테스트 실행
2.3 개발자를 위한 테스팅 프레임워크 JUnit
2.3.1 JUnit 테스트 실행 방법
IDE
빌드 툴
2.3.2 테스트 결과의 일관성
deleteAll()의 getCount() 추가
deleteAll()과 getCount()의 테스트
동일한 결과를 보장하는 테스트
2.3.3 포괄적인 테스트
getCount() 테스트
addAndGet() 테스트 보완
get() 예외조건에 대한 테스트
테스트를 성공시키기 위한 코드의 수정
포괄적인 테스트
2.3.4 테스트가 이끄는 개발
기능설계를 위한 테스트
테스트 주도 개발
2.3.5 테스트 코드 개선
@Before
픽스처
2.4 스프링 테스트 적용
2.4.1 테스트를 위한 애플리케이션 컨텍스트 관리
스프링 테스트 컨텍스트 프레임워크 적용
테스트 메소드의 컨텍스트 공유
테스트 클래스의 컨텍스트 공유
@Autowired
2.4.2 DI와 테스트
테스트 코드에 의한 DI
테스트를 위한 별도의 DI 설정
컨테이너 없는 DI 테스트
DI를 이용한 테스트 방법 선택
2.5 학습 테스트로 배우는 스프링
2.5.1 학습 테스트의 장점
2.5.2 학습 테스트 예제
JUnit 테스트 오브젝트 테스트
스프링 테스트 컨텍스트 테스트
2.5.3 버그 테스트
2.6 정리
3장 템플릿
3.1 다시 보는 초난감 DAO
3.1.1 예외처리 기능을 갖춘 DAO
JDBC 수정 기능의 예외처리 코드
JDBC 조회 기능의 예외처리
3.2 변하는 것과 변하지 않는 것
3.2.1 JDBC try/catch/finally 코드의 문제점
3.2.2 분리와 재사용을 위한 디자인 패턴 적용
메소드 추출
템플릿 메소드 패턴의 적용
전략 패턴의 적용
DI 적용을 위한 클라이언트/컨텍스트 분리
3.3 JDBC 전략 패턴의 최적화
3.3.1 전략 클래스의 추가 정보
3.3.2 전략과 클라이언트의 동거
로컬 클래스
익명 내부 클래스
3.4 컨텍스트와 DI
3.4.1 JdbcContext의 분리
클래스 분리
빈 의존관계 변경
3.4.2 JdbcContext의 특별한 DI
스프링 빈으로 DI
코드를 이용하는 수동 DI
3.5 템플릿과 콜백
3.5.1 템플릿/콜백의 동작원리
템플릿/콜백의 특징
JdbcContext에 적용된 템플릿/콜백
3.5.2 편리한 콜백의 재활용
콜백의 분리와 재활용
콜백과 템플릿의 결합
3.5.3 템플릿/콜백의 응용
테스트와 try/catch/finally
중복의 제거와 템플릿/콜백 설계
템플릿/콜백의 재설계
제네릭스를 이용한 콜백 인터페이스
3.6 스프링의 JdbcTemplate
3.6.1 update()
3.6.2 queryForInt()
3.6.3 queryForObject()
3.6.4 query()
기능 정의와 테스트 작성
query() 템플릿을 이용하는 getAll() 구현
테스트 보완
3.6.5 재사용 가능한 콜백의 분리
DI를 위한 코드 정리
중복 제거
템플릿/콜백 패턴과 UserDao
3.7 정리
4장 예외
4.1 사라진 SQLException
4.1.1 초난감 예외처리
예외 블랙홀
무의미하고 무책임한 throws
4.1.2 예외의 종류와 특징
4.1.3 예외처리 방법
예외 복구
예외처리 회피
예외 전환
4.1.4 예외처리 전략
런타임 예외의 보편화
add() 메소드의 예외처리
애플리케이션 예외
4.1.5 SQLException은 어떻게 됐나?
4.2 예외 전환
4.2.1 JDBC의 한계
비표준 SQL
호환성 없는 SQLException의 DB 에러정보
4.2.2 DB 에러 코드 매핑을 통한 전환
4.2.3 DAO 인터페이스와 DataAccessException 계층구조
DAO 인터페이스와 구현의 분리
데이터 액세스 예외 추상화와 DataAccessException 계층구조
4.2.4 기술에 독립적인 UserDao 만들기
인터페이스 적용
테스트 보완
DataAccessException 활용 시 주의사항
4.3 정리
5장 서비스 추상화
5.1 사용자 레벨 관리 기능 추가
5.1.1 필드 추가
Level 이늄
User 필드 추가
UserDaoTest 테스트 수정
UserDaoJdbc 수정
5.1.2 사용자 수정 기능 추가
수정 기능 테스트 추가
UserDao와 UserDaoJdbc 수정
수정 테스트 보완
5.1.3 UserService.upgradeLevels()
UserService 클래스와 빈 등록
UserServiceTest 테스트 클래스
upgradeLevels() 메소드
upgradeLevels() 테스트
5.1.4 UserService.add()
5.1.5 코드 개선
upgradeLevels() 메소드 코드의 문제점
upgradeLevels() 리팩토링
User 테스트
UserServiceTest 개선
5.2 트랜잭션 서비스 추상화
5.2.1 모 아니면 도
테스트용 UserService 대역
강제 예외 발생을 통한 테스트
테스트 실패의 원인
5.2.2 트랜잭션 경계설정
JDBC 트랜잭션의 트랜잭션 경계설정
UserService와 UserDao의 트랜잭션 문제
비즈니스 로직 내의 트랜잭션 경계설정
UserService 트랜잭션 경계설정의 문제점
5.2.3 트랜잭션 동기화
Connection 파라미터 제거
트랜잭션 동기화 적용
트랜잭션 테스트 보완
JdbcTemplate과 트랜잭션 동기화
5.2.4 트랜잭션 서비스 추상화
기술과 환경에 종속되는 트랜잭션 경계설정 코드
트랜잭션 API의 의존관계 문제와 해결책
스프링의 트랜잭션 서비스 추상화
트랜잭션 기술 설정의 분리
수직, 수평 계층구조와 의존관계
5.3 서비스 추상화와 단일 책임 원칙
단일 책임 원칙
단일 책임 원칙의 장점
5.4 메일 서비스 추상화
5.4.1 JavaMail을 이용한 메일 발송 기능
JavaMail 메일 발송
5.4.2 JavaMail이 포함된 코드의 테스트
5.4.3 테스트를 위한 서비스 추상화
JavaMail을 이용한 테스트의 문제점
메일 발송 기능 추상화
테스트용 메일 발송 오브젝트
테스트와 서비스 추상화
5.4.4 테스트 대역
의존 오브젝트의 변경을 통한 테스트 방법
테스트 대역의 종류와 특징
목 오브젝트를 이용한 테스트
5.5 정리
6장 AOP
6.1 트랜잭션 코드의 분리
6.1.1 메소드 분리
6.1.2 DI를 이용한 클래스의 분리
DI 적용을 이용한 트랜잭션 분리
UserService 인터페이스 도입
분리된 트랜잭션 기능
트랜잭션 적용을 위한 DI 설정
트랜잭션 분리에 따른 테스트 수정
트랜잭션 경계설정 코드 분리의 장점
6.2 고립된 단위 테스트
6.2.1 복잡한 의존관계 속의 테스트
6.2.2 테스트 대상 오브젝트 고립시키기
테스트를 위한 UserServiceImpl 고립
고립된 단위 테스트 활용
UserDao 목 오브젝트
테스트 수행 성능의 향상
6.2.3 단위 테스트와 통합 테스트
6.2.4 목 프레임워크
Mockito 프레임워크
6.3 다이내믹 프록시와 팩토리 빈
6.3.1 프록시와 프록시 패턴, 데코레이터 패턴
데코레이터 패턴
프록시 패턴
6.3.2 다이내믹 프록시
프록시의 구성과 프록시 작성의 문제점
리플렉션
프록시 클래스
다이내믹 프록시 적용
다이내믹 프록시의 확장
6.3.3 다이내믹 프록시를 이용한 트랜잭션 부가기능
트랜잭션 InvocationHandler
TransactionHandler와 다이내믹 프록시를 이용하는 테스트
6.3.4 다이내믹 프록시를 위한 팩토리 빈
팩토리 빈
팩토리 빈의 설정 방법
다이내믹 프록시를 만들어주는 팩토리 빈
트랜잭션 프록시 팩토리 빈
트랜잭션 프록시 팩토리 빈 테스트
6.3.5 프록시 팩토리 빈 방식의 장점과 한계
프록시 팩토리 빈의 재사용
프록시 팩토리 빈 방식의 장점
프록시 팩토리 빈의 한계
6.4 스프링의 프록시 팩토리 빈
6.4.1 ProxyFactoryBean
어드바이스: 타깃이 필요 없는 순수한 부가기능
포인트컷: 부가기능 적용 대상 메소드 선정 방법
6.4.2 ProxyFactoryBean 적용
TransactionAdvice
스프링 XML 설정파일
테스트
어드바이스와 포인트컷의 재사용
6.5 스프링 AOP
6.5.1 자동 프록시 생성
중복 문제의 접근 방법
빈 후처리기를 이용한 자동 프록시 생성기
확장된 포인트컷
포인트컷 테스트
6.5.2 DefaultAdvisorAutoProxyCreator의 적용
클래스 필터를 적용한 포인트컷 작성
어드바이저를 이용하는 자동 프록시 생성기 등록
포인트컷 등록
어드바이스와 어드바이저
ProxyFactoryBean 제거와 서비스 빈의 원상복구
자동 프록시 생성기를 사용하는 테스트
자동생성 프록시 확인
6.5.3 포인트컷 표현식을 이용한 포인트컷
포인트컷 표현식
포인트컷 표현식 문법
포인트컷 표현식 테스트
포인트컷 표현식을 이용하는 포인트컷 적용
타입 패턴과 클래스 이름 패턴
6.5.4 AOP란 무엇인가?
트랜잭션 서비스 추상화
프록시와 데코레이터 패턴
다이내믹 프록시와 프록시 팩토리 빈
자동 프록시 생성 방법과 포인트컷
부가기능의 모듈화
AOP: 애스펙트 지향 프로그래밍
6.5.5 AOP 적용기술
프록시를 이용한 AOP
바이트코드 생성과 조작을 통한 AOP
6.5.6 AOP의 용어
6.5.7 AOP 네임스페이스
AOP 네임스페이스
어드바이저 내장 포인트컷
6.6 트랜잭션 속성
6.6.1 트랜잭션 정의
트랜잭션 전파
격리수준
제한시간
읽기전용
6.6.2 트랜잭션 인터셉터와 트랜잭션 속성
TransactionInterceptor
메소드 이름 패턴을 이용한 트랜잭션 속성 지정
tx 네임스페이스를 이용한 설정 방법
6.6.3 포인트컷과 트랜잭션 속성의 적용 전략
트랜잭션 포인트컷 표현식은 타입 패턴이나 빈 이름을 이용한다
공통된 메소드 이름 규칙을 통해 최소한의 트랜잭션 어드바이스와 속성을 정의한다
프록시 방식 AOP는 같은 타깃 오브젝트 내의 메소드를 호출할 때는 적용되지 않는다
6.6.4 트랜잭션 속성 적용
트랜잭션 경계설정의 일원화
서비스 빈에 적용되는 포인트컷 표현식 등록
트랜잭션 속성을 가진 트랜잭션 어드바이스 등록
트랜잭션 속성 테스트
6.7 애노테이션 트랜잭션 속성과 포인트컷
6.7.1 트랜잭션 애노테이션
@Transactional
트랜잭션 속성을 이용하는 포인트컷
대체 정책
트랜잭션 애노테이션 사용을 위한 설정
6.7.2 트랜잭션 애노테이션 적용
6.8 트랜잭션 지원 테스트
6.8.1 선언적 트랜잭션과 트랜잭션 전파 속성
6.8.2 트랜잭션 동기화와 테스트
트랜잭션 매니저와 트랜잭션 동기화
트랜잭션 매니저를 이용한 테스트용 트랜잭션 제어
트랜잭션 동기화 검증
롤백 테스트
6.8.3 테스트를 위한 트랜잭션 애노테이션
@Transactional
@Rollback
@TransactionConfiguration
NotTransactional과 Propagation.NEVER
효과적인 DB 테스트
6.9 정리
7장 스프링 핵심 기술의 응용
7.1 SQL과 DAO의 분리
7.1.1 XML 설정을 이용한 분리
개별 SQL 프로퍼티 방식
SQL 맵 프로퍼티 방식
7.1.2 SQL 제공 서비스
SQL 서비스 인터페이스
스프링 설정을 사용하는 단순 SQL 서비스
7.2 인터페이스의 분리와 자기 참조 빈
7.2.1 XML 파일 매핑
JAXB
SQL 맵을 위한 스키마 작성과 컴파일
언마샬링
7.2.2 XML 파일을 이용하는 SQL 서비스
SQL 맵 XML 파일
XML SQL 서비스
7.2.3 빈의 초기화 작업
7.2.4 변화를 위한 준비: 인터페이스 분리
책임에 따른 인터페이스 정의
SqlRegistry 인터페이스
SqlReader 인터페이스
7.2.5 자기참조 빈으로 시작하기
다중 인터페이스 구현과 간접 참조
인터페이스를 이용한 분리
자기참조 빈 설정
7.2.6 디폴트 의존관계
확장 가능한 기반 클래스
디폴트 의존관계를 갖는 빈 만들기
7.3 서비스 추상화 적용
7.3.1 OXM 서비스 추상화
OXM 서비스 인터페이스
JAXB 구현 테스트
Castor 구현 테스트
7.3.2 OXM 서비스 추상화 적용
멤버 클래스를 참조하는 통합 클래스
위임을 이용한 BaseSqlService의 재사용
7.3.3 리소스 추상화
리소스
리소스 로더
Resource를 이용해 XML 파일 가져오기
7.4 인터페이스 상속을 통한 안전한 기능확장
7.4.1 DI와 기능의 확장
DI를 의식하는 설계
DI와 인터페이스 프로그래밍
7.4.2 인터페이스 상속
7.5 DI를 이용해 다양한 구현 방법 적용하기
7.5.1 ConcurrentHashMap을 이용한 수정 가능 SQL 레지스트리
수정 가능 SQL 레지스트리 테스트
수정 가능 SQL 레지스트리 구현
7.5.2 내장형 데이터베이스를 이용한 SQL 레지스트리 만들기
스프링의 내장형 DB 지원 기능
내장형 DB 빌더 학습 테스트
내장형 DB를 이용한 SqlRegistry 만들기
UpdatableSqlRegistry 테스트 코드의 재사용
XML 설정을 통한 내장형 DB의 생성과 적용
7.5.3 트랜잭션 적용
다중 SQL 수정에 대한 트랜잭션 테스트
코드를 이용한 트랜잭션 적용
7.6 스프링 3.1의 DI
자바 언어의 변화와 스프링
7.6.1 자바 코드를 이용한 빈 설정
테스트 컨텍스트의 변경
《context:annotation-config / 》 제거
《bean》의 전환
전용 태그 전환
7.6.2 빈 스캐닝과 자동와이어링
@Autowired를 이용한 자동와이어링
@Component를 이용한 자동 빈 등록
7.6.3 컨텍스트 분리와 @Import
테스트용 컨텍스트 분리
@Import
7.6.4 프로파일
@Profile과 @ActiveProfiles
컨테이너의 빈 등록 정보 확인
중첩 클래스를 이용한 프로파일 적용
7.6.5 프로퍼티 소스
@PropertySource
PropertySourcesPlaceholderConfigurer
7.6.6 빈 설정의 재사용과 @Enable*
빈 설정자
@Enable* 애노테이션
7.7 정리
8장 스프링이란 무엇인가?
8.1 스프링의 정의
8.2 스프링의 목적
8.2.1 엔터프라이즈 개발의 복잡함
복잡함의 근본적인 이유
복잡함을 가중시키는 원인
8.2.2 복잡함을 해결하려는 도전
제거될 수 없는 근본적인 복잡함
실패한 해결책: EJB
비침투적인 방식을 통한 효과적인 해결책: 스프링
8.2.3 복잡함을 상대하는 스프링의 전략
기술적 복잡함을 상대하는 전략
비즈니스와 애플리케이션 로직의 복잡함을 상대하는 전략
핵심 도구: 객체지향과 DI
8.3 POJO 프로그래밍
8.3.1 스프링의 핵심: POJO
8.3.2 POJO란 무엇인가?
8.3.3 POJO의 조건
8.3.4 POJO의 장점
8.3.5 POJO 프레임워크
8.4 스프링의 기술
8.4.1 제어의 역전(IoC) / 의존관계 주입(DI)
DI의 활용 방법
8.4.2 애스펙트 지향 프로그래밍(AOP)
AOP의 적용 기법
AOP의 적용 단계
8.4.3 포터블 서비스 추상화(PSA)
8.5 정리
9장 스프링 프로젝트 시작하기
9.1 자바 엔터프라이즈 플랫폼과 스프링 애플리케이션
9.1.1 클라이언트와 백엔드 시스템
9.1.2 애플리케이션 서버
스프링소스 tcServer
9.1.3 스프링 애플리케이션의 배포 단위
9.2 개발도구와 환경
9.2.1 JavaSE와 JavaEE
JavaSE/JDK
JavaEE/J2EE
9.2.2 IDE
9.2.3 SpringSoruce Tool Suite
SpringIDE 플러그인
STS 플러그인
기타 플러그인
9.2.4 라이브러리 관리와 빌드 툴
라이브러리 관리의 어려움
라이브러리 선정
빌드 툴과 라이브러리 관리
스프링 모듈의 두 가지 이름과 리포지토리
9.3 애플리케이션 아키텍처
9.3.1 계층형 아키텍처
아키텍처와 SoC
3계층 아키텍처와 수직 계층
계층형 아키텍처 설계의 원칙
9.3.2 애플리케이션 정보 아키텍처
DB/SQL 중심의 로직 구현 방식
거대한 서비스 계층 방식
9.3.3 오브젝트 중심 아키텍처
데이터와 오브젝트
도메인 오브젝트를 사용하는 코드
도메인 오브젝트 사용의 문제점
빈약한 도메인 오브젝트 방식
풍성한 도메인 오브젝트 방식
도메인 계층 방식
DTO와 리포트 쿼리
9.3.4 스프링 애플리케이션을 위한 아키텍처 설계
계층형 아키텍처
정보 전송 아키텍처
상태 관리와 빈 스코프
서드파티 프레임워크, 라이브러리 적용
9.4 정리
부록 A 스프링 모듈
A.1 스프링 모듈의 종류와 특징
A.1.1 스프링 모듈 이름
A.1.2 스프링 모듈 추가
수동 추가
Maven/Ivy 자동 추가
A.1.3 스프링 모듈 목록
A.2 스프링 모듈의 의존관계
A.2.1 모듈별 의존관계
ASM 모듈
Core 모듈
Beans 모듈
AOP 모듈
Expression 모듈
Context 모듈
Context.Support 모듈
Transaction 모듈
JDBC 모듈
ORM 모듈
Web 모듈
Web.Servlet 모듈
Web.Portlet 모듈
Web.Struts 모듈
JMS 모듈
Aspects 모듈
Instrument 모듈
Instrument.Tomcat 모듈
Test 모듈
부록 B 스프링 의존 라이브러리
B.1 의존 라이브러리의 종류와 특징
B.1.1 의존 라이브러리 이름
B.1.2 의존 라이브러리 추가
수동 추가
자동 추가
B.2 모듈별 의존 라이브러리 의존관계
B.2.1 필수 라이브러리
B.2.2 모듈별 선택 라이브러리
ASM 모듈
Core 모듈
Beans 모듈
AOP 모듈
Expression 모듈
Context 모듈
Context.Support 모듈
Transaction 모듈
JDBC 모듈
ORM 모듈
Web 모듈
Web.Servlet 모듈
Web.Portlet 모듈
Web.Struts 모듈
JMS 모듈
Aspects 모듈
Instrument 모듈
Instrument.Tomcat 모듈

1장 IoC 컨테이너와 DI
1.1 IoC 컨테이너: 빈 팩토리와 애플리케이션 컨텍스트
1.1.1 IoC 컨테이너를 이용해 애플리케이션 만들기
POJO 클래스
설정 메타정보
1.1.2 IoC 컨테이너의 종류와 사용 방법
StaticApplicationContext
GenericApplicationContext
GenericXmlApplicationContext
WebApplicationContext
1.1.3 IoC 컨테이너 계층구조
부모 컨텍스트를 이용한 계층구조 효과
컨텍스트 계층구조 테스트
1.1.4 웹 애플리케이션의 IoC 컨테이너 구성
웹 애플리케이션의 컨텍스트 계층구조
웹 애플리케이션의 컨텍스트 구성 방법
루트 애플리케이션 컨텍스트 등록
서블릿 애플리케이션 컨텍스트 등록
1.2 IoC/DI를 위한 빈 설정 메타정보 작성
1.2.1 빈 설정 메타정보
빈 설정 메타정보 항목
1.2.2 빈 등록 방법
XML: 《bean》 태그
XML: 네임스페이스와 전용 태그
자동인식을 이용한 빈 등록: 스테레오타입 애노테이션과 빈 스캐너
자바 코드에 의한 빈 등록: @Configuration 클래스의 @Bean 메소드
자바 코드에 의한 빈 등록: 일반 빈 클래스의 @Bean 메소드
빈 등록 메타정보 구성 전략
1.2.3 빈 의존관계 설정 방법
XML: 《property》, 《constructor-arg》
XML: 자동와이어링
XML: 네임스페이스와 전용 태그
애노테이션: @Resource
애노테이션: @Autowired/@Inject
@Autowired와 getBean(), 스프링 테스트
자바 코드에 의한 의존관계 설정
빈 의존관계 설정 전략
1.2.4 프로퍼티 값 설정 방법
메타정보 종류에 따른 값 설정 방법
PropertyEditor와 ConversionService
컬렉션
Null과 빈 문자열
프로퍼티 파일을 이용한 값 설정
1.2.5 컨테이너가 자동등록하는 빈
ApplicationContext, BeanFactory
ResourceLoader, ApplicationEventPublisher
systemProperties, systemEnvironment
1.3 프로토타입과 스코프
1.3.1 프로토타입 스코프
프로토타입 빈의 생명주기와 종속성
프로토타입 빈의 용도
DI와 DL
프로토타입 빈의 DL 전략
1.3.2 스코프
스코프의 종류
스코프 빈의 사용 방법
커스텀 스코프와 상태를 저장하는 빈 사용하기
1.4 기타 빈 설정 메타정보
1.4.1 빈 이름
XML 설정에서의 빈 식별자와 별칭
애노테이션에서의 빈 이름
1.4.2 빈 생명주기 메소드
초기화 메소드
제거 메소드
1.4.3 팩토리 빈과 팩토리 메소드
1.5 스프링 3.1의 Ioc 컨테이너와 DI
1.5.1 빈의 역할과 구분
빈의 종류
컨테이너 인프라 빈과 전용 태그
빈의 역할
1.5.2 컨테이너 인프라 빈을 위한 자바 코드 메타정보
IoC/DI 설정 방법의 발전
자바 코드를 이용한 컨테이너 인프라 빈 등록
1.5.3 웹 애플리케이션의 새로운 IoC 컨테이너 구성
1.5.4 런타임 환경 추상화와 프로파일
환경에 따른 빈 설정정보 변경 전략과 한계
런타임 환경과 프로파일
활성 프로파일 지정 방법
프로파일 활용 전략
1.5.5 프로퍼티 소스
프로퍼티
스프링에서 사용되는 프로퍼티의 종류
프로파일의 통합과 추상화
프로퍼티 소스의 사용
@PropertySource와 프로퍼티 파일
웹 환경에서 사용되는 프로퍼티 소스와 프로퍼티 소스 초기화 오브젝트
1.6 정리
2장 데이터 액세스 기술
2.1 공통 개념
2.1.1 DAO 패턴
DAO 인터페이스와 DI
예외처리
2.1.2 템플릿과 API
2.1.3 DataSource
학습 테스트와 통합 테스트를 위한 DataSource
오픈소스 또는 상용 DB 커넥션 풀
JDNI/WAS DB 풀
2.2 JDBC
2.2.1 스프링 JDBC 기술과 동작원리
스프링의 JDBC 접근 방법
스프링 JDBC가 해주는 작업
2.2.2 SimpleJdbcTemplate
SimpleJdbcTemplate 생성
SQL 파라미터
SQL 실행 메소드
SQL 조회 메소드
SQL 배치 메소드
2.2.3 SimpleJdbcInsert
SimpleJdbcInsert 생성
SimpleJdbcInsert 실행
2.2.4 SimpleJdbcCall
SimpleJdbcCall 생성
SimpleJdbcCall 실행
2.2.5 스프링 JDBC DAO
2.3 iBatis SqlMaps
2.3.1 SqlMapClient 생성
iBatis 설정파일과 매핑파일
SqlMapClient를 위한 SqlMapClientFactoryBean 등록
2.3.2 SqlMapClientTemplate
등록, 수정, 삭제
조회
SqlMapClientCallback
2.4 JPA
2.4.1 EntityManagerFactory 등록
LocalEntityManagerFactoryBean
JavaEE 5 서버가 제공하는 EntityManagerFactory
LocalContainerEntityManagerFactoryBean
트랜잭션 매니저
2.4.2 EntityManager와 JpaTemplate
JpaTemplate
애플리케이션 관리 EntityManager와 @PersistenceUnit
컨테이너 관리 EntityManager와 @PersistenceContext
@PersistenceContext와 확장된 퍼시스턴스 컨텍스트
JPA 예외 변환
JPA 예외 변환 AOP
2.5 하이버네이트
2.5.1 SessionFactory 등록
LocalSessionFactoryBean
AnnotationSessionFactoryBean
트랜잭션 매니저
2.5.2 Session과 HibernateTemplate
HibernateTemplate
SessionFactory.getCurrentSession()
2.6 트랜잭션
2.6.1 트랜잭션 추상화와 동기화
PlatformTransactionManager
트랜잭션 매니저의 종류
2.6.2 트랜잭션 경계설정 전략
코드에 의한 트랜잭션 경계설정
선언적 트랜잭션 경계설정
프록시 모드: 인터페이스와 클래스
AOP 방식: 프록시와 AspectJ
2.6.3 트랜잭션 속성
트랜잭션 전파: propagation
트랜잭션 격리수준: isolation
트랜잭션 제한시간: timeout
읽기전용 트랜잭션: read-only, readOnly
트랜잭션 롤백 예외: rollback-for, rollbackFor, rollbackForClassName
트랜잭션 커밋 예외: no-rollback-for, noRollbackFor, noRollbackForClassName
2.6.4 데이터 액세스 기술 트랜잭션의 통합
트랜잭션 매니저별 조합 가능 기술
ORM과 비 ORM DAO를 함께 사용할 때의 주의사항
2.6.5 JTA를 이용한 글로벌/분산 트랜잭션
독립형 JTA 트랜잭션 매니저
WAS 트랜잭션 매니저의 고급 기능 사용하기
2.7 스프링 3.1의 데이터 액세스 기술
2.7.1 persistence.xml 없이 JPA 사용하기
2.7.2 하이버네이트 4 지원
LocalSessionFactoryBean
LocalSessionFactoryBuilder
2.7.3 @EnableTransactionManager 295
2.8 정리
3장 스프링 웹 기술과 스프링 MVC
3.1 스프링의 웹 프레젠테이션 계층 기술
3.1.1 스프링에서 사용되는 웹 프레임워크의 종류
스프링 웹 프레임워크
스프링 포트폴리오 웹 프레임워크
스프링을 기반으로 두지 않는 웹 프레임워크
3.1.2 스프링 MVC와 DispatcherServlet 전략
DispatcherServlet과 MVC 아키텍처
DispatcherServlet의 DI 가능한 전략
3.2 스프링 웹 애플리케이션 환경 구성
3.2.1 간단한 스프링 웹 프로젝트 생성
루트 웹 애플리케이션 컨텍스트
서블릿 웹 애플리케이션 컨텍스트 등록
스프링 웹 프로젝트 검증
3.2.2 스프링 웹 학습 테스트
서블릿 테스트용 목 오브젝트
테스트를 위한 DispatcherServlet 확장
ConfigurableDispatcherServlet을 이용한 스프링 MVC 테스트
편리한 DispatcherServlet 테스트를 위한 AbstractDispatcherServletTest
3.3 컨트롤러
3.3.1 컨트롤러의 종류와 핸들러 어댑터
Servlet과 SimpleServletHandlerAdapter
HttpRequestHandler와 HttpRequestHandlerAdapter
Controller와 SimpleControllerHandlerAdapter
AnnotationMethodHandlerAdapter
3.3.2 핸들러 매핑
BeanNameUrlHandlerMapping
ControllerBeanNameHandlerMapping
ControllerClassNameHandlerMapping
SimpleUrlHandlerMapping
DefaultAnnotationHandlerMapping
기타 공통 설정정보
3.3.3 핸들러 인터셉터
HandlerInterceptor
핸들러 인터셉터 적용
3.3.4 컨트롤러 확장
커스텀 컨트롤러 인터페이스와 핸들러 어댑터 개발
3.4 뷰
3.4.1 뷰
InternalResourceView와 JstlView
RedirectView
VelocityView, FreeMarkerView
MarshallingView
AbstractExcelView, AbstractJExcelView, AbstractPdfView
AbstractAtomFeedView, AbstractRssFeedView
XsltView, TilesView, AbstractJasperReportsView
MappingJacksonJsonView
3.4.2 뷰 리졸버
InternalResourceViewResolver
VelocityViewResolver, FreeMarkerViewResolver
ResourceBundleViewResolver, XmlViewResolver, BeanNameViewResolver
ContentNegotiatingViewResolver
3.5 기타 전략
3.5.1 핸들러 예외 리졸버
AnnotationMethodHandlerExceptionResolver
ResponseStatusExceptionResolver
DefaultHandlerExceptionResolver
SimpleMappingExceptionResolver
3.5.2 지역정보 리졸버
3.5.3 멀티파트 리졸버
RequestToViewNameTranslator
3.6 스프링 3.1의 MVC
3.6.1 플래시 맵 매니저 전략
플래시 맵
플래시 맵 매니저
플래시 맵 매니저 전략
3.6.2 WebApplicationInitializer를 이용한 컨텍스트 등록
루트 웹 컨텍스트 등록
서블릿 컨텍스트 등록
3.7 정리
4장 스프링 @MVC
4.1 @RequestMapping 핸들러 매핑
4.1.1 클래스/메소드 결합 매핑정보
@RequestMapping 애노테이션
타입 레벨 매핑과 메소드 레벨 매핑의 결합
메소드 레벨 단독 매핑
타입 레벨 단독 매핑
4.1.2 타입 상속과 매핑
매핑정보 상속의 종류
제네릭스와 매핑정보 상속을 이용한 컨트롤러 작성
4.2 @Controller
4.2.1 메소드 파라미터의 종류
HttpServletRequest, HttpServletResponse
HttpSession
WebRequest, NativeWebRequest
Locale
InputStream, Reader
OutputStream, Writer
@PathVariable
@RequestParam
@CookieValue
@RequestHeader
Map, Model, ModelMap
@ModelAttribute
Errors, BindingResult
SessionStatus
@RequestBody
@Value
@Valid
4.2.2 리턴 타입의 종류
자동 추가 모델 오브젝트와 자동생성 뷰 이름
ModelAndView
String
void
모델 오브젝트
Map/Model/ModelMap
View
@ResponseBody
4.2.3 @SessionAttributes와 SessionStatus
도메인 중심 프로그래밍 모델과 상태 유지를 위한 세션 도입의 필요성
@SessionAttributes
SessionStatus
등록 폼을 위한 @SessionAttributes 사용
스프링 목 오브젝트와 AbstractDispatcherServletTest를 이용해 세션 테스트 만들기
4.3 모델 바인딩과 검증
4.3.1 PropertyEditor
디폴트 프로퍼티 에디터
커스텀 프로퍼티 에디터
@InitBinder
WebBindingInitializer
프로토타입 빈 프로퍼티 에디터
4.3.2 Converter와 Formatter
Converter
ConversionService
Formatter와 FormattingConversionService
바인딩 기술의 적용 우선순위와 활용 전략
4.3.3 WebDataBinder 설정 항목
allowedFields, disallowedFields
requiredFields
fieldMarkerPrefix
fieldDefaultPrefix
4.3.4 Validator와 BindingResult, Errors
Validator
JSR-303 빈 검증 기능
BindingResult와 MessageCodeResolver
MessageSource
4.3.5 모델의 일생
HTTP 요청으로부터 컨트롤러 메소드까지
컨트롤러 메소드로부터 뷰까지
4.4 JSP 뷰와 form 태그
4.4.1 EL과 spring 태그 라이브러리를 이용한 모델 출력
JSP EL
스프링 SpEL
지역화 메시지 출력
4.4.2 spring 태그 라이브러리를 이용한 폼 작성
단일 폼 모델
《spring:bind》와 BindingStatus
4.4.3 form 태그 라이브러리
《form:form》
《form:input》
《form:label》
《form:errors》
《form:hidden》
《form:password》, 《form:textarea》
《form:checkbox》, 《form:checkboxes》
《form:radiobutton》, 《form:radiobuttons》
《form:select》, 《form:option》, 《form:options》
커스텀 UI 태그 만들기
4.5 메시지 컨버터와 AJAX
4.5.1 메시지 컨버터의 종류
JSON을 이용한 AJAX 컨트롤러: GET JSON
JSON을 이용한 AJAX 컨트롤러: POST(JSON) JSON
4.6 mvc 네임스페이스
《mvc:annotation-driven》
《mvc:interceptors》
《mvc:view-controller》
4.7 @MVC 확장 포인트
4.7.1 AnnotationMethodHandlerAdapter
SessionAttributeStore
WebArgumentResolver
ModelAndViewResolver
4.8 URL과 리소스 관리
4.8.1 《mvc:default-servlet-handler/》를 이용한 URL 관리
디폴트 서블릿과 URL 매핑 문제
《mvc:default-servlet-handler/》
4.8.2 《url:resource/》를 이용한 리소스 관리
4.9 스프링 3.1의 @MVC
4.9.1 새로운 RequestMapping 전략
@RequestMapping 메소드와 핸들러 매핑 전략의 불일치
HandlerMethod
@RequestMapping 전략 선택
4.9.2 @RequestMapping 핸들러 매핑: RequestMappingHandlerMapping
요청 조건
요청 조건의 결합 방식
4.9.3 @RequestMapping 핸들러 어댑터
파라미터 타입
확장 포인트
4.9.4 @EnableWebMvc와 WebMvcConfigurationSupport를 이용한 @MVC 설정
@EnableWebMvc와 WebMvcConfigurer
@MVC 설정자 빈 등록 방법
@MVC 전략용 설정 빈 등록
4.10 정리
5장 AOP와 LTW
5.1 애스펙트 AOP
5.1.1 프록시 기반 AOP
프록시 기반 AOP 개발 스타일의 종류와 특징
자동 프록시 생성기와 프록시 빈
프록시의 종류
5.1.2 @AspectJ AOP
@AspectJ를 이용하기 위한 준비사항
@Aspect 클래스와 구성요소
포인트컷 메소드와 애노테이션
어드바이스 메소드와 애노테이션
파라미터 선언과 바인딩
@AspectJ를 이용한 AOP의 학습 방법과 적용 전략
5.2 AspectJ와 @Configurable
5.2.1 AspectJ AOP
5.2.2 빈이 아닌 오브젝트에 DI 적용하기
DI 애스펙트
@Configurable
로드타임 위버와 자바 에이전트
5.3 로드타임 위버(LT)
5.4 스프링 3.1의 AOP와 LTW
5.4.1 AOP와 LTW를 위한 애노테이션
@EnableAspectJAutoProxy
@EnableLoadTimeWeaving
5.5 정리
6장 테스트 컨텍스트 프레임워크
6.1 테스트 컨텍스트 프레임워크
6.1.1 테스트 프레임워크와 컨텍스트 테스트
테스트용 애플리케이션 컨텍스트 캐싱과 설정파일
컨텍스트 설정의 상속과 컨텍스트 로더
6.1.2 테스트 코드의 테스트 컨텍스트 활용
테스트 컨텍스트로부터 DI 받기
공유 컨텍스트 사용 시 주의할 점
6.2 트랜잭션 지원 테스트
6.2.1 테스트의 트랜잭션 지원 필요성
DAO 단독 테스트
롤백 테스트
6.2.2 트랜잭션 지원 테스트 작성 방법
트랜잭션 매니저
@Transactional 테스트
ORM 롤백 트랜잭션 테스트의 주의사항
트랜잭션 지원 테스트에 DBUnit 이용하기
6.3 스프링 3.1의 컨텍스트 테스트 프레임워크
6.3.1 자바 코드 설정정보와 프로파일 활용
@Configuration 클래스 테스트
@ActiveProfile
6.4 정리
7장 스프링의 기타 기술과 효과적인 학습 방법
7.1 스프링 기술과 API를 효과적으로 학습하는 방법
7.1.1 빈으로 등록되는 스프링 클래스와 DI
구현 인터페이스 분석
프로퍼티 분석
DI/확장 포인트 분석
7.2 IoC 컨테이너 DI
7.2.1 BeanPostProcessor와 BeanFactoryPostProcessor
BeanPostProcessor
BeanFactoryPostProcessor
7.3 SpEL
7.3.1 SpEL 사용 방법
7.4 OXM
7.4.1 Marshaller/Unmarshaller 인터페이스
7.4.2 OXM 기술 어댑터 클래스
7.5 리모팅과 웹 서비스, EJB
7.5.1 익스포터와 프록시
익스포터
프록시
7.5.2 RESTful 서비스 템플릿
7.5.3 EJB 서비스 이용
7.6 태스크 실행과 스케줄링
7.6.1 TaskExecutor 서비스 추상화
7.6.2 TaskScheduler
7.6.3 task 네임스페이스
《task:executor》
《task:scheduler》
《task:scheduled-tasks》와 《task:scheduled》
7.6.4 애노테이션을 이용한 스케줄링과 비동기 태스크 실행
@Scheduled
@Async
7.7 캐시 추상화(스프링 3.1)
7.7.1 애노테이션을 이용한 캐시 속성 부여
@Cacheable
@CacheEvict와 @CachePut
애노테이션을 이용한 캐시 기능 설정
7.7.2 캐시 매니저
7.8 @Enable 애노테이션을 이용한 빈 설정정보 모듈화
7.8.1 @Import와 @Configuration 상속
@Import를 이용한 단순 재사용
@Configuration 클래스 상속과 오버라이딩을 이용한 확장 방법
7.8.2 @Enable 전용 애노테이션과 ImportAware
@Enable 애노테이션 적용
ImportAware 인터페이스를 이용한 옵션 지정
7.8.3 빈 설정자
7.8.4 ImportSelector와 ImportBeanDefinitionRegistrar
7.9 정리
부록 A 스프링 모듈
A.1 스프링 모듈의 종류와 특징
A.1.1 스프링 모듈 이름
A.1.2 스프링 모듈 추가
수동 추가
Maven/Ivy 자동 추가
A.1.3 스프링 모듈 목록
A.2 스프링 모듈의 의존관계
A.2.1 모듈별 의존관계
ASM 모듈
Core 모듈
Beans 모듈
AOP 모듈
Expression 모듈
Context 모듈
Context.Support 모듈
Transaction 모듈
JDBC 모듈
ORM 모듈
Web 모듈
Web.Servlet 모듈
Web.Portlet 모듈
Web.Struts 모듈
JMS 모듈
Aspects 모듈
Instrument 모듈
Instrument.Tomcat 모듈
Test 모듈
부록 B 스프링 의존 라이브러리
B.1 의존 라이브러리의 종류와 특징
B.1.1 의존 라이브러리 이름
B.1.2 의존 라이브러리 추가
수동 추가
자동 추가
B.2 모듈별 의존 라이브러리 의존관계
B.2.1 필수 라이브러리
B.2.2 모듈별 선택 라이브러리
ASM 모듈
Core 모듈
Beans 모듈
AOP 모듈
Expression 모듈
Context 모듈
Context.Support 모듈
Transaction 모듈
JDBC 모듈
ORM 모듈
Web 모듈
Web.Servlet 모듈
Web.Portlet 모듈
Web.Struts 모듈
JMS 모듈
Aspects 모듈
Instrument 모듈
Instrument.Tomcat 모듈