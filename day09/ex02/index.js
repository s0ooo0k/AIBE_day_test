const add = function (a, b) {
  return a + b;
};
const add2 = (a, b) => {
  return a + b;
};
const add3 = (a, b) => a + b;
const power = (a) => a ** 2;
const power2 = (a) => a ** 2;
const shout = () => console.log("YEEEEE");
// const shout = => console.log("YEEEEE"); // 얘는 안되요...
const obj = () => {
  a: 10;
};
const obj2 = () => ({
  a: 10,
});
console.log(obj());
console.log(obj2());

// 함수형 프로그래밍 맛보기 / 고차함수

// 여기에 js map 고차함수에 적절한 예시 array 입력
const n1 = [1, 2, 3];
const n2 = n1;

console.log(n1);
console.log(n2);

const n3 = n1.map(function (num) {
  return num * 3;
});
// n1.map((num)=> num*3);
// n1.map(num=>num*3);
for (let index = 0; index < n2.length; index++) {
  n2[index] *= 3;
}
console.log(n1); // 출력 : [3, 6, 9] | n1 n2 모두가 변한다!
console.log(n2); // 출력 : [3, 6, 9]
console.log(n3);

console.log(Object.is(n1, n2)); // 출력: true / 두 값이 같은지 확인
console.log(Object.is(n1, n3)); // 출력: false

// map -> 여기는 ㅜㅅ자를 예시로 들었지만 오히려 문자열에서 더 많이 사용
// react로 가면 jsx/tsx 문법적 특징 때문에 list나 반복되는 컴퓨넌트
// 이런쪽에 map 문법이 더 많이 쓰임 -> 어차피 화면 구성할 때 다시 보여줌

// filter는 조건에 맞는 것만 남기겠다!
const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const odd = numbers.filter((v) => v % 2 == 1);
console.log(odd); // 출력 : [1, 3, 5, 7, 9]
const even = numbers.filter((v) => v % 2 == 0);
console.log(even); // 출력 : [2, 4, 6, 8, 10]
// 객체, 필터, 문자열, ....

// reduce -> 하나로만 계속 좁혀서 나간다
console.log(numbers.reduce((acc, cur) => acc + cur));
console.log(
  numbers.reduce((acc, cur) => {
    console.log(acc, cur); // acc: 누적값, cur : 새로 들어오는 값)
    return acc + cur;
  }, 0) // 초기값
);

//foreach
numbers.forEach((el) => console.log(el));

// 구조 분해 할당
// 배열
const arr = ["a", "b", "c", "d"];
const [a, b, c, d] = arr;
console.log(a, b, c, d);
// 짝이 맞으면 해체할 수 있다.
const [e, f, g] = arr;
console.log(e, f, g); // 출력 : a  b c

const [aa, bb, cc, dd, ee] = arr;
console.log(aa, bb, cc, dd, ee); // 출력 : a b c d undefinedconst[ff, ...gg] = arr;
const [ff, ...gg] = arr;
console.log(ff, gg); // 출력 : a ['b', 'c', 'd']

//객체
const ob = { a: "a", b: "bb", c: "ccc" };
const { a1, b1, c1 = "기본값" } = ob;
console.log(a1, b1, c1);

const { a: a2, b: b2, c: c2 } = ob;
// 내부에 있는 프로퍼티(키값이름) : 새로 할당한 변수이름 => 구조분해할당
console.log(a2, b2, c2); // 출력 : a bb ccc

//스프레드 연산자
// => 깊은 복사 얕은 복사 이슈를 해결하기 위해서..
const x = [1, 2, 3];
const y = [x];
console.log(x, y);
x[0] = 100;
console.log(x, y);
const z = [...x];
console.log(x, z);
console.log(Object.is(x, z));
x[1] = 1000;
console.log(x, z);
const y2 = [[...x]];
x[0] = 222;
console.log(x, y, y2);

// 객체
// const, final, immutable!!
// immutable의 경우 복사가되면 안됨..

const man = { name: "john", age: 30 };
const man2 = man;
man2.name = "james"; // 재할당 되어 man1과 man2 모두가 수정됨.
console.log(man, man2); // 출력 : { name: 'james', age: 30 } { name: 'james', age: 30 }

// 난 하나만 변경하고 싶다!
const man3 = { ...man }; // man3 객체 안에 man의 프로퍼티를 해체해서 집어 넣는다
console.log(man, man2, man3); // 겉으로는 같아보여도
console.log(Object.is(man, man3)); // 실제로는 false, 다른 존재

man3.name = "dave";
console.log(man, man2, man3); // man1, man2는 변하지 않는다.
