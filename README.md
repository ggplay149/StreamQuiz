# Stream API 문제 풀어보기

<br>

[문제출처] https://github.com/MangKyu/stream-quiz

<br>

Stream?
- 컬렉션데이터를 함수형프로그래밍 스타일로 처리하기 위한 api

<br>

Stream 장점
- 좋은 가독성
- 내부적인 병렬처리가능
- 함수형 프로그래밍

<br>

Stream 단점
- 특정경우(적은 데이터) 혹은 병렬처리가 오히려 오버헤드를 발생시킴 
- 사용되는 함수들의 무상태성이 완전히 보장될순 없음.



<br>

Stream 사용연습을 해보면서 배운 개념 기록

<br>

## 사용한 stream 메서드

<br>

- .stream(): 컬렉션의 요소들을 스트림으로 변환
- .map(): 스트림의 각 요소에 함수를 적용하여 새로운 요소로 변환
- .flatMap(): 스트림의 각 요소를 다른 스트림으로 변환하고, 모든 스트림을 하나의 스트림으로 평탄화
- .collect(): 스트림의 요소들을 지정된 컬렉터로 수집하여 결과를 생성
- .filter(): 스트림의 각 요소를 주어진 조건으로 필터링
- .max() / .min(): 스트림에서 최대값/최소값을 Optional 타입으로 리턴 (따라서 orElse() 연계필수)
- .orElse(): Optional 값이 존재하지 않을 때 대체 값을 반환
- .mapToInt(): 스트림의 각 요소를 int 값으로 매핑하여 IntStream을 생성
- Arrays.stream(): 배열의 요소들을 스트림으로 변환
- .distinct(): 스트림의 중복된 요소를 제거
- .limit(): 스트림의 요소를 지정된 개수만큼 제한
- .sorted(): 스트림의 요소들을 정렬
- IntStream.rangeClosed(): 지정된 범위의 int 값을 포함하는 스트림을 생성
- new Random().ints: 난수의 int 스트림을 생성
- Arrays.stream(): 배열의 요소들을 스트림으로 변환
- boxed(): 기본형 특화 스트림을 객체 스트림으로 변환

<br>

## Memo

<br>

- 기본형 특화 스트림 사용이유 ?
  - 오토 박싱/언박싱 오버헤드 비용 감소
  - 기본형 연산 편의 메서드 사용가능
  - EX : sum(), average(), max(), min() 등
 
    
<br>
    
- 기본형 특화 스트림을 객체 스트림으로 변환하는 이유?
  - collection 을 비롯한 다양한 함수형 인터페이스들을 사용하기 위해
