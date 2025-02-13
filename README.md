# 시그니처 백엔드 Path 초격차 패키지 Online.
## 02.실무자바프로그래밍 with.API
### [Course2]. Part3.API를 활용하기

#### Ch01.OthersAPI를활용하기
##### 01.JSON,XMLDataFormat이해하기

`JSON`과 `XML`은 둘다 구조화된 데이터를 표현하고 전송하기 위한 데이터 형식   
`JSON`은 경량의 데이터 교환 형식으로, 텍스트 기반의 구조화된 데이터를 표현.   
[json.org](https://www.json.org/json-en.html)   
    1. 객체: JSON 객체는 중괄호 {}로 묶인 키-값 `{ key : value }` 쌍의 집합. 키는 문자열, 값은 JSON 데이터 형식 중 하나   
    2. 배열: JSON 배열은 대괄호 []로 묶인 값들의순서 있는 리스트 `[ "apple", "banana", "orange" ]`, `[ {}, {}, {} ]   

    3. value 가능한 데이터 타입: 문자열, 숫자, 불리언, 객체, 배열, null

`XML`은 데이터를 저장하고 전송하기 위한 마크업 언어
- XML 데이터는 트리 구조
- 요소(element), 속성(attribute), 텍스트(text), 주석(comment) 등으로 구성

##### 02. Gson API 활용하기
자바에서 `JSON 데이터`를 다루는 대표적인 라이브러리는 Gson과 Jackson이 있다.   
자바 객체 <-> JSON   
[MVN Repository](https://mvnrepository.com/)   

##### 03. Jsoup API 활용하기
`Jsoup`은 자바 라이브러리로서 `HTML 문서를 읽고, 파싱`하여 `웹 크롤링, 웹 스크레이핑, 데이터 추출` 등의 작업을 수행할 수 있습니다. Jsoup API를 사용하면 HTML 문서에서 원하는 요소를 쉽게 선택하고 조작할 수 있습니다.

##### 04. URLConnection 네트워킹 하기
`HtpURLConnection`은 URLConnection의 하위 클래스로, HTTP 프로토콜을 사용하여 특정 웹 서버와 통신하기 위한 클래스이며 HttpURLCnnection은 HTTP 메서드 (예: GET, POST, PUT, DELETE 등)을 지원하며, HTTP 요청과 응답을 처리할 수 있는 메서드를 제공한다.(리소스, 이미지, 파일 등) 

###### HttpURLConnection을 사용하여 웹 서버에서 정보를 가져오는 절차
1. URL 생성
2. HttpURLConnection 초기화
3. HTTP 메서드 설정 (예: GET)
4. 요청 헤더 설정(선택 사항)
5. 요청 본문 작성(선택 사항)
6. 응답 코드 확인(서버 응답 확인)
7. 응답 헤더 읽기(선택 사항)
8. 응답 본문 읽기(InputStream)
9. 연결 종료

[예제 openweathermap](https://openweathermap.org/)
