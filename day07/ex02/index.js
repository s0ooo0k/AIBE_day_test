// 원시 타입
let integer = 4;
console.log(integer);

let float = 3.141592;
console.log(float);

let string = "hello"; //문자열 (빈 문자열)
let emptyString = ""; // 빈 문자열 (들어있는 문자가 없음);
// length size..
console.log(`안녕하세요! ${integer}`); // 템플릿 리터럴 문법 (변수를 ${} 안에 넣어 바로 표현현)

// boolea, bool. -> 불. George bool.
let isCold = true; //1+
let isHard = false; //0 , 아예 없거나, 존재하지도 않았던 빈 것들

// undefined : defined 되지 않은 것.. 정의되지 않았따?
let memory;
console.log("메모리:", memory);
// 출력값 : undefineded, 특정 키를 찾았을때 잘못된 키를 찾은 경우도 출력값이 undefined

//null
let areYouReady = null;
console.log("areYouReady", areYouReady);
// undefined와 null의 차이 : undefined는 개념 자체를 갖지 못함, null은 개념은 있지만 없음(내가 설정, .. 등)

// Object & Array
// Object : Dictionary 같은 ..
let person = {
  name: "jhs",
  job: "student",
  hunger: "100",
};
console.log(person);
// { name: 'jhs', job: 'student', hunger: '100' }
console.log(person.job);
console.log(person["job"]);
console.log(person.school); // undifined
console.log(person["school"]); //undifined

// array
let array = [1, 2, 3];
console.log(array); // [1, 2, 3]
array.push("4"); // 문자열 4 (데이터 타입 상관없이 들어갈 수 있음)
console.log(array); // [1, 2, 3, '4']
console.log("array.pop():", array.pop());
// array.pop(): 5
console.log(array);
//[1,2,3]

console.log("consol.log()", console.log());
// undefined
