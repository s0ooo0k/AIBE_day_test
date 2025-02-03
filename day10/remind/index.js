// 실제 함수 선언 지점
function myFun() {
  // 호이스팅 가능
  console.log("myFun");
}
console.log(myFun); // [Type : Function]
console.log(myFun()); // myFun + return이 없어서 undefined! **
myFun(); //myFun
// 차이점을 잘 알아야 합니됴

// myFun2(); // ReferenceError: Cannot access 'myFun2' before initialization
// 함수 표현식
const myFun2 = function () {
  console.log("myFun2");
};
myFun2(); // 호이스팅이 안된다

// 화살표 함수(arrow Function)
// this 바인딩에 관해서 굳이 딥하게 다루지는 않지만.. 알아보기
// form 처리, 기본 이벤트 처리만 사용해도 문제는 없음

// 괄호와 => 을 이용하여 함수 표현
// () => {}

function yourFun() {
  return true;
} // 함수 선언

const yourFun2 = function () {
  return true;
}; // 함수 표현식

const yourFun3 = () => true; // 화살표 함수 단일 문장

const yourFun4 = () => {
  return true;
}; // 화살표 함수 여러줄 문장

const yourFun5 = (a) => true;
// {a} a 괄호 생략 여부는 취향인데, 린팅, 규칙에 따라서 가독성에서는 넣는 걸 권장

// undefined!! 인자가 없어도 굴러는 간다..
function ourFun(a = "aaa", b, c = "ccc") {
  console.log(a, b, c);
}
ourFun(); // 출력 : aaa undefined ccc
ourFun(1, 2);
ourFun(1, 2, 3);

// 나머지 연산자
// 테스팅할 때 입력을 여러개로 하여 ..
function ourFun2(...arr) {
  console.log(arr);
}
console.log(); //
console.log(1); // 출력 : 1
console.log([]); // 배열, 출력 : []
console.log({}); // 객체, 출력 : {}
console.log(1, "", 3); // 여러 타입, 출력 : 1  3

// map. 사상
// map : 각 요소를 변환하여 새로운 배열 생성
const arr = ["Python", "JavaScript", "Java", "C++"];
// 권장 : 문자열 처리 따로 공부할 것(추가 메서드들..)
const newArr = [];
for (const v of arr) {
  newArr.push(v.toLowerCase());
  // 소문자로 만들겠다
  console.log(newArr);
}

// 위의 for문을 map을 사용하여
const mapArr = arr.map(function (el) {
  // vscode가 알아서 추론해줌...
  return el.toLowerCase();
});
console.log(mapArr);
console.log(Object.is(mapArr, arr));
// newArr와 mapArr은 다르다.. (하나하나 비교했으면 같았을 것, 그러나 map은 다름름)

// filter : 조건에 맞는 값만 반환
// el : 콜백함수의 매개변수수
const ddbk = [{ price: 5000 }, { price: 10000 }, { price: 15000 }];
console.log(
  ddbk.filter(function (el) {
    return el.price > 12000;
  })
);
console.log(ddbk.filter((el) => el.price < 7000)); // 화살표함수
// filter는 객체를 전제로 선별할 때
// json 같은 걸 넘길 때 사본을 만들어서 filter 해주므로 자주 사용
// 어떻게 상태관리를 효율적으로 할지..

// reduce -> 2개가 필요함. acc(prev), cur
// java에서의 lambda를 위하여..
// for문을 잘하면 고차함수는 상대적으로 개념만 알아도 되지만..
// 둘다 잘 알아놓자!!

// reduce.. 주로 모든 합 모든 곱
// reduce 줄인다. -> 하나로 모인다

const elements = [{ name: "월개발" }, { name: "화개발" }, { name: "수개발" }];
// 1. map
console.log(elements.map((el) => el.name));

// 2. reduce
console.log(
  elements.reduce((acc, cur) => {
    acc.push(cur.name);
    return acc;
  }, []) // acc -> return 된게 다음 acc(prev)
);

// ---------------------------------------------------------------
// 구조 분해 할당

// 배열
const a = [1, 2, 3];
const [x, y, z] = a; // 파이썬의 언패킹
console.log(x, y, z); // undefined로 인해 짝 관련하여 주의
// ... 스프레드 관련하여 주의의

// 객체
const b = {
  name: "sook",
  age: 20,
};
const { name, age } = b;
const {
  name: name2,
  age: age2,
  job = "programmer", // default를 통해 없는 걸 받아올 수도 있음
} = b;
console.log(name, age, job);

// 스프레드 연산자
console.log(a, [...a], Object.is(a, [...a]));
console.log(b, { ...b }, Object.is(b, { ...b }));
// 두 개의 연결을 끊긴 상태로 사본을 뜰 수 있음

const test = {
  name: "sook",
  age: 20,
};

test1 = test;
console.log(test1);
console.log(Object.is(test, test1));
