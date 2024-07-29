# Stream API 문제 풀어보기

<br>
[문제출처] https://github.com/MangKyu/stream-quiz

Stream 사용연습을 해보면서 배운 개념 기록

## 사용한 stream 메서드

- .stream(): 컬렉션의 요소들을 스트림으로 변환
- .map(): 스트림의 각 요소에 함수를 적용하여 새로운 요소로 변환
- .flatMap(): 스트림의 각 요소를 다른 스트림으로 변환하고, 모든 스트림을 하나의 스트림으로 평탄화
- .collect(): 스트림의 요소들을 지정된 컬렉터로 수집하여 결과를 생성
- .filter(): 스트림의 각 요소를 주어진 조건(predicate)으로 필터링
- .max(): 스트림에서 최대값
- .orElse(): Optional 값이 존재하지 않을 때 대체 값을 반환
- .mapToInt(): 스트림의 각 요소를 int 값으로 매핑하여 IntStream을 생성
- Arrays.stream(): 배열의 요소들을 스트림으로 변환
- .distinct(): 스트림의 중복된 요소를 제거
- .limit(): 스트림의 요소를 지정된 개수만큼 제한
- .sorted(): 스트림의 요소들을 정렬
- IntStream.rangeClosed(): 지정된 범위의 int 값을 포함하는 스트림을 생성
- new Random().ints: 난수의 int 스트림을 생성
- Arrays.stream(): 배열의 요소들을 스트림으로 변환
- boxed():


