# db_jdbc

JDBC
자바로 코딩하여 데이터베이스에 연동
자바에서 DB에 연동
오라클이라는 DBMS에 접속하여 필요한 쿼리를 입력한다. 
SQL 플러스에서 쿼리를 작성하고 DBMS에서 분석하고 실행한다. 
* SQL Developer라는 것으로 UI를 활용하면 DBMS에서 Listener가 열린다. SQL Developer에서 port와 sid 등을 적어줘야 한다. DBMS에서 Listener가 작동한다. 
** 자바에서 DBMS를 연동한다는 것은 SQL Developer를 만들자고 하는 것이다.
** DB연동: 자바 언어로 프로그램을 짜면 다른 시스템인 오라클을 사용하게 되는 것. (by 네트워크)
	
* Driver의 개념
=> 오라클 DBMS와 내가 만드는 프로그램은 완전히 다른 시스템이다.
	* 서로 다른 OS를 사용하기 때문에 인터페이스로 연결해줘야 한다. 
	* 서로의 시스템에게 사용법을 전달해주고 그것을 바탕으로 이해하고 만들어준다.
=> 오라클에서 제공하는 드라이버가 필요 -> 오라클의 .jar 파일!
=> 자바 언어로 DBMS를 사용할 수 있게 만들어 놓았다. (인터페이스 역할)
=> 클래스로 상속을 받아와서 사용하면 된다.

* Driver 사용 방법
1. 파일을 생성하여 jar 파일을 넣는다.
2. 프로젝트의 우 클릭하여 Libraries에 add jar파일을 한다. or build path or jar의 우 클릭하여 build path하기 
 
