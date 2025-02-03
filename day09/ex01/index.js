// 함수 선언과 함수 표현식
console.log("선언 전");
myFun(); // 호이스팅 되어 선언 전에도 실행이 됨.

function myFun() {
  console.log("안녕하세요!");
}

console.log("선언 후");
myFun; // 객체 상태
console.log(myFun); // myFun의 객체 상태(타입)이 출력
myFun(); // 호출
console.log(myFun()); // 호출 + return값(return이 없을 경우 undefined)

// yourFun(); // 이 경우에는 에러가 난다. 함수 표현식으로 했기 때문
const yourFun = function () {
  console.log("여러분 눈 오시나요?");
};
yourFun();

// arrow function  '=>'
// java '->'
// python은 lambda '...'

merge("파이썬", "sql"); // 화살표함수는 호이스팅
function merge(a, b) {
  console.log(`${a}와 ${b}는 머지되었다.`);
}

// 함수표현식
const merge2 = function (a, b) {
  console.log(`${a}와 ${b}는 머지되었다!!`);
};
merge2("자바", "도커");

// 화살표 함수(리턴이 없을 때때)
const merge3 = (a, b) => {
  // 리턴이 없다면
  console.log(`${a}와 ${b}는 머지되었다!!!`);
};
merge3("HTML", "CSS");

const merge4 = (a, b) => {
  // return이 없다면 고민 없이 중괄호에 화살표
  console.log(`${a}와 ${b}는 머지되었다!!!`);
  return "결과";
}; // 가장 마지막에 있는 function이 호이스팅
console.log(merge4("두", "둥"));

// 화살표 함수, return이 있을 때
const merge5 = (a, b) => a + b;
// 객체가 아닌 형태의 리턴값을 가질 때 return 생략 가능
console.log(merge5(1, 2));
// 객체라면 어차피 return을 생략할 수 없으므로, merge4 처럼 처리하기 항상

// 기본 매개변수
function eat(menu = "밥") {
  // default를 지정정
  console.log(`${menu}을(를) 먹는다`);
}
eat();

// 자바스크립트는 이렇게 해도 돌아간다..
function test1(a = 1, b = 2) {
  console.log(a, b);
}
function test2(a, b = 2) {
  console.log(a, b);
}
function test3(a = 2, b) {
  console.log(a, b);
}
test1(); // 1 2
test1(1); // 1 2
test1(1, 2); // 1 2
test2(); // undefined, 2
test2(1); // 1 2
test2(1, 2); // 1 2
test3(); // 2 undifined
test3(1); // 1 undefined
test3(1, 2); // 1 2

// 나머지 매개변수 - 함수가 전달받은 인수를 배열로 처리
// 여러 타입 혼용 가능, 하지만 마지막 요소가 나머지 배열 형태태
function sum(...numbers) {
  console.log(numbers);
}
sum(1, 2, 3); // 출력 : [1, 2, 3] // 배열 형태로 출력(배열의 길이를 모를 때 활용용)

function ourFun(a, b, ...c) {
  // ...은 마지막에 몰아야 함
  console.log(a, b, c);
}
ourFun(1, "happy", 3);

// => undefined!
// 1. 객체 등에서 키나 프로퍼티 빼먹은 이슈(혹은 don에서 id, class)
// 2. 함수나 메서드에서 패러미터를 빼먹었다
// 3. 비동기 처리 시 제대로 동기 처리나 큐/쓰레드 완료 못하면

// 클로져
function createCounter() {
  let count = 0;
  return function () {
    return ++count; // 증감연산자
    // ++이 앞에 붙으면 일단 증가하고 값을 리턴
    // ++이 뒤로가면 값을 돌려주고 증가를 함
  };
}
const counter = createCounter(); // 결국 function createCounter > function이 본체
console.log(counter());
console.log(counter());
console.log(counter());

// 함수의 반환값

function funfun1() {
  // 자동으로 return이 붙는 셈 친다다
}
console.log(funfun1);
console.log(funfun1());

function funfun2() {
  return 1; // break랑 유사한 대신, 함수단위..
}
console.log(funfun2);
console.log(funfun2());
