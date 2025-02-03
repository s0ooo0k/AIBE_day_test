const newYear = {
  name: "을사년",
  number: 2025,
  wish: ["다이어트하기", "취업", "TIL 열심히 쓰기"], // 객체 내엔 배열도 가능
  1: "숫자도 들어갈 수 있다", // 권장 되지 않으나 가능
  true: "가능?", // true 라는 문자열로 변환됨
  hello: function () {
    console.log("안녕하세요!");
  },
};

console.log(newYear.name);
console.log(newYear.number); // 일반적인 알파벳, 숫자(첫글자 숫자X)의 경우 .
console.log(newYear["number"]);
console.log(newYear.wish);
console.log(newYear["wish"]);
console.log(newYear["1"]); // 공백, 특수문자, 숫자로 시작하는 이름 또는 변수일 경우 bracket notation([])
console.log(newYear.true);

console.log(newYear.hello); // #출력 : 안녕하세요! // function도 하나의 타입이기 때문에 타입 출력
console.log(newYear.hello()); // #출력 : 안녕하세요! undefined // newYear.hello 출력 + return 반환값도 출력하기 때문에 "undifined" 까지 출력
newYear.hello(); // #출력 : 안녕하세요! // 함수만 호출, 안녕하세요만 출력

// ------------

// es6+ 이후로는 문자열 프로퍼티 하에서는 어느정도의 순서보장이 된다
console.log(Object.keys(newYear));
// 출력이 [ '1', 'name', 'number', 'wish', 'true', 'hello' ] .. 이게 뭐 어느정도 순서보장..
// 브라우저나 버전마다 다를 수 있기 때문에 순서를 크게 사용하지 X
console.log(Object.values(newYear)); // key의 순서에 대응해서
// react로 넘어가면 항상 key를 요구하게 됨
// 순서가 중요하면 무조건 배열(Map, Set도 안됨..)
console.log(Object.entries(newYear));
console.log(("b" + "a" + +"a" + "a").toLowerCase());

// ---------------
// 배열

const lang = ["python", "js", "c++", 0, true, {}, []];
// 자바스크립트에서의 함수형 프로그래밍 -> js, tsx react, next,,

// R과 엑셀을 제외하고서는 0부터 index 시작
// 고정적인 길이를 가지는 경우도 있지만, 자바스크립트는 굳이 고정하지 않음
console.log(lang.slice(1, 3)); // 출력 : [ 'js', 'c++' ]
// 포함과 불포함 여부를 체크해야함
// 시작점은 포함, 끝점은 포함되지 않았다
// 엄밀히 말하면 javascript의 array는 list에 가까워..

// (1) 배열의 인덱스를 적용하고 있는가 (0부터 시작하는가)
// (2) 시작점과 끝점을 어떻게 적용한느가(일반적으로 시작점은 포함, 끝점은 제외)

// -> 자바스크립트는 음수 인덱스가 없다(주의!)
console.log(lang.length); // () => 괄호가 필요한 건 호출이 필요
// 호출이 필요한 건 -> 함수 혹은 메서드
// 파이썬은 len(...) 자바는 배열.length()나 자료구조.size

console.log(lang.concat(lang));
// 배열로 구성된 원소가 있을 경우 그 원소들로 합쳐진 (1차적인 배열)
// -> lang.concat(lang) => 원본과 무슨 관계?

const l2 = lang.concat(lang, lang);
// concat -> 2개를 연결해 아예 새로운 배열이 나옴
console.log(lang);
console.log(l2);
l2.pop();
console.log(lang); // 영향이 업슴
console.log(l2);

// -------------------------------

for (let i = 0; i <= lang.length; i++) {
  console.log(i, lang[i]);
  // 배열은 인덱스와 배열[인덱스]로 값 호출
  // 마이너스라던가, 전체 길이 이상의 값을 호출한다면..
  // arr.length 이상의 값을 호출하면?
  // 원래 java 같으면 error,, 그러나 javascript는 undefined!

  // 출력 : 0 python 1 js ...
}

for (const v of lang) {
  // 인덱스를 호출하는 번거로움을 거치지 않고
  // for - of문의 경우 v라는 변수로 그때 그때 받음
  // 블록이 지나면 소멸(메모리 절약, const를 사용!!!!!!)
  console.log(v);
  // 인덱스가 안나온다 -> 알고리즘 풀 때는 기본 for문 권장장
  // 출력 : python js ...
}

for (const key in newYear) {
  // 객체 대상으로 사용
  console.log(key, newYear[key]); // . 사용X, []를 사용해야함.
  // console.log(key, newYear.key) => 의 경우 key라는 이름의 property를 조회
} // in문은 엥간하면 쓰지마시옹~ => 인터페이스 나오면서 자동완성할 수 있음..
